package com.ghx.auto.cm.ui.sso.page;



import org.openqa.selenium.By;

import com.ghx.auto.cm.ui.page.CMAbstractPage;

public class ExpressRegistrationPage extends CMAbstractPage<ExpressRegistrationPage> {
	
	//  Company Details Page    //
	private By companyRelationshipSpendTier = By.id("spendTierCode");
	private By TypeOfBusiness = By.id("typeOfBusinessCode");
	private By companyRelationshipPhi1Yes = By.id("employeeYes");
	private By companyRelationshipPhi1No = By.id("employeeNo");
	private By companyRelationshipPhi2Yes = By.id("representativesYes");
	private By companyRelationshipPhi2No = By.id("representativesNo");
	private By companyWebiste = By.id("websiteURL");
	//  Contacts Details Page   //
	private By contactsFirstName = By.id("firstName");
	private By contactsLastName = By.id("lastName");
	private By contactsEmail = By.id("email");
	private By contactsPhone = By.id("workPhone");
	private By contactsNextButton = By.xpath("//button[contains(text(),'Next')]");
	//  Diversity Details Page   //
	private By minorityOwnedYesRadioButton = By.id("minorityOwnedStr");
	private By minorityOwnedNoRadioButton =  By.xpath("//*[@id='minorityOwnedStr']//following::input");
	private By minorityTypeDiversity = By.id("minorityCode");
	private By certificationAgencyDiversity = By.id("certification1.certificationAgencyOid");
	private By certificationNumberDiversity = By.id("certification1.certNumber");
	private By effectiveDateDiversity = By.id("certification1_certEffectiveDateString");
	private By expirationDateDiversity = By.id("certification1_certExpDateString");
	private By deleteUploadedDiversityDoc = By.xpath(".//*[@id='expressDiversityForm']/vision-action/div/div[1]/div[3]/div[6]/div[1]/div[2]/a[2]");
	private By ethinicityInformation = By.id("certificationEthnicity");
	private By genderRepresents = By.xpath(".//*[@value='f']");
	
	private By healthSystemNeededNextButton = By.xpath(".//*[@id='ng-app']/body/div[5]/div/div/div[3]/div/button");
	// Forms //
	private By arContactMail = By.xpath("html/body/div[1]/div[4]/div[1]/div/div/div/vision-action/div/div[2]/div/div/div[2]/div/div[2]/vision-action/form/div[2]/div/div/input"); 
	// .//*[@id='arContactEmail'] //
	private By saveContinueFormButton = By.id("OBFormsUpdate");
	private By eeoCode = By.id("eeoCode");
	private By notifyCustomeNo = By.xpath(".//*[@id='ng-app']/body/div[5]/div/div/div[3]/button[2]");
	//  On-boarding Category   //  
	private By multiselectServiceButton = By.xpath(".//*[@id='cpanelAssignedLegalEntity']/div/div[3]/input");
	private By onboardingCategorySaveButton = By.id("VendorOnboardingCategoryNext");
	//  On-boarding Forms  // 
	private By closeButton = By.xpath(".//*[@id='containerFixed']/div[3]/header/div[2]/div[2]/button");
	private By okRegistrationPhasePopupButton = By.xpath(".//*[@id='ng-app']/body/div[5]/div/div/div/div[3]/button");
	//  Company Details Page   //
	public ExpressRegistrationPage select_type_of_business(String business_type){
		return select_by_name(TypeOfBusiness, business_type);
	}
	
	public ExpressRegistrationPage select_normal_company_relationship_spend_tier(String spend_tier){
		return select_by_name(companyRelationshipSpendTier, spend_tier);
	}
	
	public ExpressRegistrationPage enter_company_website(String website){
		enter(companyWebiste, website);
		return wait_until(2);
	}
	
	public ExpressRegistrationPage click_normal_company_relationship_phi1_option(String yes_or_no){
		if(yes_or_no.equalsIgnoreCase("yes")) {
			boolean checkbox_selected = is_element_selected(companyRelationshipPhi1Yes);
			if (checkbox_selected == false)	
				click_button(companyRelationshipPhi1Yes);
		}
		else {
			boolean checkbox_selected = is_element_selected(companyRelationshipPhi1No);
			if (checkbox_selected == false)	
				click_button(companyRelationshipPhi1No);
			}
		return this;
	} 
			
	// Code to click on option on PHI Q2 on Normal Company Relationship Page
	public ExpressRegistrationPage click_normal_company_relationship_phi2_option(String yes_or_no){
		if(yes_or_no.equalsIgnoreCase("yes")) {
			boolean checkbox_selected = is_element_selected(companyRelationshipPhi2Yes);
			if (checkbox_selected == false)	
				click_button(companyRelationshipPhi2Yes);
			}
			else {
				boolean checkbox_selected = is_element_selected(companyRelationshipPhi2No);
				if (checkbox_selected == false)	
					click_button(companyRelationshipPhi2No);
			}
		return this;
	}
	
	//  Contacts Details Page    //
	public ExpressRegistrationPage enter_first_name(String FName){
		enter(contactsFirstName, FName);
		return wait_until(2);
	}

	public ExpressRegistrationPage enter_last_name(String LName){
		enter(contactsLastName, LName);
		return wait_until(2);
	}

	public ExpressRegistrationPage enter_email(String Email){
		enter(contactsEmail, Email);
		return wait_until(2);
	}

	public ExpressRegistrationPage enter_phone(String Phone){
		enter(contactsPhone, Phone);
		return wait_until(2);
	}
	public ExpressRegistrationPage click_contacts_next_button(){
		click(contactsNextButton);
		return wait_until(2);
	}

	//  Diversity Details Page   //
	public ExpressRegistrationPage select_minority_type_diversity(String MinorityType){
		select_by_name(minorityTypeDiversity, MinorityType);
		return wait_until(2);
	}
	
	public ExpressRegistrationPage click_yes_for_minority_diversity(){
		
			boolean checkbox_selected = is_element_selected(minorityOwnedYesRadioButton);
			if (checkbox_selected == false)	{
				click_button(minorityOwnedYesRadioButton);
			}
		return this;
	}
	
	public ExpressRegistrationPage click_no_for_minority_diversity(){
		
		boolean checkbox_selected = is_element_selected(minorityOwnedYesRadioButton);
		if (checkbox_selected == false)	{
			click_button(minorityOwnedNoRadioButton);
		}
	return this;
}
	
	public ExpressRegistrationPage select_certification_agency_diversity(String certificationAgency){
		select_by_name(certificationAgencyDiversity, certificationAgency);
		return wait_until(2);
	}
	public ExpressRegistrationPage enter_certication_number(String certificationNumber){
		enter(certificationNumberDiversity, certificationNumber);
		return wait_until(2);
	}

	public ExpressRegistrationPage enter_effective_date(String mm_dd_yy) {
		wait_until(2);
		return enter(effectiveDateDiversity, mm_dd_yy);
	}

	public ExpressRegistrationPage enter_expiration_date(String mm_dd_yy) {
		wait_until(2);
		return enter(expirationDateDiversity, mm_dd_yy);
	}
	public ExpressRegistrationPage click_delete_uploaded_doc_diversity(){
		
		boolean element_visible = is_element_displayed(deleteUploadedDiversityDoc);
		if (element_visible == true){
			click(deleteUploadedDiversityDoc);
		}
		return this;
	}
	public ExpressRegistrationPage click_diversity_details_next_button(){
		click(contactsNextButton);
		return wait_until(2);
	}
	
	public ExpressRegistrationPage enter_ethnicity_information(String ethinicity){
		enter(ethinicityInformation, ethinicity);
		return wait_until(2);
	}
	
	public ExpressRegistrationPage click_Next_health_system_needed_button(){
		click(healthSystemNeededNextButton);
		return wait_until(2);
	}
	
	public ExpressRegistrationPage click_health_system_next_button(){
		click(contactsNextButton);
		return wait_until(2);
	}
	
	
	public ExpressRegistrationPage click_female_gender_radio_button(){
		click_button(genderRepresents);
		return wait_until(2);
	}
	
	// Onboarding //
	public ExpressRegistrationPage click_multiselect_service_button(){
		click(multiselectServiceButton);
		return wait_until(2);
	}
	
	public ExpressRegistrationPage click_onboarding_category_save_next_button(){
		click(onboardingCategorySaveButton);
		return wait_until(2);
	}

	
	public ExpressRegistrationPage enter_ar_contact_mail(String arcontactmail1){
		
		enter(arContactMail, arcontactmail1);
		return this;
	}
	
	public ExpressRegistrationPage click_save_continue_form_button(){
		click(saveContinueFormButton);
		return wait_until(2);
	}
	
	public ExpressRegistrationPage enter_eeo_code(String eeocode){
		enter(eeoCode, eeocode);
		return wait_until(2);
	}
	
	public ExpressRegistrationPage click_no_to_notify_customer_button(){
		click(notifyCustomeNo);
		return wait_until(2);
	}
	public ExpressRegistrationPage click_close_onboardingregistration_button(){
		click(closeButton);
		return wait_until(2);
	}
	public ExpressRegistrationPage click_ok_registration_phase_popup_button(){
		click(okRegistrationPhasePopupButton);
		return wait_until(2);
	}
}
