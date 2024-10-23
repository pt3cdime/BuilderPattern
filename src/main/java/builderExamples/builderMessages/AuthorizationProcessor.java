package builderExamples.builderMessages;

import builderExamples.builderMessages.request.DirectorFactory;
import builderExamples.builderMessages.request.builders.Builder;
import builderExamples.builderMessages.request.directors.Director;
import builderExamples.builderMessages.request.directors.SoloDirector;
import builderExamples.builderMessages.request.messages.Message;

public class AuthorizationProcessor {
	
	public Message process(String messageType) throws Exception{
		SoloDirector director = DirectorFactory.getDirector(messageType);

		director.constructMessage(new Object(), new Object());
		
		return director.getBuilder().build();
	}
}
