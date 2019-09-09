package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRECMDCMFulfillmentArrangementRequestInputModelCRECMDCMFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRECMDCMFulfillmentArrangementRequestOutputModel
 */
public class CRECMDCMFulfillmentArrangementRequestOutputModel   {
  private CRECMDCMFulfillmentArrangementRequestInputModelCRECMDCMFulfillmentArrangementInstanceRecord cRECMDCMFulfillmentArrangementInstanceRecord = null;

  private String eCMDCMFulfillmentArrangementRequestActionTaskReference = null;

  private Object eCMDCMFulfillmentArrangementRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get cRECMDCMFulfillmentArrangementInstanceRecord
   * @return cRECMDCMFulfillmentArrangementInstanceRecord
  **/

  @JsonProperty("cRECMDCMFulfillmentArrangementInstanceRecord")
  public CRECMDCMFulfillmentArrangementRequestInputModelCRECMDCMFulfillmentArrangementInstanceRecord getCRECMDCMFulfillmentArrangementInstanceRecord() {
    return cRECMDCMFulfillmentArrangementInstanceRecord;
  }

  public void setCRECMDCMFulfillmentArrangementInstanceRecord(CRECMDCMFulfillmentArrangementRequestInputModelCRECMDCMFulfillmentArrangementInstanceRecord cRECMDCMFulfillmentArrangementInstanceRecord) {
    this.cRECMDCMFulfillmentArrangementInstanceRecord = cRECMDCMFulfillmentArrangementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a ECM-DCM Fulfillment Arrangement instance request service call 
   * @return eCMDCMFulfillmentArrangementRequestActionTaskReference
  **/

  @JsonProperty("eCMDCMFulfillmentArrangementRequestActionTaskReference")
  public String getECMDCMFulfillmentArrangementRequestActionTaskReference() {
    return eCMDCMFulfillmentArrangementRequestActionTaskReference;
  }

  public void setECMDCMFulfillmentArrangementRequestActionTaskReference(String eCMDCMFulfillmentArrangementRequestActionTaskReference) {
    this.eCMDCMFulfillmentArrangementRequestActionTaskReference = eCMDCMFulfillmentArrangementRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return eCMDCMFulfillmentArrangementRequestActionTaskRecord
  **/

  @JsonProperty("eCMDCMFulfillmentArrangementRequestActionTaskRecord")
  public Object getECMDCMFulfillmentArrangementRequestActionTaskRecord() {
    return eCMDCMFulfillmentArrangementRequestActionTaskRecord;
  }

  public void setECMDCMFulfillmentArrangementRequestActionTaskRecord(Object eCMDCMFulfillmentArrangementRequestActionTaskRecord) {
    this.eCMDCMFulfillmentArrangementRequestActionTaskRecord = eCMDCMFulfillmentArrangementRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

