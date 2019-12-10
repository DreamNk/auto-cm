package com.ghx.auto.cm.ui.page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class NVDHomePage extends CMAbstractPage<NVDHomePage>{
	
	private By home_tab = By.id("home");
	private By update_badge_photo = By.linkText("Update Badge Photo");
	private By common_document_alert = By.linkText("Common Document Alert");
	private By close_document_alert_popup = By.xpath(".//*[@id='complianceAlertDiv']/a");
	private By account_specific_document_alert = By.linkText("Account Specific Document Alert");
	private By policy_alert = By.linkText("Policy Alert");
	private By no_policy_alert = By.linkText("No Policy Alerts");
	private By incomplete_registration_alert = By.linkText("Incomplete Registration Alert");
	private By health_system_alert = By.linkText("Health System Alert");
	private By Connect_with_new_Health_System = By.linkText("Connect with a new Health System");
	private By first_radio_button_common_document = By.xpath(".//div[@id='nonCompdocumentGrid_Content']/table/tbody[3]/tr[1]/td[1]/div/input");		
	private By am_i_cleared_for_accesss = By.linkText("Am I Cleared for Access?");
	private By back_to_home = By.linkText("back to Home");
	private By common_missing_document = By.xpath(".//div[@id='nonCompdocumentGrid_Content']/table/tbody[3]/tr/td[3]/div");
	private By account_specific_missing_document = By.xpath(".//div[@id='nonCompdocumentGrid_Content']/table/tbody[3]/tr/td[3]/div");
	private By policies = By.xpath(".//div[@id='nonCompliancePolicyCustomers_Content']/table/tbody[3]/tr[1]/td[2]/div/font/b");
	private By incomplete_account = By.xpath(".//div[@id='accountsDiv_Content']/table/tbody[3]/tr/td[2]/div/a");
	private By fail_account = By.xpath(".//div[@id='accountsDiv_Content']/table/tbody[3]/tr/td[2]/div/a");
	private By unregistered_account = By.xpath(".//div[@id='searchResultDiv_Content']//table/tbody[3]/tr[1]/td[1]/div/a");
	private By header_text = By.xpath(".//*[@id='printBadge']/div[3]/h6");
	private By badge_photo_text = By.xpath(".//*[@id='BadgePhoto']/div[2]/p");
	
	
	//Common Document Upload popup from Alert Link-----------------------------------------------------------
	
	private By effetive_date_button = By.id("homeDocDetailsEffectiveDateBtn");	
	private By expiration_date_button = By.id("homeDocDetailsExpirationBtn");	
	private By save_button = By.id("homeDocumentDetails.saveButton");
	private By save_button_in_common_docs_of_my_document = By.id("confirmSaveSup");
	private By upload_button = By.xpath(".//div[@id='documentUploaderContainer']/div/span[1]/input");
	private By radio_button_account_specific_document = By.id("radio_c010000ac9d00000ad2f");
	private By select_year_from_the_dropdown = By.id("popupCalendarContainerForDialog_nav_year");
	
	

	
	
	
	
	
	// Click Home Tab
	public NVDHomePage click_home_tab() {
		return click_tab(home_tab);
	}

	// Click Update Badge Photo Link
	public NVDHomePage click_update_badge_photo() {
		wait_until(7);

		return click_link(update_badge_photo);

	}

	/**
	 * Select Expiration date from the calendar in the doc upload popup
	 */
	public NVDHomePage select_expiration_date(String year, String date) {
		wait_until(1);
		select_by_name(select_year_from_the_dropdown, year);
		click_link(By.linkText(date));
		return this;
	}

	// Click Common Document Alert Link
	public NVDHomePage click_common_document_alert_link() {
		wait_until(10);
		return click_link(common_document_alert);
	}

	// Close Popup
	public NVDHomePage close_popup() {
		wait_until(10);
		return click_popup(close_document_alert_popup);
	}

	// Click Account Specific Document Alert link
	public NVDHomePage click_account_specific_document_alert() {
		wait_until(6);
		return click_link(account_specific_document_alert);

	}

	// Click Plicy Alert Link
	public NVDHomePage click_policy_alert_link() {
		wait_until(3);
		return click_link(policy_alert);
	}
	
	// Click No Plicy Alert Link
		public NVDHomePage click_no_policy_alert_link() {
			wait_until(3);
			return click_link(no_policy_alert);
		}

	// Click Incomplete Registration Alert link
	public NVDHomePage click_incomplete_registration_alert() {
		wait_until(7);
		return click_link(incomplete_registration_alert);
	}

	// Click Health System Alert Link
	public NVDHomePage click_health_system_alert() {
		wait_until(7);
		return click_link(health_system_alert);
	}

	// Click Connect With New Health System Link
	public NVDHomePage click_connect_with_new_health_system() {
		wait_until(7);
		return click_link(Connect_with_new_Health_System);
	}

	// Click Im I Clear For Access Link
	public NVDHomePage click_am_i_clear_for_access() {
		wait_until(7);
		return click_link(am_i_cleared_for_accesss);
	}

	// Click Back to Home link
	public NVDHomePage click_back_to_home() {
		wait_until(8);
		return click_link(back_to_home);
	}

	// verify common missing document
	public NVDHomePage verify_common_missing_document(String msg) {
		return verify_element_by_text(common_missing_document, msg);
	}

	// verify account specific missing document
	public NVDHomePage verify_account_specific_missing_document(String msg) {
		return verify_element_by_text(account_specific_missing_document, msg);
	}

	// verify policies
	public NVDHomePage verify_policies(String msg) {
		wait_until(2);
		return verify_element_by_text(policies, msg);
	}

	// verify incomplete account
	public NVDHomePage verify_incomplete_account(String msg) {
		return verify_element_by_text(incomplete_account, msg);
	}

	// verify fail account
	public NVDHomePage verify_fail_account(String msg) {
		return verify_element_by_text(fail_account, msg);
	}

	// verify unregistered account
	public NVDHomePage verify_unregistered_account(String msg) {
		return verify_element_by_text(unregistered_account, msg);
	}

	// verify heder text
	public NVDHomePage verify_heder_text(String msg) {
		return verify_element_by_text(header_text, msg);
	}

	// verify badge photo text
	public NVDHomePage verify_badge_photo_text(String msg) {
		return verify_element_by_text(badge_photo_text, msg);
	}

	// click radio button of common document popup
	public NVDHomePage click_1st_radio_button_of_common_document_popup() {
		return click_popup(first_radio_button_common_document);
	}

	// click effetive date button
	public NVDHomePage click_effetive_date_button() {
		// wait_until(5);
		return click_popup(effetive_date_button);
	}

	// click expiration date button
	public NVDHomePage click_expiration_date_button() {
		// wait_until(5);
		return click_popup(expiration_date_button);
	}

	// select effective date
	public NVDHomePage select_effective_date(String year, String date) {
		wait_until(1);
		select_by_name(select_year_from_the_dropdown, year);
		click_link(By.linkText(date));
		return this;
	}

	/**
	 * click save button on the popup
	 */
	public NVDHomePage click_save_button() {
		wait_until(5);
		return click_button(save_button);
	}
	
	/**
	 * click save button on the in common document of My documents tab
	 */
	public NVDHomePage click_save_button_in_common_docs_tab() {
		wait_until(5);
		return click_button(save_button_in_common_docs_of_my_document);
	}
	

	/**
	 * This method will click on the upload button
	 */
	public NVDHomePage click_upload_button() {
		wait_until(2);
		return click_button(upload_button);
	}

	// click radio button of account specific document popup
	public NVDHomePage click_radio_button_of_account_specific_document_popup() {
		// wait_until(5);
		return click_button(radio_button_account_specific_document);
	}

}
    
