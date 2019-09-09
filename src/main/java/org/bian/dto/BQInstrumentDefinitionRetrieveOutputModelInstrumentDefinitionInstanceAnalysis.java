package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInstrumentDefinitionRetrieveOutputModelInstrumentDefinitionInstanceAnalysis
 */
public class BQInstrumentDefinitionRetrieveOutputModelInstrumentDefinitionInstanceAnalysis   {
  private Object instrumentDefinitionInstanceAnalysisRecord = null;

  private String instrumentDefinitionInstanceAnalysisReportType = null;

  private String instrumentDefinitionInstanceAnalysisParameters = null;

  private Object instrumentDefinitionInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return instrumentDefinitionInstanceAnalysisRecord
  **/

  public Object getInstrumentDefinitionInstanceAnalysisRecord() {
    return instrumentDefinitionInstanceAnalysisRecord;
  }

  public void setInstrumentDefinitionInstanceAnalysisRecord(Object instrumentDefinitionInstanceAnalysisRecord) {
    this.instrumentDefinitionInstanceAnalysisRecord = instrumentDefinitionInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return instrumentDefinitionInstanceAnalysisReportType
  **/

  public String getInstrumentDefinitionInstanceAnalysisReportType() {
    return instrumentDefinitionInstanceAnalysisReportType;
  }

  public void setInstrumentDefinitionInstanceAnalysisReportType(String instrumentDefinitionInstanceAnalysisReportType) {
    this.instrumentDefinitionInstanceAnalysisReportType = instrumentDefinitionInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return instrumentDefinitionInstanceAnalysisParameters
  **/

  public String getInstrumentDefinitionInstanceAnalysisParameters() {
    return instrumentDefinitionInstanceAnalysisParameters;
  }

  public void setInstrumentDefinitionInstanceAnalysisParameters(String instrumentDefinitionInstanceAnalysisParameters) {
    this.instrumentDefinitionInstanceAnalysisParameters = instrumentDefinitionInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return instrumentDefinitionInstanceAnalysisReport
  **/

  public Object getInstrumentDefinitionInstanceAnalysisReport() {
    return instrumentDefinitionInstanceAnalysisReport;
  }

  public void setInstrumentDefinitionInstanceAnalysisReport(Object instrumentDefinitionInstanceAnalysisReport) {
    this.instrumentDefinitionInstanceAnalysisReport = instrumentDefinitionInstanceAnalysisReport;
  }


}

