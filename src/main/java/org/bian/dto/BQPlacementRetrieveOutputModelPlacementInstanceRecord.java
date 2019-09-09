package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPlacementRetrieveOutputModelPlacementInstanceRecordPlacementWorkTaskRecord;

import javax.validation.Valid;
  
/**
 * BQPlacementRetrieveOutputModelPlacementInstanceRecord
 */
public class BQPlacementRetrieveOutputModelPlacementInstanceRecord   {
  private String employeeBusinessUnitReference = null;

  private String prospectList = null;

  private String placementRoadshowSchedule = null;

  private BQPlacementRetrieveOutputModelPlacementInstanceRecordPlacementWorkTaskRecord placementWorkTaskRecord = null;

  private String placementTransaction = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Business unit and or employee responsible for the placement road show and issuance transaction 
   * @return employeeBusinessUnitReference
  **/

  public String getEmployeeBusinessUnitReference() {
    return employeeBusinessUnitReference;
  }

  public void setEmployeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: List of target investors for private placement 
   * @return prospectList
  **/

  public String getProspectList() {
    return prospectList;
  }

  public void setProspectList(String prospectList) {
    this.prospectList = prospectList;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule and details of investor presentations 
   * @return placementRoadshowSchedule
  **/

  public String getPlacementRoadshowSchedule() {
    return placementRoadshowSchedule;
  }

  public void setPlacementRoadshowSchedule(String placementRoadshowSchedule) {
    this.placementRoadshowSchedule = placementRoadshowSchedule;
  }


  /**
   * Get placementWorkTaskRecord
   * @return placementWorkTaskRecord
  **/

  public BQPlacementRetrieveOutputModelPlacementInstanceRecordPlacementWorkTaskRecord getPlacementWorkTaskRecord() {
    return placementWorkTaskRecord;
  }

  public void setPlacementWorkTaskRecord(BQPlacementRetrieveOutputModelPlacementInstanceRecordPlacementWorkTaskRecord placementWorkTaskRecord) {
    this.placementWorkTaskRecord = placementWorkTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The consolidated details of the investments obtained for the issuance - details investor participation for private placement and primary market transaction references for public offerings 
   * @return placementTransaction
  **/

  public String getPlacementTransaction() {
    return placementTransaction;
  }

  public void setPlacementTransaction(String placementTransaction) {
    this.placementTransaction = placementTransaction;
  }


}

