package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRECMDCMFulfillmentArrangementExchangeInputModelECMDCMFulfillmentArrangementExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * CRECMDCMFulfillmentArrangementExchangeInputModel
 */
public class CRECMDCMFulfillmentArrangementExchangeInputModel   {
  private String eCMDCMServicingSessionReference = null;

  private String eCMDCMFulfillmentArrangementInstanceReference = null;

  private Object eCMDCMFulfillmentArrangementExchangeActionTaskRecord = null;

  private CRECMDCMFulfillmentArrangementExchangeInputModelECMDCMFulfillmentArrangementExchangeActionRequest eCMDCMFulfillmentArrangementExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return eCMDCMFulfillmentArrangementExchangeActionTaskRecord
  **/

  public Object getECMDCMFulfillmentArrangementExchangeActionTaskRecord() {
    return eCMDCMFulfillmentArrangementExchangeActionTaskRecord;
  }

  public void setECMDCMFulfillmentArrangementExchangeActionTaskRecord(Object eCMDCMFulfillmentArrangementExchangeActionTaskRecord) {
    this.eCMDCMFulfillmentArrangementExchangeActionTaskRecord = eCMDCMFulfillmentArrangementExchangeActionTaskRecord;
  }


  /**
   * Get eCMDCMFulfillmentArrangementExchangeActionRequest
   * @return eCMDCMFulfillmentArrangementExchangeActionRequest
  **/

  public CRECMDCMFulfillmentArrangementExchangeInputModelECMDCMFulfillmentArrangementExchangeActionRequest getECMDCMFulfillmentArrangementExchangeActionRequest() {
    return eCMDCMFulfillmentArrangementExchangeActionRequest;
  }

  public void setECMDCMFulfillmentArrangementExchangeActionRequest(CRECMDCMFulfillmentArrangementExchangeInputModelECMDCMFulfillmentArrangementExchangeActionRequest eCMDCMFulfillmentArrangementExchangeActionRequest) {
    this.eCMDCMFulfillmentArrangementExchangeActionRequest = eCMDCMFulfillmentArrangementExchangeActionRequest;
  }


}

