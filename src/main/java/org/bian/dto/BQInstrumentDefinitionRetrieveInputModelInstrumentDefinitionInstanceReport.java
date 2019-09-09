package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInstrumentDefinitionRetrieveInputModelInstrumentDefinitionInstanceReport
 */
public class BQInstrumentDefinitionRetrieveInputModelInstrumentDefinitionInstanceReport   {
  private String instrumentDefinitionInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return instrumentDefinitionInstanceReportReference
  **/

  public String getInstrumentDefinitionInstanceReportReference() {
    return instrumentDefinitionInstanceReportReference;
  }

  public void setInstrumentDefinitionInstanceReportReference(String instrumentDefinitionInstanceReportReference) {
    this.instrumentDefinitionInstanceReportReference = instrumentDefinitionInstanceReportReference;
  }


}

