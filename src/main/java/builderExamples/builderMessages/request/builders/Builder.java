package builderExamples.builderMessages.request.builders;

import builderExamples.builderMessages.request.messages.Message;

//Could also be an abstract factory to remove duplication of fields :)
public interface Builder {
	Builder buildField001(Object request3cIsoMsg, Object outputMsg);
	Builder buildField002(Object request3cIsoMsg, Object outputMsg);
	Builder buildField003(Object request3cIsoMsg, Object outputMsg);
	Builder buildField004(Object request3cIsoMsg, Object outputMsg);
	Builder buildField005(Object request3cIsoMsg, Object outputMsg);
	
	Message build();
}
