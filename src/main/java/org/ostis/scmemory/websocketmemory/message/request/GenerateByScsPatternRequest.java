package org.ostis.scmemory.websocketmemory.message.request;

import java.util.Map;

/**
 * @author Michael
 * @since 0.6.3
 */
public interface GenerateByScsPatternRequest extends GenerateByPatternRequest {
    void setScsPattern(String scsPattern);

    void setParams(Map<String, Long> params);
}
