package com.ghx.auto.cm.ui.page;

import org.openqa.selenium.By;

public class NVDManageRepsPage extends CMAbstractPage<NVDManageRepsPage>{

	
	private By manage_reps_tab = By.id("manageReps");
	
	//Access Reps Accounts Accordion---------------------------------------------------------------------------------------------------
	
	private By access_reps_account_accordion = By.xpath(".//div[@id='manageRepsAccordionDiv']/ul/li[1]/a");
	private By rep_email_search_in_access_reps_account = By.xpath(".//div[@id='manageRepsSearchContainer']/div[1]/span[2]/input");
	private By search_button_in_access_reps_account = By.xpath(".//div[@id='manageRepsSearchContainer']/div[2]/input");
	private By row_1st_in_user_mail_column = By.xpath(".//div[@id='profilesDiv_Content']/table/tbody[3]/tr/td[4]/div/a");
	private By show_all_radio_button = By.xpath(".//div[@id='manageRepsTab']/div[2]/span/input[2]");
	private By associated_companies_link = By.linkText("Associated Companies"); 
	private By tax_id_in_associated_companies_popup = By.xpath(".//div[@id='associatedCompanyDiv_Content']/table/tbody[3]/tr/td[2]/div");
	private By row_3rd_in_user_mail_column = By.xpath(".//div[@id='allProfilesDiv_Content']/table/tbody[3]/tr[3]/td[4]/div/a");
	
	//Invite Reps Accordion------------------------------------------------------------------------------------------------------------
	
	private By invite_reps_accordion = By.id("ManageRepsAccordion-2-label");
	private By rep_search_dropdown = By.id("inviteRepSearchType");
	private By first_name_in_all_field_dropdown = By.xpath(".//div[@id='existingRepContentDiv']/div[2]/span/select/option[2]");
	private By last_name_in_all_field_dropdown = By.xpath(".//div[@id='existingRepContentDiv']/div[2]/span/select/option[3]");
	private By email_in_all_field_dropdown = By.xpath(".//div[@id='existingRepContentDiv']/div[2]/span/select/option[4]");
	private By search_term_text_field = By.xpath(".//div[@id='existingRepContentDiv']/div[1]/div/div[2]/div/div[1]/input");
	private By row1st_of_first_name_column = By.xpath(".//div[@id='inviteRepAccounts_Content']/table/tbody[3]/tr[1]/td[2]/div");
	private By row1st_of_last_name_column = By.xpath(".//div[@id='inviteRepAccounts_Content']/table/tbody[3]/tr[1]/td[3]/div");
	private By row1st_of_email_column = By.xpath(".//div[@id='inviteRepAccounts_Content']/table/tbody[3]/tr[1]/td[4]/div");
	private By row1st_rep_radio_button = By.xpath(".//div[@id='inviteRepAccounts_Content']/table/tbody[3]/tr/td[1]/div/input");
	private By row2nd_rep_radio_button = By.xpath(".//div[@id='inviteRepAccounts_Content']/table/tbody[3]/tr[2]/td[1]/div/input");
    private By account_checkbox = By.xpath(".//div[@id='inviteRepCustomers_Content']/table/tbody[3]/tr/td[1]/div/input");
	private By add_to_invitee_list_button = By.xpath(".//div[@id='actionListButton']/div/span/input");
	private By rep_email_in_invitee_list = By.xpath(".//div[@id='selectedReps']/table/tbody[3]/tr/td[3]/div");
	private By search_by_account_radio_button = By.id("inviteRepAccountRadio");
	private By cross_button_on_rep_search = By.id("repSearchAutoCompleteResetDiv");
	private By cross_button_on_accounts_search = By.id(".//div[@id='inviteRepCustomerAccountSearch']/div[1]/div/div[2]/img");
	private By account_search_text_box = By.xpath(".//div[@id='inviteRepCustomerAccountSearch']/div[1]/div/div[1]/input");
	private By account_column_in_invite_reps = By.xpath(".//div[@id='inviteRepCustomers_Content']/table/tbody[3]/tr/td[2]/div");
	private By second_account_column_in_invite_reps = By.xpath(".//div[@id='inviteRepCustomers_Content']/table/tbody[3]/tr[2]/td[2]/div");
	
	
	
	//Share Staff Credentials Accordion--------------------------------------------------------------------------------------------------------------------
	
	private By share_staff_credentials_accordion = By.xpath(".//div[@id='manageRepsAccordionDiv']/ul/li[3]/a");
	private By row_2nd_of_share_credentials_column = By.xpath(".//div[@id='autoCompleteGridDiv_Content']/table/tbody[3]/tr[2]/td[5]/div/a");
	private By all_field_dropdown_in_share_staff_credentials = By.xpath(".//div[@id='staffCredentialsTabAutoCompleteInfoDiv']/div/div[2]/span/select");
	private By first_name_search_in_share_staff_credentials = By.xpath(".//div[@id='staffCredentialsTabAutoCompleteInfoDiv']/div/div[2]/span/select/option[2]");
	private By last_name_search_in_share_staff_credentials = By.xpath(".//div[@id='staffCredentialsTabAutoCompleteInfoDiv']/div/div[2]/span/select/option[3]");
	private By email_search_in_share_staff_credentials = By.xpath(".//div[@id='staffCredentialsTabAutoCompleteInfoDiv']/div/div[2]/span/select/option[4]");
	private By professional_title_search_in_share_staff_credentials = By.xpath(".//div[@id='staffCredentialsTabAutoCompleteInfoDiv']/div/div[2]/span/select/option[5]");
	private By search_term_text_box = By.xpath(".//div[@id='staffCredentialsAutoCompleteSearchContainer']/div[1]/div[2]/div/div[1]/input");
	private By row_1st_of_first_name_column = By.xpath(".//div[@id='autoCompleteGridDiv_Content']/table/tbody[3]/tr/td[1]/div");
	private By row_1st_of_last_name_column = By.xpath(".//div[@id='autoCompleteGridDiv_Content']/table/tbody[3]/tr/td[2]/div");
	private By row_1st_of_email_column = By.xpath(".//div[@id='autoCompleteGridDiv_Content']/table/tbody[3]/tr/td[3]/div");
	private By row_1st_of_professional_title_column = By.xpath(".//div[@id='autoCompleteGridDiv_Content']/table/tbody[3]/tr/td[4]/div");
	private By all_field_search_in_share_credentials = By.xpath(".//div[@id='staffCredentialsAutoCompleteSearchContainer']/div[2]/span/select/option[1]");
	private By cross_button_on_search_term = By.id(".//div[@id='staffCredentialsAutoCompleteSearchContainer']/div[1]/div[2]/div/div[2]/img");
	private By row_1st_of_share_credentials_column = By.xpath(".//div[@id='autoCompleteGridDiv']/div[2]/table/tbody[3]/tr/td[5]/div/a");
	
	
	
	
	//Share Credentials Accordion-------------------------------------------------------------------------------------------------------
	
	private By back_to_share_staff_credential = By.linkText("back to Share Staff Credentials");
	private By select_credentials_to_share = By.xpath(".//div[@id='allCredentialsDocuments']/div/span");
	
	//Rep Accounts Details accordion-----------------------------------------------------------------------------------------------------------
	
	private By rep_accounts_details_accordion = By.xpath(".//div[@id='manageRepsAccordionDiv']/ul/li[5]/a");
	private By  access_rep_accounts_link = By.linkText("Access Rep Accounts");
	private By  peer_reps_accounts_details_tab_under_manage_rep_tab = By.xpath(".//div[@id='manageRepsAccountDetailsDiv']/div[3]/ul/li[1]/a/em");
	private By  peer_reps_rep_documents_tab_under_manage_rep_tab = By.xpath(".//div[@id='manageRepsAccountDetailsDiv']/div[3]/ul/li[2]/a/em");
	private By  peer_reps_User_Profile_tab_under_manage_rep_tab = By.xpath(".//div[@id='manageRepsAccountDetailsDiv']/div[3]/ul/li[3]/a/em");
	private By  peer_reps_Company_Profile_tab_under_manage_rep_tab = By.xpath(".//div[@id='manageRepsAccountDetailsDiv']/div[3]/ul/li[4]/a/em");
	private By  peer_reps_cleared_for_access_tab_under_manage_rep_tab = By.xpath(".//div[@id='manageRepsAccountDetailsDiv']/div[3]/ul/li[5]/a/em");
	private By  back_to_list_link = By.linkText("back to list");
	
	
	
	
	public NVDManageRepsPage clickManageRepsTab(){
		wait_until(3);
		return click_button(manage_reps_tab);
    }
	
	public NVDManageRepsPage verify_sharable_document_in_share_credentials_accordion(String msg){
		return verify_element_by_text(select_credentials_to_share, msg);
    }
	
	public NVDManageRepsPage enter_rep_mail_id_in_rep_email_address_text_box_of_access_rep_account_accordion(String msg){
		return enter(rep_email_search_in_access_reps_account, msg);
    }
	
	public NVDManageRepsPage click_search_button_in_access_rep_accounts_accordion(){
		wait_until(3);
		return click_button(search_button_in_access_reps_account);
    }
	
	public NVDManageRepsPage click_cross_button_on_search_term_of_share_credential_accordion(){
		wait_until(3);
		return click_button(cross_button_on_search_term);
    }
	
	
	public NVDManageRepsPage click_1st_record_share_link_in_share_staff_credentials_accordion(){
		wait_until(3);
		return click_button(row_1st_of_share_credentials_column);
    }
	
	
	public NVDManageRepsPage click_all_field_option_from_rep_search_dropdown_in_share_staff_credentials_accordion(){
		wait_until(3);
		return click_button(all_field_search_in_share_credentials);
    }
	
	public NVDManageRepsPage verify_3rd_record_of_user_email_column_in_access_rep_account_accordion(String msg){
		return verify_element_by_text(row_3rd_in_user_mail_column, msg);
    }
	
	public NVDManageRepsPage click_3rd_record_of_user_email_column_in_access_rep_account_accordion(){
		wait_until(3);
		return click_link(row_3rd_in_user_mail_column);
    }
	
	public NVDManageRepsPage verify_1st_record_of_user_email_column_in_access_rep_account_accordion(String msg){
		return verify_element_by_text(row_1st_in_user_mail_column, msg);
    }
	
	public NVDManageRepsPage click_associated_companies_link(){
		wait_until(3);
		return click_link(associated_companies_link);
    }
	
	public NVDManageRepsPage verify_taxID_in_associated_company_popup(String msg){
		return verify_element_by_text(tax_id_in_associated_companies_popup, msg);
    }
	
	public NVDManageRepsPage click_show_all_radio_button_in_access_rep_accounts_accordion(){
		wait_until(3);
		return click_button(show_all_radio_button);
    }
	
	public NVDManageRepsPage click_access_reps_account_accordion(){
		wait_until(3);
		return click_button(access_reps_account_accordion);
    }
	
	public NVDManageRepsPage click_invite_reps_accordion(){
		wait_until(3);
		return click_button(invite_reps_accordion);
    }
	
	public NVDManageRepsPage click_rep_search_dropdown_in_invites_reps(){
		wait_until(3);
		return click_button(rep_search_dropdown);
    }
	
	public NVDManageRepsPage click_first_name_option_from_rep_search_dropdown_in_invites_reps(){
		wait_until(3);
		return select_by_name(rep_search_dropdown, "First Name");
    }
	public NVDManageRepsPage click_last_name_option_from_rep_search_dropdown_in_invites_reps(){
		wait_until(3);
		return select_by_name(rep_search_dropdown, "Last Name");
    }
	public NVDManageRepsPage click_email_option_from_rep_search_dropdown_in_invites_reps(){
		wait_until(3);
		return select_by_name(rep_search_dropdown, "Email");
	}
	
	public NVDManageRepsPage enter_search_string_in_search_term_text_box_of_invite_reps(String msg){
		return enter(search_term_text_field, msg);
	}
	
	public NVDManageRepsPage verify_1st_record_in_first_name_column_of_invite_reps(String msg){
		return verify_element_by_text(row1st_of_first_name_column, msg);
    }
	
	public NVDManageRepsPage verify_1st_record_in_last_name_column_of_invite_reps(String msg){
		return verify_element_by_text(row1st_of_last_name_column, msg);
    }
	
	public NVDManageRepsPage verify_1st_record_in_email_column_of_invite_reps(String msg){
		return verify_element_by_text(row1st_of_email_column, msg);
    }
	
	public NVDManageRepsPage click_1strep_radio_button_in_invites_reps(){
		wait_until(3);
		return click_button(row1st_rep_radio_button);
    }
	
	public NVDManageRepsPage click_2ndrep_radio_button_in_invites_reps(){
		wait_until(3);
		return click_button(row2nd_rep_radio_button);
    }
	
	
	public NVDManageRepsPage click_1st_account_checkbox_in_invites_reps(){
		wait_until(3);
		return click_button(account_checkbox);
    }
	
	public NVDManageRepsPage click_add_to_invitee_list_button_in_invites_reps(){
		wait_until(3);
		return click_button(add_to_invitee_list_button);
    }
	
	public NVDManageRepsPage verify_rep_email_in_invitee_list_of_invite_reps(String msg){
		return verify_element_by_text(rep_email_in_invitee_list, msg);
    }
	
	public NVDManageRepsPage click_search_by_account_radio_button_in_invites_reps(){
		wait_until(3);
		return click_button(search_by_account_radio_button);
    }
	
	public NVDManageRepsPage click_cross_mark_in_rep_search_field_of_invite_reps(){
		wait_until(3);
		return click_button(cross_button_on_rep_search);
    }
	
	public NVDManageRepsPage click_cross_mark_in_accounts_search_field_of_invite_reps(){
		wait_until(3);
		return click_button(cross_button_on_accounts_search);
    }
	
	public NVDManageRepsPage enter_search_string_in_account_search_textbox_of_invite_reps(String msg){
		return enter(account_search_text_box, msg);
	}
	
	public NVDManageRepsPage verify_1st_searched_account_in_invite_reps(String msg){
		return verify_element_by_text(account_column_in_invite_reps, msg);
    }
	
	public NVDManageRepsPage verify_2nd_searched_account_in_invite_reps(String msg){
		return verify_element_by_text(second_account_column_in_invite_reps, msg);
    }
	
	
	public NVDManageRepsPage click_share_staff_credentials_accordion(){
		wait_until(3);
		return click_button(share_staff_credentials_accordion);
    }
	
	public NVDManageRepsPage click_2nd_record_share_link_in_share_staff_credentials_accordion(){
		wait_until(3);
		return click_link(row_2nd_of_share_credentials_column);
    }
	
	public NVDManageRepsPage click_all_field_dropdown_in_share_staff_credentials_accordion(){
		wait_until(3);
		return click_link(all_field_dropdown_in_share_staff_credentials);
    }
	
	public NVDManageRepsPage click_first_name_option_from_rep_search_dropdown_in_share_staff_credentials_accordion(){
		wait_until(3);
		return select_by_name(all_field_dropdown_in_share_staff_credentials, "First Name");
    }
	public NVDManageRepsPage click_last_name_option_from_rep_search_dropdown_in_share_staff_credentials_accordion(){
		wait_until(3);
		return select_by_name(all_field_dropdown_in_share_staff_credentials, "Last Name");
    }
	public NVDManageRepsPage click_email_option_from_rep_search_dropdown_in_share_staff_credentials_accordion(){
		wait_until(3);
		return select_by_name(all_field_dropdown_in_share_staff_credentials, "Email");
    }
	public NVDManageRepsPage click_professional_title_from_rep_search_dropdown_in_share_staff_credentials_accordion(){
		wait_until(3);
		return select_by_name(all_field_dropdown_in_share_staff_credentials, "Professional Title");
    }
	
	public NVDManageRepsPage enter_search_string_in_search_term_textbox_of_share_staff_credentials_accordion(String msg){
		wait_until(3);
		return enter(search_term_text_box, msg);
    }
	
	public NVDManageRepsPage verify_1st_record_of_first_name_column_in_share_staff_credentials_accordion(String msg){
		return verify_element_by_text(row_1st_of_first_name_column, msg);
    }
	
	public NVDManageRepsPage verify_1st_record_of_last_name_column_in_share_staff_credentials_accordion(String msg){
		return verify_element_by_text(row_1st_of_last_name_column, msg);
    }
	
	public NVDManageRepsPage verify_1st_record_of_email_column_in_share_staff_credentials_accordion(String msg){
		wait_until(3);
		return verify_element_by_text(row_1st_of_email_column, msg);
    }
	
	public NVDManageRepsPage verify_1st_record_of_professional_title_column_in_share_staff_credentials_accordion(String msg){
		return verify_element_by_text(row_1st_of_professional_title_column, msg);
    }
	
	public NVDManageRepsPage click_back_to_share_staff_credential_link_in_share_credential_accordion(){
		wait_until(3);
		return click_button(back_to_share_staff_credential);
    }
	
	public NVDManageRepsPage click_back_to_list_link_in_rep_account_details_accordion(){
		wait_until(3);
		return click_button(back_to_list_link);
    }
	
	public NVDManageRepsPage click_access_rep_accounts_link_in_rep_account_details_accordion(){
		wait_until(3);
		return click_link(access_rep_accounts_link);
    }
	
	public NVDManageRepsPage click_rep_accounts_details_accordion_in_rep_account_details_accordion(){
		wait_until(3);
		return click_button(rep_accounts_details_accordion);
    }
	
	public NVDManageRepsPage verify_peer_reps_rep_documents_tab_under_manage_rep_tab(String msg){
		return verify_element_by_text(peer_reps_rep_documents_tab_under_manage_rep_tab, msg);
    }

	public NVDManageRepsPage verify_peer_reps_accounts_details_tab_under_manage_rep_tab(String msg){
		return verify_element_by_text(peer_reps_accounts_details_tab_under_manage_rep_tab, msg);
    }
	
	public NVDManageRepsPage verify_peer_reps_user_profile_tab_under_manage_rep_tab(String msg){
		return verify_element_by_text(peer_reps_User_Profile_tab_under_manage_rep_tab, msg);
    }
	
	public NVDManageRepsPage verify_peer_reps_company_profile_tab_under_manage_rep_tab(String msg){
		return verify_element_by_text(peer_reps_Company_Profile_tab_under_manage_rep_tab, msg);
    }
	
	public NVDManageRepsPage verify_peer_reps_clear_for_access_tab_under_manage_rep_tab(String msg){
		return verify_element_by_text(peer_reps_cleared_for_access_tab_under_manage_rep_tab, msg);
    }
	
	
	
	
	
	
	
	
	
	
	
	
}
