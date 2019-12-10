package com.ghx.auto.cm.ui.page;

import org.openqa.selenium.By;

public class NBDSignInVendorPage extends CMAbstractPage<NBDSignInVendorPage> { 

	private By click_signinvendor_tab =  By.xpath(".//div[@id='mainTab']/ul/li[8]/a/em");
	private By enter_mail_id = By.id("signInVendor.signInVendorDetailsForm.corporateEmail");
	private By enter_rep_first_name = By.id("signInVendor.signInVendorDetailsForm.firstnName"); 
	private By enter_rep_last_name = By.id("signInVendor.signInVendorDetailsForm.lastName");
	private By enter_phone_number = By.id("signInVendor.signInVendorDetailsForm.phone");
	private By enter_rep_company_name = By.id("signInVendor.signInVendorDetailsForm.company"); 
	private By enter_visiting_contact = By.id("signInVendor.signInVendorDetailsForm.visitingContact"); 
	private By enter_contact_title = By.id("signInVendor.signInVendorDetailsForm.contactTitle"); 
	private By enter_purpose_of_visit = By.id("signInVendor.signInVendorDetailsForm.purposeOfVisit"); 
	private By select_location = By.id("signInVendor.signInVendorDetailsForm.locationVisit");
	private By select_poe = By.id("signInVendor.signInVendorDetailsForm.pointOfEntry");
	private By select_department = By.id("signInVendor.signInVendorDetailsForm.departmentVisited"); 
	private By click_print_badge = By.id("confirmSaveSup"); 
	private By verify_compliant_msg = By.xpath(".//div[@id='signInVendorDetailsContainer']/div[1]/span[2]");
	private By click_return_to_signin_page = By.id("confirmSaveSup"); 
	private By click_find_vendor_information = By.id("findVendorInformation");
	private By verify_noncompliant_msg = By.xpath(".//div[@id='printBadgeContainerLeft']/form/div[2]/span[2]");
	private By click_signin_history_tab =  By.xpath(".//div[@id='mainTab']/ul/li[6]/a/em");
	private By enter_rep_id = By.id("loadSignInSignOutGrid_SignInSignOutLogGrid_userInformation");
	private By verify_rep_id = By.xpath(".//div[@id='SignInSignOutLogGrid_Content']/div[3]/table/tbody[3]/tr[1]/td[4]/div/a[3]");
	private By click_signin_filter_button = By.id("loadSignInSignOutGrid_SignInSignOutLogGrid_dataTableFilterContainer");
	private By click_signin_clear_link = By.id("loadSignInSignOutGrid_SignInSignOutLogGrid_ClearAnchor");
	
	
	
	
	
	 // Sign in Vendor Tab in NBD is clicked	
	public NBDSignInVendorPage click_signinvendor_tab(){
		return click_button(click_signinvendor_tab);
	}	
	
	 // Enter Rep's Email ID in Corporate Mail Address Field
	public NBDSignInVendorPage enter_mail_id(String subject) {
		return enter(enter_mail_id, subject);
	}
		
	// Enter Rep's First Name in First Name Field
	public NBDSignInVendorPage enter_rep_first_name(String subject) {
		return enter(enter_rep_first_name, subject);
	}
		
	// Enter Rep's Last Name in Last Name Field
	public NBDSignInVendorPage enter_rep_last_name(String subject) {
		return enter(enter_rep_last_name, subject);
	}	
					
	// Enter Rep's Phone No in Phone No Field
	public NBDSignInVendorPage enter_phone_number(String subject) {
		return enter(enter_phone_number, subject);
	}	
				
	 // Enter Rep's Company Name in Company Name Field
	public NBDSignInVendorPage enter_rep_company_name(String subject) {
		return enter(enter_rep_company_name, subject);
	}		
		
	// Enter Visiting Contact in Visiting Contact Field
	public NBDSignInVendorPage enter_visiting_contact(String subject) {
		return enter(enter_visiting_contact, subject);
	}
		
	// Enter Contact Title in Contact Title Field
	public NBDSignInVendorPage enter_contact_title(String subject) {
		return enter(enter_contact_title, subject);
	}
		
	// Enter Purpose of Visit in Purpose of Visit Field
	public NBDSignInVendorPage enter_purpose_of_visit(String subject) {
		return enter(enter_purpose_of_visit, subject);
	}
		
	// Select Location from location dropdown 		
	public NBDSignInVendorPage select_location(String name) {
		  return select_by_name(select_location, name);
	}
		
	// Select POE from POE dropdown
	public NBDSignInVendorPage select_poe(String name) {
		 return select_by_name(select_poe, name);
	}
		
	// Select Department from Department dropdown
	public NBDSignInVendorPage select_department(String name) {
		 return select_by_name(select_department, name);
	}
		
	// Print Badge button is clicked	
	public NBDSignInVendorPage click_print_badge(){
		 return click_button(click_print_badge);
	}

	// Verify drools message for compliant rep
	public NBDSignInVendorPage verify_compliant_msg(String msg) {
		return verify_element_by_text(verify_compliant_msg, msg);
	}

	// Return to sign-in vendor page button is clicked	
	public NBDSignInVendorPage click_return_to_signin_page(){
		return click_button(click_return_to_signin_page);
	}

	// Find your Vendor Information button is clicked	
	public NBDSignInVendorPage click_find_vendor_information(){
		return click_button(click_find_vendor_information);
	}

	// Verify drools message for non-compliant rep
	public NBDSignInVendorPage verify_noncompliant_msg(String msg) {
		return verify_element_by_text(verify_noncompliant_msg, msg);
	}
		
	// Sign in Vendor Tab in NBD is clicked	
	public NBDSignInVendorPage click_signinhistory_tab(){
		return click_button(click_signin_history_tab);
	}
		
	// Enter Rep ID in sign-in history tab - user information field
	public NBDSignInVendorPage enter_rep_id(String subject) {
		return enter(enter_rep_id, subject);
	}
		
	// Verify Rep ID in sign-in history search
	public NBDSignInVendorPage verify_rep_id(String msg) {
		return verify_element_by_text(verify_rep_id, msg);
	}
		
	// Filter button in sign-in history tab is clicked	
	public NBDSignInVendorPage click_signin_filter_button(){
		return click_button(click_signin_filter_button);
	}					
		
	// Clear Link in sign-in history tab is clicked	
	public NBDSignInVendorPage click_signin_clear_link(){
		return click_link (click_signin_clear_link);
	}						
	
}
		
		
		

