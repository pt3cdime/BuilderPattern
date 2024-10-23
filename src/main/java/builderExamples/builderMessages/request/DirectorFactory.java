package builderExamples.builderMessages.request;

import builderExamples.builderMessages.request.builders.AuthorizationRequestBuilder;
import builderExamples.builderMessages.request.builders.PurchaseRequestBuilder;
import builderExamples.builderMessages.request.builders.ReversalRequestBuilder;
import builderExamples.builderMessages.request.directors.*;

public class DirectorFactory {
	
	public static SoloDirector getDirector(String messageType) throws Exception {
		return switch (messageType) {
			case "2100" -> new SoloDirector(new AuthorizationRequestBuilder());
			case "2200" -> new SoloDirector(new PurchaseRequestBuilder());
			case "2420" -> new SoloDirector(new ReversalRequestBuilder());
			default -> throw new Exception("Message type not supported");
		};
	}
}
