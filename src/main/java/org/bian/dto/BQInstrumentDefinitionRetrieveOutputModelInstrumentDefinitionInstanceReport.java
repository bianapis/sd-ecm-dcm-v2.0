package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInstrumentDefinitionRetrieveOutputModelInstrumentDefinitionInstanceReport
 */
public class BQInstrumentDefinitionRetrieveOutputModelInstrumentDefinitionInstanceReport   {
  private Object instrumentDefinitionInstanceReportRecord = null;

  private String instrumentDefinitionInstanceReportType = null;

  private String instrumentDefinitionInstanceReportParameters = null;

  private Object instrumentDefinitionInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return instrumentDefinitionInstanceReportRecord
  **/

  public Object getInstrumentDefinitionInstanceReportRecord() {
    return instrumentDefinitionInstanceReportRecord;
  }

  public void setInstrumentDefinitionInstanceReportRecord(Object instrumentDefinitionInstanceReportRecord) {
    this.instrumentDefinitionInstanceReportRecord = instrumentDefinitionInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return instrumentDefinitionInstanceReportType
  **/

  public String getInstrumentDefinitionInstanceReportType() {
    return instrumentDefinitionInstanceReportType;
  }

  public void setInstrumentDefinitionInstanceReportType(String instrumentDefinitionInstanceReportType) {
    this.instrumentDefinitionInstanceReportType = instrumentDefinitionInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return instrumentDefinitionInstanceReportParameters
  **/

  public String getInstrumentDefinitionInstanceReportParameters() {
    return instrumentDefinitionInstanceReportParameters;
  }

  public void setInstrumentDefinitionInstanceReportParameters(String instrumentDefinitionInstanceReportParameters) {
    this.instrumentDefinitionInstanceReportParameters = instrumentDefinitionInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return instrumentDefinitionInstanceReport
  **/

  public Object getInstrumentDefinitionInstanceReport() {
    return instrumentDefinitionInstanceReport;
  }

  public void setInstrumentDefinitionInstanceReport(Object instrumentDefinitionInstanceReport) {
    this.instrumentDefinitionInstanceReport = instrumentDefinitionInstanceReport;
  }


}

