package builderExamples.bloch;

public class main {
	public static void main (String[] args) {
		AdditionalResponseDataWithBuilder additionalResponseDataWithBuilder = new AdditionalResponseDataWithBuilder
				.Builder()
				.acquirerActionCode("123456")
		.acquirerActionText("My action Test")
		.acquirerTransactionReferenceNumber("9871234")
		.acquirerSTAN("000001")
		.acquirerReferenceDateTime("20241010")
		.authorizingAgentInstitutionIdentificationCode("PWERT")
		.validationCode("00")
		.acquirerExtraData("some some")
				.build();
		System.out.println(additionalResponseDataWithBuilder.toString());
		
		
		AdditionalResponseDataWithBuilder additionalResponseDataWithBuilder2 = new AdditionalResponseDataWithBuilder
				.Builder()
				.acquirerReferenceDateTime("20231230")
				.authorizingAgentInstitutionIdentificationCode("UFTHY")
				.acquirerExtraData("some data")
				.build();
		System.out.println(additionalResponseDataWithBuilder2.toString());
	}
}

