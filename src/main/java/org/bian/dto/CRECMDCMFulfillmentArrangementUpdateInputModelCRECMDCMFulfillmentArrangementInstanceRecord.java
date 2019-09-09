package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRECMDCMFulfillmentArrangementInitiateInputModelCRECMDCMFulfillmentArrangementInstanceRecordDateType;
import org.bian.dto.CRECMDCMFulfillmentArrangementUpdateInputModelCRECMDCMFulfillmentArrangementInstanceRecordAssociations;

import javax.validation.Valid;
  
/**
 * CRECMDCMFulfillmentArrangementUpdateInputModelCRECMDCMFulfillmentArrangementInstanceRecord
 */
public class CRECMDCMFulfillmentArrangementUpdateInputModelCRECMDCMFulfillmentArrangementInstanceRecord   {
  private String productInstanceReference = null;

  private String customerReference = null;

  private String bankBranchLocationReference = null;

  private String businessUnitReference = null;

  private String documentDirectoryEntryInstanceReference = null;

  private CRECMDCMFulfillmentArrangementUpdateInputModelCRECMDCMFulfillmentArrangementInstanceRecordAssociations associations = null;

  private String eCMDCMFulfillmentSchedule = null;

  private CRECMDCMFulfillmentArrangementInitiateInputModelCRECMDCMFulfillmentArrangementInstanceRecordDateType dateType = null;

  private Object eCMDCMInstrumentRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the advisory service session 
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the customer receiving the financial advice 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Bank branch associated with the customer account/relationship for booking purposes 
   * @return bankBranchLocationReference
  **/

  public String getBankBranchLocationReference() {
    return bankBranchLocationReference;
  }

  public void setBankBranchLocationReference(String bankBranchLocationReference) {
    this.bankBranchLocationReference = bankBranchLocationReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Business unit and or employee reference to the source of the financial advice 
   * @return businessUnitReference
  **/

  public String getBusinessUnitReference() {
    return businessUnitReference;
  }

  public void setBusinessUnitReference(String businessUnitReference) {
    this.businessUnitReference = businessUnitReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The document reference for associated documents such as disclosures and acceptance records 
   * @return documentDirectoryEntryInstanceReference
  **/

  public String getDocumentDirectoryEntryInstanceReference() {
    return documentDirectoryEntryInstanceReference;
  }

  public void setDocumentDirectoryEntryInstanceReference(String documentDirectoryEntryInstanceReference) {
    this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
  }


  /**
   * Get associations
   * @return associations
  **/

  public CRECMDCMFulfillmentArrangementUpdateInputModelCRECMDCMFulfillmentArrangementInstanceRecordAssociations getAssociations() {
    return associations;
  }

  public void setAssociations(CRECMDCMFulfillmentArrangementUpdateInputModelCRECMDCMFulfillmentArrangementInstanceRecordAssociations associations) {
    this.associations = associations;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule for work tasks performed and to be performed through the issuing process 
   * @return eCMDCMFulfillmentSchedule
  **/

  @JsonProperty("eCMDCMFulfillmentSchedule")
  public String getECMDCMFulfillmentSchedule() {
    return eCMDCMFulfillmentSchedule;
  }

  public void setECMDCMFulfillmentSchedule(String eCMDCMFulfillmentSchedule) {
    this.eCMDCMFulfillmentSchedule = eCMDCMFulfillmentSchedule;
  }


  /**
   * Get dateType
   * @return dateType
  **/

  public CRECMDCMFulfillmentArrangementInitiateInputModelCRECMDCMFulfillmentArrangementInstanceRecordDateType getDateType() {
    return dateType;
  }

  public void setDateType(CRECMDCMFulfillmentArrangementInitiateInputModelCRECMDCMFulfillmentArrangementInstanceRecordDateType dateType) {
    this.dateType = dateType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The consolidated record of the developed investment vehicle. Combines the output of the development and issuance activities, participant details, investment transaction records as appropriate (details not included at this time) 
   * @return eCMDCMInstrumentRecord
  **/

  @JsonProperty("eCMDCMInstrumentRecord")
  public Object getECMDCMInstrumentRecord() {
    return eCMDCMInstrumentRecord;
  }

  public void setECMDCMInstrumentRecord(Object eCMDCMInstrumentRecord) {
    this.eCMDCMInstrumentRecord = eCMDCMInstrumentRecord;
  }


}

