package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInstrumentDefinitionRetrieveInputModelInstrumentDefinitionInstanceAnalysis;
import org.bian.dto.BQInstrumentDefinitionRetrieveInputModelInstrumentDefinitionInstanceReport;

import javax.validation.Valid;
  
/**
 * BQInstrumentDefinitionRetrieveInputModel
 */
public class BQInstrumentDefinitionRetrieveInputModel   {
  private Object instrumentDefinitionRetrieveActionTaskRecord = null;

  private String instrumentDefinitionRetrieveActionRequest = null;

  private BQInstrumentDefinitionRetrieveInputModelInstrumentDefinitionInstanceReport instrumentDefinitionInstanceReport = null;

  private BQInstrumentDefinitionRetrieveInputModelInstrumentDefinitionInstanceAnalysis instrumentDefinitionInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return instrumentDefinitionRetrieveActionTaskRecord
  **/

  public Object getInstrumentDefinitionRetrieveActionTaskRecord() {
    return instrumentDefinitionRetrieveActionTaskRecord;
  }

  public void setInstrumentDefinitionRetrieveActionTaskRecord(Object instrumentDefinitionRetrieveActionTaskRecord) {
    this.instrumentDefinitionRetrieveActionTaskRecord = instrumentDefinitionRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return instrumentDefinitionRetrieveActionRequest
  **/

  public String getInstrumentDefinitionRetrieveActionRequest() {
    return instrumentDefinitionRetrieveActionRequest;
  }

  public void setInstrumentDefinitionRetrieveActionRequest(String instrumentDefinitionRetrieveActionRequest) {
    this.instrumentDefinitionRetrieveActionRequest = instrumentDefinitionRetrieveActionRequest;
  }


  /**
   * Get instrumentDefinitionInstanceReport
   * @return instrumentDefinitionInstanceReport
  **/

  public BQInstrumentDefinitionRetrieveInputModelInstrumentDefinitionInstanceReport getInstrumentDefinitionInstanceReport() {
    return instrumentDefinitionInstanceReport;
  }

  public void setInstrumentDefinitionInstanceReport(BQInstrumentDefinitionRetrieveInputModelInstrumentDefinitionInstanceReport instrumentDefinitionInstanceReport) {
    this.instrumentDefinitionInstanceReport = instrumentDefinitionInstanceReport;
  }


  /**
   * Get instrumentDefinitionInstanceAnalysis
   * @return instrumentDefinitionInstanceAnalysis
  **/

  public BQInstrumentDefinitionRetrieveInputModelInstrumentDefinitionInstanceAnalysis getInstrumentDefinitionInstanceAnalysis() {
    return instrumentDefinitionInstanceAnalysis;
  }

  public void setInstrumentDefinitionInstanceAnalysis(BQInstrumentDefinitionRetrieveInputModelInstrumentDefinitionInstanceAnalysis instrumentDefinitionInstanceAnalysis) {
    this.instrumentDefinitionInstanceAnalysis = instrumentDefinitionInstanceAnalysis;
  }


}

