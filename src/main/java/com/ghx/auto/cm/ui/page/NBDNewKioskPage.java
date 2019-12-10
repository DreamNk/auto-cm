package com.ghx.auto.cm.ui.page;

import org.openqa.selenium.By;

public class NBDNewKioskPage extends CMAbstractPage <NBDNewKioskPage> {
	
	private By configure_sign_in_machine = By.xpath(".//div[@id='menuwithgroups']/div[1]/ul[1]/li[1]/a");
	private By click_here_link = By.xpath(".//div[@id='signInMachineAccordionDiv']/ul/li/div/div[2]/div[2]/div/div/span/a");
	private By select_location = By.id("signIn.Machine.user.location");
	private By select_entrypoint = By.id("signIn.Machine.user.entryPoint");
	private By goto_signup_page_button = By.id("confirmSaveSup");
	private By signin_button = By.xpath(".//div[@id='mainTab']/div/div[2]/div[1]/input");
	private By email_field = By.id("kiosk.vendorSignInOutForm.emailId");
	private By find_your_information_button = By.xpath(".//div[@id='signInConfigureMachineContainer']/div[3]/div[2]/span[2]/input");
	private By print_badge_button = By.xpath(".//div[@id='signInConfigureMachineContainer']/div[3]/div[3]/div[10]/span[2]/input");
	private By reprint_button = By.id("rePrintBadge");
	private By return_to_signin_page = By.xpath(".//div[@id='maintab']/form/div/div[4]/input");
	private By unconfigure_button = By.id("confirmSaveSup");
	private By department_dropdown = By.id("kiosk.vendorSignInOutForm.departmentOid");
	private By first_name_field = By.id("kiosk.vendorSignInOutForm.firstName");
	private By last_name_field = By.id("kiosk.vendorSignInOutForm.lastName");
	private By phone_field = By.id("kiosk.vendorSignInOutForm.phone");
	private By company_field = By.id("kiosk.vendorSignInOutForm.companyName");
	private By visiting_contact_field = By.id("kiosk.vendorSignInOutForm.visitingContact");
	private By contact_title_field = By.id("kiosk.vendorSignInOutForm.contactTitle");
	private By purpose_of_visit_field = By.id("kiosk.vendorSignInOutForm.purpose");
	

	// Click configure/unconfigure machine
	public	NBDNewKioskPage click_configure_signin_machine(){
		return click_button(configure_sign_in_machine);
	}
	

	//Click click here link on sign in machine page
	public NBDNewKioskPage click_clickhere_link() {
		return click_link(click_here_link);

	}

	//Select location on new kiosk page
	public NBDNewKioskPage select_location_from_dropdown(String mesg) {
		return select_by_name( select_location , mesg);

	}
	
	//Select department on Rep Sign In Page
	public NBDNewKioskPage select_department_from_dropdown(String mesg) {
		return select_by_name( department_dropdown , mesg);

	}
	
	//Select POE on new kiosk page
	public NBDNewKioskPage select_poe_from_dropdown(String mesg) {
		return select_by_name( select_entrypoint, mesg);

	}

	// Click 'go to sign up page' button
	public NBDNewKioskPage click_goto_signup_page_button() {
		return click_button(goto_signup_page_button);
	}

	//Click 'sign in' button
	public NBDNewKioskPage click_signin_button() {
		return click_button(signin_button);
	}

	//enter email id of a compliant rep having an appointment, in email field
	public NBDNewKioskPage enter_emailid_in_email_field(String emailid) {
		return enter(email_field, emailid);
	}

	//Click 'find your information' button
	public NBDNewKioskPage click_find_your_information_button() {
		return click_button(find_your_information_button);
	}

	//Click 'print badge' button
	public NBDNewKioskPage click_print_badge_button() {
		return click_button(print_badge_button);
	}

	//Click 'unconfigure' button
	public NBDNewKioskPage click_unconfigure_button() {
		return click_button(unconfigure_button);
	}
	
	// enter first name in first name field
	public NBDNewKioskPage enter_first_name(String firstname) {
		return enter(first_name_field, firstname);
	}
	
	// enter last name in last name field
	public NBDNewKioskPage enter_last_name(String lastname) {
		return enter(last_name_field, lastname);
	}
	
	// enter phone number in phone number field
	public NBDNewKioskPage enter_phone_number(String phone) {
		return enter(phone_field, phone);
	}
	
	// enter company name in company field
	public NBDNewKioskPage enter_company_name(String companyname) {
		return enter(company_field, companyname);
	}
	
	// enter visitng contact name in visitng contact field
	public NBDNewKioskPage enter_visiting_contact_name(String visitingcontactname) {
		return enter(visiting_contact_field, visitingcontactname);
	}
	
	// enter purpose of visit name in purpose of visit field
	public NBDNewKioskPage enter_purpose_of_visit(String purposeofvisit) {
		return enter(purpose_of_visit_field, purposeofvisit);
	}
	
	// enter  contact title in contact title field
	public NBDNewKioskPage enter_contact_title(String contacttitle) {
		return enter(contact_title_field, contacttitle);
	}
	
	// verify first name in first name field on New Kiosk Page
	public NBDNewKioskPage verify_first_name(String msg) {
		return verify_element_attribute_value(first_name_field, "value", msg);

	}
	
	// verify last name in last name field on New Kiosk Page
	public NBDNewKioskPage verify_last_name(String msg) {
		return verify_element_attribute_value(last_name_field, "value", msg);

	}
	
	// verify phone number in phone number field on New Kiosk Page
	public NBDNewKioskPage verify_phone_number(String msg) {
		return verify_element_attribute_value(phone_field, "value", msg);

	}
	
	//verify visiting contact name in visiting contact field on New Kiosk Page 
	public NBDNewKioskPage verify_visiting_contact_name(String msg) {
		return verify_element_attribute_value(visiting_contact_field, "value", msg);

	}
	
	//  verify company name in company field on New Kiosk Page
	public NBDNewKioskPage verify_company_name(String msg) {
		return verify_element_attribute_value(company_field, "value", msg);

	}
	
	// verify purpose of visit name in purpose of visit field
	public NBDNewKioskPage verify_purpose_of_visit(String msg) {
		return verify_element_attribute_value(purpose_of_visit_field, "value", msg);
	}
		
		
}
