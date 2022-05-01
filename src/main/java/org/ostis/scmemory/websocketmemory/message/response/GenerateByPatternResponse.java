package org.ostis.scmemory.websocketmemory.message.response;

import java.util.stream.Stream;

/**
 * @author Michael
 * @since 0.6.3
 */
public interface GenerateByPatternResponse {
    /**
     * A method that returns the addresses of the elements that were generated
     *
     * @return addresses
     */
    Stream<Long> getGeneratedAddresses();
}
