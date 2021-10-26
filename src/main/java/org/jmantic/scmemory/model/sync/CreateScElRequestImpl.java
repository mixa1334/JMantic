package org.jmantic.scmemory.model.sync;

import org.jmantic.scmemory.model.element.ScElement;
import org.jmantic.scmemory.model.websocket.message.request.CreateScElRequest;
import org.jmantic.scmemory.model.websocket.message.request.RequestType;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Michael
 */
class CreateScElRequestImpl implements CreateScElRequest {
    private final long requestId;
    private final RequestType requestType;
    private List<ScElement> elementsToCreate;

    public CreateScElRequestImpl() {
        requestId = 1;
        requestType = RequestType.CREATE_ELEMENTS;
        this.elementsToCreate = new ArrayList<>(5);
    }

    @Override
    public boolean addElementToRequest(ScElement element) {
        return elementsToCreate.add(element);
    }

    @Override
    public Stream<ScElement> resetRequest() {
        Stream<ScElement> elements = elementsToCreate.stream();
        elementsToCreate = new ArrayList<>(5);
        return elements;
    }

    @Override
    public long getRequestId() {
        return requestId;
    }

    @Override
    public RequestType getRequestType() {
        return requestType;
    }
}
