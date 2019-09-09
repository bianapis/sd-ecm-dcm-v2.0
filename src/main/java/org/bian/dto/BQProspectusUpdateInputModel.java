package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProspectusUpdateInputModelProspectusInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQProspectusUpdateInputModel
 */
public class BQProspectusUpdateInputModel   {
  private String eCMDCMFulfillmentArrangementInstanceReference = null;

  private String prospectusInstanceReference = null;

  private BQProspectusUpdateInputModelProspectusInstanceRecord prospectusInstanceRecord = null;

  private Object prospectusUpdateActionTaskRecord = null;

  private String prospectusUpdateActionRequest = null;


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

  public BQProspectusUpdateInputModelProspectusInstanceRecord getProspectusInstanceRecord() {
    return prospectusInstanceRecord;
  }

  public void setProspectusInstanceRecord(BQProspectusUpdateInputModelProspectusInstanceRecord prospectusInstanceRecord) {
    this.prospectusInstanceRecord = prospectusInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return prospectusUpdateActionTaskRecord
  **/

  public Object getProspectusUpdateActionTaskRecord() {
    return prospectusUpdateActionTaskRecord;
  }

  public void setProspectusUpdateActionTaskRecord(Object prospectusUpdateActionTaskRecord) {
    this.prospectusUpdateActionTaskRecord = prospectusUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return prospectusUpdateActionRequest
  **/

  public String getProspectusUpdateActionRequest() {
    return prospectusUpdateActionRequest;
  }

  public void setProspectusUpdateActionRequest(String prospectusUpdateActionRequest) {
    this.prospectusUpdateActionRequest = prospectusUpdateActionRequest;
  }


}

