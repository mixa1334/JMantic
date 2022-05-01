package org.ostis.scmemory.websocketmemory.message.request;

/**
 * @author Michael
 * @since 0.6.3
 */
public interface FindByScsPatternRequest extends FindByPatternRequest{
    void setScsPattern(String scs);
}
