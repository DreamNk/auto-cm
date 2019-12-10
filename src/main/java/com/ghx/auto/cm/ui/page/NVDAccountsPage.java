package com.ghx.auto.cm.ui.page;

import org.openqa.selenium.By;
import org.testng.Assert;

public class NVDAccountsPage extends CMAbstractPage<NVDAccountsPage>{

	
	
	
	
	private By unregistered_account_of_search_for_accounts_accordion = By.xpath(".//div[@id='searchResultDiv_Content']/table/tbody[3]/tr[1]/td[1]/div/a");
	private By accounts_tab = By.id("accounts");
	private By accounts_tab1 = By.xpath(".//div[@id='mainTab']/ul/li[3]/a/em");
	private By company_status_of_second_record = By.xpath(".//div[@id='accountsDiv_Content']/table/tbody[3]/tr[2]/td[4]/div");
	private By incomplete_registered_account_dropdown = By.xpath(".//div[@id='manageAccountTypeSelectDiv']/select/option[2]");
	private By incomplete_registered_account = By.xpath(".//div[@id='accountsDiv_Content']/table/tbody[3]/tr/td[4]/div");
	private By fail_health_system_dropdown = By.xpath(".//div[@id='manageAccountTypeSelectDiv']/select/option[3]");
	private By requirement_status_fail =  By.linkText("FAIL");
	private By requirement_status_of_1st_record = By.xpath(".//div[@id='accountsDiv_Content']/table/tbody[3]/tr/td[3]/div/a");
	private By requirement_status_of_2nd_record = By.xpath(".//div[@id='accountsDiv_Content']/table/tbody[3]/tr[2]/td[3]/div/a");
	private By inactive_accounts_dropdown = By.xpath(".//div[@id='manageAccountTypeSelectDiv']/select/option[4]");
	
//-------------------------------------------------------------------------------------------------------------------------------------
//Action dropdown in Manage My ACcounts
	
	private By select_action_dropdown_in_inactive_accounts = By.xpath(".//div[@id='accountsDiv_Content']/table/tbody[3]/tr/td[1]/div/select");
	private By select_2ndrow_action_dropdown_in_Manage_my_accounts = By.xpath(".//div[@id='accountsDiv_Content']/table/tbody[3]/tr[2]/td[1]/div/select");
	private By Inactivate_option_of_2ndrow_in_all_Active_accounts = By.xpath(".//div[@id='accountsDiv_Content']/table/tbody[3]/tr[2]/td[1]/div/select/option[2]");
	private By activate_account_option = By.xpath(".//div[@id='accountsDiv_Content']/table/tbody[3]/tr/td[1]/div/select/option[2]");
	private By yes_button_on_activate_inactivate_account_popup = By.xpath(".//div[@id='accountsStatusDialogFooter']/span/input[2]");
	private By select_1strow_action_dropdown_in_Manage_my_accounts = By.xpath(".//div[@id='accountsDiv_Content']/table/tbody[3]/tr/td[1]/div/select");
	private By Inactivate_option_of_1strow_in_inactive_accounts = By.xpath(".//div[@id='accountsDiv_Content']/table/tbody[3]/tr/td[1]/div/select/option[2]");
	
//---------------------------------------------------------------------------------------------------------------------------------------------------
	
	private By account_link =  By.xpath(".//div[@id='accountsDiv_Content']/table/tbody[3]/tr/td[2]/div/a");
	private By st_account_link =  By.linkText("Vision Test Customer");
	private By continue_account =  By.linkText("Continue");
	private By back_to_list =  By.linkText("back to list");
	private By view_location_link =  By.linkText("View locations");
	private By location_popup = By.xpath(".//div[@id='customerLocationsDiv_Content']/table/tbody[3]/tr[1]/td/div");
	private By document_status_of_1st_doc = By.xpath(".//div[@id='reqNav']/table/tbody/tr[1]/td[2]/span[1]");
	private By search_for_accounts_accordion = By.id("AccountsAccordion-2-label");
	private By enter_account_name_text_box = By.xpath(".//div[@id='manageAccountTypeSelectDiv']/input");
	private By search_button_of_manage_my_accounts = By.id("confirmSaveSup");
	private By search_button_of_search_by_state = By.xpath(".//div[@id='searchTabContent']/div[2]/div[2]/span/input");
	private By search_button_of_search_by_keyword = By.xpath(".//div[@id='searchTabContent']/div[1]/div[2]/span/input");
	private By search_by_keyword_radio_button = By.id("keywordRadio");
	private By search_textbox_in_search_for_accounts_accordion = By.id("searchAll");
	private By all_active_accounts_dropdown = By.xpath(".//div[@id='manageAccountTypeSelectDiv']/select/option[1]");
	private By text_field_in_search_for_accounts_tab = By.xpath(".//div[@id='stateSearch']/div[1]/select");
	private By registration_url_in_account_details = By.xpath("/html/body/div/table/tbody/tr/td/form/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/span");
	private By accounts_detail_iframe_id = By.id("repAccountInfo");
	private By your_relationship = By.id("repAccountInfo");
	
//-------------------------------------------------------------------------------------------------------------------
// Renewal Date
	private By renewal_date_1st_row = By.xpath(".//div[@id='accountsDiv_Content']/table/tbody[3]/tr[1]/td[5]/div"); //Normal registered
	private By renewal_date_2nd_row = By.xpath(".//div[@id='accountsDiv_Content']/table/tbody[3]/tr[2]/td[5]/div"); //Express registered
	private By renewal_date_3rd_row = By.xpath(".//div[@id='accountsDiv_Content']/table/tbody[3]/tr[3]/td[5]/div"); //RFPMT vc
	private By verify_renewal_column_text = By.xpath(".//div[@id='accountsDiv_Content']/table/thead/tr/th[5]/div/div[1]/span");
	

	//Docs & Policies (Document upload)--------------------------------------------------------------------------
	
	private By action_dropdown_of_1st_document = By.xpath(".//div[@id='reqNav']/table/tbody/tr[1]/td[5]/select");
	private By action_dropdown_of_8th_document = By.xpath(".//div[@id='reqNav']/table/tbody/tr[8]/td[5]/select");
	private By action_dropdown_of_3rd_document = By.xpath(".//div[@id='reqNav']/table/tbody/tr[3]/td[5]/select");
	private By action_dropdown_of_4th_document = By.xpath(".//div[@id='reqNav']/table/tbody/tr[4]/td[5]/select");
	private By action_dropdown_of_9th_document = By.xpath(".//div[@id='reqNav']/table/tbody/tr[9]/td[5]/select");

	private By docs_and_policies_iframe_id = By.id("repAccountInfo");
	private By continue_button = By.xpath("/html/body/div[5]/table/tbody/tr[2]/td/form/table/tbody/tr[3]/td/table/tbody/tr[2]/td[1]/div/input");
	private By upload_doc_effective_date = By.xpath("/html/body/div[6]/table/tbody/tr[2]/td/form/table/tbody/tr[5]/td[3]/table/tbody/tr[7]/td[2]/input");
	private By upload_doc_expiration_date = By.xpath("/html/body/div[6]/table/tbody/tr[2]/td/form/table/tbody/tr[5]/td[3]/table/tbody/tr[8]/td[2]/input");
	private By browse_button = By.cssSelector("html.gecko.ff3.win.js body div table tbody tr td.vmTopIntroText form table tbody tr td table tbody tr td.vmFieldName a table#Document tbody tr td input");
	private By save_and_continue_button = By.cssSelector("html.gecko.ff3.win.js body div table tbody tr td.vmTopIntroText form table tbody tr td table tbody tr td div#save ul li a.vmBtnAddInline");
	private By refresh_manage_accounts_icon = By.xpath(".//div[@id='accountsDiv_Top']/a/img");
	private By refresh_requirement_status_1st_icon = By.xpath(".//div[@id='accountsDiv']/div[2]/table/tbody[3]/tr/td[3]/div/a/img");
	
	private By refresh_requirement_status_2nd_icon = By.xpath(".//div[@id='accountsDiv']/div[2]/table/tbody[3]/tr[2]/td[3]/div/a/img");
    private By continue_button_on_autoattach_doc_page = By.cssSelector("html.gecko.ff3.win.js body div table tbody tr td.vmTopIntroText form table tbody tr td.normalText table tbody tr td div#save ul li a.vmBtnAddInline");
	private By confirm_delete_button = By.cssSelector("[name='_eventId_delete']");

	
	
	
	
	
	
	
	
	
		
	public NVDAccountsPage click_accounts_tab() {
		wait_until(6);
		return click_button(accounts_tab);
	}

	public NVDAccountsPage click_accounts_tab1() {
		wait_until(6);
		return click_tab(accounts_tab1);
	}

	public NVDAccountsPage verify_company_status_for_second_record(String msg) {
		return verify_element_by_text(company_status_of_second_record, msg);
	}

	public NVDAccountsPage click_incomplete_registered_account_dropdown() {
		wait_until(3);
		return click_link(incomplete_registered_account_dropdown);
	}

	public NVDAccountsPage verify_incomplete_registered_account(String msg) {
		return verify_element_by_text(incomplete_registered_account, msg);
	}

	public NVDAccountsPage click_fail_health_system_dropdown() {
		wait_until(3);
		return click_link(fail_health_system_dropdown);
	}

	public NVDAccountsPage verify_requirement_status(String msg) {
		return verify_element_by_text(requirement_status_fail, msg);
	}

	public NVDAccountsPage click_fail_requirement_status_link() {
		return click_link(requirement_status_fail);
	}

	public NVDAccountsPage click_inactive_accounts_dropdown() {
		wait_until(3);
		return click_link(inactive_accounts_dropdown);
	}

	public NVDAccountsPage click_select_action_dropdown_in_inactive_accounts() {
		wait_until(5);
		return click_link(select_action_dropdown_in_inactive_accounts);
	}

	public NVDAccountsPage verify_activate_account_option(String msg) {
		return verify_element_by_text(activate_account_option, msg);
	}

	public NVDAccountsPage click_account_link(String account_name) {
		wait_until(5);
		return click_link(By.linkText(account_name));
	}

	public NVDAccountsPage verify_account_link(String msg) {
		wait_until(3);
		return verify_element_by_text(account_link, msg);
	}
	
	public NVDAccountsPage verify_st_account_link(String msg) {
		wait_until(3);
		return verify_element_by_text(st_account_link, msg);
	}

	public NVDAccountsPage verify_continue_account(String msg) {
		wait_until(3);
		return verify_element_by_text(continue_account, msg);
	}

	public NVDAccountsPage click_back_to_list() {
		wait_until(5);
		return click_link(back_to_list);
	}

	public NVDAccountsPage click_view_location_link() {
		wait_until(5);
		return click_link(view_location_link);
	}

	public NVDAccountsPage verify_location_popup(String msg) {
		wait_until(3);
		return verify_element_by_text(location_popup, msg);
	}

	public NVDAccountsPage verify_document_status_of_1st_document(String msg) {
		wait_until(10);
		switch_to_frame(docs_and_policies_iframe_id);
		wait_until(2);
		verify_element_by_text(document_status_of_1st_doc, msg);
		switch_to_root_page();
		return this;

	}

	public NVDAccountsPage click_search_for_accounts_accordion() {
		wait_until(5);
		return click_link(search_for_accounts_accordion);
	}

	public NVDAccountsPage click_search_button_in_manage_my_accounts() {
		wait_until(5);
		return click_button(search_button_of_manage_my_accounts);
	}

	public NVDAccountsPage verify_unregistered_account(String msg) {
		wait_until(3);
		return verify_element_by_text(
				unregistered_account_of_search_for_accounts_accordion, msg);
	}

	public NVDAccountsPage enter_account_name(String account) {
		return enter(enter_account_name_text_box, account);
	}

	public NVDAccountsPage click_search_button_to_search_by_state_in_search_for_accounts_accordion() {
		wait_until(9);
		return click_button(search_button_of_search_by_state);
	}

	public NVDAccountsPage click_search_button_to_search_by_keyword_in_search_for_accounts_accordion() {
		wait_until(9);
		return click_button(search_button_of_search_by_keyword);
	}

	public NVDAccountsPage click_search_by_keyword_radio_button() {
		wait_until(5);
		return click_button(search_by_keyword_radio_button);
	}

	public NVDAccountsPage enter_account_name_in_textbox(String account) {
		wait_until(4);
		return enter(search_textbox_in_search_for_accounts_accordion, account);
	}

	public NVDAccountsPage click_all_active_accounts_dropdown() {
		wait_until(5);
		return click_button(all_active_accounts_dropdown);
	}

	public NVDAccountsPage verify_state_name_in_text_field_of_search_for_accounts_tab(
			String msg) {
		wait_until(3);
		return verify_element_by_text(text_field_in_search_for_accounts_tab,
				msg);
	}

	public NVDAccountsPage verify_registration_URL_in_account_details(String msg) {
		wait_until(10);
		switch_to_frame(accounts_detail_iframe_id);
		wait_until(2);
		verify_element_by_text(registration_url_in_account_details, msg);
		switch_to_root_page();
		return this;
	}

	public NVDAccountsPage verify_renewal_date_in_1st_row(String msg) {
		wait_until(3);
		return verify_element_by_text(renewal_date_1st_row, msg);
	}

	public NVDAccountsPage verify_renewal_date_in_2nd_row(String msg) {
		wait_until(3);
		return verify_element_by_text(renewal_date_2nd_row, msg);
	}

	public NVDAccountsPage verify_renewal_date_in_3rd_row(String msg) {
		wait_until(3);
		return verify_element_by_text(renewal_date_3rd_row, msg);
	}

	public NVDAccountsPage verify_in_manage_my_accounts_rearch_result_contains(
			String msg) {
		wait_until(3);
		return verify_element_by_text(renewal_date_3rd_row, msg);

	}

	public NVDAccountsPage verify_renewal_date_not_present(String text) {
		try {
			verify_element_by_text(verify_renewal_column_text, text);
			Assert.fail("Element Present on the Page");
		} catch (Exception e) {
		}
		return this;
	}

	public NVDAccountsPage click_select_action_of_2nd_row_in_all_active_accounts() {
		wait_until(5);
		return click_button(select_2ndrow_action_dropdown_in_Manage_my_accounts);
	}

	public NVDAccountsPage click_inactivate_account_option() {
		wait_until(5);
		return click_link(Inactivate_option_of_2ndrow_in_all_Active_accounts);
	}

	public NVDAccountsPage click_yes_button_on_activate_or_inactivate_account_popup() {
		wait_until(5);
		return click_button(yes_button_on_activate_inactivate_account_popup);
	}

	public NVDAccountsPage click_select_action_of_1st_row_in_inactive_accounts() {
		wait_until(5);
		return click_button(select_1strow_action_dropdown_in_Manage_my_accounts);
	}

	public NVDAccountsPage click_activate_account_option() {
		wait_until(5);
		return click_link(Inactivate_option_of_1strow_in_inactive_accounts);
	}

	public NVDAccountsPage switch_to_docs_and_policies_iframe() {
		return switch_to_frame("repAccountInfo");
	}
	
	
	//Docs & policies Upload-----------------------------------------------
	
	
	// verify_requirement_status_of_1st_record
	public NVDAccountsPage verify_requirement_status_of_1st_record(String msg) {
		wait_until(5);
		return verify_element_by_text(requirement_status_of_1st_record, msg);
	}
	
	// verify_requirement_status_of_1st_record
		public NVDAccountsPage verify_requirement_status_of_2nd_record(String msg) {
			wait_until(5);
			return verify_element_by_text(requirement_status_of_2nd_record, msg);
		}

	// click_requirement_status_of_1st_record
	public NVDAccountsPage click_requirement_status_of_1st_record() {
		wait_until(5);
		return click_link(requirement_status_of_1st_record);
	}
	
	// click_requirement_status_of_3rd_record
		public NVDAccountsPage click_requirement_status_of_2nd_record() {
			wait_until(5);
			return click_link(requirement_status_of_2nd_record);
		}
	

	// select_upload_option_for_1st_document
	public NVDAccountsPage select_upload_option_for_1st_document() {
		wait_until(7);
		return select_by_name(action_dropdown_of_1st_document, "Upload");
	}

	// select_delete_option_for_1st_document
	public NVDAccountsPage select_delete_option_for_1st_document() {
		wait_until(7);
		return select_by_name(action_dropdown_of_1st_document, "Delete");
	}
	

	// select_upload_option_for_2nd_document
	public NVDAccountsPage select_option_for_8th_document(String option) {
		wait_until(5);
		return select_by_name(action_dropdown_of_8th_document, option);
	}

	// select_upload_option_for_3rd_document
	public NVDAccountsPage select_upload_option_for_3rd_document() {
		wait_until(5);
		return select_by_name(action_dropdown_of_3rd_document, "Upload");
	}

	// select_upload_option_for_3rd_document
	public NVDAccountsPage select_option_for_4th_document(String a) {
		wait_until(5);
		return select_by_name(action_dropdown_of_4th_document, a);
	}

	// select_upload_option_for_3rd_document
		public NVDAccountsPage select_option_for_9th_document(String a) {
			wait_until(5);
			return select_by_name(action_dropdown_of_9th_document, a);
		}
	
	// enter_effective_date
	public NVDAccountsPage enter_effective_date(String effectiveDate) {
		wait_until(2);
		return enter(upload_doc_effective_date, effectiveDate);
	}

	// enter_expiration_date
	public NVDAccountsPage enter_expiration_date(String expirationDate) {
		wait_until(2);
		return enter(upload_doc_expiration_date, expirationDate);
	}

	// browse_button
	public NVDAccountsPage click_browse_button() {
		wait_until(2);
		return click_button(browse_button);
	}

	// click_save_and_continue_button
	public NVDAccountsPage click_save_and_continue_button() {
		wait_until(2);
		return click_button(save_and_continue_button);
	}

	// refresh_manage_accounts_icon
	public NVDAccountsPage click_refresh_manage_accounts_icon() {
		wait_until(2);
		return click_button(refresh_manage_accounts_icon);
	}

	// refresh_requirement_status_icon
	public NVDAccountsPage click_refresh_requirement_status_1st_icon() {
		wait_until(2);
		return click_button(refresh_requirement_status_1st_icon);
	}
	
	// refresh_requirement_status_icon
	public NVDAccountsPage click_refresh_requirement_status_2nd_icon() {
		wait_until(2);
		return click_button(refresh_requirement_status_2nd_icon);
		}

	// continue_button
	public NVDAccountsPage click_continue_button() {
		wait_until(2);
		return click_button(continue_button);
	}

	public NVDAccountsPage click_continue_button_on_autoattach_doc_page() {
		wait_until(2);
		return click_button(continue_button_on_autoattach_doc_page);
	}
	
	
	/**Click 'Confirm delete' button while deleting document from 'Docs & Policies' page
	 * 
	 */
	public NVDAccountsPage click_confirm_delete_button() {
		wait_until(2);
		return click_button(confirm_delete_button);
	}
	
	
}






