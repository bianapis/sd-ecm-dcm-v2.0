package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRECMDCMFulfillmentArrangementInitiateInputModelCRECMDCMFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRECMDCMFulfillmentArrangementInitiateInputModel
 */
public class CRECMDCMFulfillmentArrangementInitiateInputModel   {
  private String eCMDCMServicingSessionReference = null;

  private Object eCMDCMFulfillmentArrangementInitiateActionRecord = null;

  private String eCMDCMFulfillmentArrangementInstanceStatus = null;

  private CRECMDCMFulfillmentArrangementInitiateInputModelCRECMDCMFulfillmentArrangementInstanceRecord cRECMDCMFulfillmentArrangementInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return eCMDCMServicingSessionReference
  **/

  public String getECMDCMServicingSessionReference() {
    return eCMDCMServicingSessionReference;
  }

  public void setECMDCMServicingSessionReference(String eCMDCMServicingSessionReference) {
    this.eCMDCMServicingSessionReference = eCMDCMServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return eCMDCMFulfillmentArrangementInitiateActionRecord
  **/

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

  public CRECMDCMFulfillmentArrangementInitiateInputModelCRECMDCMFulfillmentArrangementInstanceRecord getCRECMDCMFulfillmentArrangementInstanceRecord() {
    return cRECMDCMFulfillmentArrangementInstanceRecord;
  }

  public void setCRECMDCMFulfillmentArrangementInstanceRecord(CRECMDCMFulfillmentArrangementInitiateInputModelCRECMDCMFulfillmentArrangementInstanceRecord cRECMDCMFulfillmentArrangementInstanceRecord) {
    this.cRECMDCMFulfillmentArrangementInstanceRecord = cRECMDCMFulfillmentArrangementInstanceRecord;
  }


}

