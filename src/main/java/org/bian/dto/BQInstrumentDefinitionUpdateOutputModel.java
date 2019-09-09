package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInstrumentDefinitionUpdateInputModelInstrumentDefinitionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQInstrumentDefinitionUpdateOutputModel
 */
public class BQInstrumentDefinitionUpdateOutputModel   {
  private BQInstrumentDefinitionUpdateInputModelInstrumentDefinitionInstanceRecord instrumentDefinitionInstanceRecord = null;

  private String instrumentDefinitionUpdateActionTaskReference = null;

  private Object instrumentDefinitionUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get instrumentDefinitionInstanceRecord
   * @return instrumentDefinitionInstanceRecord
  **/

  public BQInstrumentDefinitionUpdateInputModelInstrumentDefinitionInstanceRecord getInstrumentDefinitionInstanceRecord() {
    return instrumentDefinitionInstanceRecord;
  }

  public void setInstrumentDefinitionInstanceRecord(BQInstrumentDefinitionUpdateInputModelInstrumentDefinitionInstanceRecord instrumentDefinitionInstanceRecord) {
    this.instrumentDefinitionInstanceRecord = instrumentDefinitionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return instrumentDefinitionUpdateActionTaskReference
  **/

  public String getInstrumentDefinitionUpdateActionTaskReference() {
    return instrumentDefinitionUpdateActionTaskReference;
  }

  public void setInstrumentDefinitionUpdateActionTaskReference(String instrumentDefinitionUpdateActionTaskReference) {
    this.instrumentDefinitionUpdateActionTaskReference = instrumentDefinitionUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return instrumentDefinitionUpdateActionTaskRecord
  **/

  public Object getInstrumentDefinitionUpdateActionTaskRecord() {
    return instrumentDefinitionUpdateActionTaskRecord;
  }

  public void setInstrumentDefinitionUpdateActionTaskRecord(Object instrumentDefinitionUpdateActionTaskRecord) {
    this.instrumentDefinitionUpdateActionTaskRecord = instrumentDefinitionUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

