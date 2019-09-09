package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRECMDCMFulfillmentArrangementExchangeOutputModel
 */
public class CRECMDCMFulfillmentArrangementExchangeOutputModel   {
  private String eCMDCMFulfillmentArrangementExchangeActionTaskReference = null;

  private Object eCMDCMFulfillmentArrangementExchangeActionTaskRecord = null;

  private String eCMDCMFulfillmentArrangementExchangeActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a ECM-DCM Fulfillment Arrangement instance exchange service call 
   * @return eCMDCMFulfillmentArrangementExchangeActionTaskReference
  **/

  @JsonProperty("eCMDCMFulfillmentArrangementExchangeActionTaskReference")
  public String getECMDCMFulfillmentArrangementExchangeActionTaskReference() {
    return eCMDCMFulfillmentArrangementExchangeActionTaskReference;
  }

  public void setECMDCMFulfillmentArrangementExchangeActionTaskReference(String eCMDCMFulfillmentArrangementExchangeActionTaskReference) {
    this.eCMDCMFulfillmentArrangementExchangeActionTaskReference = eCMDCMFulfillmentArrangementExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return eCMDCMFulfillmentArrangementExchangeActionTaskRecord
  **/

  @JsonProperty("eCMDCMFulfillmentArrangementExchangeActionTaskRecord")
  public Object getECMDCMFulfillmentArrangementExchangeActionTaskRecord() {
    return eCMDCMFulfillmentArrangementExchangeActionTaskRecord;
  }

  public void setECMDCMFulfillmentArrangementExchangeActionTaskRecord(Object eCMDCMFulfillmentArrangementExchangeActionTaskRecord) {
    this.eCMDCMFulfillmentArrangementExchangeActionTaskRecord = eCMDCMFulfillmentArrangementExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return eCMDCMFulfillmentArrangementExchangeActionResponse
  **/

  @JsonProperty("eCMDCMFulfillmentArrangementExchangeActionResponse")
  public String getECMDCMFulfillmentArrangementExchangeActionResponse() {
    return eCMDCMFulfillmentArrangementExchangeActionResponse;
  }

  public void setECMDCMFulfillmentArrangementExchangeActionResponse(String eCMDCMFulfillmentArrangementExchangeActionResponse) {
    this.eCMDCMFulfillmentArrangementExchangeActionResponse = eCMDCMFulfillmentArrangementExchangeActionResponse;
  }


}

