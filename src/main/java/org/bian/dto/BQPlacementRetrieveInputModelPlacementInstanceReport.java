package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPlacementRetrieveInputModelPlacementInstanceReport
 */
public class BQPlacementRetrieveInputModelPlacementInstanceReport   {
  private String placementInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return placementInstanceReportReference
  **/

  public String getPlacementInstanceReportReference() {
    return placementInstanceReportReference;
  }

  public void setPlacementInstanceReportReference(String placementInstanceReportReference) {
    this.placementInstanceReportReference = placementInstanceReportReference;
  }


}

