package com.ghx.auto.cm.ui.sso.page;

import org.openqa.selenium.By;

import com.ghx.auto.cm.ui.page.CMAbstractPage;

public class NVDAccountPage extends CMAbstractPage<NVDAccountPage> {

	
	private By accountSearchTextBox = By.id("accountName");
	private By searchButton = By.id("searchAccount");
	private By failDocStatus = By.xpath("//*[contains(text(),'FAIL')]");
	private By passDocStatus = By.xpath("//*[contains(@class,'text-success ng-binding')]");
	private By manageMyAccounts = By.xpath("//*[contains(text(),'Manage My Accounts')]");
	private By accountDetails = By.xpath("//*[contains(text(),'Account details')]");
	private By accountName = By.xpath(".//div[@class='table-responsive tableResponsive']/table/tbody/tr/td[2]/div/a/div");
	private By companyCredentialingStatus = By.xpath(".//div[@class='table-responsive tableResponsive']/table/tbody/tr/td[5]");
	private By networkRegistrationRequest = By.xpath(".//div[@class='table-responsive tableResponsive']//table/tbody/tr/td[6]/span");
	private By blockedRepAccessStatus = By.xpath("//*[contains(text(),'BLOCKED')]");
	private By manageMyAccount = By.xpath(".//*[@id='containerFixed']/div[4]/div/div/div[1]/div/div/accordion/div/div[1]/div[1]");
	
	//Docs and Policies----------------------------------------------------------------------------------
	private By selectDropdownOf5thDocument = By.xpath("//*[@id='doc']//tr[5]/td[5]/select");
	private By selectDropdownOf4thDocument = By.xpath("//*[@id='doc']//tr[4]/td[5]/select");
	private By selectDropdownOf3rdDocument = By.xpath("//*[@id='doc']//tr[3]/td[5]/select");
	private By selectDropdownOf2ndDocument = By.xpath("//*[@id='doc']//tr[2]/td[5]/select");
	private By selectDropdownOf6thDocument = By.xpath("//*[@id='doc']//tr[6]/td[5]/select");
	private By selectDropdownOf1stDocument = By.xpath(".//*[@id='doc']/tbody/tr[1]/td[5]/select");
	private By backToListLink = By.linkText("back to list");
	private By confirmDeleteBUtton = By.xpath("//*[contains(@name,'_eventId_delete')]");
	private By providerDocStatus = By.xpath(".//*[@id='doc']/tbody/tr[2]/td[2]");
	
	//upload docs----------------------------------------------------------------------------------------
	private By iframe = By.xpath("//iframe [contains(@id,'repProfileUrl')]");
	private By effectiveDate = By.xpath("//*[contains(@name,'vendoc.effectiveDate')]");
	private By expirationDate = By.xpath("//*[contains(@name,'vendoc.expirationDate')]");
	private By saveAndCloseButton = By.xpath("//*[contains(@name,'_eventId_save')]");
	private By continueButton = By.xpath("//*[contains(@value,'Continue')]");
	
	//Search for Accounts-----------------------------------------------------------------------------------
	private By searchForAccounts = By.xpath("//*[contains(text(),'Search for Accounts')]");
	private By healthSystemSearchBox = By.xpath("//*[contains(@id,'searchString')]");
	private By searchButtonOnSearchForAccounts = By.xpath("//button[contains(@class,'curveButton btn btn-primary ng-binding')]");
	private By registeredButton = By.xpath("//*[contains(text(),'Register')]");
	
	//NVD Registration code---------------------------------------------------------------------------------
	private By yesOptionOnOnsitePopup = By.xpath("//*[contains(text(),'Yes')]");
	private By noOptionOnOnsitePopup = By.xpath(".//*[@id='ng-app']/body/div[5]/div/div/div/div/div[3]/button[2]");
	
	//NVD Tool tip message Rep Access Status----------------------------------------------------------------
	private By alertRepAccessStatus = By.xpath("//*[contains(text(),'ALERT')]");
	private By toolTipMessage = By.xpath("//*[@id='manageMyAccounts']/div[2]/div[2]/table/tbody/tr/td[3]/input[4]");


	
	
	public NVDAccountPage enter_account_name(String account_name) {
		wait_until(1);
		return enter(accountSearchTextBox, account_name);
	}

	public NVDAccountPage click_search_button() {
		wait_until(1);
		click(searchButton);
		return wait_until(2);

	}

	public NVDAccountPage click_manage_my_accounts_accordion(){
		click(manageMyAccount);
		return this;
		
	}
	
	public NVDAccountPage verify_fails_status() {
		wait_until(1);
		verify_element_by_text(failDocStatus, "FAIL");
		return wait_until(1);
	}
	
	public NVDAccountPage verify_pass_status() {
		wait_until(1);
		return verify_element_by_text(passDocStatus, "PASS");
	}
	
	public NVDAccountPage verify_blocked_status() {
		wait_until(1);
		return verify_element_by_text(blockedRepAccessStatus, "BLOCKED");
	}
	public NVDAccountPage verify_alert_status() {
		wait_until(1);
		return verify_element_by_text(alertRepAccessStatus, "ALERT");
	}
	
	public NVDAccountPage click_fails_status() {
		click(failDocStatus);
		return wait_until(5);

	}
	public NVDAccountPage verify_account_name_text(String accountNm){
		wait_until(2);
		return verify_element_by_text(accountName, accountNm);
	}
	
	public NVDAccountPage verify_company_credentialing_status_text(String credStatus){
		wait_until(1);
		return verify_element_by_text(companyCredentialingStatus,credStatus);
	}
	
	public NVDAccountPage verify_network_registration_request_text(String netStatus){
		wait_until(1);
		return verify_element_by_text(networkRegistrationRequest, netStatus);
	}
	
	public NVDAccountPage click_pass_status() {
		wait_until(1);
		return click(passDocStatus);
	}
	
	// Verify Accounts - Manage My accounts 
	public NVDAccountPage verify_manage_my_accounts_text(){
		wait_until(2);
		return verify_element_by_text(manageMyAccounts, "Manage My Accounts");
	}
	
	
	//verify Account Details text
	public NVDAccountPage verify_account_details_text(){
		wait_until(2);
		return verify_element_by_text(accountDetails, "Account details");
	}
	
	//Documents & Policies-------------------------------------------------------------------------------------
	
	public NVDAccountPage switch_to_iframe() {
		wait_until(1);
		return switch_to_frame(iframe);
	}
	
	public NVDAccountPage select_option_from_actions_dropdown_of_1st_doc(String option) {
		wait_until(1);
		select_by_name(selectDropdownOf1stDocument, option);
		return wait_until(4);

	}
	
	public NVDAccountPage select_option_from_actions_dropdown_of_2nd_doc(String option) {
		wait_until(1);
		return select_by_name(selectDropdownOf2ndDocument, option);
	}	
	
	public NVDAccountPage select_option_from_actions_dropdown_of_3rd_doc(String option) {
		wait_until(1);
		return select_by_name(selectDropdownOf3rdDocument, option);
	}	
	
	public NVDAccountPage select_option_from_actions_dropdown_of_4th_doc(String option) {
		wait_until(1);
		return select_by_name(selectDropdownOf4thDocument, option);
	}
	
	public NVDAccountPage select_option_from_actions_dropdown_of_5th_doc(String option) {
		wait_until(1);
		return select_by_name(selectDropdownOf5thDocument, option);
	}
	
	public NVDAccountPage select_option_from_actions_dropdown_of_6th_doc(String option) {
		wait_until(1);
		return select_by_name(selectDropdownOf6thDocument, option);
	}
	
	public NVDAccountPage click_back_to_list_link() {
		wait_until(1);
		return click_link(backToListLink);
	}
	
	public NVDAccountPage verify_provider_doc_status(String status){
		wait_until(2);
		return verify_element_by_text(providerDocStatus, status);
	}
	
	
	//Upload & Delete doc-------------------------------------------------------------------------------------------------
	
	public NVDAccountPage enter_effective_date(String mm_dd_yy) {
		wait_until(2);
		return enter(effectiveDate, mm_dd_yy);

	}

	public NVDAccountPage enter_expiration_date(String mm_dd_yy) {
		wait_until(2);
		return enter(expirationDate, mm_dd_yy);

	}

	public NVDAccountPage click_save_and_continue_button() {
		wait_until(3);
		click(saveAndCloseButton);
		return wait_until(5);

	}
	
	public NVDAccountPage click_confirm_delete_button() {
		wait_until(2);
		click_button(confirmDeleteBUtton);
		return wait_until(5);

	}
	
	public NVDAccountPage click_continue_button() {
		wait_until(3);
		click(continueButton);
		return wait_until(5);

	}
	
	//Search for accounts tab------------------------------------------------------------------------------
	
    public NVDAccountPage verify_search_for_accounts_text(){
		wait_until(2);
		return verify_element_by_text(searchForAccounts, "Search for Accounts");
	}
	
	public NVDAccountPage click_search_for_accounts_tab(){
		wait_until(2);
		return click_button(searchForAccounts);
	}
	
	
	public NVDAccountPage enter_health_system_name_in_searchbox(String account_name) {
		wait_until(1);
		enter(healthSystemSearchBox, account_name);
		return wait_until(1);
	}
	
	public NVDAccountPage click_search_in_search_for_accounts_tab() {
		wait_until(2);
		click(searchButtonOnSearchForAccounts);
		return wait_until(4);
	}
	
	public NVDAccountPage click_register_button() {
		wait_until(1);
		click(registeredButton);
		return wait_until(4);
	}
	
	
	//NVD Regisration code----------------------------------------------------------------------------------------------
	
	public NVDAccountPage click_yes_in_onsite_popup() {
		wait_until(1);
		click(yesOptionOnOnsitePopup);
		return wait_until(4);
	}
	public NVDAccountPage click_no_in_onsite_popup() {
		wait_until(1);
		click(noOptionOnOnsitePopup);
		return wait_until(4);
	}
	
	//NVD Accounts mouseover to Rep access status
		public NVDAccountPage mouseover_rep_access_status(){
			wait_until(1);
			mouseover(alertRepAccessStatus);
			return wait_until(3);
		}
		public NVDAccountPage mouseover_fail_rep_access_status(){
			wait_until(1);
			mouseover(failDocStatus);
			return wait_until(3);
		}
		
		public String gettool_tip() {
			String i= find_element_text(toolTipMessage);
			System.out.println(i+""+"ok");
			return i;
		}
	
}
