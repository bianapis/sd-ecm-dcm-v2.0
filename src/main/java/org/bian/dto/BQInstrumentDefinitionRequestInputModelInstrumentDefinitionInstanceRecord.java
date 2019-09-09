package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInstrumentDefinitionRequestInputModelInstrumentDefinitionInstanceRecordInstrumentDefinitionWorkTaskRecord;

import javax.validation.Valid;
  
/**
 * BQInstrumentDefinitionRequestInputModelInstrumentDefinitionInstanceRecord
 */
public class BQInstrumentDefinitionRequestInputModelInstrumentDefinitionInstanceRecord   {
  private String employeeBusinessUnitReference = null;

  private BQInstrumentDefinitionRequestInputModelInstrumentDefinitionInstanceRecordInstrumentDefinitionWorkTaskRecord instrumentDefinitionWorkTaskRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Business unit and or employee responsible for the financial instrument specification - (includes financial engineers, legal/regulatory and tax specialists as appropriate) 
   * @return employeeBusinessUnitReference
  **/

  public String getEmployeeBusinessUnitReference() {
    return employeeBusinessUnitReference;
  }

  public void setEmployeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
  }


  /**
   * Get instrumentDefinitionWorkTaskRecord
   * @return instrumentDefinitionWorkTaskRecord
  **/

  public BQInstrumentDefinitionRequestInputModelInstrumentDefinitionInstanceRecordInstrumentDefinitionWorkTaskRecord getInstrumentDefinitionWorkTaskRecord() {
    return instrumentDefinitionWorkTaskRecord;
  }

  public void setInstrumentDefinitionWorkTaskRecord(BQInstrumentDefinitionRequestInputModelInstrumentDefinitionInstanceRecordInstrumentDefinitionWorkTaskRecord instrumentDefinitionWorkTaskRecord) {
    this.instrumentDefinitionWorkTaskRecord = instrumentDefinitionWorkTaskRecord;
  }


}

