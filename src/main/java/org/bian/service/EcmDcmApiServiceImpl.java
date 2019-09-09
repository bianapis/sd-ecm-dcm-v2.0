/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class EcmDcmApiServiceImpl implements EcmDcmApiService {

	public SDECMDCMActivateOutputModel activate(SDECMDCMActivateInputModel request){
		return JsonReader.read("activate-SDECMDCMActivateOutputModel.json",new TypeReference<SDECMDCMActivateOutputModel>(){});
	}
	
	public SDECMDCMConfigureOutputModel configure(String sdReferenceId, SDECMDCMConfigureInputModel request){
		return JsonReader.read("configure-SDECMDCMConfigureOutputModel.json",new TypeReference<SDECMDCMConfigureOutputModel>(){});
	}
	
	public CRECMDCMFulfillmentArrangementExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRECMDCMFulfillmentArrangementExchangeInputModel request){
		return JsonReader.read("exchange-CRECMDCMFulfillmentArrangementExchangeOutputModel.json",new TypeReference<CRECMDCMFulfillmentArrangementExchangeOutputModel>(){});
	}
	
	public SDECMDCMFeedbackOutputModel feedback(String sdReferenceId, SDECMDCMFeedbackInputModel request){
		return JsonReader.read("feedback-SDECMDCMFeedbackOutputModel.json",new TypeReference<SDECMDCMFeedbackOutputModel>(){});
	}
	
	public CRECMDCMFulfillmentArrangementInitiateOutputModel initiate(String sdReferenceId, CRECMDCMFulfillmentArrangementInitiateInputModel request){
		return JsonReader.read("initiate-CRECMDCMFulfillmentArrangementInitiateOutputModel.json",new TypeReference<CRECMDCMFulfillmentArrangementInitiateOutputModel>(){});
	}
	
	public BQInstrumentDefinitionRequestOutputModel requestInstrumentdefinition(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInstrumentDefinitionRequestInputModel request){
		return JsonReader.read("request-BQInstrumentDefinitionRequestOutputModel.json",new TypeReference<BQInstrumentDefinitionRequestOutputModel>(){});
	}
	
	public BQPlacementRequestOutputModel requestPlacement(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPlacementRequestInputModel request){
		return JsonReader.read("request-BQPlacementRequestOutputModel.json",new TypeReference<BQPlacementRequestOutputModel>(){});
	}
	
	public BQProspectusRequestOutputModel requestProspectus(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProspectusRequestInputModel request){
		return JsonReader.read("request-BQProspectusRequestOutputModel.json",new TypeReference<BQProspectusRequestOutputModel>(){});
	}
	
	public CRECMDCMFulfillmentArrangementRequestOutputModel request(String sdReferenceId, String crReferenceId, CRECMDCMFulfillmentArrangementRequestInputModel request){
		return JsonReader.read("request-CRECMDCMFulfillmentArrangementRequestOutputModel.json",new TypeReference<CRECMDCMFulfillmentArrangementRequestOutputModel>(){});
	}
	
	public CRECMDCMFulfillmentArrangementRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRECMDCMFulfillmentArrangementRetrieveOutputModel.json",new TypeReference<CRECMDCMFulfillmentArrangementRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQInstrumentDefinitionRetrieveOutputModel retrieveInstrumentdefinition(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQInstrumentDefinitionRetrieveOutputModel.json",new TypeReference<BQInstrumentDefinitionRetrieveOutputModel>(){});
	}
	
	public BQPlacementRetrieveOutputModel retrievePlacement(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQPlacementRetrieveOutputModel.json",new TypeReference<BQPlacementRetrieveOutputModel>(){});
	}
	
	public BQProspectusRetrieveOutputModel retrieveProspectus(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQProspectusRetrieveOutputModel.json",new TypeReference<BQProspectusRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDECMDCMRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDECMDCMRetrieveOutputModel.json",new TypeReference<SDECMDCMRetrieveOutputModel>(){});
	}
	
	public CRECMDCMFulfillmentArrangementUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRECMDCMFulfillmentArrangementUpdateInputModel request){
		return JsonReader.read("update-CRECMDCMFulfillmentArrangementUpdateOutputModel.json",new TypeReference<CRECMDCMFulfillmentArrangementUpdateOutputModel>(){});
	}
	
	public BQInstrumentDefinitionUpdateOutputModel updateInstrumentdefinition(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInstrumentDefinitionUpdateInputModel request){
		return JsonReader.read("update-BQInstrumentDefinitionUpdateOutputModel.json",new TypeReference<BQInstrumentDefinitionUpdateOutputModel>(){});
	}
	
	public BQPlacementUpdateOutputModel updatePlacement(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPlacementUpdateInputModel request){
		return JsonReader.read("update-BQPlacementUpdateOutputModel.json",new TypeReference<BQPlacementUpdateOutputModel>(){});
	}
	
	public BQProspectusUpdateOutputModel updateProspectus(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProspectusUpdateInputModel request){
		return JsonReader.read("update-BQProspectusUpdateOutputModel.json",new TypeReference<BQProspectusUpdateOutputModel>(){});
	}
	
}
