package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRECMDCMFulfillmentArrangementRetrieveInputModelECMDCMFulfillmentArrangementInstanceAnalysis;
import org.bian.dto.CRECMDCMFulfillmentArrangementRetrieveInputModelECMDCMFulfillmentArrangementInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRECMDCMFulfillmentArrangementRetrieveInputModel
 */
public class CRECMDCMFulfillmentArrangementRetrieveInputModel   {
  private Object eCMDCMFulfillmentArrangementRetrieveActionTaskRecord = null;

  private String eCMDCMFulfillmentArrangementRetrieveActionRequest = null;

  private CRECMDCMFulfillmentArrangementRetrieveInputModelECMDCMFulfillmentArrangementInstanceReportRecord eCMDCMFulfillmentArrangementInstanceReportRecord = null;

  private CRECMDCMFulfillmentArrangementRetrieveInputModelECMDCMFulfillmentArrangementInstanceAnalysis eCMDCMFulfillmentArrangementInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return eCMDCMFulfillmentArrangementRetrieveActionTaskRecord
  **/

  public Object getECMDCMFulfillmentArrangementRetrieveActionTaskRecord() {
    return eCMDCMFulfillmentArrangementRetrieveActionTaskRecord;
  }

  public void setECMDCMFulfillmentArrangementRetrieveActionTaskRecord(Object eCMDCMFulfillmentArrangementRetrieveActionTaskRecord) {
    this.eCMDCMFulfillmentArrangementRetrieveActionTaskRecord = eCMDCMFulfillmentArrangementRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return eCMDCMFulfillmentArrangementRetrieveActionRequest
  **/

  public String getECMDCMFulfillmentArrangementRetrieveActionRequest() {
    return eCMDCMFulfillmentArrangementRetrieveActionRequest;
  }

  public void setECMDCMFulfillmentArrangementRetrieveActionRequest(String eCMDCMFulfillmentArrangementRetrieveActionRequest) {
    this.eCMDCMFulfillmentArrangementRetrieveActionRequest = eCMDCMFulfillmentArrangementRetrieveActionRequest;
  }


  /**
   * Get eCMDCMFulfillmentArrangementInstanceReportRecord
   * @return eCMDCMFulfillmentArrangementInstanceReportRecord
  **/

  public CRECMDCMFulfillmentArrangementRetrieveInputModelECMDCMFulfillmentArrangementInstanceReportRecord getECMDCMFulfillmentArrangementInstanceReportRecord() {
    return eCMDCMFulfillmentArrangementInstanceReportRecord;
  }

  public void setECMDCMFulfillmentArrangementInstanceReportRecord(CRECMDCMFulfillmentArrangementRetrieveInputModelECMDCMFulfillmentArrangementInstanceReportRecord eCMDCMFulfillmentArrangementInstanceReportRecord) {
    this.eCMDCMFulfillmentArrangementInstanceReportRecord = eCMDCMFulfillmentArrangementInstanceReportRecord;
  }


  /**
   * Get eCMDCMFulfillmentArrangementInstanceAnalysis
   * @return eCMDCMFulfillmentArrangementInstanceAnalysis
  **/

  public CRECMDCMFulfillmentArrangementRetrieveInputModelECMDCMFulfillmentArrangementInstanceAnalysis getECMDCMFulfillmentArrangementInstanceAnalysis() {
    return eCMDCMFulfillmentArrangementInstanceAnalysis;
  }

  public void setECMDCMFulfillmentArrangementInstanceAnalysis(CRECMDCMFulfillmentArrangementRetrieveInputModelECMDCMFulfillmentArrangementInstanceAnalysis eCMDCMFulfillmentArrangementInstanceAnalysis) {
    this.eCMDCMFulfillmentArrangementInstanceAnalysis = eCMDCMFulfillmentArrangementInstanceAnalysis;
  }


}

