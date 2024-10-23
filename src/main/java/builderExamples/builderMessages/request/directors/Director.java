package builderExamples.builderMessages.request.directors;

import builderExamples.builderMessages.request.messages.Message;

public interface Director {
    public Message constructMessage(Object request3cIsoMsg, Object outputMsg);
}
