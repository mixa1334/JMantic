package org.ostis.scmemory.websocketmemory.memory.message.response;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.ostis.scmemory.websocketmemory.memory.structures.PayloadGenerateByTemplateStruct;
import org.ostis.scmemory.websocketmemory.message.response.GenerateByPatternResponse;

import java.util.stream.Stream;

/**
 * @author Michael
 * @since 0.6.3
 */
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class GenerateByPatternResponseImpl extends AbstractScResponse implements GenerateByPatternResponse {
    @JsonProperty("payload")
    private PayloadGenerateByTemplateStruct payloadGenerateByTemplateStruct;

    @Override
    public Stream<Long> getGeneratedAddresses() {
        return payloadGenerateByTemplateStruct.getGeneratedAddresses()
                                              .stream();
    }
}
