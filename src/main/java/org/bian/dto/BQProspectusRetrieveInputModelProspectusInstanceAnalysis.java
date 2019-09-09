package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProspectusRetrieveInputModelProspectusInstanceAnalysis
 */
public class BQProspectusRetrieveInputModelProspectusInstanceAnalysis   {
  private String prospectusInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return prospectusInstanceAnalysisReference
  **/

  public String getProspectusInstanceAnalysisReference() {
    return prospectusInstanceAnalysisReference;
  }

  public void setProspectusInstanceAnalysisReference(String prospectusInstanceAnalysisReference) {
    this.prospectusInstanceAnalysisReference = prospectusInstanceAnalysisReference;
  }


}

