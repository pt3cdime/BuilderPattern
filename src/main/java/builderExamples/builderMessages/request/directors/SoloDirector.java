package builderExamples.builderMessages.request.directors;

import builderExamples.builderMessages.request.builders.Builder;

//We can use this Director for objects that the fields are all the same to all
public class SoloDirector {
	Builder builder;
	
	public SoloDirector(Builder builder) {
		this.builder = builder;
	}
	
	public Builder getBuilder() {
		return builder;
	}
	
	//If needed we can add more directors and more interfaces for the builder to allow multiple differences in objects
	public Builder constructMessage(Object request3cIsoMsg, Object outputMsg) {
		return this.builder
				.buildField001(request3cIsoMsg, outputMsg)
				.buildField002(request3cIsoMsg, outputMsg)
				.buildField003(request3cIsoMsg, outputMsg)
				.buildField004(request3cIsoMsg, outputMsg)
				.buildField005(request3cIsoMsg, outputMsg);
	}
}
