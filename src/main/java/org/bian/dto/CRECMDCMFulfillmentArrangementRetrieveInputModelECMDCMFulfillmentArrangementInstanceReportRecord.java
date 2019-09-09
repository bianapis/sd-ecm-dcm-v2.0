package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRECMDCMFulfillmentArrangementRetrieveInputModelECMDCMFulfillmentArrangementInstanceReportRecord
 */
public class CRECMDCMFulfillmentArrangementRetrieveInputModelECMDCMFulfillmentArrangementInstanceReportRecord   {
  private String eCMDCMFulfillmentArrangementInstanceReportReference = null;

  private String eCMDCMFulfillmentArrangementInstanceReportType = null;

  private String eCMDCMFulfillmentArrangementInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return eCMDCMFulfillmentArrangementInstanceReportReference
  **/

  public String getECMDCMFulfillmentArrangementInstanceReportReference() {
    return eCMDCMFulfillmentArrangementInstanceReportReference;
  }

  public void setECMDCMFulfillmentArrangementInstanceReportReference(String eCMDCMFulfillmentArrangementInstanceReportReference) {
    this.eCMDCMFulfillmentArrangementInstanceReportReference = eCMDCMFulfillmentArrangementInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return eCMDCMFulfillmentArrangementInstanceReportType
  **/

  public String getECMDCMFulfillmentArrangementInstanceReportType() {
    return eCMDCMFulfillmentArrangementInstanceReportType;
  }

  public void setECMDCMFulfillmentArrangementInstanceReportType(String eCMDCMFulfillmentArrangementInstanceReportType) {
    this.eCMDCMFulfillmentArrangementInstanceReportType = eCMDCMFulfillmentArrangementInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return eCMDCMFulfillmentArrangementInstanceReportParameters
  **/

  public String getECMDCMFulfillmentArrangementInstanceReportParameters() {
    return eCMDCMFulfillmentArrangementInstanceReportParameters;
  }

  public void setECMDCMFulfillmentArrangementInstanceReportParameters(String eCMDCMFulfillmentArrangementInstanceReportParameters) {
    this.eCMDCMFulfillmentArrangementInstanceReportParameters = eCMDCMFulfillmentArrangementInstanceReportParameters;
  }


}

