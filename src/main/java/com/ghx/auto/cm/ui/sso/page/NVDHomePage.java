package com.ghx.auto.cm.ui.sso.page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.ghx.auto.cm.ui.page.CMAbstractPage;

// This class have all locators for Rep Portal

public class NVDHomePage extends CMAbstractPage<NVDHomePage> {
 
 private By vendorCredentialingLink = By.xpath(".//div[@id='1']/ul/li/a/span");
 private By contractingAppSwitcher = By.id("headerSwitcher");
 private By vendormateCredentialingHeader = By.id("headerAppName");
 private By commonDocumentAlert = By.linkText("Common Document Alert");
 private By okayImageForNoCommonDocumetALert = By.xpath("//div[contains(@ng-if,'data.successData.sharableDocumentComplianceAlertStatus ==true')]/h4/img");
 private By policyAlerts = By.linkText("Policy Alert");
 private By policyAlertWithNoLink=By.xpath(".//*[@id='policyAlert']/b");
 private By noIncompleteRegAlerts = By.linkText("No Incomplete Registration Alerts");
 private By healthSystemAlert = By.linkText("Health System Alert");
 private By connectWithNewHealtSystem = By.linkText("Connect with a new Health System");

 private By policyAlertPopupCloseButton = By.id("commonDocumentAlertCloseIcon");
 private By policyAlertPopupWindow = By.xpath("html/body/div[5]/div/div/div/div[1]/h3/b");
 
 private By commonDocAlertPopupWindow = By.xpath("html/body/div[5]/div/div/div/div/div[1]/h3/b");
 private By commonAlertCloseButton = By.id("commonDocumentAlertCloseIcon");
 private By UpdateBadgePhoto = By.linkText("Update Badge Photo");

 private By accountSpecificDocAlert = By.linkText("Account Specific Document Alert");
 private By accountSpecificDocStatus = By.xpath(".//*[@class='text-danger ng-binding']");
 
 //upload doc pop-up------------------------------------------------------------------------------------
 private By missingDocument1stRadioButton = By.xpath("//*[contains(@ng-model,'commonDocument')][1]");
 private By docEffectiveDate = By.xpath("//*[@id='commonDocAlert']//form/div[7]//input[1]");
 private By docExpirationDate = By.id("docExpirationDate");
 private By saveButton = By.xpath("//*[contains(text(),'Save')]");
 private By monthAndYearSelector = By.xpath("//*[contains(@ng-click,'toggleMode()')]");
 
 //NVD Tabs------------------------------------------------------------------------------------
 private By myDocumentsTab = By.linkText("My Documents");
 private By accountsTab = By.linkText("Accounts");
 private By manageRepsTab = By.linkText("Manage Reps");
 private By reportsTab = By.linkText("Reports");
 private By resourceCenterTab = By.linkText("Resource Center");
 private By extrasTab = By.linkText("Extras");
 private By actionDropDown = By.xpath("//*[contains(@class,'glyphicon glyphicon-cog')]");
 
 //User Details Drop Down
 private By userNameRadioButton = By.xpath("html/body/div[1]/div[3]/header/div[1]/div/ul[2]/li[1]/a/div/div");
 private By accountTabName = By.xpath(".//div[@class='panel-group']/div[1]/div[1]");
 
 // Actions Drop down------------------------------------------------------------------------
 private By shareMyCredentials = By.linkText("Share My Credentials");
 private By viewAccessStatus = By.linkText("View Access Status");
 private By selectanappointmentText = By.xpath(".//div[@class='row ng-scope']/div[3]/fieldset/form/h5/b");
 private By printBadge = By.linkText("Print Badge");
 private By requestAppointment = By.linkText("Request Appointment");
 private By requestAppointmentText = By.xpath("//*[contains(@href,'/vdb/ngApp/appoinment/request/actions/1')]");
 private By viewRequest = By.linkText("View Requests");
 private By appointmentStartTime = By.xpath(".//div[@class='table-responsive marginT0 vision-margin-10 vision-overlay-table']/table/thead/tr[1]/th[1]/div");
 private By signOut = By.linkText("Sign Out");
 private By latestSignInEvents = By.xpath(".//div[@class='table-responsive tableResponsive ng-scope']/div[1]/h3/b");
  
 //Help Link
 private By helpLink = By.linkText("Help");
 
 // Am i cleared for access link
 private By amIClearedForAccess = By.id("amIClearedForAccess");
 private By backToHome = By.linkText("back to home");
 
 //Update Badge Photo
 private By updateBadgePhoto = By.xpath(".//div[@class='col-sm-2 col-md-2 col-lg-2 paddingL0 ng-scope']/p[3]/a");
 private By editButton = By.xpath("//*[contains(@class,'btn btn-primary marginT3 ng-binding')]");
 private By closeDocumentAlertPopup = By.xpath("//*[contains(@id,'commonDocumentAlertCloseIcon')]");
  
 
 public NVDHomePage click_appSwitcher_from_contacting_and_compliane() {
  wait_until(ExpectedConditions.visibilityOfElementLocated(contractingAppSwitcher));
  wait_until(15);
  return click_button(contractingAppSwitcher);
 }

 // click Vendor mate Credentialing link from app switcher
 public NVDHomePage click_vendormate_credentialing_link() {
  return click_button(vendorCredentialingLink);
 }

 // verify Vendor Credentialing Header name
 public NVDHomePage verify_vendormate_credentialing_header_name() {
  wait_until(5);
  return verify_element_by_text(vendormateCredentialingHeader, "Vendormate Credentialing");
 }
 
 public NVDHomePage click_common_document_alert_link() {
  return click_link(commonDocumentAlert);
 }
 
 public NVDHomePage verify_right_tick_for_common_doc_alert() {
  wait_until(2);
  return verify_element_attribute_value(okayImageForNoCommonDocumetALert, "src", "https://vision.vendormate.net/vdb/img/okay.png");
 }
 
//verify common missing document
	public NVDHomePage verify_common_missing_document() {
		return verify_element_by_text(commonDocAlertPopupWindow,"Document Alert");
	}
 
//click close button of common alert
 public NVDHomePage click_common_alert_close_button(){
	 wait_until(2);
	 return click_button(commonAlertCloseButton);
 }
 
 public NVDHomePage click_policy_alert_link(){
	 wait_until(3);
	 return click_link(policyAlerts);
 }
 
 public NVDHomePage verify_policy_alert_link(){
	 wait_until(3);
	 return verify_element_by_text(policyAlertWithNoLink,"No Policy Alerts");
 }
 
 //Verify Policy alert pop up
 public NVDHomePage verify_policy_alert_pop_up_window(){
	 wait_until(2);
	 return verify_element_by_text(policyAlertPopupWindow, "Policy Alert");
 }
 
 //click policy alert cross button
 public NVDHomePage click_policy_alert_close_button(){
	 wait_until(2);
	 return click_button(policyAlertPopupCloseButton);
 }
 
 //Verify No Incomplete Reg alerts
 public NVDHomePage verify_no_incomplete_reg_alerts(){
	 wait_until(2);
	 return verify_element_by_text(noIncompleteRegAlerts, "No Incomplete Registration Alerts");
 }
 
//Verify Health System alerts
public NVDHomePage verify_health_system_alert(){
	 wait_until(2);
	 return verify_element_by_text(healthSystemAlert, "Health System Alert");
}

//Verify connect with New Health system
public NVDHomePage verify_connect_with_new_health_system(){
	 wait_until(2);
	 return verify_element_by_text(connectWithNewHealtSystem, "Connect with a new Health System");
}
 

//Click Account Specific Document Alert link
public NVDHomePage click_account_specific_doc_alert_link(){
	wait_until(2);
	return click_button(accountSpecificDocAlert); 
}

//Verify Status of Account specific doc 
public NVDHomePage verify_account_specific_doc_status(String status){
	 wait_until(2);
	 return verify_element_by_text(accountSpecificDocStatus, status);
}

 //NVD Tabs---------------------------------------------------------------------------------------------------
 public NVDHomePage click_accounts_tab() {
  wait_until(2);
  click_button(accountsTab);
  return wait_until(2);
 }
 
 public NVDHomePage verify_accounts_tab_text(){
	 wait_until(3);
	 return verify_element_by_text(accountTabName, "Manage My Accounts");
	 
 }
 
 public NVDHomePage click_my_document_tab() {
  click_button(myDocumentsTab);
  return wait_until(1);
 }
 
 // manageRepsTab
 public NVDHomePage click_manage_reps_tab(){
	 wait_until(1);
	 return click_button(manageRepsTab);
 }
 
 public NVDHomePage verify_manage_reps_tab(){
	 return verify_element_by_value(manageRepsTab, "Manage Reps");
 }

 // reportsTab
 public NVDHomePage click_report_tab(){
	 wait_until(1);
	 return click_button(reportsTab);
 }
 
 public NVDHomePage verify_report_tab(){
	 return verify_element_by_value(reportsTab, "Reports");
 }
 
  
 // Resource center tab
 public NVDHomePage verify_resource_center_tab(){
	 return verify_element_by_value(resourceCenterTab, "Resource Center");
 }
 
 public NVDHomePage click_resource_center_tab(){
	 return click_button(resourceCenterTab);
 }
 
 //Extras tab
 public NVDHomePage click_extras_tab(){
	 return click_button(extrasTab);
 }
 
 // Actions Drop down
 public NVDHomePage click_action_drop_down(){
	 wait_until(1);
	 return click_button(actionDropDown);
 }
 
 public NVDHomePage verify_share_my_credentials_link(){
	 wait_until(1);
	 return verify_element_by_text(shareMyCredentials, "Share My Credentials");
 }
 
 public NVDHomePage click_share_my_credentials_link(){
	 wait_until(1);
	 return click(shareMyCredentials);
 }
 
 public NVDHomePage click_view_access_status_link(){
	 wait_until(1);
	 return click_button(viewAccessStatus);
 }
 
 public NVDHomePage click_print_badge_link(){
	 wait_until(1);
	 return click_button(printBadge);
 }
 public NVDHomePage verify_view_access_status_text(){
	 wait_until(1);
	 return verify_element_by_text(selectanappointmentText, "Select an appointment or account");
 }
 
 public NVDHomePage click_request_appointment_link(){
	 wait_until(1);
	 return click_button(requestAppointment);
 }
 
 public NVDHomePage verify_request_appointment_text(){
	 wait_until(1);
	 return verify_element_by_text(requestAppointmentText, "Request Appointment");
 }
 
 public NVDHomePage click_view_request_link(){
	 wait_until(1);
	 return click_button(viewRequest);
 }
 
 public NVDHomePage verify_appointment_start_time_text(){
	 wait_until(1);
	 return verify_element_by_text(appointmentStartTime, "Appointment Start Time                    ");
 }
 
 public NVDHomePage click_sign_out_link(){
	 wait_until(1);
	 return click_button(signOut);
 }
 
 public NVDHomePage verify_latest_signin_events_text(){
	 wait_until(1);
	 return verify_element_by_text(latestSignInEvents, "Latest Sign-in Events");
 }
 // Badge Photo
 public NVDHomePage click_update_badge_photo(){
	 wait_until(1);
	 return click_link(updateBadgePhoto);
 }
 
 //cleared for access link
 public NVDHomePage click_am_i_cleared_for_access(){
	 wait_until(1);
	 return click_button(amIClearedForAccess);
 }
 
 public NVDHomePage click_back_to_home_link(){
	 wait_until(1);
	 return click_link(backToHome);
 }
 
 // Help Link
 public NVDHomePage click_help_link(){
	 wait_until(1);
	 return click_button(helpLink);
 }
 

 //User details drop down
 public NVDHomePage verify_logged_in_user_name(String loggedUserNm){
	 wait_until(2);
	 return verify_element_by_text(userNameRadioButton, loggedUserNm);
 }
 
 //upload doc pop-up---------------------------------------------------------------------------------------------------
 public NVDHomePage click_1st_missing_doc_radio_button() {
  return click(missingDocument1stRadioButton);
 }

 public NVDHomePage select_effective_date(String mm, String dd, String yy) {
  click_button(docEffectiveDate);
  click_button(monthAndYearSelector);
  wait_until(1);
  click_button(monthAndYearSelector);
  wait_until(1);
  click(By.xpath("//*[text()='" + yy + "']/parent::button"));
  wait_until(1);
  click(By.xpath("//*[text()='" + mm + "']/parent::button"));
  wait_until(1);
  click_button(By.xpath("//*[text()='" + dd + "']/parent::button"));
  return this;

 }

 public NVDHomePage select_expiration_date(String mm, String dd, String yy) {
  click_button(docExpirationDate);
  click_button(monthAndYearSelector);
  wait_until(1);
  click_button(monthAndYearSelector);
  wait_until(1);
  click(By.xpath("//*[text()='" + yy + "']/parent::button"));
  wait_until(1);
  click(By.xpath("//*[text()='" + mm + "']/parent::button"));
  wait_until(1);
  click_button(By.xpath("//*[text()='" + dd + "']/parent::button"));
  return this;

 }
 
 public NVDHomePage enter_expiration_date(String mm_dd_yy){
  wait_until(2);
  return enter(docExpirationDate, mm_dd_yy);

 }
 
 public NVDHomePage click_save_button() {
  wait_until(3);
  click(saveButton);
  return wait_until(2);
 }
 
 public NVDHomePage click_close_popup() {
	  wait_until(1);
	  click(closeDocumentAlertPopup);
	  return wait_until(1);
	 }
 
 public NVDHomePage click_edit_button() {
	  wait_until(1);
	  click(editButton);
	  return wait_until(1);
	 }

 public NVDHomePage verify_update_badge_photo_link() {
	  verify_element_by_text_continue(UpdateBadgePhoto, "Update Badge Photo");
	  return wait_until(2);
	 }
 
}