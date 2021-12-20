package org.jmantic.scmemory.websocketmemory.sync.element;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.jmantic.scmemory.model.element.ScElement;
import org.jmantic.scmemory.model.element.edge.EdgeType;
import org.jmantic.scmemory.model.element.edge.ScEdge;

/**
 * @author Michael
 * @since 0.0.1
 */
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class ScEdgeImpl extends ScEntity implements ScEdge {
    @JsonProperty("src")
    private EdgeSourceStruct source;
    @JsonIgnore
    private ScElement sourceElement;
    @JsonProperty("trg")
    private EdgeSourceStruct target;
    @JsonIgnore
    private ScElement targetElement;
    @JsonProperty("type")
    private EdgeType edgeType;

    public ScEdgeImpl(EdgeType edgeType, ScElement sourceElement, ScElement targetElement) {
        super("edge");
        this.edgeType = edgeType;
        this.sourceElement = sourceElement;
        this.targetElement = targetElement;
        source = new EdgeSourceStruct(EdgeEndpointType.ADDR, sourceElement.getAddress());
        target = new EdgeSourceStruct(EdgeEndpointType.ADDR, targetElement.getAddress());
    }

    public ScEdgeImpl(EdgeType edgeType, ScElement sourceElement, ScElement targetElement, Long address) {
        this(edgeType, sourceElement, targetElement);
        setAddress(address);
    }

    @JsonIgnore
    @Override
    public EdgeType getType() {
        return edgeType;
    }

    @JsonIgnore
    @Override
    public ScElement getSource() {
        return sourceElement;
    }

    @JsonIgnore
    @Override
    public ScElement getTarget() {
        return targetElement;
    }

    public void setSourceElement(ScElement sourceElement) {
        this.sourceElement = sourceElement;
        source = new EdgeSourceStruct(EdgeEndpointType.ADDR, sourceElement.getAddress());
    }

    public void setTargetElement(ScElement targetElement) {
        this.targetElement = targetElement;
        target = new EdgeSourceStruct(EdgeEndpointType.ADDR, targetElement.getAddress());
    }

}