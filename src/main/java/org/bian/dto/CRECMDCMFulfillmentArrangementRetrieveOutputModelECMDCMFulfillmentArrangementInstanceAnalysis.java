package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRECMDCMFulfillmentArrangementRetrieveOutputModelECMDCMFulfillmentArrangementInstanceAnalysis
 */
public class CRECMDCMFulfillmentArrangementRetrieveOutputModelECMDCMFulfillmentArrangementInstanceAnalysis   {
  private String eCMDCMFulfillmentArrangementInstanceAnalysisData = null;

  private String eCMDCMFulfillmentArrangementInstanceAnalysisReportType = null;

  private Object eCMDCMFulfillmentArrangementInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return eCMDCMFulfillmentArrangementInstanceAnalysisData
  **/

  @JsonProperty("eCMDCMFulfillmentArrangementInstanceAnalysisData")
  public String getECMDCMFulfillmentArrangementInstanceAnalysisData() {
    return eCMDCMFulfillmentArrangementInstanceAnalysisData;
  }

  public void setECMDCMFulfillmentArrangementInstanceAnalysisData(String eCMDCMFulfillmentArrangementInstanceAnalysisData) {
    this.eCMDCMFulfillmentArrangementInstanceAnalysisData = eCMDCMFulfillmentArrangementInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return eCMDCMFulfillmentArrangementInstanceAnalysisReportType
  **/

  @JsonProperty("eCMDCMFulfillmentArrangementInstanceAnalysisReportType")
  public String getECMDCMFulfillmentArrangementInstanceAnalysisReportType() {
    return eCMDCMFulfillmentArrangementInstanceAnalysisReportType;
  }

  public void setECMDCMFulfillmentArrangementInstanceAnalysisReportType(String eCMDCMFulfillmentArrangementInstanceAnalysisReportType) {
    this.eCMDCMFulfillmentArrangementInstanceAnalysisReportType = eCMDCMFulfillmentArrangementInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return eCMDCMFulfillmentArrangementInstanceAnalysisReport
  **/

  @JsonProperty("eCMDCMFulfillmentArrangementInstanceAnalysisReport")
  public Object getECMDCMFulfillmentArrangementInstanceAnalysisReport() {
    return eCMDCMFulfillmentArrangementInstanceAnalysisReport;
  }

  public void setECMDCMFulfillmentArrangementInstanceAnalysisReport(Object eCMDCMFulfillmentArrangementInstanceAnalysisReport) {
    this.eCMDCMFulfillmentArrangementInstanceAnalysisReport = eCMDCMFulfillmentArrangementInstanceAnalysisReport;
  }


}

