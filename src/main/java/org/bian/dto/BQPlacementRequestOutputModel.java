package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPlacementRequestOutputModelPlacementInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQPlacementRequestOutputModel
 */
public class BQPlacementRequestOutputModel   {
  private BQPlacementRequestOutputModelPlacementInstanceRecord placementInstanceRecord = null;

  private String placementRequestActionTaskReference = null;

  private Object placementRequestActionTaskRecord = null;

  private String placementRequestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get placementInstanceRecord
   * @return placementInstanceRecord
  **/

  public BQPlacementRequestOutputModelPlacementInstanceRecord getPlacementInstanceRecord() {
    return placementInstanceRecord;
  }

  public void setPlacementInstanceRecord(BQPlacementRequestOutputModelPlacementInstanceRecord placementInstanceRecord) {
    this.placementInstanceRecord = placementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Placement instance request service call 
   * @return placementRequestActionTaskReference
  **/

  public String getPlacementRequestActionTaskReference() {
    return placementRequestActionTaskReference;
  }

  public void setPlacementRequestActionTaskReference(String placementRequestActionTaskReference) {
    this.placementRequestActionTaskReference = placementRequestActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Placement service request record 
   * @return placementRequestRecordReference
  **/

  public String getPlacementRequestRecordReference() {
    return placementRequestRecordReference;
  }

  public void setPlacementRequestRecordReference(String placementRequestRecordReference) {
    this.placementRequestRecordReference = placementRequestRecordReference;
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

