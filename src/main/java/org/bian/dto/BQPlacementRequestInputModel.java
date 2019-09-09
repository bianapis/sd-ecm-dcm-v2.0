package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPlacementRequestInputModelPlacementInstanceRecord;
import org.bian.dto.CRECMDCMFulfillmentArrangementRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQPlacementRequestInputModel
 */
public class BQPlacementRequestInputModel   {
  private String eCMDCMFulfillmentArrangementInstanceReference = null;

  private String placementInstanceReference = null;

  private BQPlacementRequestInputModelPlacementInstanceRecord placementInstanceRecord = null;

  private Object placementRequestActionTaskRecord = null;

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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Placement instance 
   * @return placementInstanceReference
  **/

  public String getPlacementInstanceReference() {
    return placementInstanceReference;
  }

  public void setPlacementInstanceReference(String placementInstanceReference) {
    this.placementInstanceReference = placementInstanceReference;
  }


  /**
   * Get placementInstanceRecord
   * @return placementInstanceRecord
  **/

  public BQPlacementRequestInputModelPlacementInstanceRecord getPlacementInstanceRecord() {
    return placementInstanceRecord;
  }

  public void setPlacementInstanceRecord(BQPlacementRequestInputModelPlacementInstanceRecord placementInstanceRecord) {
    this.placementInstanceRecord = placementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return placementRequestActionTaskRecord
  **/

  public Object getPlacementRequestActionTaskRecord() {
    return placementRequestActionTaskRecord;
  }

  public void setPlacementRequestActionTaskRecord(Object placementRequestActionTaskRecord) {
    this.placementRequestActionTaskRecord = placementRequestActionTaskRecord;
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

