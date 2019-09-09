package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInstrumentDefinitionUpdateInputModelInstrumentDefinitionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQInstrumentDefinitionUpdateInputModel
 */
public class BQInstrumentDefinitionUpdateInputModel   {
  private String eCMDCMFulfillmentArrangementInstanceReference = null;

  private String instrumentDefinitionInstanceReference = null;

  private BQInstrumentDefinitionUpdateInputModelInstrumentDefinitionInstanceRecord instrumentDefinitionInstanceRecord = null;

  private Object instrumentDefinitionUpdateActionTaskRecord = null;

  private String instrumentDefinitionUpdateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent ECM-DCM Fulfillment Arrangement instance 
   * @return eCMDCMFulfillmentArrangementInstanceReference
  **/

  public String getECMDCMFulfillmentArrangementInstanceReference() {
    return eCMDCMFulfillmentArrangementInstanceReference;
  }

  public void setECMDCMFulfillmentArrangementInstanceReference(String eCMDCMFulfillmentArrangementInstanceReference) {
    this.eCMDCMFulfillmentArrangementInstanceReference = eCMDCMFulfillmentArrangementInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Instrument Definition instance 
   * @return instrumentDefinitionInstanceReference
  **/

  public String getInstrumentDefinitionInstanceReference() {
    return instrumentDefinitionInstanceReference;
  }

  public void setInstrumentDefinitionInstanceReference(String instrumentDefinitionInstanceReference) {
    this.instrumentDefinitionInstanceReference = instrumentDefinitionInstanceReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return instrumentDefinitionUpdateActionRequest
  **/

  public String getInstrumentDefinitionUpdateActionRequest() {
    return instrumentDefinitionUpdateActionRequest;
  }

  public void setInstrumentDefinitionUpdateActionRequest(String instrumentDefinitionUpdateActionRequest) {
    this.instrumentDefinitionUpdateActionRequest = instrumentDefinitionUpdateActionRequest;
  }


}

