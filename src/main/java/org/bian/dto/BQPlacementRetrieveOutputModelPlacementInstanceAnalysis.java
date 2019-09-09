package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPlacementRetrieveOutputModelPlacementInstanceAnalysis
 */
public class BQPlacementRetrieveOutputModelPlacementInstanceAnalysis   {
  private Object placementInstanceAnalysisRecord = null;

  private String placementInstanceAnalysisReportType = null;

  private String placementInstanceAnalysisParameters = null;

  private Object placementInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return placementInstanceAnalysisRecord
  **/

  public Object getPlacementInstanceAnalysisRecord() {
    return placementInstanceAnalysisRecord;
  }

  public void setPlacementInstanceAnalysisRecord(Object placementInstanceAnalysisRecord) {
    this.placementInstanceAnalysisRecord = placementInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return placementInstanceAnalysisReportType
  **/

  public String getPlacementInstanceAnalysisReportType() {
    return placementInstanceAnalysisReportType;
  }

  public void setPlacementInstanceAnalysisReportType(String placementInstanceAnalysisReportType) {
    this.placementInstanceAnalysisReportType = placementInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return placementInstanceAnalysisParameters
  **/

  public String getPlacementInstanceAnalysisParameters() {
    return placementInstanceAnalysisParameters;
  }

  public void setPlacementInstanceAnalysisParameters(String placementInstanceAnalysisParameters) {
    this.placementInstanceAnalysisParameters = placementInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return placementInstanceAnalysisReport
  **/

  public Object getPlacementInstanceAnalysisReport() {
    return placementInstanceAnalysisReport;
  }

  public void setPlacementInstanceAnalysisReport(Object placementInstanceAnalysisReport) {
    this.placementInstanceAnalysisReport = placementInstanceAnalysisReport;
  }


}

