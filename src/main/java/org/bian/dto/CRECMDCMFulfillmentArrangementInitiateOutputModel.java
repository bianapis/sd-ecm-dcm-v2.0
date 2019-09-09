package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRECMDCMFulfillmentArrangementInitiateOutputModelCRECMDCMFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRECMDCMFulfillmentArrangementInitiateOutputModel
 */
public class CRECMDCMFulfillmentArrangementInitiateOutputModel   {
  private String eCMDCMFulfillmentArrangementInstanceReference = null;

  private String eCMDCMFulfillmentArrangementInitiateActionReference = null;

  private Object eCMDCMFulfillmentArrangementInitiateActionRecord = null;

  private String eCMDCMFulfillmentArrangementInstanceStatus = null;

  private CRECMDCMFulfillmentArrangementInitiateOutputModelCRECMDCMFulfillmentArrangementInstanceRecord cRECMDCMFulfillmentArrangementInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the ECM-DCM Fulfillment Arrangement instance 
   * @return eCMDCMFulfillmentArrangementInstanceReference
  **/

  @JsonProperty("eCMDCMFulfillmentArrangementInstanceReference")
  public String getECMDCMFulfillmentArrangementInstanceReference() {
    return eCMDCMFulfillmentArrangementInstanceReference;
  }

  public void setECMDCMFulfillmentArrangementInstanceReference(String eCMDCMFulfillmentArrangementInstanceReference) {
    this.eCMDCMFulfillmentArrangementInstanceReference = eCMDCMFulfillmentArrangementInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return eCMDCMFulfillmentArrangementInitiateActionReference
  **/

  @JsonProperty("eCMDCMFulfillmentArrangementInitiateActionReference")
  public String getECMDCMFulfillmentArrangementInitiateActionReference() {
    return eCMDCMFulfillmentArrangementInitiateActionReference;
  }

  public void setECMDCMFulfillmentArrangementInitiateActionReference(String eCMDCMFulfillmentArrangementInitiateActionReference) {
    this.eCMDCMFulfillmentArrangementInitiateActionReference = eCMDCMFulfillmentArrangementInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return eCMDCMFulfillmentArrangementInitiateActionRecord
  **/

  @JsonProperty("eCMDCMFulfillmentArrangementInitiateActionRecord")
  public Object getECMDCMFulfillmentArrangementInitiateActionRecord() {
    return eCMDCMFulfillmentArrangementInitiateActionRecord;
  }

  public void setECMDCMFulfillmentArrangementInitiateActionRecord(Object eCMDCMFulfillmentArrangementInitiateActionRecord) {
    this.eCMDCMFulfillmentArrangementInitiateActionRecord = eCMDCMFulfillmentArrangementInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the ECM-DCM Fulfillment Arrangement instance (e.g. initialised, pending, active) 
   * @return eCMDCMFulfillmentArrangementInstanceStatus
  **/

  @JsonProperty("eCMDCMFulfillmentArrangementInstanceStatus")
  public String getECMDCMFulfillmentArrangementInstanceStatus() {
    return eCMDCMFulfillmentArrangementInstanceStatus;
  }

  public void setECMDCMFulfillmentArrangementInstanceStatus(String eCMDCMFulfillmentArrangementInstanceStatus) {
    this.eCMDCMFulfillmentArrangementInstanceStatus = eCMDCMFulfillmentArrangementInstanceStatus;
  }


  /**
   * Get cRECMDCMFulfillmentArrangementInstanceRecord
   * @return cRECMDCMFulfillmentArrangementInstanceRecord
  **/

  @JsonProperty("cRECMDCMFulfillmentArrangementInstanceRecord")
  public CRECMDCMFulfillmentArrangementInitiateOutputModelCRECMDCMFulfillmentArrangementInstanceRecord getCRECMDCMFulfillmentArrangementInstanceRecord() {
    return cRECMDCMFulfillmentArrangementInstanceRecord;
  }

  public void setCRECMDCMFulfillmentArrangementInstanceRecord(CRECMDCMFulfillmentArrangementInitiateOutputModelCRECMDCMFulfillmentArrangementInstanceRecord cRECMDCMFulfillmentArrangementInstanceRecord) {
    this.cRECMDCMFulfillmentArrangementInstanceRecord = cRECMDCMFulfillmentArrangementInstanceRecord;
  }


}

