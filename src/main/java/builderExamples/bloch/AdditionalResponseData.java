/**
 * Copyright (c) 2008 by 3C Communications International S.A.
 * 15 rue Leon Laval
 * BP 1
 * Leudelange L-3205
 * Luxembourg
 *
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of 3C Communications International S.A. ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use it
 * only in accordance with the terms of the license agreement you entered
 * into with 3C Communications International S.A.
 */
package builderExamples.bloch;


/**
 * The class represents the additional response data.
 *
 * @author Igor Kazarnovskiy
 * @since 1.0
 */

public class AdditionalResponseData {
    
    /** The acquirer action code. */
    private String acquirerActionCode;
    
    /** The acquirer action text. */
    private String acquirerActionText;
    
    /** The acquirer transaction reference number. */
    private String acquirerTransactionReferenceNumber;
    
    /** The acquirer STAN. */
    private String acquirerSTAN;
    
    /** The acquirer reference date time. */
    private String acquirerReferenceDateTime;
    
    /** The authorizing agent institution identification code. */
    private String authorizingAgentInstitutionIdentificationCode;
    
    /** The validation code. */
    private String validationCode;
    
    /** The acquirer extra data. */
    private String acquirerExtraData;
    
    /**
     * Instantiates a new additional response data.
     */
    public AdditionalResponseData() {
        
        super();
    }

    public AdditionalResponseData( final String acquirerActionCode, final String acquirerActionText, final String acquirerSTAN ) {
        
        this.acquirerActionCode = acquirerActionCode;
        this.acquirerActionText = acquirerActionText;
        this.acquirerSTAN = acquirerSTAN;
    }
    
    /**
     * The Constructor.
     *
     * @param acquirerActionCode
     *            the acquirer action code
     * @param acquirerActionText
     *            the acquirer action text
     * @param acquirerTransactionReferenceNumber
     *            the acquirer transaction reference number
     * @param acquirerSTAN
     *            the acquirer stan
     * @param acquirerReferenceDateTime
     *            the acquirer reference date time
     * @param authorizingAgentInstitutionIdentificationCode
     *            the authorizing agent institution identification code
     * @param validationCode
     *            the validation code
     * @param acquirerExtraData
     *            the acquirer extra data
     */
    public AdditionalResponseData( final String acquirerActionCode, final String acquirerActionText,
                                   final String acquirerTransactionReferenceNumber, final String acquirerSTAN, final String acquirerReferenceDateTime,
                                   final String authorizingAgentInstitutionIdentificationCode, final String validationCode, final String acquirerExtraData ) {
        
        this.acquirerActionCode = acquirerActionCode;
        this.acquirerActionText = acquirerActionText;
        this.acquirerTransactionReferenceNumber = acquirerTransactionReferenceNumber;
        this.acquirerSTAN = acquirerSTAN;
        this.acquirerReferenceDateTime = acquirerReferenceDateTime;
        this.authorizingAgentInstitutionIdentificationCode = authorizingAgentInstitutionIdentificationCode;
        this.validationCode = validationCode;
        this.acquirerExtraData = acquirerExtraData;
    }
    
    /**
     * Gets the acquirer action code.
     *
     * @return the acquirer action code
     */
    public String getAcquirerActionCode() {
        
        return this.acquirerActionCode;
    }
    
    /**
     * Sets the acquirer action code.
     *
     * @param acquirerActionCode
     *            the new acquirer action code
     */
    public void setAcquirerActionCode( final String acquirerActionCode ) {
        
        this.acquirerActionCode = acquirerActionCode;
    }
    
    /**
     * Gets the acquirer action text.
     *
     * @return the acquirer action text
     */
    public String getAcquirerActionText() {
        
        return this.acquirerActionText;
    }
    
    /**
     * Sets the acquirer action text.
     *
     * @param acquirerActionText
     *            the new acquirer action text
     */
    public void setAcquirerActionText( final String acquirerActionText ) {
        
        this.acquirerActionText = acquirerActionText;
    }
    
    /**
     * Gets the acquirer transaction reference number.
     *
     * @return the acquirer transaction reference number
     */
    public String getAcquirerTransactionReferenceNumber() {
        
        return this.acquirerTransactionReferenceNumber;
    }
    
    /**
     * Sets the acquirer transaction reference number.
     *
     * @param acquirerTransactionReferenceNumber
     *            the new acquirer transaction reference number
     */
    public void setAcquirerTransactionReferenceNumber( final String acquirerTransactionReferenceNumber ) {
        
        this.acquirerTransactionReferenceNumber = acquirerTransactionReferenceNumber;
    }
    
    /**
     * Gets the acquirer STAN.
     *
     * @return the acquirer STAN
     */
    public String getAcquirerSTAN() {
        
        return this.acquirerSTAN;
    }
    
    /**
     * Sets the acquirer STAN.
     *
     * @param acquirerSTAN
     *            the new acquirer STAN
     */
    public void setAcquirerSTAN( final String acquirerSTAN ) {
        
        this.acquirerSTAN = acquirerSTAN;
    }
    
    /**
     * Gets the acquirer reference date time.
     *
     * @return the acquirer reference date time
     */
    public String getAcquirerReferenceDateTime() {
        
        return this.acquirerReferenceDateTime;
    }
    
    /**
     * Sets the acquirer reference date time.
     *
     * @param acquirerReferenceDateTime
     *            the new acquirer reference date time
     */
    public void setAcquirerReferenceDateTime( final String acquirerReferenceDateTime ) {
        
        this.acquirerReferenceDateTime = acquirerReferenceDateTime;
    }
    
    /**
     * Gets the authorizing agent institution identification code.
     *
     * @return the authorizing agent institution identification code
     */
    public String getAuthorizingAgentInstitutionIdentificationCode() {
        
        return this.authorizingAgentInstitutionIdentificationCode;
    }
    
    /**
     * Sets the authorizing agent institution identification code.
     *
     * @param authorizingAgentInstitutionIdentificationCode
     *            the new authorizing agent institution identification code
     */
    public void setAuthorizingAgentInstitutionIdentificationCode( final String authorizingAgentInstitutionIdentificationCode ) {
        
        this.authorizingAgentInstitutionIdentificationCode = authorizingAgentInstitutionIdentificationCode;
    }
    
    /**
     * Gets the validation code.
     *
     * @return the validation code
     */
    public String getValidationCode() {
        
        return this.validationCode;
    }
    
    /**
     * Sets the validation code.
     *
     * @param validationCode
     *            the new validation code
     */
    public void setValidationCode( final String validationCode ) {
        
        this.validationCode = validationCode;
    }
    
    /**
     * Gets the acquirer extra data.
     *
     * @return the acquirer extra data
     */
    public String getAcquirerExtraData() {
        
        return this.acquirerExtraData;
    }
    
    /**
     * Sets the acquirer extra data.
     *
     * @param acquirerExtraData
     *            the new acquirer extra data
     */
    public void setAcquirerExtraData( final String acquirerExtraData ) {
        
        this.acquirerExtraData = acquirerExtraData;
    }
    
}
