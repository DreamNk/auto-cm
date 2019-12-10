package com.ghx.auto.cm.ui.angularjs.page;

import org.openqa.selenium.By;

import com.ghx.auto.cm.ui.page.CMAbstractPage;
import com.ghx.auto.cm.ui.page.RMNavigationPage;
import com.ghx.auto.cm.ui.angularjs.page.AjsNBDManageUsersPage;


public class AjsNBDManageUsersPage  extends CMAbstractPage <AjsNBDManageUsersPage> {
	private By manageusers_tab = By.id("manageUsers");
	private By first_name_search_field = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/accordion/div/div/div[2]/div/div/div/div/vision-data-table/div[2]/table/thead/tr[2]/th[2]/div/div/div/input");
	private By last_name_search_field = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/accordion/div/div/div[2]/div/div/div/div/vision-data-table/div[2]/table/thead/tr[2]/th[3]/div/div/div/input");
	private By email_search_field = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/accordion/div/div/div[2]/div/div/div/div/vision-data-table/div[2]/table/thead/tr[2]/th[4]/div/div/div/input");
	private By work_phone_search_field = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/accordion/div/div/div[2]/div/div/div/div/vision-data-table/div[2]/table/thead/tr[2]/th[5]/div/div/div/input");
	private By firstname_text = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/accordion/div/div/div[2]/div/div/div/div/vision-data-table/div[2]/table/tbody/tr/td[2]");
	private By lastname_text = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/accordion/div/div/div[2]/div/div/div/div/vision-data-table/div[2]/table/tbody/tr/td[3]");
	private By work_phone_text = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/accordion/div/div/div[2]/div/div/div/div/vision-data-table/div[2]/table/tbody/tr/td[5]");
	private By email_id = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/accordion/div/div/div[2]/div/div/div/div/vision-data-table/div[2]/table/tbody/tr/td[4]/a");
	private By work_phone = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/accordion/div/div/div[2]/div/div/div/div/vision-data-table/div[2]/table/tbody/tr/td[5]");
	private By active_users_filter_button = By.id("loadManageActiveUsersGrid_manageUsersGridContent_dataTableFilterContainer");
	private By inactive_users_filter_button = By.id("loadManageInActiveUsersGrid_manageUsersGridContent_dataTableFilterContainer");
	private By active_users_clear_link = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/accordion/div/div/div[2]/div/div/div/div/vision-data-table/div[1]/div[4]/button[2]");
	private By inactive_users_clear_link = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/accordion/div/div/div[2]/div/div/div/div/vision-data-table/div[1]/div[4]/button[2]");
	private By activeusers_actions_dropdown = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/accordion/div/div/div[2]/div/div/div/div/vision-data-table/div[2]/table/tbody/tr/td[1]/select");
	private By inactivateusers_popup_text = By.xpath("/html/body/div[7]/div/div/div/vision-action/form/div[1]");
	private By close_inactivateusers_popup = By.xpath("/html/body/div[7]/div/div/div/div/button");
	private By create_new_user_button = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/accordion/div/div/div[2]/div/div/div/div/vision-data-table/div[1]/div[4]/button[1]");
	private By create_new_user_form = By.xpath("/html/body/div[7]/div/div/div/div[1]/h3");
	private By close_create_new_user_form = By.xpath("/html/body/div[7]/div/div/div/div[1]/button");
	private By edit_user_form_header_text = By.xpath("/html/body/div[7]/div/div/div/div[1]/h3");
	private By close_edit_user_form = By.xpath("/html/body/div[7]/div/div/div/div[1]/button");
	private By user_status_dropdown = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/accordion/div/div/div[2]/div/div/div/div/vision-data-table/div[1]/div[3]/select");
	private By user_email_id_field = By.xpath("/html/body/div[7]/div/div/div/div[2]/vision-action/form/div[1]/div[1]/div[1]/div/input");
	private By salutation_field = By.name("Salutation");
	private By first_name_field = By.name("organizationFirstName");
	private By middle_name_field = By.name("middleInitial");
	private By last_name_field = By.name("lastName");
	private By title_field = By.name("organizationTitle");
	private By work_phone_field = By.name("phone");
	private By cell_phone_field = By.name("cellPhone");
	private By save_button = By.xpath("/html/body/div[7]/div/div/div/div[2]/vision-action/form/div[2]/button");
	private By cancel_button = By.xpath("/html/body/div[7]/div/div/div/div[2]/vision-action/form/div[2]/a/button");
	
	//Edit Buyer-------------------------------------------------------------------------------------------------
	private By select_action = By.id("Actions");
	private By edit_first_name = By.cssSelector("[ng-model='data.User.firstName']");
	private By edit_middle_name = By.cssSelector("[ng-model='data.User.middleInitial']");
	private By edit_last_name = By.cssSelector("[ng-model='data.User.lastName']");
	private By edit_work_phone = By.cssSelector("[ng-model='data.User.workPhone']");
	private By save_edited_field_button = By.cssSelector("[ng-click='submit()']");
	
	//Inactive buyer---------------------------------------------------------------------------------------------
	private By yes_button_in_inactive_user_popup = By.cssSelector("[class='btn btn-success ng-binding']");	
	private By first_name_text_in_inactive_user = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/accordion/div/div/div[2]/div/div/div/div/vision-data-table/div[2]/table/tbody/tr/td[2]/div");
	private By last_name_text_in_inactive_user = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/accordion/div/div/div[2]/div/div/div/div/vision-data-table/div[2]/table/tbody/tr/td[3]/div");
	private By workphone_text_in_inactive_user = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/accordion/div/div/div[2]/div/div/div/div/vision-data-table/div[2]/table/tbody/tr/td[5]/div");
	private By action_in_manage_staff_inactive_user_filter = By.cssSelector("[ng-model='actions']");	

	
	
	//RM Dashboard locators
	private By click_edit_customer_link = By.linkText("Edit Customer");
	private By enter_customer_name = By.id("namebox");
	private By click_search_button = By.className("vBtnComplete");
	private By click_view_button = By.xpath("/html/body/form/table/tbody/tr/td/table/tbody/tr/td[3]/table/tbody/tr[2]/td/table/tbody/tr[5]/td/table/tbody/tr[1]/td[1]/input[1]");
	private By click_delete_buyer_button = By.name("_eventId_deleteBuyer");
	private By buyer_search_field = By.name("searchString");
	private By buyer_search_button = By.name("_eventId_searchResults");
	private By select_buyer = By.name("selectDeleteBuyerOid");
	private By continue_button = By.name("_eventId_continue");
	private By delete_continue_button = By.className("vBtnComplete");
	
	
	// Click manage users tab in NBD
	public AjsNBDManageUsersPage click_manageusers_tab() {
		return click_tab(manageusers_tab);
	}
	
	// enter first name in first name filter field on manage users page
	public AjsNBDManageUsersPage enter_first_name_in_filter_field(String firstname) {
		wait_until(5);
		return enter(first_name_search_field, firstname);
	}
	
	// enter last name in last name filter field on manage users page
	public AjsNBDManageUsersPage enter_last_name_in_filter_field(String lastname) {
		return enter(last_name_search_field, lastname);
	}
	
	// enter emailid in email filter field on manage users page
	public AjsNBDManageUsersPage enter_emailid_in_filter_field(String emailid) {
		return enter( email_search_field ,emailid);
	}
	
	// enter emailid in email filter field on manage users page
	public AjsNBDManageUsersPage enter_work_phone_in_filter_field(String workphone) {
		return enter( work_phone_search_field ,workphone);
	}
	
	// Click filter button in active users grid on  manage users page
	public AjsNBDManageUsersPage click_filter_button() {
		return click_button(active_users_filter_button);

	}
	
	// Click filter button in active users grid on  manage users page
	public AjsNBDManageUsersPage click_inactiveusers_filter_button() {
		return click_button(inactive_users_filter_button);

	}
	
	// Click clear link on active users page on manage users page
	public AjsNBDManageUsersPage click_clear_link() {
		wait_until(3);
		return click_link(active_users_clear_link);

	}
	
	// Click clear link on inactive users page on manage users page
		public AjsNBDManageUsersPage click_clear_link_oninactive_users_page() {
			return click_link(inactive_users_clear_link);

		}
	
	//click create new user button on manage users page
	public AjsNBDManageUsersPage click_create_new_user_button() {
		return click_button(create_new_user_button);

	}
		
	// Select  from actions dropdown  on manage users page
	public AjsNBDManageUsersPage select_from_action_dropdown(String mesg) {
		return select_by_name(activeusers_actions_dropdown, mesg);

	}
		
	// user status dropdown  on manage users page
	public AjsNBDManageUsersPage select_user_status_dropdown(String mesg) {
		return select_by_name(user_status_dropdown, mesg);

	}
	
	// close inactivate users pop up on manage users
	// page
	public AjsNBDManageUsersPage  close_inactivateuser_popup() {
		return click_link(close_inactivateusers_popup);

	}
	
	// close create new user form on manage users
	// page
	public AjsNBDManageUsersPage  close_create_new_user_form() {
		return click_link(close_create_new_user_form);

	}
	
	// close edit user form on manage users
	// page
	public AjsNBDManageUsersPage  close_edit_user_form() {
		return click_link(close_edit_user_form);

	}
	
	// verify 'firstname' text in first name column on manage users
	// page
	public AjsNBDManageUsersPage  verify_first_name_text_in_firstname_column(
			String msg) {
		return verify_element_by_text(firstname_text, msg);

	}
	
	// verify last name text in last name column on manage users
	// page
	public AjsNBDManageUsersPage  verify_last_name_text_in_lastname_column(
			String msg) {
		return verify_element_by_text(lastname_text, msg);

	}
	// verify email id in email column on manage users
	// page
	public AjsNBDManageUsersPage  verify_email_id_in_email_column(
			String msg) {
		return verify_element_by_text(email_id , msg);

	}
	
	// verify work phone in workphone column on manage users
	// page
	public AjsNBDManageUsersPage  verify_work_phone_in_workphone_column(
			String msg) {
		return verify_element_by_text(work_phone, msg);

	}
	
	// verify inactivate users pop up text on manage users
	// page
	public AjsNBDManageUsersPage  verify_inactivateusers_popup_text(
			String msg) {
		return verify_element_by_text(inactivateusers_popup_text, msg);

	}
	
	// verify header text on create new user form text on manage users
	// page
	public AjsNBDManageUsersPage  verify_header_text_on_create_new_user_form(
			String msg) {
		return verify_element_by_text(create_new_user_form, msg);

	}
	
	// verify header text on create new user form text on manage users
	// page
	public AjsNBDManageUsersPage  verify_header_text_on_edit_user_form(
			String msg) {
		return verify_element_by_text(edit_user_form_header_text, msg);

	}
	// enter emailid in email field on create new user form
	public AjsNBDManageUsersPage enter_emailid_in_field(String useremailid) {
		return enter( user_email_id_field ,useremailid);
	}
	
	// enter firstname in first name field on create new user form
	public AjsNBDManageUsersPage enter_firstname_in_field(String firstname) {
		return enter( first_name_field ,firstname);
	}
	
	// enter salutation in salutation field on create new user form
	public AjsNBDManageUsersPage enter_salutation_in_field(String salutation) {
		return enter( salutation_field,salutation);
	}
	
	// enter middlename in middlename field on create new user form
	public AjsNBDManageUsersPage enter_middle_name_in_field(String middlename) {
		return enter( middle_name_field ,middlename);
	}
	
	// enter lastname in lastname field on create new user form
	public AjsNBDManageUsersPage enter_last_name_field_in_field(String lastname) {
		return enter( last_name_field ,lastname);
	}
	
	// enter title in title field on create new user form
	public AjsNBDManageUsersPage enter_title_in_field(String title) {
		return enter( title_field ,title);
	}
	
	// enter workphone in workphone field on create new user form
	public AjsNBDManageUsersPage enter_workphone_in_field(String workphone) {
		return enter( work_phone_field ,workphone);
	}
	
	// enter cellphone in cellphone field on create new user form
	public AjsNBDManageUsersPage enter_cellphone_in_field(String cellphone) {
		return enter( cell_phone_field ,cellphone);
	}
	
	//click save button on  create new user form
	public AjsNBDManageUsersPage click_save_button() {
		return click_button(save_button);

	}
	
	//click cancel button on  create new user form
	public AjsNBDManageUsersPage click_cancel_button() {
		return click_button(cancel_button);

	}
	public AjsNBDManageUsersPage press_enter() {
		AjsCommonUtilities c = new AjsCommonUtilities();
		wait_until(2);
		c.pressEnter();
		wait_until(3);
		return this;
	}
	
	//RM Dashboard - delete buyer methods

	// RM clicks on Edit customer link
	public AjsNBDManageUsersPage click_edit_customer_link(){
		return click_link(click_edit_customer_link);
	}
	
	// RM enters customer name in edit customer search page
	public AjsNBDManageUsersPage enter_customer_name(String customername){
		return enter (enter_customer_name, customername);
}

	// RM clicks on search button
	public AjsNBDManageUsersPage click_search_button(){
		return click_button(click_search_button);
}
	
	public AjsNBDManageUsersPage  Verify_work_phone_text(String work_phone) {
		return verify_element_by_text(work_phone_text, work_phone);

}
	
	
	//Edit Buyer--------------------------------------------------------------------------------------------------------
	
	// select option from Action dropdown
	public AjsNBDManageUsersPage select_action_from_action_dropdown(String option){
		return select_by_name(select_action, option);
}
	//Enter First name
	public AjsNBDManageUsersPage enter_edited_first_name(String first_name){
		return enter (edit_first_name, first_name);
}
	// Enter last name
	public AjsNBDManageUsersPage enter_edited_last_name(String customername){
		return enter (edit_last_name, customername);
}
	// Enter work phone
	public AjsNBDManageUsersPage enter_edited_work_phone(String work_phone){
		return enter (edit_work_phone, work_phone);
}
		
	// Click save button on edit user page
	public AjsNBDManageUsersPage click_save_button_on_edit_user(){
		return click_button(save_edited_field_button);
}

	//Inactive buyer--------------------------------------------------------------------------------------------------
	
	// click_yes_button_in_inactive_user_popup
	public AjsNBDManageUsersPage click_yes_button_in_inactive_user_popup(){
		return click_button(yes_button_in_inactive_user_popup);
}
	//Enter First name
	public AjsNBDManageUsersPage verify__first_name_text_in_inactive_user(String first_name){
		return verify_element_by_text(first_name_text_in_inactive_user, first_name);
}
	// Enter last name
	public AjsNBDManageUsersPage verify_last_name_text_in_inactive_user(String customername){
		return verify_element_by_text(last_name_text_in_inactive_user, customername);
}
	// Enter work phone
	public AjsNBDManageUsersPage verify_workphone_text_in_inactive_user(String work_phone){
		wait_until(5);
		return verify_element_by_text(workphone_text_in_inactive_user, work_phone);

}
	// select action
	public AjsNBDManageUsersPage select_action_in_manage_staff_inactive_user_filter(String option){
		return select_by_name(action_in_manage_staff_inactive_user_filter, option);

}
	
	
}

	

