package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRECMDCMFulfillmentArrangementRetrieveInputModelECMDCMFulfillmentArrangementInstanceAnalysis
 */
public class CRECMDCMFulfillmentArrangementRetrieveInputModelECMDCMFulfillmentArrangementInstanceAnalysis   {
  private String eCMDCMFulfillmentArrangementInstanceAnalysisReference = null;

  private String eCMDCMFulfillmentArrangementInstanceAnalysisReportType = null;

  private String eCMDCMFulfillmentArrangementInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return eCMDCMFulfillmentArrangementInstanceAnalysisReference
  **/

  public String getECMDCMFulfillmentArrangementInstanceAnalysisReference() {
    return eCMDCMFulfillmentArrangementInstanceAnalysisReference;
  }

  public void setECMDCMFulfillmentArrangementInstanceAnalysisReference(String eCMDCMFulfillmentArrangementInstanceAnalysisReference) {
    this.eCMDCMFulfillmentArrangementInstanceAnalysisReference = eCMDCMFulfillmentArrangementInstanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return eCMDCMFulfillmentArrangementInstanceAnalysisReportType
  **/

  public String getECMDCMFulfillmentArrangementInstanceAnalysisReportType() {
    return eCMDCMFulfillmentArrangementInstanceAnalysisReportType;
  }

  public void setECMDCMFulfillmentArrangementInstanceAnalysisReportType(String eCMDCMFulfillmentArrangementInstanceAnalysisReportType) {
    this.eCMDCMFulfillmentArrangementInstanceAnalysisReportType = eCMDCMFulfillmentArrangementInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return eCMDCMFulfillmentArrangementInstanceAnalysisParameters
  **/

  public String getECMDCMFulfillmentArrangementInstanceAnalysisParameters() {
    return eCMDCMFulfillmentArrangementInstanceAnalysisParameters;
  }

  public void setECMDCMFulfillmentArrangementInstanceAnalysisParameters(String eCMDCMFulfillmentArrangementInstanceAnalysisParameters) {
    this.eCMDCMFulfillmentArrangementInstanceAnalysisParameters = eCMDCMFulfillmentArrangementInstanceAnalysisParameters;
  }


}

