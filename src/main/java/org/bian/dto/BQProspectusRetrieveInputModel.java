package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProspectusRetrieveInputModelProspectusInstanceAnalysis;
import org.bian.dto.BQProspectusRetrieveInputModelProspectusInstanceReport;

import javax.validation.Valid;
  
/**
 * BQProspectusRetrieveInputModel
 */
public class BQProspectusRetrieveInputModel   {
  private Object prospectusRetrieveActionTaskRecord = null;

  private String prospectusRetrieveActionRequest = null;

  private BQProspectusRetrieveInputModelProspectusInstanceReport prospectusInstanceReport = null;

  private BQProspectusRetrieveInputModelProspectusInstanceAnalysis prospectusInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return prospectusRetrieveActionTaskRecord
  **/

  public Object getProspectusRetrieveActionTaskRecord() {
    return prospectusRetrieveActionTaskRecord;
  }

  public void setProspectusRetrieveActionTaskRecord(Object prospectusRetrieveActionTaskRecord) {
    this.prospectusRetrieveActionTaskRecord = prospectusRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return prospectusRetrieveActionRequest
  **/

  public String getProspectusRetrieveActionRequest() {
    return prospectusRetrieveActionRequest;
  }

  public void setProspectusRetrieveActionRequest(String prospectusRetrieveActionRequest) {
    this.prospectusRetrieveActionRequest = prospectusRetrieveActionRequest;
  }


  /**
   * Get prospectusInstanceReport
   * @return prospectusInstanceReport
  **/

  public BQProspectusRetrieveInputModelProspectusInstanceReport getProspectusInstanceReport() {
    return prospectusInstanceReport;
  }

  public void setProspectusInstanceReport(BQProspectusRetrieveInputModelProspectusInstanceReport prospectusInstanceReport) {
    this.prospectusInstanceReport = prospectusInstanceReport;
  }


  /**
   * Get prospectusInstanceAnalysis
   * @return prospectusInstanceAnalysis
  **/

  public BQProspectusRetrieveInputModelProspectusInstanceAnalysis getProspectusInstanceAnalysis() {
    return prospectusInstanceAnalysis;
  }

  public void setProspectusInstanceAnalysis(BQProspectusRetrieveInputModelProspectusInstanceAnalysis prospectusInstanceAnalysis) {
    this.prospectusInstanceAnalysis = prospectusInstanceAnalysis;
  }


}

