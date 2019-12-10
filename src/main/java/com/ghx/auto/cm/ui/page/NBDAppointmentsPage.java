package com.ghx.auto.cm.ui.page;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class NBDAppointmentsPage extends CMAbstractPage<NBDAppointmentsPage> { 

	private By appointment_tab_click = By.xpath(".//div[@id='mainTab']/ul/li[7]/a/em");
	private By click_start_date = By.xpath(".//div[@id='appointmentGrid_Content']/table/tbody[1]/tr/th[2]/div/span/input[1]");
	private By click_end_date = By.xpath(".//div[@id='appointmentGrid_Content']/table/tbody[1]/tr/th[3]/div/span/input[1]");
	private By enter_appt_subject = By.id("loadAppointmentGrid_appointmentGrid_subject");
	private By verify_appt_name_in_search = By.xpath(".//div[@id='appointmentGrid_Content']/table/tbody[3]/tr/td[11]/div");
	private By enter_createdby_id = By.id("loadAppointmentGrid_appointmentGrid_createdBy");
	private By verify_createdby_id = By.xpath(".//div[@id='appointmentGrid_Content']/table/tbody[3]/tr/td[12]/div");
	private By enter_location_name = By.id("loadAppointmentGrid_appointmentGrid_locationForDisplay");
	private By verify_location_name_in_result = By.xpath(".//div[@id='appointmentGrid_Content']/table/tbody[3]/tr/td[10]/div");
	private By enter_department_name = By.id("loadAppointmentGrid_appointmentGrid_departmentForDisplay");
	private By verify_department_name_in_result = By.xpath(".//div[@id='appointmentGrid_Content']/table/tbody[3]/tr/td[9]/div");
	private By enter_staff_name = By.id("loadAppointmentGrid_appointmentGrid_buyersDetailsForDisplay");
	private By verify_staff_name_in_result = By.xpath(".//div[@id='appointmentGrid_Content']/table/tbody[3]/tr/td[8]/div");
	private By enter_email_id = By.id("loadAppointmentGrid_appointmentGrid_repsEmailForDisplay");
	private By verify_email_id = By.xpath(".//div[@id='appointmentGrid_Content']/table/tbody[3]/tr/td[7]/div/a"); 
	private By enter_user_name = By.id("loadAppointmentGrid_appointmentGrid_userForDisplay");
	private By verify_user_name = By.xpath(".//div[@id='appointmentGrid_Content']/table/tbody[3]/tr/td[6]/div/a");
	private By enter_company_name = By.id("loadAppointmentGrid_appointmentGrid_legalName");
	private By verify_company_name = By.xpath(".//div[@id='appointmentGrid_Content']/table/tbody[3]/tr/td[5]/div/a");
	private By click_filter_button = By.id("loadAppointmentGrid_appointmentGrid_dataTableFilterContainer");
	private By click_clear_link = By.id("loadAppointmentGrid_appointmentGrid_ClearAnchor");
	private By select_month = By.id("popupCalContainer_nav_month");
	private By select_year = By.id("popupCalContainer_nav_year");
	private By apptdetails_iframe = By.id("iFrameDetails");
	private By apptdetails_vendorname = By.xpath("./html/body/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/table[1]/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[1]/table/tbody/tr[1]/td/strong");
	private By apptdetails_username = By.xpath("./html/body/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/table[1]/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/table/tbody/tr/td[1]/table/tbody/tr[1]/td/strong"); 
	private By appt_backtolist_link = By.linkText("back to list"); 

//--------------------------------------------------------------------------------------------------------------------------------
	//Add, Update & Delete Appointment
	private By add_appointment_button = By.xpath(".//div[@id='addAppointmentButtonDiv']/span/input");
	private By location_dropdown = By.id("recurringAppointment.recurringAppointmentForm.location");
	private By department_dropdown = By.id("recurringAppointment.recurringAppointmentForm.department");
	private By start_date_calender_of_one_time_appoi = By.id("selectDateShowAddApppointment");
	private By year_dropdown = By.id("popupCalContainer_nav_year");
	private By month_dropdown = By.id("popupCalContainer_nav_month");
	private By end_date_calender_of_one_time_appoi = By.id("endDateShowAddApppointment");
	private By one_time_appointment_start_time = By.id("recurring.addAppointmentForm.startTime");
	private By recurring_appointment_start_time = By.id("recurring.addAppointmentForm.recurringStartTime");
	private By one_time_appointment_end_time = By.id("recurring.addAppointmentForm.endTime");
	private By recurring_appointment_end_time = By.id("recurring.addAppointmentForm.recurringEndTime");
	private By invite_guests_email = By.id("loadInviteListDetails_recurringAppointmentInviteListGridDiv_inviteeUserId");
	private By filter_button = By.id("loadInviteListDetails_recurringAppointmentInviteListGridDiv_dataTableFilterContainer");
	
	private By invitee_checkbox1 = By.xpath(".//div[@id='recurringAppointmentInviteListGridDiv_Content']/table/tbody[3]/tr/td[4]/div/input");
	private By appointment_subject = By.id("recurringAppointment.recurringAppointmentForm.subject");
	private By appointment_description = By.id("recurringAppointment.recurringAppointmentForm.description");
	private By save_appointment_button = By.xpath(".//div[@id='recurringEditButtonDiv']/span/span[1]/input");
	private By select_1st_appoint_record_dropdown = By.xpath(".//div[@id='appointmentGrid_Content']/table/tbody[3]/tr[1]/td[1]/div/select");
	private By select_2nd_appoint_record_dropdown = By.xpath(".//div[@id='appointmentGrid_Content']/table/tbody[3]/tr[2]/td[1]/div/select");

	private By invitee_checkbox3 = By.xpath(".//div[@id='recurringAppointmentInviteListGridDiv_Content']/table/tbody[3]/tr[3]/td[4]/div/input");
	private By view_appointment_tab_header = By.xpath(".//div[@id='recurringAppointmentAccordionDiv']/ul/li/a");
	private By view_appointment_cancel_button = By.xpath(".//div[@id='AppointmentCancelButtonDiv']/span/span/span/input");
	private By appointment_delete_ok_button = By.xpath(".//div[@id='recurringAppointmentDeleteConfButtonDiv']/span/span[1]/input");
	private By appointment_not_found_msg = By.xpath(".//div[@id='appointmentGrid_Content']/table/tbody[2]/tr/td/div/div");
	
	private By recurring_appointment_radio_button = By.id("recurring.addAppointmentForm.recurringAppointment");
	private By every_day_number = By.id("recurring.repetitiveAppointmentFormDialog.everyday");
	private By recurring_month_dropdown = By.id("popupCalendarContainerForDialog_nav_month");
	private By recurring_year_dropdown = By.id("popupCalendarContainerForDialog_nav_year");
	private By done_button_on_recurring_appointment_popup = By.id("recurringAppointmentDialog.saveButton");
	private By type_of_appointment = By.id("recurring.repetitiveAppointmentFormDialog.Repeats");
	private By start_date_calender_of_recurring_appoi = By.id("selectDateShowAddApppointment1");
	private By end_date_calender_of_recurring_appoi = By.id("endDateShowAddApppointment1");
	
	private By delete_all_future_appointment = By.xpath(".//div[@id='deleteApppointmentTypeDiv']/div[2]/div/div[3]/span[1]/input");
	private By delete_following_appointment = By.xpath(".//div[@id='deleteApppointmentTypeDiv']/div[2]/div/div[2]/span[1]/input");
	private By delete_only_this_appointment = By.xpath(".//div[@id='deleteApppointmentTypeDiv']/div[2]/div/div[1]/span[1]/input");
	
	private By edit_all_future_appointment = By.xpath(".//div[@id='apppointmentTypeConfirmDiv']/div[2]/div/div[3]/span[1]/input");
	private By edit_following_appointment = By.xpath(".//div[@id='apppointmentTypeConfirmDiv']/div[2]/div/div[2]/span[1]/input");
	private By edit_only_this_appointment = By.xpath(".//div[@id='apppointmentTypeConfirmDiv']/div[2]/div/div[1]/span[1]/input");
	
	private By select_monday = By.xpath(".//div[@id='recurringAppointmentDialogContent']/form/div[1]/div[7]/div[2]/span[2]/input[1]");
	private By select_tuesday = By.xpath(".//div[@id='recurringAppointmentDialogContent']/form/div[1]/div[7]/div[2]/span[2]/input[2]");
	private By select_wednesday = By.xpath(".//div[@id='recurringAppointmentDialogContent']/form/div[1]/div[7]/div[2]/span[2]/input[3]");
	private By select_thursday = By.xpath(".//div[@id='recurringAppointmentDialogContent']/form/div[1]/div[7]/div[2]/span[2]/input[4]");
	private By select_friday = By.xpath(".//div[@id='recurringAppointmentDialogContent']/form/div[1]/div[7]/div[2]/span[2]/input[5]");
	
	
	
	private By select_sunday_weekly = By.xpath(".//div[@id='weeklyDiv1']/div/span[2]/input[1]");
	private By select_monday_weekly = By.xpath(".//div[@id='weeklyDiv1']/div/span[2]/input[2]");
	private By select_tuesday_weekly = By.xpath(".//div[@id='weeklyDiv1']/div/span[2]/input[3]");
	private By select_wednesday_weekly = By.xpath(".//div[@id='weeklyDiv1']/div/span[2]/input[4]");
	private By select_thursday_weekly = By.xpath(".//div[@id='weeklyDiv1']/div/span[2]/input[5]");
	private By select_friday_weekly = By.xpath(".//div[@id='weeklyDiv1']/div/span[2]/input[6]");
	private By select_saturday_weekly = By.xpath(".//div[@id='weeklyDiv1']/div/span[2]/input[7]");
	
	private By start_date_clear_button = By.id("loadAppointmentGrid_clearButton_startTime");
    private By end_date_clear_button = By.id("loadAppointmentGrid_clearButton_endTime");
	
	
	
	
	
	
		
		
	
	
	
// Appointment Tab in NBD is clicked	
	public NBDAppointmentsPage click_appointment_tab(){
		return click_button(appointment_tab_click);
	}

// Start Date is selected from calendar pop-up
	public NBDAppointmentsPage select_start_date(String month, String date, String year) {
		wait_until(1);
		click_button(click_start_date);
		select_by_name(select_year, year);
		wait_until(2);
		select_by_name(select_month, month);
		wait_until(2);
		click_link(By.linkText(date));
		return this;
	}

	// End Date is selected from calendar pop-up
	public NBDAppointmentsPage select_end_date(String month, String date, String year) {
		wait_until(1);
		click_button(click_end_date);
		select_by_name(select_year, year);
		wait_until(2);
		select_by_name(select_month, month);
		wait_until(2);
		click_link(By.linkText(date));
		return this;
	}

	// Enter appointment subject in search field
	public NBDAppointmentsPage enter_appointment_subject(String subject) {
		return enter(enter_appt_subject, subject);
	}

	// Verify displayed result is matching with entered string
	public NBDAppointmentsPage verify_appointment_name_in_search(String msg) {
		return verify_element_by_text(verify_appt_name_in_search, msg);
	}

	// Created by email-ID is entered in search field of created by
	public NBDAppointmentsPage enter_createdby_id(String subject) {
		return enter(enter_createdby_id, subject);
	}

	// Verify displayed result is matching with entered string of created by
	public NBDAppointmentsPage verify_createdby_id_in_result(String msg) {
		return verify_element_by_text(verify_createdby_id, msg);
	}

	// Enter Location name in location search field
	public NBDAppointmentsPage enter_location_name(String subject) {
		return enter(enter_location_name, subject);
	}

	// Verify displayed result is matching with entered string of location
	public NBDAppointmentsPage verify_location_name_in_result(String msg) {
		return verify_element_by_text(verify_location_name_in_result, msg);
	}

	// Enter Department name in department search field
	public NBDAppointmentsPage enter_department_name(String subject) {
		return enter(enter_department_name, subject);
	}

	// Verify displayed result is matching with entered string of department
	public NBDAppointmentsPage verify_department_name_in_result(String msg) {
		return verify_element_by_text(verify_department_name_in_result, msg);
	}

	// Enter staff name in staff department search field
	public NBDAppointmentsPage enter_staff_name(String subject) {
		return enter(enter_staff_name, subject);
	}

	// Verify displayed result is matching with entered string of staff
	public NBDAppointmentsPage verify_staff_name_in_result(String msg) {
		return verify_element_by_text(verify_staff_name_in_result, msg);
	}

	// Enter Email ID in staff Email search field
	public NBDAppointmentsPage enter_email_ID(String subject) {
		return enter(enter_email_id, subject);
	}

	// Verify displayed result is matching with entered string of E-mail ID
	public NBDAppointmentsPage verify_email_ID(String msg) {
		return verify_element_by_text(verify_email_id, msg);
	}

	// Enter user name in user search field
	public NBDAppointmentsPage enter_user_name(String subject) {
		return enter(enter_user_name, subject);
	}

	// Verify displayed result is matching with entered string of E-mail ID
	public NBDAppointmentsPage verify_user_name(String msg) {
		return verify_element_by_text(verify_user_name, msg);
	}

	// Enter company name in company search field
	public NBDAppointmentsPage enter_company_name(String subject) {
		return enter(enter_company_name, subject);
	}

	// Verify displayed result is matching with entered string of company name
	public NBDAppointmentsPage verify_company_name(String msg) {
		return verify_element_by_text(verify_company_name, msg);
	}

	// Filter button is clicked
	public NBDAppointmentsPage click_filter_button() {
		return click_button(click_filter_button);
	}

	// Company name link is clicked
	public NBDAppointmentsPage click_company_link(String company_name) {
		return click_link(By.linkText(company_name));
	}

	// User name link is clicked
	public NBDAppointmentsPage click_user_link(String user_name) {
		return click_link(By.linkText(user_name));
	}

	// Clear link is clicked
	public NBDAppointmentsPage click_clear_link() {
		return click_link(By.linkText("Clear"));
	}

	// Verify company name in VendorDetails IFrame Section
	public NBDAppointmentsPage verify_apptdetails_vendorname(String msg) {
		wait_until(ExpectedConditions.presenceOfElementLocated(apptdetails_iframe));
		switch_to_frame(apptdetails_iframe);
		return verify_element_by_text(apptdetails_vendorname, msg);
	}

	// Back-to-list link is clicked in Vendor details - Appt details
	public NBDAppointmentsPage click_appt_backtolist_link() {
		switch_to_root_page();
		return click_link(appt_backtolist_link);
	}

	// Verify user name in RepDetails IFrame Section
	public NBDAppointmentsPage verify_apptdetails_username(String msg) {
		wait_until(ExpectedConditions.presenceOfElementLocated(apptdetails_iframe));
		switch_to_frame(apptdetails_iframe);
		return verify_element_by_text(apptdetails_username, msg);
	}

	// --------------------------------------------------------------------------------------------------------------------------------
	// Add, Update & Delete Appointment methods

	// Click 'Add Appointment' button
	public NBDAppointmentsPage click_add_appointment_button() {
		return click_button(add_appointment_button);
	}

	// Click 'Location' dropdown
	public NBDAppointmentsPage select_appointment_location(String loc) {
		return select_by_name(location_dropdown, loc);
	}

	// Click 'Department' dropdown
	public NBDAppointmentsPage select_appointment_department(String loc) {
		return select_by_name(department_dropdown, loc);
	}

	// Enter appointment subject
	public NBDAppointmentsPage enter_appointment_subject_in_add_appointment(String subject) {
		return enter(appointment_subject, subject);
	}

	// Enter appointment Description
	public NBDAppointmentsPage enter_appointment_description_in_add_appointment(String description) {
		return enter(appointment_description, description);
	}

	// Enter invite Guests search string
	public NBDAppointmentsPage enter_invite_guests_search_string(String msg) {
		return enter(invite_guests_email, msg);
	}

	// Click 'Filter' button on add appointment page
	public NBDAppointmentsPage click_filter_button_on_add_appointment() {
		return click_button(filter_button);
	}

	// select start time of one time appointment
	public NBDAppointmentsPage select_appointment_start_time(String time) {
		return select_by_name(one_time_appointment_start_time, time);
	}

	// Click end time for one time appointment
	public NBDAppointmentsPage select_appointment_end_time(String time) {
		return select_by_name(one_time_appointment_end_time, time);
	}

	// select start time of the recurring appointment
	public NBDAppointmentsPage select_recurring_appointment_start_time(	String time) {
		return select_by_name(recurring_appointment_start_time, time);
	}

	// Click end time for recurring appointment
	public NBDAppointmentsPage select_recurring_appointment_end_time(String time) {
		return select_by_name(recurring_appointment_end_time, time);
	}

	// Click Invitee Checkbox
	public NBDAppointmentsPage click_invitee_checkbox1() {
		return click_button(invitee_checkbox1);
	}

	// Click Invitee Checkbox
	public NBDAppointmentsPage click_invitee_checkbox3() {
		return click_button(invitee_checkbox3);
	}

	// Click save appointment button
	public NBDAppointmentsPage click_save_appointment_button() {
		return click_button(save_appointment_button);
	}

	// Click appointment start date
	public NBDAppointmentsPage select_one_time_appointment_start_date(String month, String edited_start_date, String year) {
		click_button(start_date_calender_of_one_time_appoi);
		select_by_name(year_dropdown, year);
		select_by_name(month_dropdown, month);
		click_link(By.linkText(edited_start_date));
		return this;

	}

	// Click appointment end date
	public NBDAppointmentsPage select_one_time_appointment_end_date(String month, String date, String year) {
		click_button(end_date_calender_of_one_time_appoi);
		select_by_value(year_dropdown, year);
		select_by_name(month_dropdown, month);
		click_link(By.linkText(date));
		return this;

	}
	
	
	// Click appointment end date
		public NBDAppointmentsPage select_one_time_appointment_end_date_digit(String date) {
			click_button(end_date_calender_of_one_time_appoi);
			return click_link(By.linkText(date));
		} 
		
		
		
	// Click appointment end date
		public NBDAppointmentsPage select_one_time_appointment_start_date_digit(String date) {
			click_button(start_date_calender_of_one_time_appoi);
			return click_link(By.linkText(date));
		}		


	// Click 'Filter' button on add appointment page
	public NBDAppointmentsPage select_1st_edit_delete_view_appointment(String value) {
		return select_by_name(select_1st_appoint_record_dropdown, value);
	}

	// Click 'Filter' button on add appointment page
	public NBDAppointmentsPage select_2nd_edit_delete_view_appointment(String value) {
		return select_by_name(select_2nd_appoint_record_dropdown, value);
	}

	// Verify View Appointment tab header
	public NBDAppointmentsPage verify_view_appointment_header(String msg) {
		return verify_element_by_text(view_appointment_tab_header, msg);
	}

	// Click Cancel button on the view appointment page
	public NBDAppointmentsPage click_cancel_button_on_view_appointment() {
		return click_button(view_appointment_cancel_button);
	}

	// Click Cancel button on the view appointment page
	public NBDAppointmentsPage click_ok_button_on_delete_appointment_popup() {
		return click_button(appointment_delete_ok_button);
	}

	// Verify appointment not found message
	public NBDAppointmentsPage verify_appointment_not_found_msg(String msg) {
		return verify_element_by_text(appointment_not_found_msg, msg);
	}

	// Click recurring Appointment radio button
	public NBDAppointmentsPage click_recurring_appointment_radio_button() {
		return click_button(recurring_appointment_radio_button);
	}

	// select every day number
	public NBDAppointmentsPage select_occurrence_of_everyday_appointment(String value) {
		return select_by_name(every_day_number, value);
	}

	// Click recurring appointment start date
	public NBDAppointmentsPage select_recurring_appointment_start_date(String month, String date, String year) {
		click_button(start_date_calender_of_recurring_appoi);
		select_by_name(recurring_year_dropdown, year);
		select_by_name(recurring_month_dropdown, month);
		//String dt = Integer.toString(date);
		click_link(By.linkText(date));
		return this;

	}

	// Click recurring appointment end date
	public NBDAppointmentsPage select_recurring_appointment_end_date(String month, String date, String year) {
		click_button(end_date_calender_of_recurring_appoi);
		select_by_name(recurring_year_dropdown, year);
		select_by_name(recurring_month_dropdown, month);
		//String dt = Integer.toString(date);
		click_link(By.linkText(date));
		return this;

	}

	// Click on recurring appointment popup
	public NBDAppointmentsPage click_done_on_recurring_appointment_popup() {
		return click_button(done_button_on_recurring_appointment_popup);
	}

	// Select Appointment type
	public NBDAppointmentsPage select_type_of_appointment(String msg) {
		return select_by_name(type_of_appointment, msg);
	}

	// Click on delete All Future Appointments
	public NBDAppointmentsPage click_on_delete_all_future_appointments() {
		return click_button(delete_all_future_appointment);
	}

	// Click on delete following Appointments
	public NBDAppointmentsPage click_on_delete_following_appointments() {
		return click_button(delete_following_appointment);
	}

	// Click on delete only this Appointments
	public NBDAppointmentsPage click_on_delete_only_this_appointments() {
		return click_button(delete_only_this_appointment);
	}

	// Click on edit All Future Appointments
	public NBDAppointmentsPage click_on_edit_all_future_appointments() {
		return click_button(edit_all_future_appointment);
	}

	// Click on edit following Appointments
	public NBDAppointmentsPage click_on_edit_following_appointments() {
		return click_button(edit_following_appointment);
	}

	// Click on edit only this Appointments
	public NBDAppointmentsPage click_on_edit_only_this_appointments() {
		return click_button(edit_only_this_appointment);

	}


//Check Monday for weekdays Only appointment
public NBDAppointmentsPage select_monday_for_weekdays_only_appointment(){
	boolean ab = is_element_selected(select_monday);
	if (ab != true) 
	click_button(select_monday);
	return this;
}

//Uncheck Monday for weekdays Only appointment
public NBDAppointmentsPage uncheck_monday_for_weekdays_only_appointment(){
	boolean ab = is_element_selected(select_monday);
	if (ab == true) 
	click_button(select_monday);
	return this;
}

//Check Tuesday for weekdays Only appointment
public NBDAppointmentsPage select_tuesday_for_weekdays_only_appointment(){
	boolean ab = is_element_selected(select_tuesday);
	if (ab != true) 
	click_button(select_tuesday);
	return this;
}

//Uncheck Tuesday for weekdays Only appointment
public NBDAppointmentsPage uncheck_tuesday_for_weekdays_only_appointment(){
	boolean ab = is_element_selected(select_tuesday);
	if (ab == true) 
	click_button(select_tuesday);
	return this;
}

//Check Wednesday for weekdays Only appointment
public NBDAppointmentsPage select_wednesday_for_weekdays_only_appointment(){
	boolean ab = is_element_selected(select_wednesday);
	if (ab != true) 
	click_button(select_wednesday);
	return this;
}

//Uncheck Wednesday for weekdays Only appointment
public NBDAppointmentsPage uncheck_wednesday_for_weekdays_only_appointment(){
	boolean ab = is_element_selected(select_wednesday);
	if (ab == true) 
	click_button(select_wednesday);
	return this;
}

//Check Thursday for weekdays Only appointment
public NBDAppointmentsPage select_thursday_for_weekdays_only_appointment(){
	boolean ab = is_element_selected(select_thursday);
	if (ab != true) 
	click_button(select_thursday);
	return this;
}

//Unheck Thursday for weekdays Only appointment
public NBDAppointmentsPage uncheck_thursday_for_weekdays_only_appointment(){
	boolean ab = is_element_selected(select_thursday);
	if (ab == true) 
	click_button(select_thursday);
	return this;
}

//Check Friday for weekdays Only appointment
public NBDAppointmentsPage select_friday_for_weekdays_only_appointment(){
	boolean ab = is_element_selected(select_friday);
	if (ab != true) 
	click_button(select_friday);
	return this;
}

//Uncheck Friday for weekdays Only appointment
public NBDAppointmentsPage uncheck_friday_for_weekdays_only_appointment(){
	boolean ab = is_element_selected(select_friday);
	if (ab == true) 
	click_button(select_friday);
	return this;
}

//Check Saturday for weekly appointment
public NBDAppointmentsPage select_saturday_for_weekly_appointment(){
	boolean ab = is_element_selected(select_saturday_weekly);
	if (ab != true) 
	click_button(select_saturday_weekly);
	return this;
}

//Uncheck Saturday for weekly appointment
public NBDAppointmentsPage uncheck_saturday_for_weekly_appointment(){
	boolean ab = is_element_selected(select_saturday_weekly);
	if (ab == true) 
	click_button(select_saturday_weekly);
	return this;
}

//Check Sunday for weekly appointment
public NBDAppointmentsPage select_sunday_for_weekly_appointment(){
	boolean ab = is_element_selected(select_sunday_weekly);
	if (ab != true) 
	click_button(select_sunday_weekly);
	return this;
}

//Uncheck Sunday for weekly appointment
public NBDAppointmentsPage uncheck_sunday_for_weekly_appointment(){
	boolean ab = is_element_selected(select_sunday_weekly);
	if (ab == true) 
	click_button(select_sunday_weekly);
	return this;
}



//Check Monday for weekly appointment
public NBDAppointmentsPage select_monday_for_weekly_appointment(){
	boolean ab = is_element_selected(select_monday_weekly);
	if (ab != true) 
	click_button(select_monday_weekly);
	return this;
}

//Uncheck Monday for weekly appointment
public NBDAppointmentsPage uncheck_monday_for_weekly_appointment(){
	boolean ab = is_element_selected(select_monday_weekly);
	if (ab == true) 
	click_button(select_monday_weekly);
	return this;
}

//Check Tuesday for weekly appointment
public NBDAppointmentsPage select_tuesday_for_weekly_appointment(){
	boolean ab = is_element_selected(select_tuesday_weekly);
	if (ab != true) 
	click_button(select_tuesday_weekly);
	return this;
}

//Uncheck Tuesday for weekly appointment
public NBDAppointmentsPage uncheck_tuesday_for_weekly_appointment(){
	boolean ab = is_element_selected(select_tuesday_weekly);
	if (ab == true) 
	click_button(select_tuesday_weekly);
	return this;
}

//Check Wednesday for weekly appointment
public NBDAppointmentsPage select_wednesday_for_weekly_appointment(){
	boolean ab = is_element_selected(select_wednesday_weekly);
	if (ab != true) 
	click_button(select_wednesday_weekly);
	return this;
}

//Uncheck Wednesday for weekly appointment
public NBDAppointmentsPage uncheck_wednesday_for_weekly_appointment(){
	boolean ab = is_element_selected(select_wednesday_weekly);
	if (ab == true) 
	click_button(select_wednesday_weekly);
	return this;
}

//Check Thursday for weekly appointment
public NBDAppointmentsPage select_thursday_for_weekly_appointment(){
	boolean ab = is_element_selected(select_thursday_weekly);
	if (ab != true) 
	click_button(select_thursday_weekly);
	return this;
}

//Uncheck Thursday for weekly appointment
public NBDAppointmentsPage uncheck_thursday_for_weekly_appointment(){
	boolean ab = is_element_selected(select_thursday_weekly);
	if (ab == true) 
	click_button(select_thursday_weekly);
	return this;
}

//Check Friday for weekly appointment
public NBDAppointmentsPage select_friday_for_weekly_appointment(){
	boolean ab = is_element_selected(select_friday_weekly);
	if (ab != true) 
	click_button(select_friday_weekly);
	return this;
}

//Uncheck Friday for weekly appointment
public NBDAppointmentsPage uncheck_friday_for_weekly_appointment(){
	boolean ab = is_element_selected(select_friday_weekly);
	if (ab == true) 
	click_button(select_friday_weekly);
	return this;
}

//Click start date clear button
public NBDAppointmentsPage click_start_date_clear_button() {
	return click_button(start_date_clear_button);
}

//Click end date clear button
public NBDAppointmentsPage click_end_date_clear_button() {
	return click_button(end_date_clear_button);
}

}
