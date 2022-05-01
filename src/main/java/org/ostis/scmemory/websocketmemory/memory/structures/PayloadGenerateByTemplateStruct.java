package org.ostis.scmemory.websocketmemory.memory.structures;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author Michael
 * @since 0.6.3
 */
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class PayloadGenerateByTemplateStruct {
    @JsonProperty("aliases")
    private AliasesStruct aliases = new AliasesStruct();

    @JsonProperty("addrs")
    private List<Long> generatedAddresses;

    public AliasesStruct getAliases() {
        return aliases;
    }

    public List<Long> getGeneratedAddresses() {
        return generatedAddresses;
    }

    private static class AliasesStruct {
    }
}
