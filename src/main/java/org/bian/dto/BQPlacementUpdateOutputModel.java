package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPlacementUpdateInputModelPlacementInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQPlacementUpdateOutputModel
 */
public class BQPlacementUpdateOutputModel   {
  private BQPlacementUpdateInputModelPlacementInstanceRecord placementInstanceRecord = null;

  private String placementUpdateActionTaskReference = null;

  private Object placementUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return placementUpdateActionTaskReference
  **/

  public String getPlacementUpdateActionTaskReference() {
    return placementUpdateActionTaskReference;
  }

  public void setPlacementUpdateActionTaskReference(String placementUpdateActionTaskReference) {
    this.placementUpdateActionTaskReference = placementUpdateActionTaskReference;
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

