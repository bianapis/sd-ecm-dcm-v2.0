package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInstrumentDefinitionRequestInputModelInstrumentDefinitionInstanceRecordInstrumentDefinitionWorkTaskRecord
 */
public class BQInstrumentDefinitionRequestInputModelInstrumentDefinitionInstanceRecordInstrumentDefinitionWorkTaskRecord   {
  private String instrumentDefinitionWorkTaskType = null;

  private String instrumentDefinitionWorkTaskWorkProducts = null;

  private String documentDirectoryEntryInstanceReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of work task (e.g. financial engineering, tax optimization, regulatory compliance checks) 
   * @return instrumentDefinitionWorkTaskType
  **/

  public String getInstrumentDefinitionWorkTaskType() {
    return instrumentDefinitionWorkTaskType;
  }

  public void setInstrumentDefinitionWorkTaskType(String instrumentDefinitionWorkTaskType) {
    this.instrumentDefinitionWorkTaskType = instrumentDefinitionWorkTaskType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: File of consolidated notes, algorithms, financial market research, forms and documents for the work task 
   * @return instrumentDefinitionWorkTaskWorkProducts
  **/

  public String getInstrumentDefinitionWorkTaskWorkProducts() {
    return instrumentDefinitionWorkTaskWorkProducts;
  }

  public void setInstrumentDefinitionWorkTaskWorkProducts(String instrumentDefinitionWorkTaskWorkProducts) {
    this.instrumentDefinitionWorkTaskWorkProducts = instrumentDefinitionWorkTaskWorkProducts;
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

