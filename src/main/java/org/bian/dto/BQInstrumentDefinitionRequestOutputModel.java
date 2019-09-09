package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInstrumentDefinitionRequestOutputModelInstrumentDefinitionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQInstrumentDefinitionRequestOutputModel
 */
public class BQInstrumentDefinitionRequestOutputModel   {
  private BQInstrumentDefinitionRequestOutputModelInstrumentDefinitionInstanceRecord instrumentDefinitionInstanceRecord = null;

  private String instrumentDefinitionRequestActionTaskReference = null;

  private Object instrumentDefinitionRequestActionTaskRecord = null;

  private String instrumentDefinitionRequestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get instrumentDefinitionInstanceRecord
   * @return instrumentDefinitionInstanceRecord
  **/

  public BQInstrumentDefinitionRequestOutputModelInstrumentDefinitionInstanceRecord getInstrumentDefinitionInstanceRecord() {
    return instrumentDefinitionInstanceRecord;
  }

  public void setInstrumentDefinitionInstanceRecord(BQInstrumentDefinitionRequestOutputModelInstrumentDefinitionInstanceRecord instrumentDefinitionInstanceRecord) {
    this.instrumentDefinitionInstanceRecord = instrumentDefinitionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Instrument Definition instance request service call 
   * @return instrumentDefinitionRequestActionTaskReference
  **/

  public String getInstrumentDefinitionRequestActionTaskReference() {
    return instrumentDefinitionRequestActionTaskReference;
  }

  public void setInstrumentDefinitionRequestActionTaskReference(String instrumentDefinitionRequestActionTaskReference) {
    this.instrumentDefinitionRequestActionTaskReference = instrumentDefinitionRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return instrumentDefinitionRequestActionTaskRecord
  **/

  public Object getInstrumentDefinitionRequestActionTaskRecord() {
    return instrumentDefinitionRequestActionTaskRecord;
  }

  public void setInstrumentDefinitionRequestActionTaskRecord(Object instrumentDefinitionRequestActionTaskRecord) {
    this.instrumentDefinitionRequestActionTaskRecord = instrumentDefinitionRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Instrument Definition service request record 
   * @return instrumentDefinitionRequestRecordReference
  **/

  public String getInstrumentDefinitionRequestRecordReference() {
    return instrumentDefinitionRequestRecordReference;
  }

  public void setInstrumentDefinitionRequestRecordReference(String instrumentDefinitionRequestRecordReference) {
    this.instrumentDefinitionRequestRecordReference = instrumentDefinitionRequestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

