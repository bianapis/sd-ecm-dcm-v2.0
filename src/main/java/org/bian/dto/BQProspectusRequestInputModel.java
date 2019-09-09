package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProspectusRequestInputModelProspectusInstanceRecord;
import org.bian.dto.CRECMDCMFulfillmentArrangementRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQProspectusRequestInputModel
 */
public class BQProspectusRequestInputModel   {
  private String eCMDCMFulfillmentArrangementInstanceReference = null;

  private String prospectusInstanceReference = null;

  private BQProspectusRequestInputModelProspectusInstanceRecord prospectusInstanceRecord = null;

  private Object prospectusRequestActionTaskRecord = null;

  private CRECMDCMFulfillmentArrangementRequestInputModelRequestRecordType requestRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent ECM-DCM Fulfillment Arrangement instance 
   * @return eCMDCMFulfillmentArrangementInstanceReference
  **/

  public String getECMDCMFulfillmentArrangementInstanceReference() {
    return eCMDCMFulfillmentArrangementInstanceReference;
  }

  public void setECMDCMFulfillmentArrangementInstanceReference(String eCMDCMFulfillmentArrangementInstanceReference) {
    this.eCMDCMFulfillmentArrangementInstanceReference = eCMDCMFulfillmentArrangementInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Prospectus instance 
   * @return prospectusInstanceReference
  **/

  public String getProspectusInstanceReference() {
    return prospectusInstanceReference;
  }

  public void setProspectusInstanceReference(String prospectusInstanceReference) {
    this.prospectusInstanceReference = prospectusInstanceReference;
  }


  /**
   * Get prospectusInstanceRecord
   * @return prospectusInstanceRecord
  **/

  public BQProspectusRequestInputModelProspectusInstanceRecord getProspectusInstanceRecord() {
    return prospectusInstanceRecord;
  }

  public void setProspectusInstanceRecord(BQProspectusRequestInputModelProspectusInstanceRecord prospectusInstanceRecord) {
    this.prospectusInstanceRecord = prospectusInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return prospectusRequestActionTaskRecord
  **/

  public Object getProspectusRequestActionTaskRecord() {
    return prospectusRequestActionTaskRecord;
  }

  public void setProspectusRequestActionTaskRecord(Object prospectusRequestActionTaskRecord) {
    this.prospectusRequestActionTaskRecord = prospectusRequestActionTaskRecord;
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

