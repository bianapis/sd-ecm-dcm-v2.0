package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInstrumentDefinitionRequestInputModelInstrumentDefinitionInstanceRecord;
import org.bian.dto.CRECMDCMFulfillmentArrangementRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQInstrumentDefinitionRequestInputModel
 */
public class BQInstrumentDefinitionRequestInputModel   {
  private String eCMDCMFulfillmentArrangementInstanceReference = null;

  private String instrumentDefinitionInstanceReference = null;

  private BQInstrumentDefinitionRequestInputModelInstrumentDefinitionInstanceRecord instrumentDefinitionInstanceRecord = null;

  private Object instrumentDefinitionRequestActionTaskRecord = null;

  private CRECMDCMFulfillmentArrangementRequestInputModelRequestRecordType requestRecordType = null;


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

  public BQInstrumentDefinitionRequestInputModelInstrumentDefinitionInstanceRecord getInstrumentDefinitionInstanceRecord() {
    return instrumentDefinitionInstanceRecord;
  }

  public void setInstrumentDefinitionInstanceRecord(BQInstrumentDefinitionRequestInputModelInstrumentDefinitionInstanceRecord instrumentDefinitionInstanceRecord) {
    this.instrumentDefinitionInstanceRecord = instrumentDefinitionInstanceRecord;
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
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRECMDCMFulfillmentArrangementRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRECMDCMFulfillmentArrangementRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

