package builderExamples.bloch;

public class AdditionalResponseDataWithBuilder {
    
    private String acquirerActionCode;
    private String acquirerActionText;
    private String acquirerTransactionReferenceNumber;
    private String acquirerSTAN;
    private String acquirerReferenceDateTime;
    private String authorizingAgentInstitutionIdentificationCode;
    private String validationCode;
    private String acquirerExtraData;
    
    private AdditionalResponseDataWithBuilder(Builder builder) {
        
        this.acquirerActionCode = builder.acquirerActionCode;
        this.acquirerActionText = builder.acquirerActionText;
        this.acquirerTransactionReferenceNumber = builder.acquirerTransactionReferenceNumber;
        this.acquirerSTAN = builder.acquirerSTAN;
        this.acquirerReferenceDateTime = builder.acquirerReferenceDateTime;
        this.authorizingAgentInstitutionIdentificationCode = builder.authorizingAgentInstitutionIdentificationCode;
        this.validationCode = builder.validationCode;
        this.acquirerExtraData = builder.acquirerExtraData;
    }

    public String getAcquirerActionCode() {
        
        return this.acquirerActionCode;
    }
    
    public String getAcquirerActionText() {
        
        return this.acquirerActionText;
    }

    public String getAcquirerTransactionReferenceNumber() {
        
        return this.acquirerTransactionReferenceNumber;
    }

    public String getAcquirerSTAN() {
        
        return this.acquirerSTAN;
    }
 
    public String getAcquirerReferenceDateTime() {
        
        return this.acquirerReferenceDateTime;
    }
    

    public String getAuthorizingAgentInstitutionIdentificationCode() {
        
        return this.authorizingAgentInstitutionIdentificationCode;
    }
    
    public String getValidationCode() {
        
        return this.validationCode;
    }
    
    public String getAcquirerExtraData() {
        
        return this.acquirerExtraData;
    }
    
    public static class Builder{
        private String acquirerActionCode;
        private String acquirerActionText;
        private String acquirerTransactionReferenceNumber;
        private String acquirerSTAN;
        private String acquirerReferenceDateTime;
        private String authorizingAgentInstitutionIdentificationCode;
        private String validationCode;
        private String acquirerExtraData;
        
        public Builder acquirerActionCode(String acquirerActionCode) {
            this.acquirerActionCode = acquirerActionCode;
            return this;
        }
        
        public Builder acquirerActionText(String acquirerActionText) {
            this.acquirerActionText = acquirerActionText;
            return this;
        }
        
        public Builder acquirerTransactionReferenceNumber(String acquirerTransactionReferenceNumber) {
            this.acquirerTransactionReferenceNumber = acquirerTransactionReferenceNumber;
            return this;
        }
        
        public Builder acquirerSTAN(String acquirerSTAN) {
            this.acquirerSTAN = acquirerSTAN;
            return this;
        }
        
        public Builder acquirerReferenceDateTime(String acquirerReferenceDateTime) {
            this.acquirerReferenceDateTime = acquirerReferenceDateTime;
            return this;
        }
        
        public Builder authorizingAgentInstitutionIdentificationCode(String authorizingAgentInstitutionIdentificationCode) {
            this.authorizingAgentInstitutionIdentificationCode = authorizingAgentInstitutionIdentificationCode;
            return this;
        }
        
        public Builder validationCode(String validationCode) {
            this.validationCode = validationCode;
            return this;
        }
        
        public Builder acquirerExtraData(String acquirerExtraData) {
            this.acquirerExtraData = acquirerExtraData;
            return this;
        }
        
        public AdditionalResponseDataWithBuilder build() {
            return new AdditionalResponseDataWithBuilder(this);
        }
    }
    
    public String toString(){
        return STR."Acquirer Action Code                                   -> \{acquirerActionCode}\n" +
                STR."Acquirer Action Text                                   -> \{acquirerActionText}\n" +
                STR."Acquirer Transaction Reference Number                  -> \{acquirerTransactionReferenceNumber}\n" +
                STR."Acquirer STAN                                          -> \{acquirerSTAN}\n" +
                STR."Acquirer Reference Date Time                           -> \{acquirerReferenceDateTime}\n" +
                STR."Authorizing Agent Institution Identification Code      -> \{authorizingAgentInstitutionIdentificationCode}\n" +
                STR."Validation Code                                        -> \{validationCode}\n" +
                STR."Acquirer Extra Data                                    -> \{acquirerExtraData}\n";
                
    }
}
