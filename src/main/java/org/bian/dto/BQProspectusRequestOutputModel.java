package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProspectusRequestOutputModelProspectusInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQProspectusRequestOutputModel
 */
public class BQProspectusRequestOutputModel   {
  private BQProspectusRequestOutputModelProspectusInstanceRecord prospectusInstanceRecord = null;

  private String prospectusRequestActionTaskReference = null;

  private Object prospectusRequestActionTaskRecord = null;

  private String prospectusRequestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get prospectusInstanceRecord
   * @return prospectusInstanceRecord
  **/

  public BQProspectusRequestOutputModelProspectusInstanceRecord getProspectusInstanceRecord() {
    return prospectusInstanceRecord;
  }

  public void setProspectusInstanceRecord(BQProspectusRequestOutputModelProspectusInstanceRecord prospectusInstanceRecord) {
    this.prospectusInstanceRecord = prospectusInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Prospectus instance request service call 
   * @return prospectusRequestActionTaskReference
  **/

  public String getProspectusRequestActionTaskReference() {
    return prospectusRequestActionTaskReference;
  }

  public void setProspectusRequestActionTaskReference(String prospectusRequestActionTaskReference) {
    this.prospectusRequestActionTaskReference = prospectusRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return prospectusRequestActionTaskRecord
  **/

  public Object getProspectusRequestActionTaskRecord() {
    return prospectusRequestActionTaskRecord;
  }

  public void setProspectusRequestActionTaskRecord(Object prospectusRequestActionTaskRecord) {
    this.prospectusRequestActionTaskRecord = prospectusRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Prospectus service request record 
   * @return prospectusRequestRecordReference
  **/

  public String getProspectusRequestRecordReference() {
    return prospectusRequestRecordReference;
  }

  public void setProspectusRequestRecordReference(String prospectusRequestRecordReference) {
    this.prospectusRequestRecordReference = prospectusRequestRecordReference;
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

