package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProspectusRetrieveOutputModelProspectusInstanceAnalysis
 */
public class BQProspectusRetrieveOutputModelProspectusInstanceAnalysis   {
  private Object prospectusInstanceAnalysisRecord = null;

  private String prospectusInstanceAnalysisReportType = null;

  private String prospectusInstanceAnalysisParameters = null;

  private Object prospectusInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return prospectusInstanceAnalysisRecord
  **/

  public Object getProspectusInstanceAnalysisRecord() {
    return prospectusInstanceAnalysisRecord;
  }

  public void setProspectusInstanceAnalysisRecord(Object prospectusInstanceAnalysisRecord) {
    this.prospectusInstanceAnalysisRecord = prospectusInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return prospectusInstanceAnalysisReportType
  **/

  public String getProspectusInstanceAnalysisReportType() {
    return prospectusInstanceAnalysisReportType;
  }

  public void setProspectusInstanceAnalysisReportType(String prospectusInstanceAnalysisReportType) {
    this.prospectusInstanceAnalysisReportType = prospectusInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return prospectusInstanceAnalysisParameters
  **/

  public String getProspectusInstanceAnalysisParameters() {
    return prospectusInstanceAnalysisParameters;
  }

  public void setProspectusInstanceAnalysisParameters(String prospectusInstanceAnalysisParameters) {
    this.prospectusInstanceAnalysisParameters = prospectusInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return prospectusInstanceAnalysisReport
  **/

  public Object getProspectusInstanceAnalysisReport() {
    return prospectusInstanceAnalysisReport;
  }

  public void setProspectusInstanceAnalysisReport(Object prospectusInstanceAnalysisReport) {
    this.prospectusInstanceAnalysisReport = prospectusInstanceAnalysisReport;
  }


}

