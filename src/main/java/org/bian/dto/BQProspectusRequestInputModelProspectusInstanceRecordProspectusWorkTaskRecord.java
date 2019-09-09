package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProspectusRequestInputModelProspectusInstanceRecordProspectusWorkTaskRecord
 */
public class BQProspectusRequestInputModelProspectusInstanceRecordProspectusWorkTaskRecord   {
  private String prospectusWorkTaskType = null;

  private String prospectusWorkTaskWorkProducts = null;

  private String documentDirectoryEntryInstanceReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of work task (e.g. financial analysis/comparison development, pricing negotiation, presentation development, legal/tax/compliance assurance) 
   * @return prospectusWorkTaskType
  **/

  public String getProspectusWorkTaskType() {
    return prospectusWorkTaskType;
  }

  public void setProspectusWorkTaskType(String prospectusWorkTaskType) {
    this.prospectusWorkTaskType = prospectusWorkTaskType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: File of consolidated notes, algorithms, financial market research, forms and documents for the work task 
   * @return prospectusWorkTaskWorkProducts
  **/

  public String getProspectusWorkTaskWorkProducts() {
    return prospectusWorkTaskWorkProducts;
  }

  public void setProspectusWorkTaskWorkProducts(String prospectusWorkTaskWorkProducts) {
    this.prospectusWorkTaskWorkProducts = prospectusWorkTaskWorkProducts;
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

