package com.ghx.auto.cm.ui.page;

import org.openqa.selenium.By;

public class NBDManageUsersPage extends CMAbstractPage <NBDManageUsersPage> {

	private By manageusers_tab = By.xpath(".//div[@id='mainTab']/ul/li[4]/a/em");
	private By first_name_search_field = By.xpath(".//div[@id='manageUsersGridContent_Content']/table/tbody[1]/tr/th[2]/div/span/input");
	private By last_name_search_field = By.id("loadManageActiveUsersGrid_manageUsersGridContent_lastName");
	private By email_search_field = By.id("loadManageActiveUsersGrid_manageUsersGridContent_userId");
	private By work_phone_search_field = By.id("loadManageActiveUsersGrid_manageUsersGridContent_workPhone");
	private By firstname_text = By.xpath(".//div[@id='manageUsersGridContent_Content']/table/tbody[3]/tr/td[2]/div");
	private By lastname_text = By.xpath(".//div[@id='manageUsersGridContent_Content']/table/tbody[3]/tr/td[3]/div");
	private By email_id = By.xpath(".//div[@id='manageUsersGridContent_Content']/table/tbody[3]/tr/td[4]/div/a");
	private By work_phone = By.xpath(".//div[@id='manageUsersGridContent_Content']/table/tbody[3]/tr/td[5]/div");
	private By active_users_filter_button = By.id("loadManageActiveUsersGrid_manageUsersGridContent_dataTableFilterContainer");
	private By inactive_users_filter_button = By.id("loadManageInActiveUsersGrid_manageUsersGridContent_dataTableFilterContainer");
	private By active_users_clear_link = By.id("loadManageActiveUsersGrid_manageUsersGridContent_ClearAnchor");
	private By inactive_users_clear_link = By.id("loadManageInActiveUsersGrid_manageUsersGridContent_ClearAnchor");
	private By activeusers_actions_dropdown = By.xpath(".//div[@id='manageUsersGridContent_Content']/table/tbody[3]/tr[1]/td[1]/div/select");
	private By inactivateusers_popup_text = By.xpath(".//div[@id='commonDialog']/div[2]");
	private By close_inactivateusers_popup = By.xpath(".//div[@id='commonDialog']/a");
	private By create_new_user_button = By.id("confirmSaveSup");
	private By create_new_user_form = By.xpath(".//div[@id='commonDialog_c']/div[1]/div[1]/h3");
	private By close_create_new_user_form = By.xpath(".//div[@id='commonDialog_c']/div[1]/a");
	private By edit_user_form_header_text = By.xpath(".//div[@id='commonDialog_c']/div[1]/div[1]/h3");
	private By close_edit_user_form = By.xpath("//div[@id='commonDialog_c']/div[1]/a");
	private By user_status_dropdown = By.id("manageUsersTypeSelect");
	
	// Click manage users tab in NBD
	public NBDManageUsersPage click_manageusers_tab() {
		return click_tab(manageusers_tab);
	}
	
	// enter first name in first name filter field on manage users page
	public NBDManageUsersPage enter_first_name_in_filter_field(String firstname) {
		return enter(first_name_search_field, firstname);
	}
	
	// enter last name in last name filter field on manage users page
	public NBDManageUsersPage enter_last_name_in_filter_field(String lastname) {
		return enter(last_name_search_field, lastname);
	}
	
	// enter emailid in email filter field on manage users page
	public NBDManageUsersPage enter_emailid_in_filter_field(String emailid) {
		return enter( email_search_field ,emailid);
	}
	
	// enter emailid in email filter field on manage users page
	public NBDManageUsersPage enter_work_phone_in_filter_field(String workphone) {
		return enter( work_phone_search_field ,workphone);
	}
	
	// Click filter button in active users grid on  manage users page
	public NBDManageUsersPage click_filter_button() {
		return click_button(active_users_filter_button);

	}
	
	// Click filter button in active users grid on  manage users page
	public NBDManageUsersPage click_inactiveusers_filter_button() {
		return click_button(inactive_users_filter_button);

	}
	
	// Click clear link on active users page on manage users page
	public NBDManageUsersPage click_clear_link() {
		return click_link(active_users_clear_link);

	}
	
	// Click clear link on inactive users page on manage users page
		public NBDManageUsersPage click_clear_link_oninactive_users_page() {
			return click_link(inactive_users_clear_link);

		}
	
	//click create new user button on manage users page
	public NBDManageUsersPage click_create_new_user_button() {
		return click_button(create_new_user_button);

	}
		
	// Select  from actions dropdown  on manage users page
	public NBDManageUsersPage select_from_action_dropdown(String mesg) {
		return select_by_name(activeusers_actions_dropdown, mesg);

	}
		
	// user status dropdown  on manage users page
	public NBDManageUsersPage user_status_dropdown(String mesg) {
		return select_by_name(user_status_dropdown, mesg);

	}
	
	// close inactivate users pop up on manage users
	// page
	public NBDManageUsersPage  close_inactivateuser_popup() {
		return click_link(close_inactivateusers_popup);

	}
	
	// close create new user form on manage users
	// page
	public NBDManageUsersPage  close_create_new_user_form() {
		return click_link(close_create_new_user_form);

	}
	
	// close edit user form on manage users
	// page
	public NBDManageUsersPage  close_edit_user_form() {
		return click_link(close_edit_user_form);

	}
	
	// verify 'firstname' text in first name column on manage users
	// page
	public NBDManageUsersPage  verify_first_name_text_in_firstname_column(
			String msg) {
		return verify_element_by_text(firstname_text, msg);

	}
	
	// verify last name text in last name column on manage users
	// page
	public NBDManageUsersPage  verify_last_name_text_in_lastname_column(
			String msg) {
		return verify_element_by_text(lastname_text, msg);

	}
	// verify email id in email column on manage users
	// page
	public NBDManageUsersPage  verify_email_id_in_email_column(
			String msg) {
		return verify_element_by_text(email_id , msg);

	}
	
	// verify work phone in workphone column on manage users
	// page
	public NBDManageUsersPage  verify_work_phone_in_workphone_column(
			String msg) {
		return verify_element_by_text(work_phone, msg);

	}
	
	// verify inactivate users pop up text on manage users
	// page
	public NBDManageUsersPage  verify_inactivateusers_popup_text(
			String msg) {
		return verify_element_by_text(inactivateusers_popup_text, msg);

	}
	
	// verify header text on create new user form text on manage users
	// page
	public NBDManageUsersPage  verify_header_text_on_create_new_user_form(
			String msg) {
		return verify_element_by_text(create_new_user_form, msg);

	}
	
	// verify header text on create new user form text on manage users
	// page
	public NBDManageUsersPage  verify_header_text_on_edit_user_form(
			String msg) {
		return verify_element_by_text(edit_user_form_header_text, msg);

		}
}
