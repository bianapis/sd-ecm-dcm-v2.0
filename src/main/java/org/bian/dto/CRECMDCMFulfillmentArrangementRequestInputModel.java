package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRECMDCMFulfillmentArrangementRequestInputModelCRECMDCMFulfillmentArrangementInstanceRecord;
import org.bian.dto.CRECMDCMFulfillmentArrangementRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRECMDCMFulfillmentArrangementRequestInputModel
 */
public class CRECMDCMFulfillmentArrangementRequestInputModel   {
  private String eCMDCMServicingSessionReference = null;

  private String eCMDCMFulfillmentArrangementInstanceReference = null;

  private CRECMDCMFulfillmentArrangementRequestInputModelCRECMDCMFulfillmentArrangementInstanceRecord cRECMDCMFulfillmentArrangementInstanceRecord = null;

  private Object eCMDCMFulfillmentArrangementRequestActionTaskRecord = null;

  private CRECMDCMFulfillmentArrangementRequestInputModelRequestRecordType requestRecordType = null;


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

  public CRECMDCMFulfillmentArrangementRequestInputModelCRECMDCMFulfillmentArrangementInstanceRecord getCRECMDCMFulfillmentArrangementInstanceRecord() {
    return cRECMDCMFulfillmentArrangementInstanceRecord;
  }

  public void setCRECMDCMFulfillmentArrangementInstanceRecord(CRECMDCMFulfillmentArrangementRequestInputModelCRECMDCMFulfillmentArrangementInstanceRecord cRECMDCMFulfillmentArrangementInstanceRecord) {
    this.cRECMDCMFulfillmentArrangementInstanceRecord = cRECMDCMFulfillmentArrangementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return eCMDCMFulfillmentArrangementRequestActionTaskRecord
  **/

  public Object getECMDCMFulfillmentArrangementRequestActionTaskRecord() {
    return eCMDCMFulfillmentArrangementRequestActionTaskRecord;
  }

  public void setECMDCMFulfillmentArrangementRequestActionTaskRecord(Object eCMDCMFulfillmentArrangementRequestActionTaskRecord) {
    this.eCMDCMFulfillmentArrangementRequestActionTaskRecord = eCMDCMFulfillmentArrangementRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRECMDCMFulfillmentArrangementRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRECMDCMFulfillmentArrangementRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

