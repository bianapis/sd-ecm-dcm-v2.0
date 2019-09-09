package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPlacementUpdateInputModelPlacementInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQPlacementUpdateInputModel
 */
public class BQPlacementUpdateInputModel   {
  private String eCMDCMFulfillmentArrangementInstanceReference = null;

  private String placementInstanceReference = null;

  private BQPlacementUpdateInputModelPlacementInstanceRecord placementInstanceRecord = null;

  private Object placementUpdateActionTaskRecord = null;

  private String placementUpdateActionRequest = null;


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

  public BQPlacementUpdateInputModelPlacementInstanceRecord getPlacementInstanceRecord() {
    return placementInstanceRecord;
  }

  public void setPlacementInstanceRecord(BQPlacementUpdateInputModelPlacementInstanceRecord placementInstanceRecord) {
    this.placementInstanceRecord = placementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return placementUpdateActionTaskRecord
  **/

  public Object getPlacementUpdateActionTaskRecord() {
    return placementUpdateActionTaskRecord;
  }

  public void setPlacementUpdateActionTaskRecord(Object placementUpdateActionTaskRecord) {
    this.placementUpdateActionTaskRecord = placementUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return placementUpdateActionRequest
  **/

  public String getPlacementUpdateActionRequest() {
    return placementUpdateActionRequest;
  }

  public void setPlacementUpdateActionRequest(String placementUpdateActionRequest) {
    this.placementUpdateActionRequest = placementUpdateActionRequest;
  }


}

