package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRECMDCMFulfillmentArrangementUpdateInputModelCRECMDCMFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRECMDCMFulfillmentArrangementUpdateInputModel
 */
public class CRECMDCMFulfillmentArrangementUpdateInputModel   {
  private String eCMDCMServicingSessionReference = null;

  private String eCMDCMFulfillmentArrangementInstanceReference = null;

  private CRECMDCMFulfillmentArrangementUpdateInputModelCRECMDCMFulfillmentArrangementInstanceRecord cRECMDCMFulfillmentArrangementInstanceRecord = null;

  private Object eCMDCMFulfillmentArrangementUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the ECM-DCM Fulfillment Arrangement instance 
   * @return eCMDCMFulfillmentArrangementInstanceReference
  **/

  public String getECMDCMFulfillmentArrangementInstanceReference() {
    return eCMDCMFulfillmentArrangementInstanceReference;
  }

  public void setECMDCMFulfillmentArrangementInstanceReference(String eCMDCMFulfillmentArrangementInstanceReference) {
    this.eCMDCMFulfillmentArrangementInstanceReference = eCMDCMFulfillmentArrangementInstanceReference;
  }


  /**
   * Get cRECMDCMFulfillmentArrangementInstanceRecord
   * @return cRECMDCMFulfillmentArrangementInstanceRecord
  **/

  public CRECMDCMFulfillmentArrangementUpdateInputModelCRECMDCMFulfillmentArrangementInstanceRecord getCRECMDCMFulfillmentArrangementInstanceRecord() {
    return cRECMDCMFulfillmentArrangementInstanceRecord;
  }

  public void setCRECMDCMFulfillmentArrangementInstanceRecord(CRECMDCMFulfillmentArrangementUpdateInputModelCRECMDCMFulfillmentArrangementInstanceRecord cRECMDCMFulfillmentArrangementInstanceRecord) {
    this.cRECMDCMFulfillmentArrangementInstanceRecord = cRECMDCMFulfillmentArrangementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return eCMDCMFulfillmentArrangementUpdateActionTaskRecord
  **/

  public Object getECMDCMFulfillmentArrangementUpdateActionTaskRecord() {
    return eCMDCMFulfillmentArrangementUpdateActionTaskRecord;
  }

  public void setECMDCMFulfillmentArrangementUpdateActionTaskRecord(Object eCMDCMFulfillmentArrangementUpdateActionTaskRecord) {
    this.eCMDCMFulfillmentArrangementUpdateActionTaskRecord = eCMDCMFulfillmentArrangementUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

