package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPlacementRequestOutputModelPlacementInstanceRecordPlacementWorkTaskRecord
 */
public class BQPlacementRequestOutputModelPlacementInstanceRecordPlacementWorkTaskRecord   {
  private String placementWorkTaskType = null;

  private String placementWorkTaskDescription = null;

  private String placementWorkTaskWorkProducts = null;

  private String documentDirectoryEntryInstanceReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of work task (e.g. prospect scheduling, presentation, negotiation) 
   * @return placementWorkTaskType
  **/

  public String getPlacementWorkTaskType() {
    return placementWorkTaskType;
  }

  public void setPlacementWorkTaskType(String placementWorkTaskType) {
    this.placementWorkTaskType = placementWorkTaskType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the task performed 
   * @return placementWorkTaskDescription
  **/

  public String getPlacementWorkTaskDescription() {
    return placementWorkTaskDescription;
  }

  public void setPlacementWorkTaskDescription(String placementWorkTaskDescription) {
    this.placementWorkTaskDescription = placementWorkTaskDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: File of consolidated notes, forms and documents used and generated through the work task 
   * @return placementWorkTaskWorkProducts
  **/

  public String getPlacementWorkTaskWorkProducts() {
    return placementWorkTaskWorkProducts;
  }

  public void setPlacementWorkTaskWorkProducts(String placementWorkTaskWorkProducts) {
    this.placementWorkTaskWorkProducts = placementWorkTaskWorkProducts;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to associated documents 
   * @return documentDirectoryEntryInstanceReference
  **/

  public String getDocumentDirectoryEntryInstanceReference() {
    return documentDirectoryEntryInstanceReference;
  }

  public void setDocumentDirectoryEntryInstanceReference(String documentDirectoryEntryInstanceReference) {
    this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
  }


}

