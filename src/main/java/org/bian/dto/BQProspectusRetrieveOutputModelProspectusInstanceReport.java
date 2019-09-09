package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProspectusRetrieveOutputModelProspectusInstanceReport
 */
public class BQProspectusRetrieveOutputModelProspectusInstanceReport   {
  private Object prospectusInstanceReportRecord = null;

  private String prospectusInstanceReportType = null;

  private String prospectusInstanceReportParameters = null;

  private Object prospectusInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return prospectusInstanceReportRecord
  **/

  public Object getProspectusInstanceReportRecord() {
    return prospectusInstanceReportRecord;
  }

  public void setProspectusInstanceReportRecord(Object prospectusInstanceReportRecord) {
    this.prospectusInstanceReportRecord = prospectusInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return prospectusInstanceReportType
  **/

  public String getProspectusInstanceReportType() {
    return prospectusInstanceReportType;
  }

  public void setProspectusInstanceReportType(String prospectusInstanceReportType) {
    this.prospectusInstanceReportType = prospectusInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return prospectusInstanceReportParameters
  **/

  public String getProspectusInstanceReportParameters() {
    return prospectusInstanceReportParameters;
  }

  public void setProspectusInstanceReportParameters(String prospectusInstanceReportParameters) {
    this.prospectusInstanceReportParameters = prospectusInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return prospectusInstanceReport
  **/

  public Object getProspectusInstanceReport() {
    return prospectusInstanceReport;
  }

  public void setProspectusInstanceReport(Object prospectusInstanceReport) {
    this.prospectusInstanceReport = prospectusInstanceReport;
  }


}

