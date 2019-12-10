package com.ghx.auto.cm.ui.sso.page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.ghx.auto.cm.ui.angularjs.page.RegistrationUI;
import com.ghx.auto.cm.ui.page.CMAbstractPage;

public class NetworkRegistrationPage extends CMAbstractPage<NetworkRegistrationPage>  {
	
	//Locators for Page One - Enter Email Address
	
	private By email_id = By.id("email");
	private By nextButton = By.xpath(".//div[@class='col-md-6 text-right']/button");
	private By ghxTermsOfUseLink = By.xpath(".//div[@class='col-sm-12 col-md-12 col-lg-12 text-center ng-binding']/a[1]");
	private By ghxSupportLink = By.xpath(".//div[@class='col-sm-12 col-md-12 col-lg-12 text-center ng-binding']/a[3]");
	private By ghxPrivacyPolicyLink = By.xpath(".//div[@class='col-sm-12 col-md-12 col-lg-12 text-center ng-binding']/a[2]");
	private By emailChevron = By.xpath("//*[contains(@class,'fontWeightBold searchOrg ng-binding')]");
	private By welcomeMessage = By.xpath("//*[contains(@class,'fontWeightBold searchOrg ng-binding')]");
	
	// Locators for Page 2 - Select Company ==================================/
	private By selectCompanyChevron = By.xpath("//div[@class='steps-headers marginB2']/ul/li[2]/a");
	private By federalTaxIdTextBox = By.id("taxIdDiv");
	private By federalTaxIdNotFoundButton = By.xpath(".//*[@id='selectCompanyForm']/div[3]/button");
	private By addCompanyNotListedButton = By.xpath(".//*[@id='selectCompanyForm']/div[4]/div[4]/button");
	private By selectYourCompanyTextMessage = By.xpath(".//div[@class='col-md-12']/p[1]");
	private By taxIdSearchButton = By.xpath(".//*[@id='selectCompanyForm']/div[2]/button");
	private By prepopulatedFederalTaxId = By.xpath(".//*[@id='getTaxIdCustomerList']/tbody/tr/td[1]");
	private By selectAction = By.xpath(".//*[@id='getTaxIdCustomerList']/tbody/tr/td[4]/a/button");
	
		// Locators for Page 3 - Setup Company =====================================/
	private By setupCompanyChevron = By.xpath("//div[@class='steps-headers marginB2']/ul/li[3]/a");
	private By legalBusinessName = By.id("legalName");
	private By federalTaxId = By.id("taxId");
	private By doingBusinessAs = By.id("business");
	private By streetAddress1 = By.id("street1");
	private By streetAddress2 = By.id("street2");
	private By stateDropdown = By.id("stateProvince");
	private By city = By.id("city");
	private By zipCode = By.id("zip");
	private By countryDropDown = By.id("country");
	private By setUpCompanyNextButton = By.xpath(".//*[@id='setupCompanyForm']/div[4]/div/div[5]/div[3]/div[2]/button");
	
	// Locators for Page 4 - create Account =====================================/
	
	// Locators Related to Normalization address popup page -
	private By normalizationPopUpSelectButton = By.xpath("//button[contains(., 'Select')]");
	private By normalizationPopUpCloseButton = By.xpath("//button[contains(., 'Close')]");
	
	private By setupCreateAccountChevron = By.xpath("//div[@class='steps-headers marginB2']/ul/li[4]/a");
	private By salutation = By.xpath(".//*[@id='salutation']");
	private By firstName = By.id("firstName");
	private By lastName = By.id("lastName");
	private By middleName = By.id("middleInitial");
	private By suffix = By.id("suffix");
	private By workPhone = By.id("workNumber");
	private By jobTitle = By.id("title");
	private By fName = By.id("supervisorFirstName");
	private By lName = By.id("supervisorLastName");
	private By eMail = By.id("supervisorEmail");
	private By eulaCheckBox = By.id("checkAgreement");
	private By submitButton = By.xpath("//div[@class='col-md-1 padLeft0']/button");
	
	// Locators Page 5 - Validate Account =======================================/
	private By accountPopupTextHeader = By.cssSelector("[class='modal-title ng-binding']");
	private By accountPopupContinueButton = By.cssSelector("[data-ui-sref='registration.validateAccount']");
	private By tempPassword = By.id("temporaryPassword");
	private By customPassword = By.id("password");
	private By confirmPassword = By.id("confirmPassword");
	private By validateAccountSubmitButton = By.xpath(".//div[@class='col-md-10 text-right']/div/button");
	private By validate_account_custom_password_check = By.xpath("/html/body/div[4]/div[1]/div/div/div/form/div[2]/div/div/div[2]/div[3]/div[3]/div[2]/img");
	private By validate_account_confirm_password_check = By.xpath("/html/body/div[4]/div[1]/div/div/div/form/div[2]/div/div/div[2]/div[3]/div[4]/div[2]/img");
	
	//Locators for page 5 - Confirm and Log-in
	private By confirmAndLoginChevron = By.xpath(".//div[@class='steps-headers marginB2']/ul");
	private By textMessageOfConfirmAndLogin = By.xpath(".//div[@class='marginB3']/label");
	private By getStartedButton = By.xpath(".//div[@class='col-md-5 btn btn-primary startBtnCls']/div[3]/ul/li/a");
	
	private By confirmYourProfileText = By.xpath(".//*[@id='resendRegisteringForm']/div[1]/div/h4");
	                                               //*[@id="resendRegisteringForm"]/div[1]/div/h4
	// Locators for Search for accounts page
	private By searchForAccounts = By.id("searchString");
	private By searchButton = By.xpath(".//*[@id='searchAccountForm']/div/div[1]/div[3]/button");
	
	// Locators For Confirm Password
	private By submitPasswordButton= By.xpath("//*[contains(@type,'submit')]");
	
	
	
	//Locators for Onsite visit
	private By search_for_account_popup_text = By.cssSelector("[class='col-sm-12 col-md-12 col-lg-12']");
	private By search_for_account_popup_no_button = By.xpath(".//*[@id='ng-app']/body/div[5]/div/div/div/div/div/div[3]/button[2]");
	private By search_for_account_customer_name_row_1 = By.xpath("//*[@id='searchCustomerList']/tbody/tr[1]/td[2]/p");
	private By search_for_account_popup_yes = By.cssSelector("[class='btn btn-success ng-binding']");
	private By search_for_account_search_field = By.id("searchString");
	private By search_for_account_search_button = By.xpath(".//div[@class='col-md-12 padLeft0']/div[2]/button");
	private By search_for_account_register_button = By.xpath(".//*[@id='searchCustomerList']/tbody/tr[2]/td[1]/button");
	
	
	// load login url
		
	public NetworkRegistrationPage invoke_loginURL(String URL) {
		load(URL);
		wait_until(5);
		handle_browser_exceptions();
		return this;
	}
	
	//enter Email address	
	public NetworkRegistrationPage enter_email_address(String email){
		return enter(email_id, email);
	}

	//Wait for page to load
	public NetworkRegistrationPage wait_for_landing_page_to_load(){
		wait_until(ExpectedConditions.visibilityOfElementLocated(emailChevron));
		return this;
	}
			
	// Code to Verify terms of use text for registration ui landing page
	public NetworkRegistrationPage verify_ghx_terms_of_use(String ghxTermsOfUse){
		return verify_element_by_text(ghxTermsOfUseLink, ghxTermsOfUse);
	}
		
	// Code to Verify privacy policy text for registration ui landing page
	public NetworkRegistrationPage verify_ghx_privacy_policy(String ghxPrivacyPolicy){
		return verify_element_by_text(ghxPrivacyPolicyLink, ghxPrivacyPolicy);
	}
		
	// Code to Verify site map text for registration ui landing page
	public NetworkRegistrationPage verify_ghx_support(String ghxSupport){
		return verify_element_by_text(ghxSupportLink, ghxSupport);
	}
	
	//Code to verify welcome Message
	public NetworkRegistrationPage verify_welcome_message(String welcomeMsg){
		return verify_element_by_text_partial_match(welcomeMessage, welcomeMsg);
	}
	
	//code to click Next button
	public NetworkRegistrationPage click_next_button(){
		return click_button(nextButton);
	}
	
	//Page 2 - Select Company =========================================
	
	// code to verify select company chevron
	public NetworkRegistrationPage verify_select_company_chevron(String selectCompChevron){
		return verify_element_by_text(selectCompanyChevron, selectCompChevron);
	}
	
	//code to click Federal tax Id not found button
	public NetworkRegistrationPage click_federal_taxid_not_found_button(){
		return click_button(federalTaxIdNotFoundButton);
	}
	
	public NetworkRegistrationPage click_add_company_not_listed_button(){
		return click_button(addCompanyNotListedButton);
	}
	
	//code to verify select your company Text Message
	public NetworkRegistrationPage verify_select_your_company_text_message(String selectYourcompanyMessage){
		return verify_element_by_text(selectYourCompanyTextMessage, selectYourcompanyMessage);
	}
	
	// Code to enter Tax Id
	public NetworkRegistrationPage enter_federal_tax_id_in_serch_field(String federalTaxID){
		return enter(federalTaxIdTextBox, federalTaxID);
	}

	// Code to click Search button
	public NetworkRegistrationPage click_search_tax_id_button(){
		return click_button(taxIdSearchButton);
	}
	
	// Code to verify Legal Name
	public NetworkRegistrationPage verify_prepopulated_tax_id(String ftd){
		return verify_element_by_text(prepopulatedFederalTaxId, ftd);
	}
	
	// Code to click Select Action
	public NetworkRegistrationPage click_select_button(){
		return click_button(selectAction);
	}
	
	// Page 3 - Setup Company ==========================================
	
	public NetworkRegistrationPage verify_set_up_company_chevron(String setUpCompChevron){
		return verify_element_by_text(setupCompanyChevron, setUpCompChevron);
	}
	
	// Code to enter legal business name in Setup Company Chevron
	public NetworkRegistrationPage enter_legal_business_name(String legalname){
		return enter(legalBusinessName, legalname);
	}
		
	// Code to enter federal tax id in Setup Company Chevron
	public NetworkRegistrationPage enter_federal_tax_id(String taxid){
		return enter(federalTaxId, taxid);
	}
		
	// Code to enter Doing Business As in Setup Company Chevron
	public NetworkRegistrationPage enter_doing_business_as(String dba){
		return enter(doingBusinessAs, dba);
	}
		
	// Code to enter Street Address 1 in Setup Company Chevron
	public NetworkRegistrationPage enter_street_address1(String street1){
		return enter(streetAddress1, street1);
	}
		
	// Code to enter Street Address 2 in Setup Company Chevron
	public NetworkRegistrationPage enter_street_address2(String street2){
		return enter(streetAddress2, street2);
	}
		
	// Code to enter Street City in Setup Company Chevron
	public NetworkRegistrationPage enter_city(String vendorcity){
		return enter(city, vendorcity);
	}
			
	// Code to enter Street zipcode in Setup Company Chevron
	public NetworkRegistrationPage enter_zipcode(String vendorZipCode){
		return enter(zipCode, vendorZipCode);
	}
		
	// Code to Select State from State Dropdown
	public NetworkRegistrationPage select_state_from_dropdown(String vendorstate){
		return select_by_name(stateDropdown, vendorstate);
	}
	
	// Code to Select State from State Dropdown
	public NetworkRegistrationPage select_country_from_dropdown(String vendorcountry){
		return select_by_name(countryDropDown, vendorcountry);
	}
		
	// Code to click on Validate and Next Button on Setup Company Chevron
	public NetworkRegistrationPage click_validate_and_next_button(){
		return click_button(setUpCompanyNextButton);
	}
	
	
	//Page 4 - Create Account ===============================================/
	
	// Wait Until loading bar dissappears -
	public NetworkRegistrationPage wait_until_loading_bar_to_complete (){
		 wait_until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[class='loading']")));
		 wait_until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[class='loading ng-hide']")));
		 return this;
	}
	 	 
	// Clear Cookies
	public NetworkRegistrationPage clear_cookies(){
	  clear_session();
	  wait_until(5);
	  return this;
	}
	
	public NetworkRegistrationPage click_normalization_pop_up_select_btn(){
		return click_button(normalizationPopUpSelectButton);
	}
 
	public NetworkRegistrationPage click_normalization_pop_up_close_btn(){
		return click_button(normalizationPopUpCloseButton);
	}
	
	public NetworkRegistrationPage verify_create_account_chevron(String createAccountChevron){
		return verify_element_by_text(setupCreateAccountChevron, createAccountChevron);
	}
	
	// Code to Select Salutation from salutation dropdown from State Dropdown
	public NetworkRegistrationPage select_salutation_from_dropdown(String user_salutation){
		return select_by_name(salutation, user_salutation);
	}
		
	// Code to enter First name in Create Account Chevron
	public NetworkRegistrationPage enter_first_name(String firstname){
		return enter(firstName, firstname);
	}
		
	// Code to enter last name in Create Account Chevron
	public NetworkRegistrationPage enter_last_name(String lastname){
		return enter(lastName, lastname);
	}
			
	// Code to enter middle name in Create Account Chevron
	public NetworkRegistrationPage enter_middle_name(String middlename){
		return enter(middleName, middlename);
	}
		
	// Code to enter suffix name in Create Account Chevron
	public NetworkRegistrationPage enter_suffix(String user_suffix){
		return enter(suffix, user_suffix);
	}
			
	// Code to enter work phone in Create Account Chevron
	public NetworkRegistrationPage enter_work_phone(String workphone){
		return enter(workPhone, workphone);
	}
			
	// Code to enter job title in Create Account Chevron
	public NetworkRegistrationPage enter_job_title(String jobtitle){
		return enter(jobTitle, jobtitle);
	}
			
	// Code to enter supervisor fname in Create Account Chevron
	public NetworkRegistrationPage enter_supervisor_fname(String fname){
		return enter(fName, fname);
	}
		
	public NetworkRegistrationPage enter_supervisor_lname(String lname){
		return enter(lName, lname);
	}
	public NetworkRegistrationPage enter_supervisor_email(String email){
		return enter(eMail, email);
	}
	// Code to click on EULA checkbox on create account Chevron
	public NetworkRegistrationPage click_eula_checkbox(){
		boolean checkbox_selected = is_element_selected(eulaCheckBox);
		if (checkbox_selected == false)		
		click_button(eulaCheckBox);
		return this;
	}
		
	// Code to click on Submit Button on create account Chevron
	public NetworkRegistrationPage click_create_account_chevron_submit_button(){
		return click_button(submitButton);
	}
	
	// Page 5 - Validate Account ===============================================/
	
	//Code to verify Create Account Chevron Header text
	public NetworkRegistrationPage verify_create_account_popup_text_header(String msg){
		return verify_element_by_text(accountPopupTextHeader, msg);
	}
	
	// Code to click on Submit Button on create account Chevron
	public NetworkRegistrationPage click_create_account_popup_text_continue_button(){
		return click_button(accountPopupContinueButton);
	}
		
	// Code to enter temporary Password on Validate Account Chevron
	public NetworkRegistrationPage enter_validate_account_temp_password(String temppass){
		return enter(tempPassword, temppass);
	}
			
	// Code to enter custom Password on Validate Account Chevron
	public NetworkRegistrationPage enter_validate_account_custom_password(String custompass){
		return enter(customPassword, custompass);
	}
		
	// Code to enter confirm Password on Validate Account Chevron
	public NetworkRegistrationPage enter_validate_account_confirm_password(String confirmpass){
		return enter(confirmPassword, confirmpass);
	}
		
	// code to wait for custom password check to load
	public NetworkRegistrationPage wait_for_custom_password_check_to_load(){
		wait_until(ExpectedConditions.visibilityOfElementLocated(validate_account_custom_password_check));
		return this;
	}
		
	// code to wait for confirm password check to load
	public NetworkRegistrationPage wait_for_confirm_password_check_to_load(){
		wait_until(ExpectedConditions.visibilityOfElementLocated(validate_account_confirm_password_check));
		return this;
	}
		
	// Code to click on Submit Button on Validate account Chevron
	public NetworkRegistrationPage click_validate_account_submit_button(){
		return click_button(validateAccountSubmitButton);
	}
	
	// Code for confirm your profile page
	public NetworkRegistrationPage verify_confirm_your_profile_text(String confirmYourProfile){
		return verify_element_by_text(confirmYourProfileText, confirmYourProfile);
	}
	
	// Page 6 - Confirm and Login ======================================================/
	
	// Code to validate Confirm and Login
	public NetworkRegistrationPage verify_confirm_and_login_chevron(String confirmAndLogin ){
		return verify_element_by_text(confirmAndLoginChevron, confirmAndLogin);
	}
	
	// Code to verify text
	public NetworkRegistrationPage verify_text_message_of_confirm_and_login(String messageConfirmAndLogin){
		return verify_element_by_text(textMessageOfConfirmAndLogin, messageConfirmAndLogin);
	}
	
	// Code to click
	public NetworkRegistrationPage click_get_started_button(){
		return click_button(getStartedButton);
	}
	
	//Code for Onsite
	//Code to verify Search or account pop up page text
	public NetworkRegistrationPage verify_search_for_account_popup_text(String msg){
		return verify_element_by_text(search_for_account_popup_text, msg);
	}
			
	// Code for Yes Button to be clickable on Search for Account pop up Page
	public NetworkRegistrationPage wait_for_search_for_account_popup_yes_button_clickable(){
		return wait_until(ExpectedConditions.elementToBeClickable(search_for_account_popup_yes));
	}
		
	// Code to click on Yes Option on Search for Accounts Pop up
	public NetworkRegistrationPage click_search_for_account_popup_yes_button(){
		return click_button(search_for_account_popup_yes);
	}	
		
	// Code for No Button to be clickable on Search for Account pop up Page
	public NetworkRegistrationPage wait_for_search_for_account_popup_no_button_clickable(){
		return wait_until(ExpectedConditions.elementToBeClickable(search_for_account_popup_no_button));
	}
		
	// Code to click on No Button on Search for Account popup Page
	public NetworkRegistrationPage click_search_for_account_popup_no_button(){
		return click_button(search_for_account_popup_no_button);
	}
	
	
	// Code to enter customer name is search for account search field on Search For Accounts Page
	public NetworkRegistrationPage enter_search_for_account_search_field(String cusname){
		return enter(search_for_account_search_field, cusname);
	}
	
	public NetworkRegistrationPage click_search_for_account_search_button(){
		return click_button(search_for_account_search_button);
	}
	
	// Verify health system present in the first row - 
	public NetworkRegistrationPage verify_health_system_present_in_row_1(String customer_name){
		return verify_element_by_text(search_for_account_customer_name_row_1, customer_name);
	}
	
	// Code to verify the searched customer matches with the one inputed by user and click on register button
	public NetworkRegistrationPage click_search_for_account_register_button(){
		return click_button(search_for_account_register_button);
	}
		
	// code to enter and search health system name
	
	public NetworkRegistrationPage enter_health_system_name(String custName){
		enter(searchForAccounts, custName);
		wait_until(2);
		return click(searchButton);
	}
	
	// Enter custom password	
	public NetworkRegistrationPage enter_custom_password(String vendormatePassword) {
		return enter(customPassword, vendormatePassword);
	}
	// Enter confirm password	
	public NetworkRegistrationPage enter_confirm_password(String vendormatePassword) {
		return enter(confirmPassword, vendormatePassword);
	}
	// Click Cancel button for reset Password page
	public NetworkRegistrationPage click_submit_password() {
		wait_until(3);
		return click_button(submitPasswordButton);
	}

}
