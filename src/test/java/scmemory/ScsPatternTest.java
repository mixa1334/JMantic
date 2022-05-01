package scmemory;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.ostis.scmemory.model.ScMemory;
import org.ostis.scmemory.model.element.edge.EdgeType;
import org.ostis.scmemory.model.element.edge.ScEdge;
import org.ostis.scmemory.model.element.node.NodeType;
import org.ostis.scmemory.model.element.node.ScNode;
import org.ostis.scmemory.model.exception.ScMemoryException;
import org.ostis.scmemory.websocketmemory.memory.SyncOstisScMemory;

import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Michael
 * @since 0.6.3
 */
public class ScsPatternTest {
    private ScMemory scMemory;

    @BeforeEach
    public void init() throws Exception {
        scMemory = new SyncOstisScMemory(new URI("ws://localhost:8090/ws_json"));
        scMemory.open();
    }

    @AfterEach
    public void shutdown() throws Exception {
        scMemory.close();
    }

    @Test
    @Timeout(value = 5000, unit = TimeUnit.MILLISECONDS)
    void createByScsPattern() throws ScMemoryException {
        ScNode node = scMemory.resolveKeynodes(
                                      Stream.of("c1"),
                                      Stream.of(NodeType.NODE))
                              .findFirst()
                              .get();
        //        ScNode node = scMemory.createNodes(Stream.of(NodeType.NODE))
        //                              .findFirst()
        //                              .get();
        String pattern = "c1 _=> _b1;; _b1 <- sc_node_abstract;;";
        Map<String, Long> params = new HashMap<>();
        params.put(
                "c1",
                node.getAddress());

        long numberOfElements = scMemory.generate(
                                                pattern,
                                                params)
                                        .count();
        assertEquals(
                3,
                numberOfElements);

    }

    @Test
    @Timeout(value = 5000, unit = TimeUnit.MILLISECONDS)
    void findByScsPattern() throws ScMemoryException {
        ScNode source = scMemory.resolveKeynodes(
                                        Stream.of("_a"),
                                        Stream.of(NodeType.VAR))
                                .findFirst()
                                .get();

        ScNode target = scMemory.resolveKeynodes(
                                        Stream.of("b"),
                                        Stream.of(NodeType.VAR_TUPLE))
                                .findFirst()
                                .get();

        ScEdge edge = scMemory.createEdges(
                                      Stream.of(EdgeType.ACCESS_VAR_POS_PERM),
                                      Stream.of(source),
                                      Stream.of(target))
                              .findFirst()
                              .get();

        String pattern = "_a _-> b;;";
        var elements = scMemory.find(pattern)
                               .count();
        assertEquals(
                3,
                elements);

    }

    @Test
    @Timeout(value = 5000, unit = TimeUnit.MILLISECONDS)
    void createAndFindByScsPattern() {

    }
}
