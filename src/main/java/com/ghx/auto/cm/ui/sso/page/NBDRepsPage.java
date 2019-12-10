package com.ghx.auto.cm.ui.sso.page;

import org.openqa.selenium.By;

import com.ghx.auto.cm.ui.page.CMAbstractPage;

public class NBDRepsPage extends CMAbstractPage<NBDRepsPage> {
	
	// Rep Search Section----------------------------------------------------------------------------
	private By firstNameSearchTextbox = By.xpath("//*[contains(@id,'firstName')]");
	private By lastNameSearchTextbox = By.xpath("//*[contains(@id,'lastName')]");
	private By repsHeaderText = By.xpath(".//div[@class='panel panel-default panel-open']/div[1]/h4/a/span/a");
	private By repFirstName = By.xpath(".//*[@id='repsList']/div[2]/div[1]/div[2]/table/tbody/tr/td[2]/div/a");
	private By repLastName = By.xpath(".//*[@id='repsList']/div[2]/div[1]/div[2]/table/tbody/tr/td[3]/div/a");
	private By repCompanyName = By.xpath(".//*[@id='repsList']/div[2]/div[1]/div[2]/table/tbody/tr/td[4]/div/a");
	private By repPhoneNo = By.xpath(".//*[@id='repsList']/div[2]/div[1]/div[2]/table/tbody/tr/td[5]/div");
	private By repEmailId = By.xpath(".//*[@id='repsList']/div[2]/div[1]/div[2]/table/tbody/tr/td[6]/div");
	private By failDocAlert = By.xpath("//*[contains(@class,'textFailColor')]");
	private By passDocAlert = By.xpath("//*[contains(@class,'text-success cursorPointer ng-binding ng-scope')]");
	private By requirementStatus = By.xpath(".//*[@id='repsList']/div[2]/div[1]/div[2]/table/tbody/tr/td[7]/span");
	
	// Blocked Rep // 
	private By actionsStatus = By.xpath("//*[@id='repsList']/div[2]/div[1]/div[2]/table/tbody/tr/td[1]/select");
	private By blockReason = By.xpath("html/body/div[5]/div/div/div/div[2]/div/form/div/div/textarea");
	private By blockbtn=By.xpath("html/body/div[5]/div/div/div/div[2]/div/form/div/div/button");
	
	//private By reqiurementStatus= By.xpath("//[contains(text(),'BLOCKED ')]");
	private By reqiurementStatus= By.xpath("//span[contains(text(),'BLOCKED')]");
	private By unblockReason = By.xpath("//*[@id='reason']");
	private By unblockRepbtn = By.xpath("//*[@id='reasonSubmit']");
	
	// Rep Details  Section---------------------------------------------------------------------------
	private By iframe = By.id("repDocumentUrl");
	private By docAlertsInInfoSubTab = By.xpath("//*[@id='complianceAlertDetails']/tbody/tr[2]/td[2]/table/tbody/tr/td[3]/table/tbody/tr[2]/td[2]/b/nobr");
	private By backToList = By.linkText("back to list");
	private By doctab = By.id("documents1");
	private By infotab = By.id("info1");
	private By actionDropdown = By.xpath("html/body/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/table[5]/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[5]/select");
	private By effectiveDate = By.xpath("//*[contains(@name,'doc.effectiveDate')]");
	private By expirationDate = By.xpath("//*[contains(@name,'doc.expirationDate')]");
	private By acknowledgement = By.xpath("//*[contains(@name,'doc.acknowledgement')]");
	private By saveAndContinueButton = By.xpath("//*[contains(@value,'Save and Continue')]");
	private By docVerificationStatus = By.xpath(".//*[@id='entry']/tbody/tr[2]/td[4]");
	private By docUpdatedByName = By.xpath(".//*[@id='entry']/tbody/tr[2]/td[7]");
	private By docStatus = By.xpath(".//*[@id='entry']/tbody/tr[2]/td[3]");
	private By confirmDeleteButton = By.xpath("//*[contains(@value,'Confirm Delete')]");
	
	
	// Manage Rep Permissions section -------------------------------------
	private By manageVendorPermissionsTab = By.id("vendorPermissions");
	private By manageRepPermissionsTab = By.id("actionRepsPermissions");
	private By manageRepPermissionsTabStaging= By.id("repsPermissions");
	private By firstNameSearchTextForManageRep = By.id("firstName");
	private By haveAppointmentPermissionForRep = By.xpath(".//div[@class='table-responsive']/table/tbody/tr/td[2]/span");
	private By firstNameInManageRepPermissions = By.xpath(".//div[@class='table-responsive']/table/tbody/tr/td[3]/div");
	private By lastNameInManageRepPermissions = By.xpath(".//div[@class='table-responsive']/table/tbody/tr/td[4]/div");
	private By companyNameInManageRepPermissions = By.xpath(".//div[@class='table-responsive']/table/tbody/tr/td[5]/div");
	
	
	
	
	public NBDRepsPage enter_rep_first_name(String user_first_name) {
		return enter(firstNameSearchTextbox, user_first_name);
	}
	
	 public NBDRepsPage enter_rep_last_name(String user_last_name) {
		  return enter(lastNameSearchTextbox, user_last_name);
	}
	
	public NBDRepsPage verify_fail_alert() {
		return verify_element_by_text(failDocAlert, "FAIL");
	}
	
	public NBDRepsPage verify_pass_alert() {
		return verify_element_by_text(passDocAlert, "PASS");
	}
	
	public NBDRepsPage click_rep_first_name(String rep_first) {
		return click_link(By.linkText(rep_first));
	}
	
	public NBDRepsPage click_requirement_status_link(){
		return click(requirementStatus);
	}
	
	public NBDRepsPage switch_to_iframe() {
		return switch_to_frame(iframe);
	}
	
	public NBDRepsPage click_fail_status_link() {
		return click(failDocAlert);
	}
	
	public NBDRepsPage click_pass_status_link() {
		return click(passDocAlert);
	}
	
	public NBDRepsPage verify_alert_in_info_section(String alert) {
		return verify_element_by_text(docAlertsInInfoSubTab, alert);
	}
	
	public NBDRepsPage click_back_to_list_link() {
		return click_link(backToList);
	}
	
	public NBDRepsPage click_doc_tab() {
		wait_until(2); 
		return click_button(doctab);
	}

	public NBDRepsPage click_info_tab() {
		wait_until(2); 
		return click_button(infotab);
	}

	public NBDRepsPage select_option_from_actions_for_provider_doc(String option) {
		wait_until(2); 
		select_by_name(actionDropdown, option);
		return this;
	}
	
	public NBDRepsPage enter_effective_date(String effDate) {
		wait_until(2);
		return enter(effectiveDate, effDate);
	}
	public NBDRepsPage enter_expiration_date(String expDate) {
		wait_until(2);
		return enter(expirationDate, expDate);
	}
	
	public NBDRepsPage select_acknowledgment_check_box(){
		wait_until(2);
		return click(acknowledgement);
	}
	
	public NBDRepsPage click_save_and_continue_button(){
		wait_until(2);
		return click(saveAndContinueButton);
	}
	
	public NBDRepsPage click_confirm_delete_button(){
		wait_until(2);
		return click(confirmDeleteButton);
	}
	
	public NBDRepsPage verify_doc_verification_status(String status) {
		return verify_element_by_text(docVerificationStatus, status);
	}
	
	public NBDRepsPage verify_doc_updated_by_name(String buyerName) {
		return verify_element_by_text(docUpdatedByName, buyerName);
	}
	
	public NBDRepsPage verify_doc_status(String status) {
		return verify_element_by_text(docStatus, status);
	}
	
	public NBDRepsPage click_manage_vendor_permissions_tab(){
		wait_until(1);
		return click_tab(manageVendorPermissionsTab);
	}
			
	public NBDRepsPage click_manage_rep_permissions_tab(){
		wait_until(1);
		return click_tab(manageRepPermissionsTab);
	}
	public NBDRepsPage click_manage_rep_permissions_tab_staging(){
		wait_until(1);
		return click_tab(manageRepPermissionsTabStaging);
	}
	
	public NBDRepsPage verify_manage_rep_permission_text(){
		wait_until(1);
		return verify_element_by_text(manageRepPermissionsTab,"Manage Rep Permissions");
	}
	
	public NBDRepsPage verify_manage_rep_permission_text_staging(){
		wait_until(1);
		return verify_element_by_text(manageRepPermissionsTabStaging,"Manage Rep Permissions");
	}
	
	public NBDRepsPage verify_reps_header_text(){
		wait_until(1);
		return verify_element_by_text(repsHeaderText, "Reps");
	}
	
	public NBDRepsPage verify_rep_first_name(String repFirstNm){
		wait_until(1);
		return verify_element_by_text(repFirstName, repFirstNm);
	}
	
	public NBDRepsPage verify_rep_last_name(String repLastNm){
		wait_until(1);
		return verify_element_by_text(repLastName, repLastNm);
	}
	
	public NBDRepsPage verify_rep_company_name(String legalNm){
		wait_until(1);
		return verify_element_by_text(repCompanyName, legalNm);
	}
	
	public NBDRepsPage verify_rep_phone_no(String repPhNo){
		wait_until(1);
		return verify_element_by_text(repPhoneNo, repPhNo);
	}
	
	public NBDRepsPage verify_email_id(String repEmlId){
		wait_until(1);
		return verify_element_by_text(repEmailId, repEmlId);
	}
	
	// Blocked Rep
	public NBDRepsPage select_option_for_actionstatus(String status){
	 select_by_name(actionsStatus, status);
	 return this;
	}
	
	public NBDRepsPage enter_blockReason(String reason){
		enter(blockReason, reason);
		return this;
	}
	public NBDRepsPage click_block_btn() {
		return click_button(blockbtn);
	}
	public NBDRepsPage verify_requirement_status(String status){
		verify_element_by_text(reqiurementStatus, status);
		return this;
	}
	public NBDRepsPage enter_unblockReason(String reason){
		enter(unblockReason, reason);
		return this;
	}
	public NBDRepsPage click_unblock_btn() {
		return click_button(unblockRepbtn);
	}
	
	
	//Manage Rep Permissions tab
	public NBDRepsPage enter_first_name_in_manage_rep_permission(String firstNm){
		wait_until(1);
		return enter(firstNameSearchTextForManageRep,firstNm);
	}
	
	public NBDRepsPage verify_have_appointment_permission_for_rep(){
		wait_until(1);
		return verify_element_by_text(haveAppointmentPermissionForRep, "Yes");
	}
	
	public NBDRepsPage verify_first_name_in_manage_rep_permissions(String repFirNm ){
		wait_until(1);
		return verify_element_by_text(firstNameInManageRepPermissions, repFirNm);
	}
	
	public NBDRepsPage verify_last_name_in_manage_rep_permissions(String repLstNm){
		wait_until(1);
		return verify_element_by_text(lastNameInManageRepPermissions, repLstNm);
	}
	
	public NBDRepsPage verify_company_name_in_manage_rep_permissions(String repComNm){
		wait_until(1);
		return verify_element_by_text(companyNameInManageRepPermissions, repComNm);
	}
	
}