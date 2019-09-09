package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProspectusRequestInputModelProspectusInstanceRecordProspectusWorkTaskRecord;

import javax.validation.Valid;
  
/**
 * BQProspectusRequestInputModelProspectusInstanceRecord
 */
public class BQProspectusRequestInputModelProspectusInstanceRecord   {
  private String employeeBusinessUnitReference = null;

  private BQProspectusRequestInputModelProspectusInstanceRecordProspectusWorkTaskRecord prospectusWorkTaskRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Business unit and or employee responsible for the prospectus development 
   * @return employeeBusinessUnitReference
  **/

  public String getEmployeeBusinessUnitReference() {
    return employeeBusinessUnitReference;
  }

  public void setEmployeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
  }


  /**
   * Get prospectusWorkTaskRecord
   * @return prospectusWorkTaskRecord
  **/

  public BQProspectusRequestInputModelProspectusInstanceRecordProspectusWorkTaskRecord getProspectusWorkTaskRecord() {
    return prospectusWorkTaskRecord;
  }

  public void setProspectusWorkTaskRecord(BQProspectusRequestInputModelProspectusInstanceRecordProspectusWorkTaskRecord prospectusWorkTaskRecord) {
    this.prospectusWorkTaskRecord = prospectusWorkTaskRecord;
  }


}

