package org.ostis.scmemory.websocketmemory.memory.message.request;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.ostis.scmemory.model.pattern.ScPatternTriplet;
import org.ostis.scmemory.websocketmemory.message.request.FindByScsPatternRequest;
import org.ostis.scmemory.websocketmemory.message.request.RequestType;

/**
 * @author Michael
 * @since 0.6.3
 */
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class FindByScsPatternRequestImpl extends AbstractScRequest implements FindByScsPatternRequest {
    @JsonProperty("payload")
    private String scs_pattern;

    public FindByScsPatternRequestImpl() {
        super(RequestType.SEARCH_TEMPLATE);
        scs_pattern = "";
    }

    @JsonIgnore
    @Override
    public void setScsPattern(String scs) {
        this.scs_pattern = scs;
    }

    @JsonIgnore
    @Override
    public boolean addComponent(ScPatternTriplet component) {
        throw new UnsupportedOperationException("Unsupported operation for scs_pattern");
    }
}
