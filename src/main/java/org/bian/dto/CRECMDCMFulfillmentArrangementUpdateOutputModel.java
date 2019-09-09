package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRECMDCMFulfillmentArrangementUpdateInputModelCRECMDCMFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRECMDCMFulfillmentArrangementUpdateOutputModel
 */
public class CRECMDCMFulfillmentArrangementUpdateOutputModel   {
  private CRECMDCMFulfillmentArrangementUpdateInputModelCRECMDCMFulfillmentArrangementInstanceRecord cRECMDCMFulfillmentArrangementInstanceRecord = null;

  private String eCMDCMFulfillmentArrangementUpdateActionTaskReference = null;

  private Object eCMDCMFulfillmentArrangementUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get cRECMDCMFulfillmentArrangementInstanceRecord
   * @return cRECMDCMFulfillmentArrangementInstanceRecord
  **/

  @JsonProperty("cRECMDCMFulfillmentArrangementInstanceRecord")
  public CRECMDCMFulfillmentArrangementUpdateInputModelCRECMDCMFulfillmentArrangementInstanceRecord getCRECMDCMFulfillmentArrangementInstanceRecord() {
    return cRECMDCMFulfillmentArrangementInstanceRecord;
  }

  public void setCRECMDCMFulfillmentArrangementInstanceRecord(CRECMDCMFulfillmentArrangementUpdateInputModelCRECMDCMFulfillmentArrangementInstanceRecord cRECMDCMFulfillmentArrangementInstanceRecord) {
    this.cRECMDCMFulfillmentArrangementInstanceRecord = cRECMDCMFulfillmentArrangementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return eCMDCMFulfillmentArrangementUpdateActionTaskReference
  **/

  @JsonProperty("eCMDCMFulfillmentArrangementUpdateActionTaskReference")
  public String getECMDCMFulfillmentArrangementUpdateActionTaskReference() {
    return eCMDCMFulfillmentArrangementUpdateActionTaskReference;
  }

  public void setECMDCMFulfillmentArrangementUpdateActionTaskReference(String eCMDCMFulfillmentArrangementUpdateActionTaskReference) {
    this.eCMDCMFulfillmentArrangementUpdateActionTaskReference = eCMDCMFulfillmentArrangementUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return eCMDCMFulfillmentArrangementUpdateActionTaskRecord
  **/

  @JsonProperty("eCMDCMFulfillmentArrangementUpdateActionTaskRecord")
  public Object getECMDCMFulfillmentArrangementUpdateActionTaskRecord() {
    return eCMDCMFulfillmentArrangementUpdateActionTaskRecord;
  }

  public void setECMDCMFulfillmentArrangementUpdateActionTaskRecord(Object eCMDCMFulfillmentArrangementUpdateActionTaskRecord) {
    this.eCMDCMFulfillmentArrangementUpdateActionTaskRecord = eCMDCMFulfillmentArrangementUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

