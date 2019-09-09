package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProspectusUpdateInputModelProspectusInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQProspectusUpdateOutputModel
 */
public class BQProspectusUpdateOutputModel   {
  private BQProspectusUpdateInputModelProspectusInstanceRecord prospectusInstanceRecord = null;

  private String prospectusUpdateActionTaskReference = null;

  private Object prospectusUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get prospectusInstanceRecord
   * @return prospectusInstanceRecord
  **/

  public BQProspectusUpdateInputModelProspectusInstanceRecord getProspectusInstanceRecord() {
    return prospectusInstanceRecord;
  }

  public void setProspectusInstanceRecord(BQProspectusUpdateInputModelProspectusInstanceRecord prospectusInstanceRecord) {
    this.prospectusInstanceRecord = prospectusInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return prospectusUpdateActionTaskReference
  **/

  public String getProspectusUpdateActionTaskReference() {
    return prospectusUpdateActionTaskReference;
  }

  public void setProspectusUpdateActionTaskReference(String prospectusUpdateActionTaskReference) {
    this.prospectusUpdateActionTaskReference = prospectusUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return prospectusUpdateActionTaskRecord
  **/

  public Object getProspectusUpdateActionTaskRecord() {
    return prospectusUpdateActionTaskRecord;
  }

  public void setProspectusUpdateActionTaskRecord(Object prospectusUpdateActionTaskRecord) {
    this.prospectusUpdateActionTaskRecord = prospectusUpdateActionTaskRecord;
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

