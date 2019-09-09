package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRECMDCMFulfillmentArrangementRetrieveOutputModelCRECMDCMFulfillmentArrangementInstanceRecord;
import org.bian.dto.CRECMDCMFulfillmentArrangementRetrieveOutputModelECMDCMFulfillmentArrangementInstanceAnalysis;
import org.bian.dto.CRECMDCMFulfillmentArrangementRetrieveOutputModelECMDCMFulfillmentArrangementInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRECMDCMFulfillmentArrangementRetrieveOutputModel
 */
public class CRECMDCMFulfillmentArrangementRetrieveOutputModel   {
  private CRECMDCMFulfillmentArrangementRetrieveOutputModelCRECMDCMFulfillmentArrangementInstanceRecord cRECMDCMFulfillmentArrangementInstanceRecord = null;

  private String eCMDCMFulfillmentArrangementRetrieveActionTaskReference = null;

  private Object eCMDCMFulfillmentArrangementRetrieveActionTaskRecord = null;

  private String eCMDCMFulfillmentArrangementRetrieveActionResponse = null;

  private CRECMDCMFulfillmentArrangementRetrieveOutputModelECMDCMFulfillmentArrangementInstanceReportRecord eCMDCMFulfillmentArrangementInstanceReportRecord = null;

  private CRECMDCMFulfillmentArrangementRetrieveOutputModelECMDCMFulfillmentArrangementInstanceAnalysis eCMDCMFulfillmentArrangementInstanceAnalysis = null;


  /**
   * Get cRECMDCMFulfillmentArrangementInstanceRecord
   * @return cRECMDCMFulfillmentArrangementInstanceRecord
  **/

  @JsonProperty("cRECMDCMFulfillmentArrangementInstanceRecord")
  public CRECMDCMFulfillmentArrangementRetrieveOutputModelCRECMDCMFulfillmentArrangementInstanceRecord getCRECMDCMFulfillmentArrangementInstanceRecord() {
    return cRECMDCMFulfillmentArrangementInstanceRecord;
  }

  public void setCRECMDCMFulfillmentArrangementInstanceRecord(CRECMDCMFulfillmentArrangementRetrieveOutputModelCRECMDCMFulfillmentArrangementInstanceRecord cRECMDCMFulfillmentArrangementInstanceRecord) {
    this.cRECMDCMFulfillmentArrangementInstanceRecord = cRECMDCMFulfillmentArrangementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a ECM-DCM Fulfillment Arrangement instance retrieve service call 
   * @return eCMDCMFulfillmentArrangementRetrieveActionTaskReference
  **/

  @JsonProperty("eCMDCMFulfillmentArrangementRetrieveActionTaskReference")
  public String getECMDCMFulfillmentArrangementRetrieveActionTaskReference() {
    return eCMDCMFulfillmentArrangementRetrieveActionTaskReference;
  }

  public void setECMDCMFulfillmentArrangementRetrieveActionTaskReference(String eCMDCMFulfillmentArrangementRetrieveActionTaskReference) {
    this.eCMDCMFulfillmentArrangementRetrieveActionTaskReference = eCMDCMFulfillmentArrangementRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return eCMDCMFulfillmentArrangementRetrieveActionTaskRecord
  **/

  @JsonProperty("eCMDCMFulfillmentArrangementRetrieveActionTaskRecord")
  public Object getECMDCMFulfillmentArrangementRetrieveActionTaskRecord() {
    return eCMDCMFulfillmentArrangementRetrieveActionTaskRecord;
  }

  public void setECMDCMFulfillmentArrangementRetrieveActionTaskRecord(Object eCMDCMFulfillmentArrangementRetrieveActionTaskRecord) {
    this.eCMDCMFulfillmentArrangementRetrieveActionTaskRecord = eCMDCMFulfillmentArrangementRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return eCMDCMFulfillmentArrangementRetrieveActionResponse
  **/

  @JsonProperty("eCMDCMFulfillmentArrangementRetrieveActionResponse")
  public String getECMDCMFulfillmentArrangementRetrieveActionResponse() {
    return eCMDCMFulfillmentArrangementRetrieveActionResponse;
  }

  public void setECMDCMFulfillmentArrangementRetrieveActionResponse(String eCMDCMFulfillmentArrangementRetrieveActionResponse) {
    this.eCMDCMFulfillmentArrangementRetrieveActionResponse = eCMDCMFulfillmentArrangementRetrieveActionResponse;
  }


  /**
   * Get eCMDCMFulfillmentArrangementInstanceReportRecord
   * @return eCMDCMFulfillmentArrangementInstanceReportRecord
  **/

  @JsonProperty("eCMDCMFulfillmentArrangementInstanceReportRecord")
  public CRECMDCMFulfillmentArrangementRetrieveOutputModelECMDCMFulfillmentArrangementInstanceReportRecord getECMDCMFulfillmentArrangementInstanceReportRecord() {
    return eCMDCMFulfillmentArrangementInstanceReportRecord;
  }

  public void setECMDCMFulfillmentArrangementInstanceReportRecord(CRECMDCMFulfillmentArrangementRetrieveOutputModelECMDCMFulfillmentArrangementInstanceReportRecord eCMDCMFulfillmentArrangementInstanceReportRecord) {
    this.eCMDCMFulfillmentArrangementInstanceReportRecord = eCMDCMFulfillmentArrangementInstanceReportRecord;
  }


  /**
   * Get eCMDCMFulfillmentArrangementInstanceAnalysis
   * @return eCMDCMFulfillmentArrangementInstanceAnalysis
  **/

  @JsonProperty("eCMDCMFulfillmentArrangementInstanceAnalysis")
  public CRECMDCMFulfillmentArrangementRetrieveOutputModelECMDCMFulfillmentArrangementInstanceAnalysis getECMDCMFulfillmentArrangementInstanceAnalysis() {
    return eCMDCMFulfillmentArrangementInstanceAnalysis;
  }

  public void setECMDCMFulfillmentArrangementInstanceAnalysis(CRECMDCMFulfillmentArrangementRetrieveOutputModelECMDCMFulfillmentArrangementInstanceAnalysis eCMDCMFulfillmentArrangementInstanceAnalysis) {
    this.eCMDCMFulfillmentArrangementInstanceAnalysis = eCMDCMFulfillmentArrangementInstanceAnalysis;
  }


}

