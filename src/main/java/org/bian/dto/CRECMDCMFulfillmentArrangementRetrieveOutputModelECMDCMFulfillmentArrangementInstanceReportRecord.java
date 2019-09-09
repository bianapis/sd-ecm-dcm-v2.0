package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRECMDCMFulfillmentArrangementRetrieveOutputModelECMDCMFulfillmentArrangementInstanceReportRecord
 */
public class CRECMDCMFulfillmentArrangementRetrieveOutputModelECMDCMFulfillmentArrangementInstanceReportRecord   {
  private String eCMDCMFulfillmentArrangementInstanceReportData = null;

  private String eCMDCMFulfillmentArrangementInstanceReportType = null;

  private Object eCMDCMFulfillmentArrangementInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return eCMDCMFulfillmentArrangementInstanceReportData
  **/

  @JsonProperty("eCMDCMFulfillmentArrangementInstanceReportData")
  public String getECMDCMFulfillmentArrangementInstanceReportData() {
    return eCMDCMFulfillmentArrangementInstanceReportData;
  }

  public void setECMDCMFulfillmentArrangementInstanceReportData(String eCMDCMFulfillmentArrangementInstanceReportData) {
    this.eCMDCMFulfillmentArrangementInstanceReportData = eCMDCMFulfillmentArrangementInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return eCMDCMFulfillmentArrangementInstanceReportType
  **/

  @JsonProperty("eCMDCMFulfillmentArrangementInstanceReportType")
  public String getECMDCMFulfillmentArrangementInstanceReportType() {
    return eCMDCMFulfillmentArrangementInstanceReportType;
  }

  public void setECMDCMFulfillmentArrangementInstanceReportType(String eCMDCMFulfillmentArrangementInstanceReportType) {
    this.eCMDCMFulfillmentArrangementInstanceReportType = eCMDCMFulfillmentArrangementInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return eCMDCMFulfillmentArrangementInstanceReport
  **/

  @JsonProperty("eCMDCMFulfillmentArrangementInstanceReport")
  public Object getECMDCMFulfillmentArrangementInstanceReport() {
    return eCMDCMFulfillmentArrangementInstanceReport;
  }

  public void setECMDCMFulfillmentArrangementInstanceReport(Object eCMDCMFulfillmentArrangementInstanceReport) {
    this.eCMDCMFulfillmentArrangementInstanceReport = eCMDCMFulfillmentArrangementInstanceReport;
  }


}

