package org.ostis.scmemory.websocketmemory.memory.message.request;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.ostis.scmemory.websocketmemory.message.request.GenerateByScsPatternRequest;
import org.ostis.scmemory.websocketmemory.message.request.RequestType;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Michael
 * @since 0.6.3
 */
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class GenerateByScsPatternRequestImpl extends AbstractScRequest implements GenerateByScsPatternRequest {
    @JsonProperty("payload")
    private PayloadStruct payloadStruct = new PayloadStruct();

    public GenerateByScsPatternRequestImpl() {
        super(RequestType.GENERATE_TEMPLATE);
    }


    @JsonIgnore
    @Override
    public void setScsPattern(String scsPattern) {
        payloadStruct.pattern = scsPattern;
    }

    @JsonIgnore
    @Override
    public void setParams(Map<String, Long> params) {
        payloadStruct.params = new HashMap<>(params);
    }

    @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
    private static class PayloadStruct {
        @JsonProperty("templ")
        private String pattern;
        @JsonProperty("params")
        private Map<String, Long> params;

        public String getPattern() {
            return pattern;
        }

        public void setPattern(String pattern) {
            this.pattern = pattern;
        }

        public Map<String, Long> getParams() {
            return params;
        }

        public void setParams(Map<String, Long> params) {
            this.params = params;
        }
    }
}
