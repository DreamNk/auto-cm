package com.ghx.auto.cm.ui.sso.page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.ghx.auto.cm.ui.page.CMAbstractPage;

public class NBDHomePage extends CMAbstractPage<NBDHomePage> {

	private By contractingAppSwitcher = By.id("headerSwitcher");
	private By vendorCredentialingLink = By.xpath(".//div[@id='1']/ul/li/a/span");
	private By vendormateCredentialingHeader = By.id("headerAppName");
	private By continueButtonOnNBDLoginPage = By.id("hideMessageBtn");
	private By registrationAndVisits = By.xpath(".//div[@class='panel-heading']/h6/strong");
	private By unpaidVendorsLink = By.id("unpaidVendor");
	private By repsOfUnpaidVendors = By.xpath(".//div[@class='panel-group']/div/div[1]/h4/a/span/a");
	private By vendorsRegisteredLink = By.id("vendorRegistered");
	private By manageUsersTab = By.id("manageUsers");
	private By reportsTab = By.xpath(".//div[@id='navbar-collapse']/ul[1]/li[5]/a");
	private By signInHistoryTab = By.id("signInHistory");
	private By resourceCenterTab = By.id("resourceCenter");
	private By signInAVendor = By.id("signInVendor");

	//Tabs
	private By signInHistory = By.id("signInHistory");
	
	//Actions Dropdown------------------------------------------------------------------------------------------
	private By actionDropdown = By.xpath("//*[contains(@class,'glyphicon glyphicon-cog')]");
	private By configureUnconfigureSignInMachine = By.xpath("//*[@id='configureUnconfigure']/span[1]");
	
	//----------------Action Drop Down----------------
	private By actionsDropDown = By.xpath(".//div[@class='navbar-custom']/div[2]/ul[2]/li/a");
	//private By configureUnconfigureSignIn = By.xpath(".//div[@class='navbar-custom']/div[2]/ul[2]/li/ul/li[2]/a/span[2]");
	private By configureUnconfigureSignIn= By.xpath(".//*[@id='containerFixed']/div[5]/div/div/div[1]/div/div/accordion/div/div/div[1]/h4/a/span/a");
	
	
	private By addAppointmentTab = By.id("addAppointment");
	private By addAppointmentText = By.xpath(".//div[@class='panel-heading']/h4/a/span/a/span[1]");
	private By inviteARepTab=By.xpath(".//div[@class='navbar-custom']/div[2]/ul[2]/li/ul/li[9]/a");
	
	//-----------------Search For Vendors and Rep---------
	private By searchForVendorsandRep = By.xpath(".//div[@id='navbar-collapse']/form/div/input");
	private By vendorSearchResults = By.xpath(".//div[@id='homeRecentVisitorList']/div/div[2]/h3");
	private By searchResultsText = By.xpath(".//div[@class='ng-scope']/div[2]/h3");
	private By repSearchResults = By.xpath("//*[contains(@placeholder,'Search for Vendors & Reps')]");
	
	//--------------------------
	private By repsRegisteredLink = By.id("repRegistered");
	private By repsTextOfRepRegisteredLink = By.xpath(".//div[@class='panel-heading']/h4/a/span/a");
	
	private By visitInLast30DaysLink = By.id("VisitThirtyDays");
	private By signInHistoryText = By.xpath(".//div[@class='panel-heading']/h4/a/span/a");
	
	private By pendingAppointmentLink = By.id("pendingAppointment");
	private By pendingApptRequestText = By.xpath(".//div[@class='panel panel-default panel-open']/div[1]/h4/a/span/a");
	
	private By repsOfUnpaidVendorText = By.xpath(".//div[@class='panel-heading']/4/a/span/a");
	
	
	
	//Tabs------------------------------------------------------------------------------------------------------
	private By appointmentTab = By.id("appointments");
	private By repsTab = By.id("reps");
	private By homeTab = By.id("home");
	private By vendorsTab = By.id("vendors");
	
	// Home tab-------------------------------------------------------------------------------------------------
	private By recentVisitors = By.linkText("Recent Visitors");
	private By recentCompanyRegistration = By.xpath(".//div[@class='col-sm-9 col-md-9 col-lg-9 paddingR0']/div[3]/div/h4");
	private By myAppointments = By.id("myAppointmentBtn");

	public NBDHomePage click_appSwitcher_from_contacting_and_compliane() {

		wait_until(ExpectedConditions.visibilityOfElementLocated(contractingAppSwitcher));
		wait_until(15);
		return click_button(contractingAppSwitcher);
	}

	// click Vendormate Credentialing link from app switcher
	public NBDHomePage click_vendormate_credentialing_link() {
		return click_button(vendorCredentialingLink);
	}

	// verify Vendor Credentialing Header name
	public NBDHomePage verify_vendormate_credentialing_header_name() {
		wait_until(10);
		return verify_element_by_text(vendormateCredentialingHeader, "Vendormate Credentialing");
	}

	public NBDHomePage click_continue_button() {
		click_button(continueButtonOnNBDLoginPage);
		return wait_until(3);
	}

	public NBDHomePage click_appointment_tab() {
		return click_button(appointmentTab);
	}
	
	public NBDHomePage click_reps_tab() {
		return click_button(repsTab);
	}
	
	public NBDHomePage verify_recent_visitors(String recentVst){
		wait_until(1);
		return verify_element_by_text(recentVisitors, recentVst);
	}
	
	public NBDHomePage click_recent_visitors_link(){
		wait_until(1);
		return click(recentVisitors);
	}
	public NBDHomePage verify_recent_company_registration_text(String recntCompReg){
		wait_until(1);
		return verify_element_by_text(recentCompanyRegistration, recntCompReg);
	}
	
	public NBDHomePage verify_my_appointments_text(String myappt){
		wait_until(1);
		return verify_element_by_text(myAppointments, myappt);
	}
	
	public NBDHomePage click_home_tab(){
		wait_until(1);
		return click(homeTab);
	}
	
	public NBDHomePage verify_registration_and_visits_text(){
		wait_until(1);
		return verify_element_by_text(registrationAndVisits, "Registrations and Visits");
	}
	
	public NBDHomePage verify_vendors_registered_link(){
		wait_until(2);
		return verify_element_by_text(vendorsRegisteredLink, "Vendors Registered");
	}
	
	public NBDHomePage click_vendors_registered_link(){
		wait_until(2);
		return click(vendorsRegisteredLink);
	}
	
	public NBDHomePage verify_vendors_tab(){
		wait_until(2);
		return verify_element_by_text(vendorsTab, "Vendors");
	}
	
	public NBDHomePage click_vendors_tab(){
		wait_until(2);
		return click(vendorsTab);
	}
	
	public NBDHomePage verify_reps_registered_link(){
		wait_until(2);
		return verify_element_by_text(repsRegisteredLink, "Reps Registered");
	}
	
	public NBDHomePage click_reps_registered_link(){
		wait_until(2);
		return click(repsRegisteredLink);
	}
	
	public NBDHomePage verify_reps_text_of_rep_registered_link(){
		wait_until(2);
		return verify_element_by_text(repsTextOfRepRegisteredLink, "Reps");
	}
	public NBDHomePage verify_visit_in_last_30_days_link(){
		wait_until(2);
		return verify_element_by_text(visitInLast30DaysLink, "Visits in Last 30 Days");
	}
	
	public NBDHomePage click_visit_in_last_30_days_link(){
		wait_until(2);
		return click(visitInLast30DaysLink);
	}
	
	public NBDHomePage verify_sign_in_history_text(){
		wait_until(2);
		return verify_element_by_text(signInHistoryText, "Sign-In History");
	}
	
	
	public NBDHomePage verify_pending_appointment_link(){
		wait_until(2);
		return verify_element_by_text(pendingAppointmentLink, "Pending Appointment Requests");
	}
	
	public NBDHomePage click_pending_appointment_link(){
		wait_until(2);
		return click(pendingAppointmentLink);
	}
		
	public NBDHomePage verify_pending_appt_request_text(){
		wait_until(1);
		return verify_element_by_text(pendingApptRequestText, "Manage Appointment Requests");
	}
	
	public NBDHomePage verify_unpaid_vendors_link(){
		wait_until(2);
		return verify_element_by_text(unpaidVendorsLink, "Unpaid Vendors");
	}
	public NBDHomePage click_unpaid_vendors_link(){
		wait_until(2);
		return click(unpaidVendorsLink);
	}
	
	public NBDHomePage verify_reps_of_unpaid_vendors(){
		wait_until(2);
		return verify_element_by_text(repsOfUnpaidVendors, "Unpaid Vendors");
	}
	
	// Manage Users tab
	public NBDHomePage click_manage_users_tab(){
		wait_until(2);
		return click_tab(manageUsersTab);
	}
	
	//Reports tab
	public NBDHomePage click_reports_tab(){
		wait_until(1);
		return click_tab(reportsTab);
	}
	
	//Sign in history tab
	public NBDHomePage click_sign_in_history_tab(){
		wait_until(1);
		return click_tab(signInHistoryTab);
	}
	
	//Resource Center
	public NBDHomePage click_resource_center_tab(){
		wait_until(1);
		return click_tab(resourceCenterTab);
	}
	
	//Action Dropdown
	public NBDHomePage click_actions_drop_down(){
		wait_until(1);
		return click_tab(actionsDropDown);
	}
	//Configure Sign in machine
	public NBDHomePage click_configure_unconfigure_sign_in(){
		wait_until(1);
		return click_tab(configureUnconfigureSignIn);
	}
	
	public NBDHomePage verify_configure_unconfigure_sign_in_text(){
		wait_until(1);
		return verify_element_by_text(configureUnconfigureSignIn,"Configure/Unconfigure Sign-In Machine");
	}
	
	//Add Appointment Tab
	public NBDHomePage click_add_appointment_tab(){
		wait_until(1);
		return click_tab(addAppointmentTab);
	}
	
	public NBDHomePage verify_add_appointment_text(){
		wait_until(1);
		return verify_element_by_text(addAppointmentText,"Add Appointment");
	}
	
	public NBDHomePage click_invite_rep_tab(){
		wait_until(1);
		return click_tab(inviteARepTab);
	}
	
	public NBDHomePage verify_invite_rep_text(){
		wait_until(1);
		return verify_element_by_text(inviteARepTab,"Invite a Rep");
	}
	
	//Search for vendors and rep	
	
	public NBDHomePage click_search_for_vendors_and_rep(){
		wait_until(1);
		return click(searchForVendorsandRep);
	}
	
	public NBDHomePage enter_vendor_name(String vendorNm){
		wait_until(1);
		
		return enter(searchForVendorsandRep,vendorNm);
		
	}
	
	public NBDHomePage verify_vendor_search_results(){
		wait_until(1);
		return verify_element_by_text(searchResultsText, "Vendor Search Results");
	}
		
	public NBDHomePage enter_rep_first_name(String repNm){
		wait_until(5);
		return enter(repSearchResults,repNm);
	}
	
	
	public NBDHomePage verify_rep_search_results(){
		wait_until(1);
		return verify_element_by_text(searchResultsText, "Rep Search Results");
	}
	
	 public NBDHomePage click_sign_in_a_vendor() {
		 return click(signInAVendor);
	 }
	
	 public NBDHomePage click_configure_unconfigure_signin_machine() {
		 click(actionDropdown);
		 wait_until(1);
		 click(configureUnconfigureSignInMachine);
		 return this;
	 }
	 
	 public NBDHomePage click_signin_history() {
		 return click_button(signInHistory);
	 }

	
}
