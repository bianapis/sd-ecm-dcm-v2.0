package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPlacementRetrieveInputModelPlacementInstanceAnalysis;
import org.bian.dto.BQPlacementRetrieveInputModelPlacementInstanceReport;

import javax.validation.Valid;
  
/**
 * BQPlacementRetrieveInputModel
 */
public class BQPlacementRetrieveInputModel   {
  private Object placementRetrieveActionTaskRecord = null;

  private String placementRetrieveActionRequest = null;

  private BQPlacementRetrieveInputModelPlacementInstanceReport placementInstanceReport = null;

  private BQPlacementRetrieveInputModelPlacementInstanceAnalysis placementInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return placementRetrieveActionRequest
  **/

  public String getPlacementRetrieveActionRequest() {
    return placementRetrieveActionRequest;
  }

  public void setPlacementRetrieveActionRequest(String placementRetrieveActionRequest) {
    this.placementRetrieveActionRequest = placementRetrieveActionRequest;
  }


  /**
   * Get placementInstanceReport
   * @return placementInstanceReport
  **/

  public BQPlacementRetrieveInputModelPlacementInstanceReport getPlacementInstanceReport() {
    return placementInstanceReport;
  }

  public void setPlacementInstanceReport(BQPlacementRetrieveInputModelPlacementInstanceReport placementInstanceReport) {
    this.placementInstanceReport = placementInstanceReport;
  }


  /**
   * Get placementInstanceAnalysis
   * @return placementInstanceAnalysis
  **/

  public BQPlacementRetrieveInputModelPlacementInstanceAnalysis getPlacementInstanceAnalysis() {
    return placementInstanceAnalysis;
  }

  public void setPlacementInstanceAnalysis(BQPlacementRetrieveInputModelPlacementInstanceAnalysis placementInstanceAnalysis) {
    this.placementInstanceAnalysis = placementInstanceAnalysis;
  }


}

