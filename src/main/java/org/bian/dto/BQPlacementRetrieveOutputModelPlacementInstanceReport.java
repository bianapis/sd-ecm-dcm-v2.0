package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPlacementRetrieveOutputModelPlacementInstanceReport
 */
public class BQPlacementRetrieveOutputModelPlacementInstanceReport   {
  private Object placementInstanceReportRecord = null;

  private String placementInstanceReportType = null;

  private String placementInstanceReportParameters = null;

  private Object placementInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return placementInstanceReportRecord
  **/

  public Object getPlacementInstanceReportRecord() {
    return placementInstanceReportRecord;
  }

  public void setPlacementInstanceReportRecord(Object placementInstanceReportRecord) {
    this.placementInstanceReportRecord = placementInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return placementInstanceReportType
  **/

  public String getPlacementInstanceReportType() {
    return placementInstanceReportType;
  }

  public void setPlacementInstanceReportType(String placementInstanceReportType) {
    this.placementInstanceReportType = placementInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return placementInstanceReportParameters
  **/

  public String getPlacementInstanceReportParameters() {
    return placementInstanceReportParameters;
  }

  public void setPlacementInstanceReportParameters(String placementInstanceReportParameters) {
    this.placementInstanceReportParameters = placementInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return placementInstanceReport
  **/

  public Object getPlacementInstanceReport() {
    return placementInstanceReport;
  }

  public void setPlacementInstanceReport(Object placementInstanceReport) {
    this.placementInstanceReport = placementInstanceReport;
  }


}

