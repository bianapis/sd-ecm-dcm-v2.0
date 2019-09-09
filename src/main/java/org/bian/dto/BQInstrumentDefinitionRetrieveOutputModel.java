package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInstrumentDefinitionRetrieveOutputModelInstrumentDefinitionInstanceAnalysis;
import org.bian.dto.BQInstrumentDefinitionRetrieveOutputModelInstrumentDefinitionInstanceRecord;
import org.bian.dto.BQInstrumentDefinitionRetrieveOutputModelInstrumentDefinitionInstanceReport;

import javax.validation.Valid;
  
/**
 * BQInstrumentDefinitionRetrieveOutputModel
 */
public class BQInstrumentDefinitionRetrieveOutputModel   {
  private BQInstrumentDefinitionRetrieveOutputModelInstrumentDefinitionInstanceRecord instrumentDefinitionInstanceRecord = null;

  private String instrumentDefinitionRetrieveActionTaskReference = null;

  private Object instrumentDefinitionRetrieveActionTaskRecord = null;

  private String instrumentDefinitionRetrieveActionResponse = null;

  private BQInstrumentDefinitionRetrieveOutputModelInstrumentDefinitionInstanceReport instrumentDefinitionInstanceReport = null;

  private BQInstrumentDefinitionRetrieveOutputModelInstrumentDefinitionInstanceAnalysis instrumentDefinitionInstanceAnalysis = null;


  /**
   * Get instrumentDefinitionInstanceRecord
   * @return instrumentDefinitionInstanceRecord
  **/

  public BQInstrumentDefinitionRetrieveOutputModelInstrumentDefinitionInstanceRecord getInstrumentDefinitionInstanceRecord() {
    return instrumentDefinitionInstanceRecord;
  }

  public void setInstrumentDefinitionInstanceRecord(BQInstrumentDefinitionRetrieveOutputModelInstrumentDefinitionInstanceRecord instrumentDefinitionInstanceRecord) {
    this.instrumentDefinitionInstanceRecord = instrumentDefinitionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Instrument Definition instance retrieve service call 
   * @return instrumentDefinitionRetrieveActionTaskReference
  **/

  public String getInstrumentDefinitionRetrieveActionTaskReference() {
    return instrumentDefinitionRetrieveActionTaskReference;
  }

  public void setInstrumentDefinitionRetrieveActionTaskReference(String instrumentDefinitionRetrieveActionTaskReference) {
    this.instrumentDefinitionRetrieveActionTaskReference = instrumentDefinitionRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return instrumentDefinitionRetrieveActionResponse
  **/

  public String getInstrumentDefinitionRetrieveActionResponse() {
    return instrumentDefinitionRetrieveActionResponse;
  }

  public void setInstrumentDefinitionRetrieveActionResponse(String instrumentDefinitionRetrieveActionResponse) {
    this.instrumentDefinitionRetrieveActionResponse = instrumentDefinitionRetrieveActionResponse;
  }


  /**
   * Get instrumentDefinitionInstanceReport
   * @return instrumentDefinitionInstanceReport
  **/

  public BQInstrumentDefinitionRetrieveOutputModelInstrumentDefinitionInstanceReport getInstrumentDefinitionInstanceReport() {
    return instrumentDefinitionInstanceReport;
  }

  public void setInstrumentDefinitionInstanceReport(BQInstrumentDefinitionRetrieveOutputModelInstrumentDefinitionInstanceReport instrumentDefinitionInstanceReport) {
    this.instrumentDefinitionInstanceReport = instrumentDefinitionInstanceReport;
  }


  /**
   * Get instrumentDefinitionInstanceAnalysis
   * @return instrumentDefinitionInstanceAnalysis
  **/

  public BQInstrumentDefinitionRetrieveOutputModelInstrumentDefinitionInstanceAnalysis getInstrumentDefinitionInstanceAnalysis() {
    return instrumentDefinitionInstanceAnalysis;
  }

  public void setInstrumentDefinitionInstanceAnalysis(BQInstrumentDefinitionRetrieveOutputModelInstrumentDefinitionInstanceAnalysis instrumentDefinitionInstanceAnalysis) {
    this.instrumentDefinitionInstanceAnalysis = instrumentDefinitionInstanceAnalysis;
  }


}

