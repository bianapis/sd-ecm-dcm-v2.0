package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProspectusRetrieveOutputModelProspectusInstanceAnalysis;
import org.bian.dto.BQProspectusRetrieveOutputModelProspectusInstanceRecord;
import org.bian.dto.BQProspectusRetrieveOutputModelProspectusInstanceReport;

import javax.validation.Valid;
  
/**
 * BQProspectusRetrieveOutputModel
 */
public class BQProspectusRetrieveOutputModel   {
  private BQProspectusRetrieveOutputModelProspectusInstanceRecord prospectusInstanceRecord = null;

  private String prospectusRetrieveActionTaskReference = null;

  private Object prospectusRetrieveActionTaskRecord = null;

  private String prospectusRetrieveActionResponse = null;

  private BQProspectusRetrieveOutputModelProspectusInstanceReport prospectusInstanceReport = null;

  private BQProspectusRetrieveOutputModelProspectusInstanceAnalysis prospectusInstanceAnalysis = null;


  /**
   * Get prospectusInstanceRecord
   * @return prospectusInstanceRecord
  **/

  public BQProspectusRetrieveOutputModelProspectusInstanceRecord getProspectusInstanceRecord() {
    return prospectusInstanceRecord;
  }

  public void setProspectusInstanceRecord(BQProspectusRetrieveOutputModelProspectusInstanceRecord prospectusInstanceRecord) {
    this.prospectusInstanceRecord = prospectusInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Prospectus instance retrieve service call 
   * @return prospectusRetrieveActionTaskReference
  **/

  public String getProspectusRetrieveActionTaskReference() {
    return prospectusRetrieveActionTaskReference;
  }

  public void setProspectusRetrieveActionTaskReference(String prospectusRetrieveActionTaskReference) {
    this.prospectusRetrieveActionTaskReference = prospectusRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return prospectusRetrieveActionResponse
  **/

  public String getProspectusRetrieveActionResponse() {
    return prospectusRetrieveActionResponse;
  }

  public void setProspectusRetrieveActionResponse(String prospectusRetrieveActionResponse) {
    this.prospectusRetrieveActionResponse = prospectusRetrieveActionResponse;
  }


  /**
   * Get prospectusInstanceReport
   * @return prospectusInstanceReport
  **/

  public BQProspectusRetrieveOutputModelProspectusInstanceReport getProspectusInstanceReport() {
    return prospectusInstanceReport;
  }

  public void setProspectusInstanceReport(BQProspectusRetrieveOutputModelProspectusInstanceReport prospectusInstanceReport) {
    this.prospectusInstanceReport = prospectusInstanceReport;
  }


  /**
   * Get prospectusInstanceAnalysis
   * @return prospectusInstanceAnalysis
  **/

  public BQProspectusRetrieveOutputModelProspectusInstanceAnalysis getProspectusInstanceAnalysis() {
    return prospectusInstanceAnalysis;
  }

  public void setProspectusInstanceAnalysis(BQProspectusRetrieveOutputModelProspectusInstanceAnalysis prospectusInstanceAnalysis) {
    this.prospectusInstanceAnalysis = prospectusInstanceAnalysis;
  }


}

