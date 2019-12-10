package com.ghx.auto.cm.ui.angularjs.page;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.ghx.auto.cm.ui.page.CMAbstractPage;





public class AjsNVDAccountsPage extends CMAbstractPage<AjsNVDAccountsPage>{


	
	
	private By accounts_tab = By.xpath("/html/body/div[3]/header/div[2]/div[2]/ul[1]/li[3]/a");
	private By company_status_of_second_record = By.xpath(" /html/body/div[4]/div/div/div[1]/div/div/accordion/div/div[1]/div[2]/div/div[2]/div/div/div/vision-data-table/div[3]/table/tbody/tr[2]/td[5]");
	private By incomplete_registered_account_dropdown = By.xpath(".//div[@id='manageAccountTypeSelectDiv']/select/option[2]");
	private By incomplete_registered_status = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/accordion/div/div[1]/div[2]/div/div[2]/div/div/div/vision-data-table/div[3]/table/tbody/tr/td[5]");
	private By fail_health_system_dropdown = By.xpath(".//div[@id='manageAccountTypeSelectDiv']/select/option[3]");
	private By requirement_status_fail =  By.linkText("FAIL");
	private By requirement_status_of_1st_record = By.xpath(".//div[@id='accountsDiv_Content']/table/tbody[3]/tr/td[3]/div/a");
	private By requirement_status_of_2nd_record = By.xpath(".//div[@id='accountsDiv_Content']/table/tbody[3]/tr[2]/td[3]/div/a");
	private By inactive_accounts_dropdown = By.xpath(".//div[@id='manageAccountTypeSelectDiv']/select/option[4]");
	private By account_status_dropdown = By.id("accountStatus");
//-------------------------------------------------------------------------------------------------------------------------------------
//Action dropdown in Manage My ACcounts
	
	private By select_action_dropdown_in_inactive_accounts = By.xpath(".//div[@id='accountsDiv_Content']/table/tbody[3]/tr/td[1]/div/select");
	private By select_2ndrow_action_dropdown_in_Manage_my_accounts = By.xpath(".//div[@id='accountsDiv_Content']/table/tbody[3]/tr[2]/td[1]/div/select");
	private By Inactivate_option_of_2ndrow_in_all_Active_accounts = By.xpath(".//div[@id='accountsDiv_Content']/table/tbody[3]/tr[2]/td[1]/div/select/option[2]");
	private By activate_account_option = By.xpath(".//div[@id='accountsDiv_Content']/table/tbody[3]/tr/td[1]/div/select/option[2]");
	private By yes_button_on_activate_inactivate_account_popup = By.xpath(".//div[@id='accountsStatusDialogFooter']/span/input[2]");
	private By select_1strow_action_dropdown_in_Manage_my_accounts = By.xpath(".//div[@id='accountsDiv_Content']/table/tbody[3]/tr/td[1]/div/select");
	private By Inactivate_option_of_1strow_in_inactive_accounts = By.xpath(".//div[@id='accountsDiv_Content']/table/tbody[3]/tr/td[1]/div/select/option[2]");
	private By close_popup = By.cssSelector("[class='close']");
	private By help_popup = By.cssSelector("[class='text-success']"); //PASS
	private By enter_account_name = By.id("accountName");

//---------------------------------------------------------------------------------------------------------------------------------------------------
	
	private By account_link =  By.xpath("/html/body/div[4]/div/div/div[1]/div/div/accordion/div/div[1]/div[2]/div/div/div/div/div/vision-data-table/div[3]/table/tbody/tr[1]/td[2]/a/span");
	private By st_account_link =  By.linkText("Vision Test Customer");
	private By continue_account =  By.linkText("Continue");
	private By back_to_list =  By.linkText("back to list");
	private By view_location_link_1st =  By.xpath("/html/body/div[4]/div/div/div[1]/div/div/accordion/div/div[1]/div[2]/div/div[2]/div/div/div/vision-data-table/div[3]/table/tbody/tr[1]/td[7]/a");
	private By location_popup = By.xpath("/html/body/div[9]/div/div/div/div[2]/vision-data-table/div/table/tbody/tr[1]/td");
	private By document_status_of_1st_doc = By.xpath(".//div[@id='reqNav']/table/tbody/tr[1]/td[2]/span[1]");
	private By search_button_of_manage_my_accounts = By.id("searchAccount");
	private By search_textbox_in_search_for_accounts_accordion = By.id("searchAll");
	private By all_active_accounts_dropdown = By.xpath(".//div[@id='manageAccountTypeSelectDiv']/select/option[1]");
	private By text_field_in_search_for_accounts_tab = By.xpath(".//div[@id='stateSearch']/div[1]/select");
	private By registration_url_in_account_details = By.xpath("/html/body/div/table/tbody/tr/td/form/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/span");
	private By accounts_detail_iframe_id = By.id("repAccountInfo");
	
	
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

	
	//Search for Accounts tab -----------------------------------------------------------------------------------------
	private By search_for_accounts_tab = By.cssSelector("[data-ui-sref='accounts.searchAccounts']");
	private By enter_search_string = By.id("searchString");
	private By search_button = By.cssSelector("[data-validation-submit='searchForm']");
	private By serach_filter_dropdown = By.cssSelector("[data-ng-model='searchAccount.searchType']");
	private By health_system_1st_record = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/accordion/div/div[2]/div[2]/div/div/div/vision-data-table/div/div[3]/div[2]/table/tbody/tr[1]/td[2]/span");
	private By location_1st_record = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/accordion/div/div[2]/div[2]/div/div/div/vision-data-table/div/div[3]/div[2]/table/tbody/tr[1]/td[3]/span");
	private By city_1st_record = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/accordion/div/div[2]/div[2]/div/div/div/vision-data-table/div/div[3]/div[2]/table/tbody/tr[1]/td[4]/span");
	private By state_1st_record = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/accordion/div/div[2]/div[2]/div/div/div/vision-data-table/div/div[3]/div[2]/table/tbody/tr[1]/td[5]/span/b");
	
	
	
	
	
		
	public AjsNVDAccountsPage click_accounts_tab() {
		wait_until(6);
		return click_button(accounts_tab);
	}

	

	public AjsNVDAccountsPage verify_company_status_for_second_record(String msg) {
		return verify_element_by_text(company_status_of_second_record, msg);
	}

	public AjsNVDAccountsPage click_incomplete_registered_account_dropdown() {
		wait_until(3);
		return click_link(incomplete_registered_account_dropdown);
	}

	public AjsNVDAccountsPage verify_incomplete_registered_account(String msg) {
		wait_until(4);
		return verify_element_by_text(incomplete_registered_status, msg);
	}

	public AjsNVDAccountsPage click_fail_health_system_dropdown() {
		wait_until(3);
		return click_link(fail_health_system_dropdown);
	}

	public AjsNVDAccountsPage verify_requirement_status(String msg) {
		return verify_element_by_text(requirement_status_fail, msg);
	}

	public AjsNVDAccountsPage click_fail_requirement_status_link() {
		return click_link(requirement_status_fail);
	}

	public AjsNVDAccountsPage click_inactive_accounts_dropdown() {
		wait_until(3);
		return click_link(inactive_accounts_dropdown);
	}

	public AjsNVDAccountsPage click_select_action_dropdown_in_inactive_accounts() {
		wait_until(5);
		return click_link(select_action_dropdown_in_inactive_accounts);
	}

	public AjsNVDAccountsPage verify_activate_account_option(String msg) {
		return verify_element_by_text(activate_account_option, msg);
	}

	public AjsNVDAccountsPage click_account_link(String account_name) {
		wait_until(5);
		return click_link(By.linkText(account_name));
	}

	public AjsNVDAccountsPage verify_account_link(String msg) {
		wait_until(3);
		return verify_element_by_text(account_link, msg);
	}
	
	public AjsNVDAccountsPage verify_st_account_link(String msg) {
		wait_until(3);
		return verify_element_by_text(st_account_link, msg);
	}

	public AjsNVDAccountsPage verify_continue_account(String msg) {
		wait_until(3);
		return verify_element_by_text(continue_account, msg);
	}

	public AjsNVDAccountsPage click_back_to_list() {
		wait_until(5);
		return click_link(back_to_list);
	}

	public AjsNVDAccountsPage click_view_location_link_of_1st_record() {
		wait_until(5);
		return click_link(view_location_link_1st);
	}

	public AjsNVDAccountsPage verify_location_popup(String msg) {
		wait_until(6);
		return verify_element_by_text(location_popup, msg);
	}

	public AjsNVDAccountsPage verify_document_status_of_1st_document(String msg) {
		wait_until(10);
		switch_to_frame(docs_and_policies_iframe_id);
		wait_until(2);
		verify_element_by_text(document_status_of_1st_doc, msg);
		switch_to_root_page();
		return this;

	}

	public AjsNVDAccountsPage click_search_button_in_manage_my_accounts() {
		wait_until(5);
		return click_button(search_button_of_manage_my_accounts);
	}

	
	public AjsNVDAccountsPage enter_account_name_in_textbox(String account) {
		wait_until(4);
		return enter(search_textbox_in_search_for_accounts_accordion, account);
	}

	public AjsNVDAccountsPage click_all_active_accounts_dropdown() {
		wait_until(5);
		return click_button(all_active_accounts_dropdown);
	}

	public AjsNVDAccountsPage verify_state_name_in_text_field_of_search_for_accounts_tab(
			String msg) {
		wait_until(3);
		return verify_element_by_text(text_field_in_search_for_accounts_tab,
				msg);
	}

	public AjsNVDAccountsPage verify_registration_URL_in_account_details(String msg) {
		wait_until(10);
		switch_to_frame(accounts_detail_iframe_id);
		wait_until(2);
		verify_element_by_text(registration_url_in_account_details, msg);
		switch_to_root_page();
		return this;
	}

	public AjsNVDAccountsPage verify_renewal_date_in_1st_row(String msg) {
		wait_until(3);
		return verify_element_by_text(renewal_date_1st_row, msg);
	}

	public AjsNVDAccountsPage verify_renewal_date_in_2nd_row(String msg) {
		wait_until(3);
		return verify_element_by_text(renewal_date_2nd_row, msg);
	}

	public AjsNVDAccountsPage verify_renewal_date_in_3rd_row(String msg) {
		wait_until(3);
		return verify_element_by_text(renewal_date_3rd_row, msg);
	}

	public AjsNVDAccountsPage verify_in_manage_my_accounts_rearch_result_contains(
			String msg) {
		wait_until(3);
		return verify_element_by_text(renewal_date_3rd_row, msg);

	}

	public AjsNVDAccountsPage verify_renewal_date_not_present(String text) {

		/*String txt = find_element_text(verify_renewal_column_text);
		boolean result = txt.equals("Renewal Date");
		if (result == true)
			Assert.fail("Element Present on the Page");*/
		
		try {
			verify_element_by_text(verify_renewal_column_text, text);
			Assert.fail("Element Present on the Page");
		} catch (Exception e) {
		}
		return this;
	}

	public AjsNVDAccountsPage click_select_action_of_2nd_row_in_all_active_accounts() {
		wait_until(5);
		return click_button(select_2ndrow_action_dropdown_in_Manage_my_accounts);
	}

	public AjsNVDAccountsPage click_inactivate_account_option() {
		wait_until(5);
		return click_link(Inactivate_option_of_2ndrow_in_all_Active_accounts);
	}

	public AjsNVDAccountsPage click_yes_button_on_activate_or_inactivate_account_popup() {
		wait_until(5);
		return click_button(yes_button_on_activate_inactivate_account_popup);
	}

	public AjsNVDAccountsPage click_select_action_of_1st_row_in_inactive_accounts() {
		wait_until(5);
		return click_button(select_1strow_action_dropdown_in_Manage_my_accounts);
	}

	public AjsNVDAccountsPage click_activate_account_option() {
		wait_until(5);
		return click_link(Inactivate_option_of_1strow_in_inactive_accounts);
	}

	public AjsNVDAccountsPage switch_to_docs_and_policies_iframe() {
		return switch_to_frame("repAccountInfo");
	}
	
	
	//Docs & policies Upload-----------------------------------------------
	
	
	// verify_requirement_status_of_1st_record
	public AjsNVDAccountsPage verify_requirement_status_of_1st_record(String msg) {
		wait_until(5);
		return verify_element_by_text(requirement_status_of_1st_record, msg);
	}
	
	// verify_requirement_status_of_1st_record
		public AjsNVDAccountsPage verify_requirement_status_of_2nd_record(String msg) {
			wait_until(5);
			return verify_element_by_text(requirement_status_of_2nd_record, msg);
		}

	// click_requirement_status_of_1st_record
	public AjsNVDAccountsPage click_requirement_status_of_1st_record() {
		wait_until(5);
		return click_link(requirement_status_of_1st_record);
	}
	
	// click_requirement_status_of_3rd_record
		public AjsNVDAccountsPage click_requirement_status_of_2nd_record() {
			wait_until(5);
			return click_link(requirement_status_of_2nd_record);
		}
	

	// select_upload_option_for_1st_document
	public AjsNVDAccountsPage select_upload_option_for_1st_document() {
		wait_until(7);
		return select_by_name(action_dropdown_of_1st_document, "Upload");
	}

	// select_delete_option_for_1st_document
	public AjsNVDAccountsPage select_delete_option_for_1st_document() {
		wait_until(7);
		return select_by_name(action_dropdown_of_1st_document, "Delete");
	}
	

	// select_upload_option_for_2nd_document
	public AjsNVDAccountsPage select_option_for_8th_document(String option) {
		wait_until(5);
		return select_by_name(action_dropdown_of_8th_document, option);
	}

	// select_upload_option_for_3rd_document
	public AjsNVDAccountsPage select_upload_option_for_3rd_document() {
		wait_until(5);
		return select_by_name(action_dropdown_of_3rd_document, "Upload");
	}

	// select_upload_option_for_3rd_document
	public AjsNVDAccountsPage select_option_for_4th_document(String a) {
		wait_until(5);
		return select_by_name(action_dropdown_of_4th_document, a);
	}

	// select_upload_option_for_3rd_document
		public AjsNVDAccountsPage select_option_for_9th_document(String a) {
			wait_until(5);
			return select_by_name(action_dropdown_of_9th_document, a);
		}
	
	// enter_effective_date
	public AjsNVDAccountsPage enter_effective_date(String effectiveDate) {
		wait_until(2);
		return enter(upload_doc_effective_date, effectiveDate);
	}

	// enter_expiration_date
	public AjsNVDAccountsPage enter_expiration_date(String expirationDate) {
		wait_until(2);
		return enter(upload_doc_expiration_date, expirationDate);
	}

	// browse_button
	public AjsNVDAccountsPage click_browse_button() {
		wait_until(2);
		return click_button(browse_button);
	}

	// click_save_and_continue_button
	public AjsNVDAccountsPage click_save_and_continue_button() {
		wait_until(2);
		return click_button(save_and_continue_button);
	}

	// refresh_manage_accounts_icon
	public AjsNVDAccountsPage click_refresh_manage_accounts_icon() {
		wait_until(2);
		return click_button(refresh_manage_accounts_icon);
	}

	// refresh_requirement_status_icon
	public AjsNVDAccountsPage click_refresh_requirement_status_1st_icon() {
		wait_until(2);
		return click_button(refresh_requirement_status_1st_icon);
	}
	
	// refresh_requirement_status_icon
	public AjsNVDAccountsPage click_refresh_requirement_status_2nd_icon() {
		wait_until(2);
		return click_button(refresh_requirement_status_2nd_icon);
		}

	// continue_button
	public AjsNVDAccountsPage click_continue_button() {
		wait_until(2);
		return click_button(continue_button);
	}

	public AjsNVDAccountsPage click_continue_button_on_autoattach_doc_page() {
		wait_until(2);
		return click_button(continue_button_on_autoattach_doc_page);
	}
	
	
	/**Click 'Confirm delete' button while deleting document from 'Docs & Policies' page
	 * 
	 */
	public AjsNVDAccountsPage click_confirm_delete_button() {
		wait_until(2);
		return click_button(confirm_delete_button);
	}
	
	// Click Close Popup
	public AjsNVDAccountsPage click_close_popup() {
		wait_until(7);
		return click_link(close_popup);
	}
		
	public AjsNVDAccountsPage select_account_status(String status) {
		wait_until(2);
		return select_by_name(account_status_dropdown, status);
	}
	
	public AjsNVDAccountsPage click_help_link_in_manage_my_accounts_tab() {
		wait_until(2);
		return click_link(By.linkText("help"));
	}
	
	public AjsNVDAccountsPage verify_help_popup_in_manage_my_accounts_tab() {
		wait_until(2);
		return verify_element_by_text(help_popup, "PASS");
	}
	
	public AjsNVDAccountsPage enter_account_name(String account) {
		wait_until(5);
		return enter(enter_account_name, account);
	}
	
	
// Search for Accounts Accordion ----------------------------------------------------------------------------------------
	
	//click_search_for_accounts_accordion
	public AjsNVDAccountsPage click_search_for_accounts_accordion() {
		wait_until(2);
		return click_button(search_for_accounts_tab);
	}
	
	//enter_serach_string
	public AjsNVDAccountsPage enter_search_string_in_search_for_accounts_accordion(String string) {
		wait_until(5);
		return enter(enter_search_string, string);
	}
	
	//click_serach_button_in_search_for_accounts_accordion
	public AjsNVDAccountsPage click_serach_button_in_search_for_accounts_accordion() {
		wait_until(5);
		return click_button(search_button);
	}
	
	//select_filter_in_search_for_accounts_accordion
	public AjsNVDAccountsPage select_filter_in_search_for_accounts_accordion(String string) {
		wait_until(5);
		return select_by_name(serach_filter_dropdown, string);
	}
	
	//verify_account_name_of_1st_record
	public AjsNVDAccountsPage verify_account_name_of_1st_record(String account) {
		wait_until(5);
		return verify_element_by_text(health_system_1st_record, account);
	}
	
	//verify_location_of_1st_record
	public AjsNVDAccountsPage verify_location_of_1st_record(String location) {
		wait_until(5);
		return verify_element_by_text(location_1st_record, location);
	}
	
	//verify_city_of_1st_record
	public AjsNVDAccountsPage verify_city_of_1st_record(String city) {
		wait_until(5);
		return verify_element_by_text(city_1st_record, city);
	}
	
	//verify_state_of_1st_record
	public AjsNVDAccountsPage verify_state_of_1st_record(String state) {
		wait_until(5);
		return verify_element_by_text(state_1st_record, state);
	}
	
	
}






