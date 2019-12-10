package com.ghx.auto.cm.ui.angularjs.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import com.ghx.auto.cm.ui.page.CMAbstractPage;

public class RegistrationUI extends CMAbstractPage<RegistrationUI>{
	
	// Locators for Enter Email Address Chevron 
	private By email_id = By.id("email");
	private By enter_email_next_button = By.xpath("/html/body/div[4]/div[1]/div/div/div/form/div[2]/div/div/div[3]/div[1]/div[4]/div/button");
	private By ghx_header = By.xpath("/html/body/div[3]/header/nav/div/div/img");
	private By ghx_footer = By.xpath("/html/body/div[6]/footer/div/div/div/div");
	private By ghx_terms_of_use = By.xpath("/html/body/div[6]/footer/div/div/div/div/a[1]");
	
	private By ghx_privacy_policy = By.xpath("/html/body/div[6]/footer/div/div/div/div/a[2]");
	private By ghx_site_map = By.xpath("/html/body/div[6]/footer/div/div/div/div/a[3]");
	private By enter_email_chevron = By.xpath("/html/body/div[4]/div[1]/div/div/div/form/div[1]/ul/li[1]/a");
	private By enter_email_welcomemessage = By.xpath("/html/body/div[4]/div[1]/div/div/div/form/div[2]/div/div/div[2]/div");
	// Locators for Select Company Chevron
	private By select_company_chevron = By.xpath("/html/body/div[4]/div[1]/div/div/div/form/div[1]/ul/li[2]/a");
	private By select_company_chevron_header = By.xpath("/html/body/div[4]/div[1]/div/div/div/form/div[2]/div/div/div[1]/div/h4");
	private By add_company_not_listed_button = By.xpath("/html/body/div[4]/div[1]/div/div/div/form/div[2]/div/div/div[2]/div[1]/div/div[1]/div[2]/button");
	//Locators for Setup Company Chevron
	private By setup_company_chevron = By.xpath("/html/body/div[4]/div[1]/div/div/div/form/div[1]/ul/li[3]/a");
	private By setup_company_chevron_header = By.xpath("/html/body/div[4]/div[1]/div/div/div/form/div[2]/div/div/div[2]/h4");
	private By validate_and_next_button = By.xpath("/html/body/div[4]/div[1]/div/div/div/form/div[2]/div/div/div[4]/div[6]/div[2]/button");
	private By legal_business_name = By.id("legalName");
	private By federal_tax_id = By.id("taxId");
	private By doing_business_as = By.id("business");
	private By street_address1 = By.id("street1");
	private By street_address2 = By.id("street2");
	private By state_dropdown = By.id("stateProvince");
	private By city = By.id("city");
	private By zipcode = By.id("zip");
	private By country_dropdown = By.id("country");
	private By populate_existing_vendor_details_popup_yes = By.cssSelector("[ng-click='yes()']");

	//Locators for Create Account Chevron
	private By create_account_chevron = By.xpath("/html/body/div[4]/div[1]/div/div/div/form/div[1]/ul/li[4]/a");
	private By salutation = By.xpath("/html/body/div[4]/div[1]/div/div/div/form/div[2]/div/div/div[2]/div/div[4]/div/div/select");
	private By first_name = By.id("firstName");
	private By last_name = By.id("lastName");
	private By middle_name = By.id("middleInitial");
	private By suffix = By.id("suffix");
	private By work_phone = By.id("workNumber");
	private By job_title = By.id("title");
	private By cell_phone = By.id("cellPhone");
	private By eula_checkbox = By.id("checkAgreement");
	private By create_account_chevron_submit_button = By.xpath("/html/body/div[4]/div[1]/div/div/div/form/div[2]/div/div/div[2]/div/div[12]/div[2]/button");
	private By create_account_popup_text_header = By.cssSelector("[class='modal-title ng-binding']");
	private By create_account_popup_text_continue_button = By.cssSelector("[data-ui-sref='registration.validateAccount']");
	//Locators for Validate Account Chevron
	private By validate_account_temp_password = By.id("temporaryPassword");
	private By validate_account_custom_password = By.id("password");
	private By validate_account_confirm_password = By.id("confirmPassword");
	private By validate_account_submit_button = By.xpath(".//div[@class='col-md-10 text-right']/div/button");
	private By validate_account_custom_password_check = By.xpath("/html/body/div[4]/div[1]/div/div/div/form/div[2]/div/div/div[2]/div[3]/div[3]/div[2]/img");
	private By validate_account_confirm_password_check = By.xpath("/html/body/div[4]/div[1]/div/div/div/form/div[2]/div/div/div[2]/div[3]/div[4]/div[2]/img");
	//Locators for Confirm and Login Chevron
	private By confirm_and_login_chevron_header = By.xpath("/html/body/div[4]/div[1]/div/div/div/form/div[2]/div/div/div[2]/div[1]/div[1]/label");
	private By confirm_and_login_onboardcm_button = By.xpath("/html/body/div[4]/div[1]/div/div/div/form/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div[3]/ul/li/a");
	private By confirm_and_login_onboardsm_button = By.xpath("/html/body/div[4]/div[1]/div/div/div/form/div[2]/div/div/div[2]/div[1]/div[2]/div[3]/div[4]/ul/li/a");
	
	
	// Method to invoke Registration UI url
	public RegistrationUI invoke_url() {
		load("registrationUrl");
		handle_browser_exceptions();
		return this;
	}
	
	public RegistrationUI invoke_url(String url) {
		loadUrl(url);
		handle_browser_exceptions();
		return this;
	}
	
	//Code for Enter Email Address Chevron 
	//Wait for Enter Email Address Chevron Page to load
	
	public RegistrationUI wait_for_landing_page_to_load(){
		wait_until(ExpectedConditions.visibilityOfElementLocated(enter_email_chevron));
		return this;
	}
	
	// Code to Verify footer page text for registration ui landing page
	
	public RegistrationUI verify_ghx_footer(String msg){
		return verify_element_by_text(ghx_footer, msg);
	}
	
	// Code to Verify terms of use text for registration ui landing page
	public RegistrationUI verify_ghx_terms_of_use(String msg){
		return verify_element_by_text(ghx_terms_of_use, msg);
	}
	
	// Code to Verify privacy policy text for registration ui landing page
	public RegistrationUI verify_ghx_privacy_policy(String msg){
		return verify_element_by_text(ghx_privacy_policy, msg);
	}
	
	// Code to Verify site map text for registration ui landing page
	public RegistrationUI verify_ghx_site_map(String msg){
		return verify_element_by_text(ghx_site_map, msg);
	}
	
	// Code to verify Email Address Chevron text
	public RegistrationUI verify_enter_email_chevron(String msg){
		return verify_element_by_text(enter_email_chevron, msg);
	}
	
	//Code to verify Enter Email Address chevron Welcome Message
	public RegistrationUI verify_enter_email_welcomemessage(String msg){
		return verify_element_by_text(enter_email_welcomemessage, msg);
	}
	
	// Code to enter email address in email id field in Enter Email Address Chevron
	public RegistrationUI enter_email_id(String email){
		return enter(email_id, email);
	}
	
	// Code for Wait for Next Button to be clickable on Enter Email Address Chevron
	public RegistrationUI wait_for_enter_email_next_button_clickable(){
		wait_until(ExpectedConditions.elementToBeClickable(enter_email_next_button));
		return this;
	}
		
	// Code to click on Next Button on Enter Email Address Chevron
	public RegistrationUI click_enter_email_next_button(){
		return click_button(enter_email_next_button);
	}
	
	// Code for Select Company Chevron 
	// Code for Wait for Select Company Chevron to be loaded and visible
	public RegistrationUI wait_for_select_company_chevron_to_load(){
		wait_until(ExpectedConditions.visibilityOfElementLocated(select_company_chevron));
		return this;
	}
	
	// Code for Wait for add company not listed button  to be loaded and visible
	public RegistrationUI wait_for_add_company_not_listed_button_to_load(){
    	wait_until(ExpectedConditions.visibilityOfElementLocated(add_company_not_listed_button));
	    return this;
	} 
	
	//Code to verify Select Company Chevron Header text
	public RegistrationUI verify_select_company_chevron_header(String msg){
		return verify_element_by_text(select_company_chevron_header, msg);
	}
	
	// Code for Wait for Add company not listed Button to be clickable on Select Company Chevron
	public RegistrationUI wait_for_add_company_not_listed_button_clickable(){
		wait_until(ExpectedConditions.elementToBeClickable(add_company_not_listed_button));
	return this;
	}
		
	// Code to click on Add company not listed Button on Select Company Chevron
	public RegistrationUI click_add_company_not_listed_button(){
		return click_button(add_company_not_listed_button);
	}
	
	//Code for Set Up Company Chevron
	// Code for Wait for Setup Company Chevron to be loaded and visible
	public RegistrationUI wait_for_setup_company_chevron_to_load(){
		wait_until(ExpectedConditions.visibilityOfElementLocated(setup_company_chevron));
		return this;
	}
		
	// Code for Wait for validate and next button  to be loaded and visible
	public RegistrationUI wait_for_validate_and_next_button_to_load(){
	   	wait_until(ExpectedConditions.visibilityOfElementLocated(validate_and_next_button));
	    return this;
	} 
	
	// Code for Wait for Validate and Next Button to be clickable on Select Company Chevron
	public RegistrationUI wait_for_validate_and_next_button_clickable(){
		wait_until(ExpectedConditions.elementToBeClickable(validate_and_next_button));
	return this;
	}
	
	//Code to verify Setup Company Chevron Header text
	public RegistrationUI verify_setup_company_chevron_header(String msg){
		return verify_element_by_text(setup_company_chevron_header, msg);
	}
	
	// Code to enter legal business name in Setup Company Chevron
	public RegistrationUI enter_legal_business_name(String legalname){
		return enter(legal_business_name, legalname);
	}
	
	// Code to enter federal tax id in Setup Company Chevron
	public RegistrationUI enter_federal_tax_id( String taxid){
		return enter(federal_tax_id, taxid);
	}
	
	// Code to enter Doing Business As in Setup Company Chevron
	public RegistrationUI enter_doing_business_as(String dba){
		return enter(doing_business_as, dba);
	}
	
	// Code to enter Street Address 1 in Setup Company Chevron
	public RegistrationUI enter_street_address1(String street1){
		return enter(street_address1, street1);
	}
	
	// Code to enter Street Address 2 in Setup Company Chevron
	public RegistrationUI enter_street_address2(String street2){
		return enter(street_address2, street2);
	}
	
	// Code to enter Street City in Setup Company Chevron
	public RegistrationUI enter_city(String vendorcity){
		return enter(city, vendorcity);
	}
		
	// Code to enter Street zipcode in Setup Company Chevron
	public RegistrationUI enter_zipcode(String vendorzipcode){
		return enter(zipcode, vendorzipcode);
	}
	
	// Code to click on State Dropdown on Setup Company Chevron
	public RegistrationUI click_state_dropdown(){
		return click_button(state_dropdown);
	}
	
	// Code to Select State from State Dropdown
	public RegistrationUI select_state_from_dropdown(String vendorstate){
		return select_by_name(state_dropdown, vendorstate);
	}
	
	// Code to click on Validate and Next Button on Setup Company Chevron
	public RegistrationUI click_validate_and_next_button(){
		return click_button(validate_and_next_button);
	}
	
// Code to click on Country Dropdown on Setup Company Chevron
	public RegistrationUI click_country_dropdown(){
		return click_button(country_dropdown);
	}
	
	// Code to Select State from State Dropdown
	public RegistrationUI select_country_from_dropdown(String vendorcountry){
		return select_by_name(country_dropdown, vendorcountry);
	}
	
	// Code to populate existing vendor details popup yes
	public RegistrationUI click_yes_to_populate_existing_vendor_details(){
		return click_button(populate_existing_vendor_details_popup_yes);
	}
	
	// Code for Create Account Chevron
	// code to wait for create account chevron to load
	public RegistrationUI wait_for_create_account_chevron_to_load(){
		wait_until(ExpectedConditions.visibilityOfElementLocated(create_account_chevron));
		return this;
	}
	
	// Code to Select Salutation from salutation dropdown from State Dropdown
	public RegistrationUI select_salutation_from_dropdown(String user_salutation){
		return select_by_name(salutation, user_salutation);
	}
	
	// Code to enter First name in Create Account Chevron
	public RegistrationUI enter_first_name(String firstname){
		return enter(first_name, firstname);
	}
	
// Code to enter last name in Create Account Chevron
	public RegistrationUI enter_last_name(String lastname){
		return enter(last_name, lastname);
	}
		
	// Code to enter middle name in Create Account Chevron
	public RegistrationUI enter_middle_name(String middlename){
		return enter(middle_name, middlename);
	}
	
	// Code to enter suffix name in Create Account Chevron
	public RegistrationUI enter_suffix(String user_suffix){
		return enter(suffix, user_suffix);
	}
		
	// Code to enter work phone in Create Account Chevron
	public RegistrationUI enter_work_phone(String workphone){
		return enter(work_phone, workphone);
	}
		
	// Code to enter job title in Create Account Chevron
	public RegistrationUI enter_job_title(String jobtitle){
		return enter(job_title, jobtitle);
	}
		
	// Code to enter cellphone in Create Account Chevron
	public RegistrationUI enter_cell_phone(String cellphone){
		return enter(cell_phone, cellphone);
	}
	
	// Code to click on EULA checkbox on create account Chevron
	public RegistrationUI click_eula_checkbox(){
		boolean checkbox_selected = is_element_selected(eula_checkbox);
		if (checkbox_selected == false)		
		click_button(eula_checkbox);
		return this;
	}
	
	// Code to click on Submit Button on create account Chevron
	public RegistrationUI click_create_account_chevron_submit_button(){
		return click_button(create_account_chevron_submit_button);
	}
		
	//Code to verify Create Account Chevron Header text
	public RegistrationUI verify_create_account_popup_text_header(String msg){
		return verify_element_by_text(create_account_popup_text_header, msg);
	}
	
	// Code to click on Submit Button on create account Chevron
	public RegistrationUI click_create_account_popup_text_continue_button(){
		return click_button(create_account_popup_text_continue_button);
	}
	
	// Code Validate Account Chevron
	// Code to enter temporary Password on Validate Account Chevron
	public RegistrationUI enter_validate_account_temp_password(String temppass){
		return enter(validate_account_temp_password, temppass);
	}
		
	// Code to enter custom Password on Validate Account Chevron
	public RegistrationUI enter_validate_account_custom_password(String custompass){
		return enter(validate_account_custom_password, custompass);
	}
	
	// Code to enter confirm Password on Validate Account Chevron
	public RegistrationUI enter_validate_account_confirm_password(String confirmpass){
		return enter(validate_account_confirm_password, confirmpass);
	}
	
	// code to wait for custom password check to load
	public RegistrationUI wait_for_custom_password_check_to_load(){
		wait_until(ExpectedConditions.visibilityOfElementLocated(validate_account_custom_password_check));
	return this;
	}
	
	// code to wait for confirm password check to load
	public RegistrationUI wait_for_confirm_password_check_to_load(){
		wait_until(ExpectedConditions.visibilityOfElementLocated(validate_account_confirm_password_check));
	return this;
	}
	
	// Code for Wait for submit Button to be clickable on Validate account Chevron
	public RegistrationUI wait_for_validate_account_submit_button_clickable(){
		wait_until(ExpectedConditions.elementToBeClickable(validate_account_submit_button));
	return this;
	}
	
	// Code to click on Submit Button on Validate account Chevron
	public RegistrationUI click_validate_account_submit_button(){
		return click_button(validate_account_submit_button);
	}
	
	//Code for Confirm and Login Chevron
	//Code to verify Confirm and Login Chevron Header text
	public RegistrationUI verify_confirm_and_login_chevron_header(String msg){
		return verify_element_by_text(confirm_and_login_chevron_header, msg);
	}
	
	// Code for Wait for Onboard yourself and Company Button to be clickable on Confirm and Login Chevron
	public RegistrationUI wait_for_confirm_and_login_onboardcm_button_clickable(){
		wait_until(ExpectedConditions.elementToBeClickable(confirm_and_login_onboardcm_button));
	return this;
	}
	
	// Code for Wait for SM navigation Button to be clickable on Confirm and Login Chevron
	public RegistrationUI wait_for_confirm_and_login_onboardsm_button_clickable(){
		wait_until(ExpectedConditions.elementToBeClickable(confirm_and_login_onboardsm_button));
	return this;
	}
	
	// Code to click on Onboard yourself and Company Button on Confirm and Login Chevron
	public RegistrationUI click_confirm_and_login_onboardcm_button(){
		return click_button(confirm_and_login_onboardcm_button);
	}
	
	//Locators for Search for account Page
	private By search_for_account_search_field = By.id("searchString");
	private By search_for_account_search_button = By.xpath(".//div[@class='col-md-12 padLeft0']/div[2]/button");	
	private By search_for_account_register_button = By.xpath("//*[@id='searchCustomerList']/tbody/tr[1]/td[1]/button");
	private By search_for_account_popup_text = By.cssSelector("[class='col-sm-12 col-md-12 col-lg-12']");
	private By search_for_account_popup_no_button = By.xpath("/html/body/div[7]/div/div/div/div/div[3]/button[2]");
	private By search_for_account_customer_name_row_1 = By.xpath("//*[@id='searchCustomerList']/tbody/tr[1]/td[2]/p");
	private By search_for_account_popup_yes = By.cssSelector("[class='btn btn-success ng-binding']");
	
	//Code for Search For Accounts Page -
	// Code to enter customer name is search for accountsearch field on Search For Accounts Page
	public RegistrationUI enter_search_for_account_search_field(String cusname){
		return enter(search_for_account_search_field, cusname);
	}
		
	// Code for Wait for Search Button to be clickable on Search for Account Page
	public RegistrationUI wait_for_search_for_account_search_button_clickable(){
		return wait_until(ExpectedConditions.elementToBeClickable(search_for_account_search_button));
	}
	
	// Code to click on Search Button on Search for Account Page
	public RegistrationUI click_search_for_account_search_button(){
		return click_button(search_for_account_search_button);
	}
	
	// Code for Wait for Search Button to be clickable on Search for Account Page
	public RegistrationUI wait_for_search_for_account_register_button_clickable(){
		return wait_until(ExpectedConditions.elementToBeClickable(search_for_account_register_button));
	}
	
	// Verify health system present in the first row - 
	public RegistrationUI verify_health_system_present_in_row_1(String customer_name){
		return verify_element_by_text(search_for_account_customer_name_row_1, customer_name);
	}
	
	// Code to verify the searched customer matches with the one inputed by user and click on register button
	public RegistrationUI click_search_for_account_register_button(){
		return click_button(search_for_account_register_button);
	}
	
	//Code to verify Search or account pop up page text
	public RegistrationUI verify_search_for_account_popup_text(String msg){
		return verify_element_by_text(search_for_account_popup_text, msg);
	}
		
	// Code for Yes Button to be clickable on Search for Account pop up Page
	public RegistrationUI wait_for_search_for_account_popup_yes_button_clickable(){
		return wait_until(ExpectedConditions.elementToBeClickable(search_for_account_popup_yes));
	}
	
	// Code to click on Yes Option on Search for Accounts Pop up
	public RegistrationUI click_search_for_account_popup_yes_button(){
		return click_button(search_for_account_popup_yes);
	}	
	
	// Code for No Button to be clickable on Search for Account pop up Page
	public RegistrationUI wait_for_search_for_account_popup_no_button_clickable(){
		return wait_until(ExpectedConditions.elementToBeClickable(search_for_account_popup_no_button));
	}
	
	// Code to click on No Button on Search for Account popup Page
	public RegistrationUI click_search_for_account_popup_no_button(){
		return click_button(search_for_account_popup_no_button);
	}

	//Locators for Express Health system Details page
	private By express_health_system_details_customername = By.cssSelector("[ng-bind-html='customerName | trustAsHtml']");
	private By express_health_system_details_customeraddress = By.xpath(".//form[@name='expressionForm']/div[3]/div[1]/div/div[1]/div[1]/div[1]/div");
	private By express_health_system_details_customercity = By.xpath(".//form[@name='expressionForm']/div[3]/div[1]/div/div[1]/div[1]/div[3]/div");
	private By express_health_system_details_customerzip = By.xpath(".//form[@name='expressionForm']/div[3]/div[1]/div/div[1]/div[1]/div[4]/div");
	private By express_health_system_details_customerurl = By.xpath(".//form[@name='expressionForm']/div[3]/div[1]/div/div[1]/div[2]");
	private By express_health_system_details_next_button = By.xpath(".//form[@name='expressionForm']/div[3]/div[2]/button");
		
	//Code to verify Customer name on Health system Details Page
	public RegistrationUI verify_express_health_system_details_customername(String msg){
		return verify_element_by_text(express_health_system_details_customername, msg);
	}
		
	//Code to verify Customer address on Health system Details Page
	public RegistrationUI verify_express_health_system_details_customeraddress(String msg){
		return verify_element_by_text(express_health_system_details_customeraddress, msg);
	}
	
	//Code to verify Customer city on Health system Details Page
	public RegistrationUI verify_express_health_system_details_customercity(String msg){
		return verify_element_by_text(express_health_system_details_customercity, msg);
	}
	
	//Code to verify Customer zip on Health system Details Page
	public RegistrationUI verify_express_health_system_details_customerzip(String msg){
		return verify_element_by_text(express_health_system_details_customerzip, msg);
	}
	
	//Code to verify Customer url on Health system Details Page
	public RegistrationUI verify_express_health_system_details_customerurl(String msg){
		return verify_element_by_text(express_health_system_details_customerurl, msg);
	}
	
	// Code for Wait for Next Button to be clickable on Health System Details Page
	public RegistrationUI wait_for_express_health_system_details_next_button_clickable(){
		wait_until(ExpectedConditions.elementToBeClickable(express_health_system_details_next_button));
	return this;
	}
	
	// Code to click on Next Button on Health System Details Page
	public RegistrationUI click_express_health_system_details_next_button(){
		return click_button(express_health_system_details_next_button);
	}
	
	//Locators for Express Payment page
//	private By express_payment_cardtype = By.xpath("//div[@class='row ng-scope']/div[5]/div/div[2]/select");
	private By express_payment_cardtype = By.name("cardTypeCode");
	
//	private By express_payment_cardnumber = By.xpath("//div[@class='row ng-scope']/div[6]/div/div[2]/input");
	private By express_payment_cardnumber = By.name("cardNumber");
	
//	private By express_payment_nameoncard = By.xpath("//div[@class='row ng-scope']/div[7]/div/div[2]/input");
	private By express_payment_nameoncard = By.name("nameOnCard");
	
//	private By express_payment_expirationmonth = By.xpath("//div[@class='row ng-scope']/div[8]/div/div[2]/div[1]/select");
	private By express_payment_expirationmonth = By.name("expirationMonthCode");
	
//	private By express_payment_expirationyear = By.xpath("//div[@class='row ng-scope']/div[8]/div/div[2]/div[2]/select");
	private By express_payment_expirationyear = By.name("expirationYearStr");
	
//	private By express_payment_verificationnumber = By.xpath("//div[@class='row ng-scope']/div[9]/div/div[2]/div[1]/input");
	private By express_payment_verificationnumber = By.name("authorizationCode");
	private By express_payment_billingst = By.id("billingAddress1");
	private By express_payment_billingcity = By.name("billingCity");
	private By express_payment_billingstate = By.name("billingStateCode");
	private By express_payment_billingcountry = By.id("billingCountryCode");
	private By express_payment_billingzip = By.name("billingZip");
	private By express_payment_billingemail = By.id("billingEmail");
	private By express_payment_checkbox1 = By.id("acceptFee");
	private By express_payment_checkbox2 = By.id("acceptChangable");
	private By express_payment_checkbox3 = By.id("acceptAutoRenew");
	private By express_payment_checkbox4 = By.id("trueAndAccurate");
//	private By express_payment_chargeandcontinue_button = By.xpath("//div[@class='row ng-scope']/div[22]/div[2]/button");
	private By express_payment_chargeandcontinue_button = By.xpath("//button[contains(., 'Charge Card & Continue')]");
	private By express_payment_amount = By.xpath("//*[@name='paymentDetailsForm']/div[19]/div/div[2]");
	
	//Code for Payment Page of Express Flow
	// Code to select card type from dropdown
	public RegistrationUI select_express_payment_cardtype(String cardtype){
		return select_by_name(express_payment_cardtype, cardtype);
	}
	
	// Code to enter card number Payment Details Page 
	public RegistrationUI enter_express_payment_cardnumber(String cardnumber){
		return enter(express_payment_cardnumber, cardnumber);
	}
	
	// Code to enter name on card on Payment Details Page 
	public RegistrationUI enter_express_payment_nameoncard(String nameoncard){
		return enter(express_payment_nameoncard, nameoncard);
	}
	
	// Code to select card expiration month from dropdown
	public RegistrationUI select_express_payment_expirationmonth(String expiremnth){
		return select_by_name(express_payment_expirationmonth, expiremnth);
	}
		
	// Code to select card expiration year from dropdown
	public RegistrationUI select_express_payment_expirationyear(String expireyr){
		return select_by_name(express_payment_expirationyear, expireyr);
	}
	
	// Code to enter verification number on Payment Details Page 
	public RegistrationUI enter_express_payment_verificationnumber(String verificationno){
		return enter(express_payment_verificationnumber, verificationno);
	}
	
	// Code to enter billing St on Payment Details Page 
	public RegistrationUI enter_express_payment_billingst(String billingst1){
		return enter(express_payment_billingst, billingst1);
	}
	
	// Code to enter billing city on Payment Details Page 
	public RegistrationUI enter_express_payment_billingcity(String billingsct){
		return enter(express_payment_billingcity, billingsct);
	}
	
	// Code to select billing state from dropdown
	public RegistrationUI select_express_payment_billingstate(String billingstate){
		return select_by_name(express_payment_billingstate, billingstate);
	}
		
	// Code to select billing country from dropdown
	public RegistrationUI select_express_payment_billingcountry(String billingcountry){
		return select_by_name(express_payment_billingcountry, billingcountry);
	}
	
	// Code to enter billing zip on Payment Details Page 
	public RegistrationUI enter_express_payment_billingzip(String billingzip){
		return enter(express_payment_billingzip, billingzip);
	}
	
	// Code to enter billing mail on Payment Details Page 
	public RegistrationUI enter_express_payment_billingemail(String billingmail){
		return enter(express_payment_billingemail, billingmail);
	}
	
	// Code to click on payment page checkbox1 on create account Chevron
	public RegistrationUI click_express_payment_checkbox1(){
		boolean checkbox_selected = is_element_selected(express_payment_checkbox1);
		if (checkbox_selected == false)		
		click_button(express_payment_checkbox1);
		return this;
	}
	
	// Code to click on payment page checkbox2 on create account Chevron
	public RegistrationUI click_express_payment_checkbox2(){
		boolean checkbox_selected = is_element_selected(express_payment_checkbox2);
		if (checkbox_selected == false)		
		click_button(express_payment_checkbox2);
		return this;
	}
		
	// Code to click on payment page checkbox3 on create account Chevron
	public RegistrationUI click_express_payment_checkbox3(){
		boolean checkbox_selected = is_element_selected(express_payment_checkbox3);
		if (checkbox_selected == false)		
		click_button(express_payment_checkbox3);
		return this;
	}
	
	// Code to click on payment page checkbox4 on create account Chevron
	public RegistrationUI click_express_payment_checkbox4(){
		boolean checkbox_selected = is_element_selected(express_payment_checkbox4);
		if (checkbox_selected == false)		
		click_button(express_payment_checkbox4);
		return this;
	}	
	
	// Code to click on Charge Card and Continue button on Payment Page
	public RegistrationUI click_express_payment_chargeandcontinue_button(){
		return click_button(express_payment_chargeandcontinue_button);
	}
	
	public RegistrationUI verify_express_payment_amount(String amount){
		return verify_element_by_text(express_payment_amount, amount);
	}
	
	
	//Locators for Express Company Details Page
	private By express_company_details_legal_name = By.id("legalName");
	private By express_company_details_tax_id = By.id("taxId");
	private By express_company_details_business_type = By.id("typeOfBusinessCode");
	private By express_company_details_amount_of_business = By.id("spendTierCode");
	private By express_company_details_company_website = By.id("websiteURL");
	private By express_company_details_phi1_yes = By.id("employeeYes");
	private By express_company_details_phi2_yes = By.id("representativesYes");
	private By express_company_details_phi1_no = By.id("employeeNo");
	private By express_company_details_phi2_no	= By.id("representativesNo");
	private By express_company_details_next_button = By.cssSelector("[data-ng-click='saveCompanyDetails(data,$parent.data.expressData.CustomerAddress)']");
	
	
	// Code to verify company website name
	  public RegistrationUI verify_express_company_details_company_website(String companywebsite){
	   return verify_element_attribute_value(express_company_details_company_website, "value", companywebsite);
	 }
	
	// Code for Next Button to be clickable on Company Details Page
	public RegistrationUI wait_for_express_company_details_next_button_clickable(){
		return wait_until(ExpectedConditions.elementToBeClickable(express_company_details_next_button));
	}
		
	// Code to select business type from dropdown
	public RegistrationUI select_express_company_details_business_type(String businesstype){
		return select_by_name(express_company_details_business_type, businesstype);
	}
	
	public RegistrationUI verify_express_company_details_business_type(String businesstype){
		return verify_element_attribute_value(express_company_details_business_type, "value", businesstype);		
	}
	
	// Code to select business amount from dropdown
	public RegistrationUI select_express_company_details_amount_of_business(String businessamount){
		return select_by_name(express_company_details_amount_of_business, businessamount);
	}
	
	public RegistrationUI verify_express_company_details_amount_of_business(String businessamount){
		return verify_element_attribute_value(express_company_details_amount_of_business, "value", businessamount);
	}
	
	public RegistrationUI verify_express_company_details_legal_name(String legalname){
		wait_until(2);
		return verify_element_attribute_value(express_company_details_legal_name, "value", legalname);
	}
	
	public RegistrationUI verify_express_company_details_tax_id(String fein){
		return verify_element_attribute_value(express_company_details_tax_id, "value", fein);
	}
	
	// Code to enter verification number on Payment Details Page 
	public RegistrationUI enter_express_company_details_company_website(String verificationno){
		return enter(express_company_details_company_website, verificationno);
	}
	
	// Code to click on PHI Question 1 radiobutton Yes on Express Company Details Page
	public RegistrationUI click_express_company_details_phi1_option(String yes_or_no){
		if(yes_or_no.equalsIgnoreCase("yes")) {
			 boolean checkbox_selected = is_element_selected(express_company_details_phi1_yes);
				if (checkbox_selected == false)	
					click_button(express_company_details_phi1_yes);
		 }
		 
		 else {
			 	boolean checkbox_selected = is_element_selected(express_company_details_phi1_no);
				if (checkbox_selected == false)	
					click_button(express_company_details_phi1_no);
		 }
		return this;
	}
	
	public RegistrationUI verify_express_company_details_phi1_option(String yes_or_no){
		 if(yes_or_no.equalsIgnoreCase("yes")) {
			 boolean checkbox_selected = is_element_selected(express_company_details_phi1_yes);
			 Assert.assertEquals(checkbox_selected, true);
		 }
		 
		 else {
			 	boolean checkbox_selected = is_element_selected(express_company_details_phi1_no);
			 	Assert.assertEquals(checkbox_selected, true);
		 }
		return this;
	}
		
	// Code to click on PHI Question 2 radiobutton Yes on Express Company Details Page
	public RegistrationUI click_express_company_details_phi2_option(String yes_or_no){
		if(yes_or_no.equalsIgnoreCase("yes")) {
			 boolean checkbox_selected = is_element_selected(express_company_details_phi2_yes);
				if (checkbox_selected == false)	
					click_button(express_company_details_phi2_yes);
		 }
		 
		 else {
			 	boolean checkbox_selected = is_element_selected(express_company_details_phi2_no);
				if (checkbox_selected == false)	
					click_button(express_company_details_phi2_no);
		 }
		return this;
	}
	
	public RegistrationUI verify_express_company_details_phi2_option(String yes_or_no){
		 if(yes_or_no.equalsIgnoreCase("yes")) {
			 boolean checkbox_selected = is_element_selected(express_company_details_phi2_yes);
			 Assert.assertEquals(checkbox_selected, true);
		 }
		 
		 else {
			 	boolean checkbox_selected = is_element_selected(express_company_details_phi2_no);
			 	Assert.assertEquals(checkbox_selected, true);
		 }
		return this;
	}
	
	// Code to click on Charge Card and Continue button on Payment Page
	public RegistrationUI click_express_company_details_next_button(){
		return click_button(express_company_details_next_button);
	}
	
	//Locators for Contacts Page
	 private By contacts_sales_first_name = By.id("firstName");
	 private By contacts_sales_last_name = By.id("lastName");
	 private By contacts_sales_email = By.id("email");
	 private By contacts_next_button = By.cssSelector("[data-ng-click='submitComplianceForm(data,8);']");

//Code for Contacts Page
	 
	 // Code to enter sales operations first name on Contacts Page 
	 public RegistrationUI enter_contacts_sales_first_name(String sales_first_name){
	  return enter(contacts_sales_first_name, sales_first_name);
	 }
	 
	 public RegistrationUI verify_contacts_sales_first_name(String sales_first_name){
		  return verify_element_attribute_value(contacts_sales_first_name, "value", sales_first_name);
	 }
	 
	 // Code to enter sales operations first name on Contacts Page 
	 public RegistrationUI enter_contacts_sales_last_name(String sales_last_name){
		 return enter(contacts_sales_last_name, sales_last_name);
	 }
	 
	 public RegistrationUI verify_contacts_sales_last_name(String sales_last_name){
		  return verify_element_attribute_value(contacts_sales_last_name, "value", sales_last_name);
	 }
	 
	 // Code to enter sales operations first name on Contacts Page 
	 public RegistrationUI enter_contacts_sales_email(String sales_email){
	  return enter(contacts_sales_email, sales_email);
	 }
	 
	 public RegistrationUI verify_contacts_sales_email(String sales_email){
		 return verify_element_attribute_value(contacts_sales_email, "value", sales_email);
	 }
	 
	 // Code to click on next button on contacts Page
	 public RegistrationUI click_contacts_next_button(){
		 wait_until(3);
	  return click_button(contacts_next_button);
	 }
	 
	 //Locators for Diversity Page
	 //private By minority_owned_minority_type = By.id("minorityCode");
	 //private By minority_owned_certification_agency = By.id("certification1.certificationAgencyOid");
	 //private By minority_owned_certification_number = By.id("certification1.certNumber");
	 private By diversity_majority_owner_gender_male = By.cssSelector("[id='certificationGender'][value='m']");
	 private By diversity_majority_owner_etnicity = By.id("certificationEthnicity");
	 private By diversity_next_button = By.cssSelector("[type='submit']");
	 
	 //Code for Diversity Page
	 // Code to click on male option for gender field on Diversity Page
	 public RegistrationUI click_diversity_majority_owner_gender_male(){
	  boolean checkbox_selected = is_element_selected(diversity_majority_owner_gender_male);
	  if (checkbox_selected == false)  
	  click_button(diversity_majority_owner_gender_male);
	  return this;
	 }
	 
	 public RegistrationUI verify_diversity_majority_owner_gender_male(){
		  boolean checkbox_selected = is_element_selected(diversity_majority_owner_gender_male);
		  Assert.assertEquals(checkbox_selected, true);
		  return this;
		 }
	 
	 // Code to enter etnicity on Diversity Page 
	 public RegistrationUI enter_diversity_majority_owner_etnicity(String etnicity){
	  return enter(diversity_majority_owner_etnicity, etnicity);
	 }
	 
	 public RegistrationUI verify_diversity_majority_owner_etnicity(String etnicity){
		  return verify_element_attribute_value(diversity_majority_owner_etnicity, "value",etnicity);
	 }
	 
	 // Code to click on next button on Diversity Page
	 public RegistrationUI click_diversity_next_button(){
	  return click_button(diversity_next_button);
	 }
	 
// Locators for Docuent Upload - 
	 private By doc_name_row_1 = By.xpath("//*[@id='companyReqiredDocuments']/tbody/tr/td[2]/span");
	 private By click_upload_link = By.linkText("Upload"); 
	 private By upload_status = By.xpath("//*[@id='companyReqiredDocuments']/tbody/tr/td[1]/span/img");
	 private By doc_updated_by = By.xpath("xpath=//*[@id='companyReqiredDocuments']/tbody/tr/td[4]");
	 private By expiration_date = By.cssSelector("[ng-model='data.DocumentDetail.docExpirationDateString']");
	 private By file_upload = By.xpath("//*[@id='documentUplaod']/div[1]/input");
	 private By save_button = By.cssSelector("[validation-submit='expressionForm'][type='button']");
	 private By cautions_compliance_icon = By.id("complianceContinueIcon");
	 private By doc_page_next_button = By.cssSelector("[data-ng-click='validateCompanyDocuments('expressionRegistration.policies','');']");
	 
	 public RegistrationUI verify_doc_name_row_1(String doc_name) {
		 return verify_element_by_text(doc_name_row_1, doc_name);
	 }
	 
	 public RegistrationUI click_upload_link() {
		 wait_until(2);
		 return click_link(click_upload_link);
	 }
	 
	 public RegistrationUI verify_upload_status(String status) {
		 return verify_element_attribute_value(upload_status, "alt", status);
	 }
	  
	 public RegistrationUI verify_updated_by_name(String updated_by) {
		 return verify_element_by_text(doc_updated_by, updated_by);
	 }
	 
	 public RegistrationUI click_continue_button() {
		 wait_until(2);
		 return click_button(cautions_compliance_icon);
	 }
	 
	 public RegistrationUI enter_expiration_date(String year, String month, String date) {
		 wait_until(2);
		 click(expiration_date);
		 wait_until(1);
		 click_year_or_month_field();
		 wait_until(1);
		 click_year_or_month_field();
		 select_year(year);
		 select_month(month);
		 select_date(date);
		 return this;
	 }
	 
	 public RegistrationUI upload_doc_file(String path) {
		 wait_until(3);
		 WebElement ele = verify(ExpectedConditions.visibilityOfElementLocated(file_upload));
		 ele.sendKeys(path);
		 return this; 
	 }
	 
	 public RegistrationUI click_save_button() {
		 wait_until(3);
		 return click_button(save_button);
	 }
	 
	 public RegistrationUI wait_for_document_to_upload(String doc_name){
		 wait_until(5);
		 return wait_until(ExpectedConditions.presenceOfElementLocated(By.linkText(doc_name)));
	 }
	 
	 public RegistrationUI click_doc_upload_next_button() {
		 wait_until(2);
		 return click_button(doc_page_next_button);
	 }
	
// Locators for Acknowledgement Page - 
	 private By ack_status = By.xpath("//*[@id='companyPolicies']/tbody/tr/td[1]/span/img");
	 private By click_ack_link = By.linkText("Acknowledge");
	 private By ack_popup_yes = By.cssSelector("[ng-click='ok()']");
	 private By ack_provided_by = By.xpath("//*[@id='companyPolicies']/tbody/tr/td[4]");
	 private By ack_page_next_button = By.cssSelector("[data-ng-click='validatePolicies('expressionRegistration.agreements',companyPolicies);']");
	 private By ack_name_row_1 = By.cssSelector("[ng-if='policiesInfo.docDefName']");

	 public RegistrationUI verify_ack_name_row_1(String ack_name) {
		 return verify_element_by_text(ack_name_row_1, ack_name);
	 }

	 public RegistrationUI verify_ack_status(String status) {
		 wait_until(3);
		 return verify_element_attribute_value(ack_status, "alt", status);
	 }
	 
	 public RegistrationUI click_ack_link() {
		 wait_until(2);
		 return click_link(click_ack_link);
	 }
	 
	 public RegistrationUI click_ack_popup_yes_button() {
		 wait_until(5);
		 return click_button(ack_popup_yes);
	 }
	 
	 public RegistrationUI verify_ack_provided_by_name(String name) {
		 return verify_element_by_text(ack_provided_by, name);
	 }
	 
	 public RegistrationUI click_ack_page_next_button() {
		 wait_until(5);
		 return click_button(ack_page_next_button);
	 }
	 
// Locators for Agreements page - 
	 private By relationship_no = By.cssSelector("[id='cfiRelationship'][value='false']"); 
	 private By affiliations_no = By.cssSelector("[id='cfiBoardAffl'][value='false']");
	 private By compensation_no = By.cssSelector("[id='cfiCompensation'][value='false']");
	 private By eula_license_aggement = By.id("licenseAgreement");
	 private By agreement_page_next_button = By.xpath("//button[contains(., 'Next')]");
	
	 public RegistrationUI click_relationship_no_radio_button() {
		boolean checkbox_selected = is_element_selected(relationship_no);
		if (checkbox_selected == false)	
			click_button(relationship_no);
			return this;
	 }
	 
	 public RegistrationUI verify_relationship_no_radio_button() {
			boolean checkbox_selected = is_element_selected(relationship_no);
			Assert.assertEquals(checkbox_selected, true);
			return this;
		 }
	 
	 public RegistrationUI click_affiliations_no_radio_button() {
		 boolean checkbox_selected = is_element_selected(affiliations_no);
			if (checkbox_selected == false)	
				click_button(affiliations_no);
				return this;
	 }
	 
	 public RegistrationUI verify_affiliations_no_radio_button() {
		 boolean checkbox_selected = is_element_selected(affiliations_no);
		 Assert.assertEquals(checkbox_selected, true);
		 return this;
	 }
	 
	 public RegistrationUI click_compensation_no_radio_button() {
		 boolean checkbox_selected = is_element_selected(compensation_no);
			if (checkbox_selected == false)	
				click_button(compensation_no);
				return this;
	 }
	 
	 public RegistrationUI verify_compensation_no_radio_button() {
		 boolean checkbox_selected = is_element_selected(compensation_no);
		 Assert.assertEquals(checkbox_selected, true);
		 return this;
	 }
	 
	 public RegistrationUI check_eula_license_aggement_checkbox() {
		 boolean checkbox_selected = is_element_selected(eula_license_aggement);
			if (checkbox_selected == false)	
				click_button(eula_license_aggement);
				return this;
	 }
	 
	 public RegistrationUI click_agreement_page_next_button() {
		 return click_button(agreement_page_next_button);
	 }
	 
	// Health System Request Popup -
	 private By popup_header = By.className("modal-title text-center margin");
	 private By popup_msg = By.xpath("//div[@class='modal-content']/div[2]/div/div/p");
	 private By popup_next_button = By.cssSelector("[ng-click='yes()']");
	 
	 public RegistrationUI verify_health_system_request_popup_header(String header) {
		 return verify_element_by_text(popup_header, header);
	 }
	 
	 public RegistrationUI click_health_system_request_popup_next_button() {
		 wait_until(3);
		 return click_button(popup_next_button);
	 }
	 
// Locators for Onboarding Category Page- 
	 private By available_onboarding_category = By.name("AvailableVendorOnBoardingCategory");
	 private By used_onboarding_category = By.id("usedVendorOnBoardingCategory");
	 private By move_available_to_used  = By.xpath("//form[@name='vendorOnboardingCategoryForm']/div[1]/div/div/div/multi-select/cpanel/div/div[1]/input");
	 private By onboarding_save_and_next = By.id("VendorOnboardingCategoryNext");
	 private By onboarding_page_next_button = By.id("VendorOnboardingCategorySave");
	 
	 public RegistrationUI select_available_onboarding_category (String category) {
		 wait_until(2);
		 return select_by_name(available_onboarding_category, category);
	 }
	 
	 public RegistrationUI move_category_available_to_used() {
		 return click_button(move_available_to_used);
	 }
	 
	 public RegistrationUI click_onboarding_category_page_save_and_next_button() {
		 wait_until(2);
		 return click_button(onboarding_save_and_next);
	 }
	 
	 public RegistrationUI verify_used_onboaring_category(int row_number, String category){
		 row_number = row_number - 1;
		 WebElement table = verify(ExpectedConditions.presenceOfElementLocated(used_onboarding_category));
		 String actual_category = table.findElements(By.tagName("option")).get(row_number).getText();
		 Assert.assertEquals(actual_category, category);
		 return this;
	 }
	 
	 
// Locators related to Form page - 
	 private By company_affiliate_fein = By.xpath("(//*[@id='companyAffiliateFein'])[2]");
	 private By contact_first_name = By.xpath("(//*[@id='contactFirstName'])[2]");
	 private By do_you_accept_edi_transmissions = By.xpath("(//*[@id='isAcceptEDITransmissions'])[2]");
	 private By is_your_company_iso_certified = By.xpath("(//*[@id='isCompanyISOCertified'])[2]");
	 private By save_and_coninue = By.id("OBFormsUpdate");
	 private By alert_notify_person_no_button = By.cssSelector("[ng-click='no()']") ;
	 
	 public RegistrationUI enter_company_affiliate_fein(String fein){
		 return enter(company_affiliate_fein, fein);
	 }
	 
	 public RegistrationUI verify_company_affiliate_fein(String fein){
		 return verify_element_attribute_value(company_affiliate_fein, "value", fein);
	 }
	 
	 public RegistrationUI enter_contact_first_name(String name){
		 return enter(contact_first_name, name);
	 }
	 
	 public RegistrationUI verify_contact_first_name(String name){
		 return verify_element_attribute_value(contact_first_name, "value", name);
	 }
	 
	 public RegistrationUI click_form_page_save_and_continue_button() {
		 wait_until(3);
		 return click_button(save_and_coninue);
	 }
	 
	 public RegistrationUI select_do_you_accept_edi_transmissions (String name) {
		 return select_by_name(do_you_accept_edi_transmissions, name);
	 }
	 
	 public RegistrationUI verify_do_you_accept_edi_transmissions (String name) {
		 return verify_element_attribute_value(do_you_accept_edi_transmissions, "value", name);
	 }
	 
	 public RegistrationUI select_is_your_company_iso_certified (String name) {
		 return select_by_name(is_your_company_iso_certified, name);
	 }
	 
	 public RegistrationUI verify_is_your_company_iso_certified (String name) {
		 return verify_element_attribute_value(is_your_company_iso_certified,"value", name);
	 }
	 
	 public RegistrationUI click_alert_notify_person_no_button() {
		 wait_until(3);
		 return click_button(alert_notify_person_no_button);
	 }
	 
// Locator related to onboarding document page -  
	 private By doc_type_row_1 = By.xpath("//*[@id='vendorOBDocsList']/div[2]/table/tbody/tr[1]/td[1]/span");
	 private By doc_status_row_1 = By.xpath("//*[@id='vendorOBDocsList']/div[2]/table/tbody/tr[1]/td[5]/span");
	 
	 
	 public RegistrationUI verify_doc_type_row_1(String doc) {
		 return verify_element_attribute_value(doc_type_row_1, "tooltip", doc);
	 }
	 
	 public RegistrationUI verify_doc_status_row_1(String status) {
		 return verify_element_by_text(doc_status_row_1, status);
	 }
	 
//  Locators related to User Relationship Page - 
	 private By rep_risk_ques_1_yes = By.cssSelector("[id='data.RepRiskSummary.q_1'][value='true']");
	 private By rep_risk_ques_1_no = By.cssSelector("[id='data.RepRiskSummary.q_1'][value='false']");
	 private By rep_risk_ques_2_yes = By.cssSelector("[id='data.RepRiskSummary.q_2'][value='true']");
	 private By rep_risk_ques_2_no = By.cssSelector("[id='data.RepRiskSummary.q_2'][value='false']");
	 private By rep_risk_ques_3_yes = By.cssSelector("[id='data.RepRiskSummary.q_3'][value='true']");
	 private By rep_risk_ques_3_no = By.cssSelector("[id='data.RepRiskSummary.q_3'][value='false']");
	 private By rep_risk_ques_4_yes = By.cssSelector("[id='data.RepRiskSummary.q_4'][value='true']");
	 private By rep_risk_ques_4_no = By.cssSelector("[id='data.RepRiskSummary.q_4'][value='false']");
	 private By rep_risk_ques_5_yes = By.cssSelector("[id='data.RepRiskSummary.q_5'][value='true']");
	 private By rep_risk_ques_5_no = By.cssSelector("[id='data.RepRiskSummary.q_5'][value='false']");
	 private By rep_risk_ques_rep_on_site_yes = By.cssSelector("[id='data.RepRiskSummary.repOnSite'][value='true']");
	 private By rep_risk_ques_rep_on_site_no = By.cssSelector("[id='data.RepRiskSummary.repOnSite'][value='false']");
	 private By location_common_locator = By.id("data.customerChildLocation.locationOid");
	 private By department_common_locator = By.id("department.id");
	 private By your_relationship_page_next_button = By.cssSelector("[data-ng-click='submitYourRelationship(data);']");
	
	 public RegistrationUI select_rep_risk_question_1(String yes_no){
		 
		 if(yes_no.equalsIgnoreCase("yes")) {
			 boolean checkbox_selected = is_element_selected(rep_risk_ques_1_yes);
				if (checkbox_selected == false)	
					click_button(rep_risk_ques_1_yes);
		 }
		 
		 else {
			 	boolean checkbox_selected = is_element_selected(rep_risk_ques_1_no);
				if (checkbox_selected == false)	
					click_button(rep_risk_ques_1_no);
		 }
		return this;
	 }
	 
	public RegistrationUI select_rep_risk_question_2(String yes_no){
			 
			 if(yes_no.equalsIgnoreCase("yes")) {
				 boolean checkbox_selected = is_element_selected(rep_risk_ques_2_yes);
					if (checkbox_selected == false)	
						click_button(rep_risk_ques_2_yes);
			 }
			 
			 else {
				 	boolean checkbox_selected = is_element_selected(rep_risk_ques_2_no);
					if (checkbox_selected == false)	
						click_button(rep_risk_ques_2_no);
			 }
			return this;
		 }
	
	public RegistrationUI select_rep_risk_question_3(String yes_no){
		 
		 if(yes_no.equalsIgnoreCase("yes")) {
			 boolean checkbox_selected = is_element_selected(rep_risk_ques_3_yes);
				if (checkbox_selected == false)	
					click_button(rep_risk_ques_3_yes);
		 }
		 
		 else {
			 	boolean checkbox_selected = is_element_selected(rep_risk_ques_3_no);
				if (checkbox_selected == false)	
					click_button(rep_risk_ques_3_no);
		 }
		return this;
	}
	
	public RegistrationUI select_rep_risk_question_4(String yes_no){
		 
		 if(yes_no.equalsIgnoreCase("yes")) {
			 boolean checkbox_selected = is_element_selected(rep_risk_ques_4_yes);
				if (checkbox_selected == false)	
					click_button(rep_risk_ques_4_yes);
		 }
		 
		 else {
			 	boolean checkbox_selected = is_element_selected(rep_risk_ques_4_no);
				if (checkbox_selected == false)	
					click_button(rep_risk_ques_4_no);
		 }
		return this;
	}
	
	public RegistrationUI select_rep_risk_question_5(String yes_no){
		 
		 if(yes_no.equalsIgnoreCase("yes")) {
			 boolean checkbox_selected = is_element_selected(rep_risk_ques_5_yes);
				if (checkbox_selected == false)	
					click_button(rep_risk_ques_5_yes);
		 }
		 
		 else {
			 	boolean checkbox_selected = is_element_selected(rep_risk_ques_5_no);
				if (checkbox_selected == false)	
					click_button(rep_risk_ques_5_no);
		 }
		return this;
	}
	 
	public RegistrationUI select_rep_risk_on_site_question(String yes_no){
		 
		 if(yes_no.equalsIgnoreCase("yes")) {
			 boolean checkbox_selected = is_element_selected(rep_risk_ques_rep_on_site_yes);
				if (checkbox_selected == false)	
					click_button(rep_risk_ques_rep_on_site_yes);
		 }
		 
		 else {
			 	boolean checkbox_selected = is_element_selected(rep_risk_ques_rep_on_site_no);
				if (checkbox_selected == false)	
					click_button(rep_risk_ques_rep_on_site_no);
		 }
		return this;
	} 
	 
	public RegistrationUI select_dynamic_question(int ques_no, String yes_no){
		ques_no = ques_no - 1;
		By rep_risk_dynamic_ques_yes = By.cssSelector("[id='dynamicRepQuestion[" +ques_no +"].questionOid'][value='true']");
		By rep_risk_dynamic_ques_no = By.cssSelector("[id='dynamicRepQuestion[" +ques_no +"].questionOid'][value='false']");

		 if(yes_no.equalsIgnoreCase("yes")) {
			 boolean checkbox_selected = is_element_selected(rep_risk_dynamic_ques_yes);
				if (checkbox_selected == false)	
					click_button(rep_risk_dynamic_ques_yes);
		 }
		 
		 else {
			 	boolean checkbox_selected = is_element_selected(rep_risk_dynamic_ques_no);
				if (checkbox_selected == false)	
					click_button(rep_risk_dynamic_ques_no);
		 }
		return this;
	}
	 
	public RegistrationUI select_location(String location){
		
		List<WebElement>  ele = verify(ExpectedConditions.visibilityOfAllElementsLocatedBy(location_common_locator));
		int size = ele.size();
		int a = 0;
		for (int i = 1; i <= size; i++) {
			
			String xpath1 = "(//*[@class='col-md-4 ng-scope'])[" + i +"]";
			By loc1 = By.xpath(xpath1);
			WebElement txt1 = verify(ExpectedConditions.visibilityOfElementLocated(loc1));
			if(txt1.getText().equalsIgnoreCase(location)) {
				
				String xpath2 = "(//*[@id='data.customerChildLocation.locationOid'])[" + i +"]";
				By loc2 = By.xpath(xpath2);
				WebElement txt2 = verify(ExpectedConditions.visibilityOfElementLocated(loc2));
				 boolean checkbox_selected = txt2.isSelected();
					if (checkbox_selected == false)	{
						txt2.click();
						break;
					} 
			} else {a++;}
		}
		
		 if(size == a)
			 Assert.fail("Location not found");
		return this;
	}
	
	public RegistrationUI select_department(String department){
		
		List<WebElement>  ele = verify(ExpectedConditions.visibilityOfAllElementsLocatedBy(department_common_locator));
		int size = ele.size();
		System.out.println(size);
		int a = 0;
		for (int i = 1; i <= size; i++) {
			
			String xpath1 = "(//*[@class='col-md-4 marginL2 ng-scope'])[" + i +"]";
			By loc1 = By.xpath(xpath1);
			WebElement txt1 = verify(ExpectedConditions.visibilityOfElementLocated(loc1));
			System.out.println(i + " - " +txt1.getText());
			if(txt1.getText().equalsIgnoreCase(department)) {
				
				String xpath2 = "(//*[@id='department.id'])[" + i +"]";
				By loc2 = By.xpath(xpath2);
				WebElement txt2 = verify(ExpectedConditions.visibilityOfElementLocated(loc2));
				 boolean checkbox_selected = txt2.isSelected();
					if (checkbox_selected == false)	{
						txt2.click();
						break;
					} 
			} else {a++;}
		}
		
		 if(size == a)
			 Assert.fail("Department not found");
		return this;
	}
	
	 
	 public RegistrationUI click_your_relationship_page_next_button() {
		 wait_until(3);
		 return click_button(your_relationship_page_next_button);
	 } 
	 
//	Locators for Payment Received and Next Steps - 
	 private By payment_received_popup_header = By.className("modal-header");
	 private By payment_received_popup_body_text1 = By.className("modal-body");
	 private By payment_received_popup_body_text2 = By.className("marginL3 marginB3");
	 private By payment_received_popup_next_button = By.cssSelector("[data-ng-click='goNormalToExpress();']");
	 
	 
	 public RegistrationUI verify_payment_received_popup_header_msg (String msg) {
		 return verify_element_by_text(payment_received_popup_header, msg);
	 }
	 
	 public RegistrationUI verify_payment_received_popup_body_text1_msg (String msg) {
		 return verify_element_by_text(payment_received_popup_body_text1, msg);
	 }
	 
	 public RegistrationUI verify_payment_received_popup_body_text2_msg (String msg) {
		 return verify_element_by_text(payment_received_popup_body_text2, msg);
	 }
	 
	 public RegistrationUI click_payment_received_popup_next_button() {
		 wait_until(3);
		 return click_button(payment_received_popup_next_button);
	 } 
	 
//	 Locators related to Select Your Company Page - 
	 
	 private By your_company_tax_id = By.id("taxIdDiv_value");
	 private By select_option_1_from_fein_dropdown = By.cssSelector("[ng-click='selectResult(result)']");
	 private By company_tax_id_table_locator = By.tagName("table");
	 
	 public RegistrationUI enter_your_company_tax_id(String taxid) {
		 wait_until(3);
		 return enter(your_company_tax_id, taxid);
	 }
	 
	 public RegistrationUI click_option_1_from_fein_dropdown() {
		 wait_until(3);
		 return click(select_option_1_from_fein_dropdown);
	 }
	 
	 public RegistrationUI verify_tax_id_row_no(int row_number, String fein) {
		 wait_until(5);
		 row_number = row_number - 1;
		 WebElement table = verify(ExpectedConditions.presenceOfElementLocated(company_tax_id_table_locator));
		 WebElement body = table.findElement(By.tagName("tbody"));
		 List<WebElement> rows = body.findElements(By.tagName("tr"));
		 String get_fein = rows.get(row_number).findElements(By.tagName("td")).get(0).getText();
		 Assert.assertEquals(get_fein, fein);
		 return this;
	 }
	 
	 public RegistrationUI verify_legal_business_name_row_no(int row_number, String name) {
		 row_number = row_number - 1;
		 WebElement table = verify(ExpectedConditions.presenceOfElementLocated(company_tax_id_table_locator));
		 WebElement body = table.findElement(By.tagName("tbody"));
		 List<WebElement> rows = body.findElements(By.tagName("tr"));
		 String get_name = rows.get(row_number).findElements(By.tagName("td")).get(1).getText();
		 Assert.assertEquals(get_name, name);
		 return this;
	 }
	 
	 public RegistrationUI verify_address_row_no(int row_number, String address) {
		 row_number = row_number - 1;
		 WebElement table = verify(ExpectedConditions.presenceOfElementLocated(company_tax_id_table_locator));
		 WebElement body = table.findElement(By.tagName("tbody"));
		 List<WebElement> rows = body.findElements(By.tagName("tr"));
		 String get_address = rows.get(row_number).findElements(By.tagName("td")).get(2).getText();
		 Assert.assertEquals(get_address, address);
		 return this;
	 }
	 
	 public RegistrationUI click_select_button_present_on_row_no(int row_number) {
		 row_number = row_number - 1;
		 WebElement table = verify(ExpectedConditions.presenceOfElementLocated(company_tax_id_table_locator));
		 WebElement body = table.findElement(By.tagName("tbody"));
		 List<WebElement> rows = body.findElements(By.tagName("tr"));
		 rows.get(row_number).findElements(By.tagName("td")).get(3).click();
		 return this;
	 }
	 
// 	 Methods related to Setup Your Company Page -
	 private By verify_state_on_setup_your_company_page = By.id("state");
	 private By setup_your_comapny_page_page_next_button = By.cssSelector("[data-validation-submit='registrationForm'][type='submit']");
	 
	 public RegistrationUI verify_legal_business_name_on_setup_company_page(String name){
		 return verify_element_attribute_value(legal_business_name, "value", name);
	 }
	 
	 public RegistrationUI verify_fein_on_setup_company_page(String fein){
		 return verify_element_attribute_value(federal_tax_id, "value", fein);
	 }
	 
	 public RegistrationUI verify_street_add_1_on_setup_company_page(String name){
		 return verify_element_attribute_value(street_address1, "value", name);
	 }
	 
	 public RegistrationUI verify_street_add_2_on_setup_company_page(String name){
		 return verify_element_attribute_value(street_address2, "value", name);
	 }
	 
	 public RegistrationUI verify_country_on_setup_company_page(String name){
		 return verify_element_attribute_value(country_dropdown, "value", name);
	 }
	 
	 public RegistrationUI verify_state_on_setup_company_page(String name){
		 return verify_element_attribute_value(verify_state_on_setup_your_company_page, "value", name);
	 }
	 
	 public RegistrationUI verify_city_on_setup_company_page(String name){
		 return verify_element_attribute_value(city, "value", name);
	 }
	 
	 public RegistrationUI verify_zip_on_setup_company_page(String zip){
		 return verify_element_attribute_value(zipcode, "value", zip);
	 }
	 
	 public RegistrationUI verify_dba_on_setup_company_page(String dba){
		 return verify_element_attribute_value(doing_business_as, "value", dba);
	 }
	 
	 public RegistrationUI click_next_button_on_setup_company_page() {
		 wait_until(3);
		 return click_button(setup_your_comapny_page_page_next_button);
	 }
	 
// Locators Related to Normalization address popup page -
	 private By normalization_pop_up_select_btn = By.xpath("//button[contains(., 'Select')]");
	 private By normalization_pop_up_close_btn = By.xpath("//button[contains(., 'Close')]");
	 
	 public RegistrationUI click_normalization_pop_up_select_btn(){
			return click_button(normalization_pop_up_select_btn);
	 }
	 
	 public RegistrationUI click_normalization_pop_up_close_btn(){
			return click_button(normalization_pop_up_close_btn);
	 }
	 

//*****************Abhijit's Code ******
	 
	// Locators for Normal Company Details Page
		private By normal_company_details_business_type = By.id("typeOfBusinessCode"); //Corporation
		private By normal_company_details_dba_name = By.id("dbaName");
		private By normal_company_details_next_button = By.xpath("//button[contains(., 'Next')]");
		private By normal_company_details_search_field = By.id("searchString");
		

		
		// Code to Select type of business on Normal Company Details Page
		public RegistrationUI select_normal_company_details_business_type(String business_type){
			return select_by_name(normal_company_details_business_type, business_type);
		}
		
		// Code to enter DBA Name in Normal Company Details Page
		public RegistrationUI enter_normal_company_details_dba_name(String dbaname){
			return enter(normal_company_details_dba_name, dbaname);
		}
		
		// Code to click on Next Button on Normal Company Details Page 
		public RegistrationUI click_normal_company_details_next_button(){
			return click_button(normal_company_details_next_button);
		}
		
	// Locators for Normal Company Relationship Page
		private By normal_company_relationship_existing_relationship_yes = By.xpath("//*[@id='potential'][1]");
		private By normal_company_relationship_existing_relationship_no = By.xpath("//*[@id='potential'][2]"); 
		private By normal_company_relationship_spend_tier = By.id("tierCode");
		private By normal_company_relationship_number_of_reps = By.id("numberOfReps");
		private By normal_company_relationship_onsite_yes = By.xpath("//*[@id='onSite'][1]");
		private By normal_company_relationship_onsite_no = By.xpath("//*[@id='onSite'][2]");
		private By normal_company_relationship_q1_yes = By.xpath("//*[@id='riskQuestion1'][1]");
		private By normal_company_relationship_q1_no = By.xpath("//*[@id='riskQuestion1'][2]");
		private By normal_company_relationship_q2_yes = By.xpath("//*[@id='riskQuestion2'][1]");
		private By normal_company_relationship_q2_no = By.xpath("//*[@id='riskQuestion2'][2]");
		private By normal_company_relationship_q3_yes = By.xpath("//*[@id='riskQuestion3'][1]");
		private By normal_company_relationship_q3_no = By.xpath("//*[@id='riskQuestion3'][2]");
		private By normal_company_relationship_q4_yes = By.xpath("//*[@id='riskQuestion4'][1]");
		private By normal_company_relationship_q4_no = By.xpath("//*[@id='riskQuestion4'][2]");
		private By normal_company_relationship_q5_yes = By.xpath("//*[@id='riskQuestion5'][1]");
		private By normal_company_relationship_q5_no = By.xpath("//*[@id='riskQuestion5'][2]");
		private By normal_company_relationship_phi1_yes = By.xpath("//*[@id='employee'][1]");
		private By normal_company_relationship_phi1_no = By.xpath("//*[@id='employee'][2]");
		private By normal_company_relationship_phi2_yes = By.xpath("//*[@id='phiOnSite'][1]");
		private By normal_company_relationship_phi2_no = By.xpath("//*[@id='phiOnSite'][2]");
		private By normal_company_relationship_next_button = By.xpath("//button[contains(., 'Next')]");
		
		// Code to click on no option on existing company relationship on Normal Company Relationship Page
		public RegistrationUI click_normal_company_relationship_existing_relationship_option(String yes_or_no){
			 if(yes_or_no.equalsIgnoreCase("yes")) {
				 boolean checkbox_selected = is_element_selected(normal_company_relationship_existing_relationship_yes);
					if (checkbox_selected == false)	
						click_button(normal_company_relationship_existing_relationship_yes);
			 }
			 
			 else {
				 	boolean checkbox_selected = is_element_selected(normal_company_relationship_existing_relationship_no);
					if (checkbox_selected == false)	
						click_button(normal_company_relationship_existing_relationship_no);
			 }
			return this;
		}
		
		// Code to Select spend tier on Normal Company Relationship Page
		public RegistrationUI select_normal_company_relationship_spend_tier(String spend_tier){
			return select_by_name(normal_company_relationship_spend_tier, spend_tier);
		}
		
		public RegistrationUI enter_normal_company_relationship_employee_count(String count){
			return enter(normal_company_relationship_number_of_reps, count);
			
		}
		
		// Code to click on no option on onsite option on Normal Company Relationship Page
		public RegistrationUI click_normal_company_relationship_onsite_option(String yes_or_no){
			if(yes_or_no.equalsIgnoreCase("yes")) {
				 boolean checkbox_selected = is_element_selected(normal_company_relationship_onsite_yes);
					if (checkbox_selected == false)	
						click_button(normal_company_relationship_onsite_yes);
			 }
			 
			 else {
				 	boolean checkbox_selected = is_element_selected(normal_company_relationship_onsite_no);
					if (checkbox_selected == false)	
						click_button(normal_company_relationship_onsite_no);
			 }
			return this;
		}
		
		// Code to click on no option on VRP Q1 on Normal Company Relationship Page
		public RegistrationUI click_normal_company_relationship_q1_option(String yes_or_no){
			if(yes_or_no.equalsIgnoreCase("yes")) {
				 boolean checkbox_selected = is_element_selected(normal_company_relationship_q1_yes);
					if (checkbox_selected == false)	
						click_button(normal_company_relationship_q1_yes);
			 }
			 
			 else {
				 	boolean checkbox_selected = is_element_selected(normal_company_relationship_q1_no);
					if (checkbox_selected == false)	
						click_button(normal_company_relationship_q1_no);
			 }
			return this;
		}
		
		
		// Code to click on no option on VRP Q2 on Normal Company Relationship Page
		public RegistrationUI click_normal_company_relationship_q2_option(String yes_or_no){
			if(yes_or_no.equalsIgnoreCase("yes")) {
				boolean checkbox_selected = is_element_selected(normal_company_relationship_q2_yes);
				if (checkbox_selected == false)	
					click_button(normal_company_relationship_q2_yes);
			}

			else {
				boolean checkbox_selected = is_element_selected(normal_company_relationship_q2_no);
				if (checkbox_selected == false)	
					click_button(normal_company_relationship_q2_no);
			}
			return this;
		}

		// Code to click on no option on VRP Q3 on Normal Company Relationship Page
		public RegistrationUI click_normal_company_relationship_q3_option(String yes_or_no){
			if(yes_or_no.equalsIgnoreCase("yes")) {
				boolean checkbox_selected = is_element_selected(normal_company_relationship_q3_yes);
				if (checkbox_selected == false)	
					click_button(normal_company_relationship_q3_yes);
			}

			else {
				boolean checkbox_selected = is_element_selected(normal_company_relationship_q3_no);
				if (checkbox_selected == false)	
					click_button(normal_company_relationship_q3_no);
			}
			return this;
		}

		// Code to click on no option on VRP Q4 on Normal Company Relationship Page
		public RegistrationUI click_normal_company_relationship_q4_option(String yes_or_no){
			if(yes_or_no.equalsIgnoreCase("yes")) {
				boolean checkbox_selected = is_element_selected(normal_company_relationship_q4_yes);
				if (checkbox_selected == false)	
					click_button(normal_company_relationship_q4_yes);
			}

			else {
				boolean checkbox_selected = is_element_selected(normal_company_relationship_q4_no);
				if (checkbox_selected == false)	
					click_button(normal_company_relationship_q4_no);
			}
			return this;
		}

		// Code to click on no option on VRP Q5 on Normal Company Relationship Page
		public RegistrationUI click_normal_company_relationship_q5_option(String yes_or_no){
			if(yes_or_no.equalsIgnoreCase("yes")) {
				boolean checkbox_selected = is_element_selected(normal_company_relationship_q5_yes);
				if (checkbox_selected == false)	
					click_button(normal_company_relationship_q5_yes);
			}

			else {
				boolean checkbox_selected = is_element_selected(normal_company_relationship_q5_no);
				if (checkbox_selected == false)	
					click_button(normal_company_relationship_q5_no);
			}
			return this;
		}
		
		// Code to click on option on PHI Q1 on Normal Company Relationship Page
		public RegistrationUI click_normal_company_relationship_phi1_option(String yes_or_no){
			if(yes_or_no.equalsIgnoreCase("yes")) {
				boolean checkbox_selected = is_element_selected(normal_company_relationship_phi1_yes);
				if (checkbox_selected == false)	
					click_button(normal_company_relationship_phi1_yes);
			}

			else {
				boolean checkbox_selected = is_element_selected(normal_company_relationship_phi1_no);
				if (checkbox_selected == false)	
					click_button(normal_company_relationship_phi1_no);
			}
			return this;
		} 
		
		// Code to click on option on PHI Q2 on Normal Company Relationship Page
		public RegistrationUI click_normal_company_relationship_phi2_option(String yes_or_no){
			if(yes_or_no.equalsIgnoreCase("yes")) {
				boolean checkbox_selected = is_element_selected(normal_company_relationship_phi2_yes);
				if (checkbox_selected == false)	
					click_button(normal_company_relationship_phi2_yes);
			}

			else {
				boolean checkbox_selected = is_element_selected(normal_company_relationship_phi2_no);
				if (checkbox_selected == false)	
					click_button(normal_company_relationship_phi2_no);
			}
			return this;
		} 
		
		// Code to click Next Button on Normal Company Relationship Page
		public RegistrationUI click_normal_company_relationship_next_button(){
			return click_button(normal_company_relationship_next_button);
		}
		
	// Locators related to Normal Registration for Health System Details Page - 
		private By normal_health_system_details_customername = By.cssSelector("[ng-bind-html='customerName | trustAsHtml']");
		private By normal_health_system_details_customeraddress = By.xpath("//*[@name='healthSystemDetails']/div[1]/div[1]/div[1]/div/label");
		private By normal_health_system_details_customercity = By.xpath("//*[@name='healthSystemDetails']/div[1]/div[1]/div[3]/div");
		private By normal_health_system_details_customerzip = By.xpath("//*[@name='healthSystemDetails']/div[1]/div[1]/div[4]/div/label");
		private By normal_health_system_details_customerurl = By.xpath("//*[@name='healthSystemDetails']/div[1]/div[2]/label/a");
		private By normal_health_system_details_next_button = By.xpath("//button[contains(., 'Next')]");
		
		public RegistrationUI verify_normal_health_system_details_customername(String name){
			return verify_element_by_text(normal_health_system_details_customername, name);
		}
			
		//Code to verify Customer address on Health system Details Page
		public RegistrationUI verify_normal_health_system_details_customeraddress(String add){
			return verify_element_by_text(normal_health_system_details_customeraddress, add);
		}
		
		//Code to verify Customer city on Health system Details Page
		public RegistrationUI verify_normal_health_system_details_customercity(String city){
			return verify_element_by_text(normal_health_system_details_customercity, city);
		}
		
		//Code to verify Customer zip on Health system Details Page
		public RegistrationUI verify_normal_health_system_details_customerzip(String zip){
			return verify_element_by_text(normal_health_system_details_customerzip, zip);
		}
		
		//Code to verify Customer url on Health system Details Page
		public RegistrationUI verify_normal_health_system_details_customerurl(String url){
			return verify_element_by_text(normal_health_system_details_customerurl, url);
		}
		
		// Code to click on Next Button on Health System Details Page
		public RegistrationUI click_normal_health_system_details_next_button(){
			wait_until(3);
			return click_button(normal_health_system_details_next_button);
		}
		
	 
// ***************************************************** add your code above *******************************************
	 
// Wait Until loading bar dissappears -
 	 public RegistrationUI wait_until_loading_bar_to_complete (){
			 wait_until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[class='loading']")));
			 wait_until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[class='loading ng-hide']")));
			 return this;
	 }
 	 
// Clear Cookies - 
 	 public RegistrationUI clear_cookies(){
 		  clear_session();
 		  wait_until(5);
 		  return this;
 	 }
 	 
// 	 Code is related to date picker - 
	 private By select_month_year = By.cssSelector("[ng-click='toggleMode()']");
	 
	 public	RegistrationUI click_year_or_month_field(){
		 	wait_until(1);
			return click_button(select_month_year);
		}
	 
// Select Year -----------------------------------------------------------
	 public	RegistrationUI select_year(String year){		 
		 int i;
	        wait_until(2);
	        
	        for (i = 1; i < 15; i++) {
	            String xpath = "/html/body/div[" +i +"]";
	            String style = find_element_attribute_value(By.xpath(xpath), "style");
	            if(style.contains("block")) {
	                break;
	            }
	        }
	        
	        wait_until(2);
	        //tr
	    
	     loop1:   
	        for (int j = 1; j <= 5; j++) {
	            //td
	            for (int k = 1; k <= 4; k++) {
	                
	                String year_xpath = "/html/body/div[" +i +"]/div/div[1]/table/tbody/tr[" +j +"]/td[" +k +"]/button";
	                	                
	                boolean result = find_element_text(By.xpath(year_xpath)).equalsIgnoreCase(year);
	                if (result == true) {
	                    click(By.xpath(year_xpath));
	                    break loop1;
	                }
	            }
	        }
		return this;
	}
		        
		
// Select month -------------------------------------------------------
		  public RegistrationUI select_month(String month){
		        int a;
		        wait_until(2);
		        
		        for (a = 1; a < 15; a++) {
		            String xpath = "/html/body/div[" +a +"]";
		            String style = find_element_attribute_value(By.xpath(xpath), "style");
		            if(style.contains("block")) {
		            break;
		            }
		        }
		        
		 loop2:
			 // tr - 
			 for (int j = 1; j <= 4; j++) {
		            //td
	            for (int k = 1; k <= 3; k++) {
		                
	                String month_xpath = "/html/body/div[" +a +"]/div/div[1]/table/tbody/tr[" +j +"]/td[" +k +"]/button";
	                                
	                boolean result = find_element_text(By.xpath(month_xpath)).equalsIgnoreCase(month);
	                if (result == true) {
	                    click(By.xpath(month_xpath));
	                    break loop2;
	                }
	            }
	        }
		return this; 
	  }
			
//Select Date--------------------------------------------------------	  
		public	RegistrationUI select_date(String date){
			
			int i;
			for (i = 1; i < 15; i++) {
				String xpath = "/html/body/div[" +i +"]";
				String style = find_element_attribute_value(By.xpath(xpath), "style");
				if(style.contains("block")) {
					break;
				}
			}
			
			int date_int = Integer.parseInt(date);
			
			wait_until(2);
			int d = 1;
			if(date_int >= 25){
				d = 2;
			}
			
		        
		loop3:
			// tr -
			for (int j = d; j <= 6; j++) {
					// td - 
				for (int k = 1; k <= 7; k++) {

					String date_xpath = "/html/body/div[" +i +"]/div/div[1]/table/tbody/tr[" +j +"]/td[" +k +"]/button";
					
					boolean result = find_element_text(By.xpath(date_xpath)).equalsIgnoreCase(date);
					if (result == true) {
						click(By.xpath(date_xpath));
						break loop3;
					}
				}
			}
		return this;
		}
	 
}
