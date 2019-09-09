package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPlacementRetrieveOutputModelPlacementInstanceAnalysis;
import org.bian.dto.BQPlacementRetrieveOutputModelPlacementInstanceRecord;
import org.bian.dto.BQPlacementRetrieveOutputModelPlacementInstanceReport;

import javax.validation.Valid;
  
/**
 * BQPlacementRetrieveOutputModel
 */
public class BQPlacementRetrieveOutputModel   {
  private BQPlacementRetrieveOutputModelPlacementInstanceRecord placementInstanceRecord = null;

  private String placementRetrieveActionTaskReference = null;

  private Object placementRetrieveActionTaskRecord = null;

  private String placementRetrieveActionResponse = null;

  private BQPlacementRetrieveOutputModelPlacementInstanceReport placementInstanceReport = null;

  private BQPlacementRetrieveOutputModelPlacementInstanceAnalysis placementInstanceAnalysis = null;


  /**
   * Get placementInstanceRecord
   * @return placementInstanceRecord
  **/

  public BQPlacementRetrieveOutputModelPlacementInstanceRecord getPlacementInstanceRecord() {
    return placementInstanceRecord;
  }

  public void setPlacementInstanceRecord(BQPlacementRetrieveOutputModelPlacementInstanceRecord placementInstanceRecord) {
    this.placementInstanceRecord = placementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Placement instance retrieve service call 
   * @return placementRetrieveActionTaskReference
  **/

  public String getPlacementRetrieveActionTaskReference() {
    return placementRetrieveActionTaskReference;
  }

  public void setPlacementRetrieveActionTaskReference(String placementRetrieveActionTaskReference) {
    this.placementRetrieveActionTaskReference = placementRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return placementRetrieveActionTaskRecord
  **/

  public Object getPlacementRetrieveActionTaskRecord() {
    return placementRetrieveActionTaskRecord;
  }

  public void setPlacementRetrieveActionTaskRecord(Object placementRetrieveActionTaskRecord) {
    this.placementRetrieveActionTaskRecord = placementRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return placementRetrieveActionResponse
  **/

  public String getPlacementRetrieveActionResponse() {
    return placementRetrieveActionResponse;
  }

  public void setPlacementRetrieveActionResponse(String placementRetrieveActionResponse) {
    this.placementRetrieveActionResponse = placementRetrieveActionResponse;
  }


  /**
   * Get placementInstanceReport
   * @return placementInstanceReport
  **/

  public BQPlacementRetrieveOutputModelPlacementInstanceReport getPlacementInstanceReport() {
    return placementInstanceReport;
  }

  public void setPlacementInstanceReport(BQPlacementRetrieveOutputModelPlacementInstanceReport placementInstanceReport) {
    this.placementInstanceReport = placementInstanceReport;
  }


  /**
   * Get placementInstanceAnalysis
   * @return placementInstanceAnalysis
  **/

  public BQPlacementRetrieveOutputModelPlacementInstanceAnalysis getPlacementInstanceAnalysis() {
    return placementInstanceAnalysis;
  }

  public void setPlacementInstanceAnalysis(BQPlacementRetrieveOutputModelPlacementInstanceAnalysis placementInstanceAnalysis) {
    this.placementInstanceAnalysis = placementInstanceAnalysis;
  }


}

