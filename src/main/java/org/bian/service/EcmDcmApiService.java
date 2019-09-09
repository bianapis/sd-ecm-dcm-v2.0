/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface EcmDcmApiService {

	SDECMDCMActivateOutputModel activate(SDECMDCMActivateInputModel request);
	
	SDECMDCMConfigureOutputModel configure(String sdReferenceId, SDECMDCMConfigureInputModel request);
	
	CRECMDCMFulfillmentArrangementExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRECMDCMFulfillmentArrangementExchangeInputModel request);
	
	SDECMDCMFeedbackOutputModel feedback(String sdReferenceId, SDECMDCMFeedbackInputModel request);
	
	CRECMDCMFulfillmentArrangementInitiateOutputModel initiate(String sdReferenceId, CRECMDCMFulfillmentArrangementInitiateInputModel request);
	
	BQInstrumentDefinitionRequestOutputModel requestInstrumentdefinition(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInstrumentDefinitionRequestInputModel request);
	
	BQPlacementRequestOutputModel requestPlacement(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPlacementRequestInputModel request);
	
	BQProspectusRequestOutputModel requestProspectus(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProspectusRequestInputModel request);
	
	CRECMDCMFulfillmentArrangementRequestOutputModel request(String sdReferenceId, String crReferenceId, CRECMDCMFulfillmentArrangementRequestInputModel request);
	
	CRECMDCMFulfillmentArrangementRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	BQInstrumentDefinitionRetrieveOutputModel retrieveInstrumentdefinition(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQPlacementRetrieveOutputModel retrievePlacement(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQProspectusRetrieveOutputModel retrieveProspectus(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDECMDCMRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRECMDCMFulfillmentArrangementUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRECMDCMFulfillmentArrangementUpdateInputModel request);
	
	BQInstrumentDefinitionUpdateOutputModel updateInstrumentdefinition(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInstrumentDefinitionUpdateInputModel request);
	
	BQPlacementUpdateOutputModel updatePlacement(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPlacementUpdateInputModel request);
	
	BQProspectusUpdateOutputModel updateProspectus(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProspectusUpdateInputModel request);
	
}
