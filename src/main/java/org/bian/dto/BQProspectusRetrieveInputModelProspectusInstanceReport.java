package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProspectusRetrieveInputModelProspectusInstanceReport
 */
public class BQProspectusRetrieveInputModelProspectusInstanceReport   {
  private String prospectusInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return prospectusInstanceReportReference
  **/

  public String getProspectusInstanceReportReference() {
    return prospectusInstanceReportReference;
  }

  public void setProspectusInstanceReportReference(String prospectusInstanceReportReference) {
    this.prospectusInstanceReportReference = prospectusInstanceReportReference;
  }


}

