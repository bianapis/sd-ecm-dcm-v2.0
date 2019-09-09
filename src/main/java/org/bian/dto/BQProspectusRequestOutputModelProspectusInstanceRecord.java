package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProspectusRequestOutputModelProspectusInstanceRecordProspectusWorkTaskRecord;

import javax.validation.Valid;
  
/**
 * BQProspectusRequestOutputModelProspectusInstanceRecord
 */
public class BQProspectusRequestOutputModelProspectusInstanceRecord   {
  private String employeeBusinessUnitReference = null;

  private BQProspectusRequestOutputModelProspectusInstanceRecordProspectusWorkTaskRecord prospectusWorkTaskRecord = null;


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

  public BQProspectusRequestOutputModelProspectusInstanceRecordProspectusWorkTaskRecord getProspectusWorkTaskRecord() {
    return prospectusWorkTaskRecord;
  }

  public void setProspectusWorkTaskRecord(BQProspectusRequestOutputModelProspectusInstanceRecordProspectusWorkTaskRecord prospectusWorkTaskRecord) {
    this.prospectusWorkTaskRecord = prospectusWorkTaskRecord;
  }


}

