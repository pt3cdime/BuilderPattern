package builderExamples.builderMessages.request.directors;

import builderExamples.builderMessages.request.builders.Builder;
import builderExamples.builderMessages.request.builders.ReversalRequestBuilder;
import builderExamples.builderMessages.request.messages.Message;

public class ReversalDirector implements Director {
    
    Builder builder;
    
    public ReversalDirector(Builder builder) {
        this.builder = builder;
    }
    
    @Override
    public Message constructMessage(Object request3cIsoMsg, Object outputMsg) {
        return new ReversalRequestBuilder()
                .buildField001(request3cIsoMsg, outputMsg)
                .buildField002(request3cIsoMsg, outputMsg)
                .buildField004(request3cIsoMsg, outputMsg)
                .buildField005(request3cIsoMsg, outputMsg)
                .build();
    }
}