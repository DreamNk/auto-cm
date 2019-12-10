package com.ghx.auto.cm.ui.sso.page;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.ghx.auto.cm.ui.page.CMAbstractPage;

public class NBDAppointmentsPage extends CMAbstractPage<NBDAppointmentsPage> {

	// Appointment tab------------------------------------------------------------------------------------
	private By addAppointmentButton = By.xpath("//*[contains(@value,'Add Appointment')]");
	private By appointmentsTabHeading = By.xpath(".//div[@class='panel-heading']/h4/a/span/a");
	private By backToHomeLink = By.id("homeIframeLink");

	// Add appointment section----------------------------------------------------------------------------
	private By LocationDropdown = By.xpath("//*[contains(@id,'locationName')]");
	private By DepartmentDropdown = By.xpath("//*[contains(@id,'departmentName')]");
	private By startDateBox = By.xpath("//*[contains(@id,'startdate')]");
	private By startDateSearchGrid = By.xpath("//*[contains(@id,'startDate')]");
	private By endDateBox = By.xpath("//*[contains(@id,'endDate')]");
	private By startTime = By.xpath("//*[contains(@id,'addAppointmentForm.startTime')]");
	private By endTime = By.xpath("//*[contains(@id,'addAppointmentForm.endTime')]");
	private By subjectTextBox = By.id("subject");
	private By descriptionTextBox = By.xpath("//*[contains(@id,'description')]");
	private By emailSearchbox = By.id("inviteeUserId");
	private By inviteGuestCheckbox = By.xpath("//*[contains(@type,'checkbox')]");
	private By saveAppointmentButton = By.xpath("//*[contains(@id,'saveAppointment')]");
	private By monthAndYearSelector = By.xpath("//*[contains(@ng-click,'toggleMode()')]");
	
	//Appointment Search Grids------------------------------------------------------------------------------
	private By departmentIn1stSearchedRecord = By.xpath("//vision-data-table[@id='appointmentGridList']//tr/td[9]");
	private By departmentIn2ndSearchedRecord = By.xpath("//vision-data-table[@id='appointmentGridList']//tr[2]/td[9]");
	private By departmentIn3rdSearchedRecord = By.xpath("//vision-data-table[@id='appointmentGridList']//tr[3]/td[9]");
	private By subjectIn1stSearchedRecord = By.xpath("//vision-data-table[@id='appointmentGridList']//tr/td[11]");
	private By subjectIn2ndSearchedRecord = By.xpath("//vision-data-table[@id='appointmentGridList']//tr[2]/td[11]");
	private By subjectIn3rdSearchedRecord = By.xpath("//vision-data-table[@id='appointmentGridList']//tr[3]/td[11]");


	// Edit & Delete Appointment----------------------------------------------------------------------------
	private By actionsDropdownOf1stRecord = By.xpath("//vision-data-table[@id='appointmentGridList']//tr/td/select");
	private By actionsDropdownOf2ndRecord = By.xpath("//vision-data-table[@id='appointmentGridList']//tr[2]/td/select");
	private By actionsDropdownOf3rdRecord = By.xpath("//vision-data-table[@id='appointmentGridList']//tr[3]/td/select");
	private By subjectSearchBox = By.xpath("//*[contains(@id,'subject')]");
	private By deleteAppointmentOkbutton = By.xpath("//*[text()='OK']");
	private By noAppointmentErrorMsg = By.xpath("//*[contains(@class,'text-danger ng-binding')]");
	private By recurringAppointmentRadioButton = By.xpath("//*[contains(@value, 'recurring')]");
	private By editAllFutureAppointments = By.xpath("//*[contains(@value, 'All Future Appointments')]");
	private By editFollowingAppointments = By.xpath("//*[contains(@value, 'Following Appointments')]");
	private By editOnlyThisAppointments = By.xpath("//*[contains(@value, 'Only this Appointment')]");
	
	
	//Recurring Appointment setting popup-------------------------------------------------------------------
	private By repeatsDropdown = By.xpath("//*[contains(@name, 'repeats')]");
	private By repeatBy = By.xpath(".//*[contains(@value,'dw')]");
	private By everyDropdownForWeeklyAndWeekdaysOnlyAppoi = By.xpath("//*[contains(@name, 'weekdaysOnly')]");
	private By recurringAppoinmentStartDate = By.xpath("//*[contains(@id, 'recurringStartdate')]");
	private By recurringAppoinmentEndDate = By.xpath("//*[contains(@id, 'recurringEnddate')]");
	private By recurringAppointmentStartTime = By.id("addAppointmentForm.recurringStartTime");
	private By recurringAppointmentEndTime = By.id("addAppointmentForm.recurringEndTime");
	private By sundayCheckBox = By.xpath("//*[contains(@value, 'Sunday')]");
	private By mondayCheckBox = By.xpath("//*[contains(@value, 'Monday')]");
	private By tuesdayCheckBox = By.xpath("//*[contains(@value, 'Tuesday')]");
	private By wednesdayCheckBox = By.xpath("//*[contains(@value, 'Wednesday')]");
	private By thursdayCheckBox = By.xpath("//*[contains(@value, 'Thursday')]");
	private By fridayCheckBox = By.xpath("//*[contains(@value, 'Friday')]");
	private By saturdayCheckBox = By.xpath("//*[contains(@value, 'Saturday')]");
	private By doneButton = By.xpath("//*[text()='Done']");
	
	// Recurring Appointment - Monthly
	private By repeatByCheckBox = By.id("inlineRadio1");
	private By repeatByDay = By.xpath("//*[contains(@ng-model,'recurringAppt.monthDays')]");
	private By repeatByMonth=By.xpath("//*[contains(@ng-model,'recurringAppt.everyMonth')]");
	private By summaryMessageForMonthlyAppt = By.xpath(".//*[@id='ng-app']/body/div[5]/div/div/div/div[2]/form/div/div[5]/label[2]/span[2]");

	private By summaryMessageForYearlyAppt = By.xpath(".//*[@id='ng-app']/body/div[5]/div/div/div/div[2]/form/div/div[5]/label[2]");
	//RIA Manage Appointment Requests tab -----------------------------------------------------------------------
	private By appointmentRequestTab = By.xpath("//*[contains(text(),'Manage Appointment Requests')]");
	private By manageAppointmentRequest = By.xpath("//*[contains(text(),'Manage Appointment Requests')]");
	private By subjectSearchbox = By.xpath("//*[contains(@id,'subject')]");
	private By StatusDropdown = By.xpath("//*[contains(@id,'requestStatus')]");
	private By startDateRIASearchbox = By.xpath("//*[contains(@id,'apptStartTime')]");
	private By endDateRIASearchbox = By.xpath("//*[contains(@id,'apptEndTime')]");
	private By RIAcheckbox = By.xpath("//*[contains(@type,'checkbox')]");
	private By ActionsDropdownInRIA = By.xpath("//*[contains(@ng-model,'selectedStatus')]");
	private By acceptAppointmentRequestYesButton = By.xpath("//*[contains(@data-ng-click,'submit()')]");
	private By subjectInSearchResultRecord1 = By.xpath(".//*[@id='manageSigninHistory']/table/tbody/tr/td[2]/div/a");
	private By companyResultRecord1 = By.xpath(".//*[@id='manageSigninHistory']/table/tbody/tr/td[8]/span/a/div");
	private By departmentResultRecord1 = By.xpath(".//*[@id='manageSigninHistory']/table/tbody/tr/td[11]/div");
	private By locationtSearchbox = By.xpath("//*[contains(@id,'locationName')]");
	// Locators for NBD - Action Drop Down Appointment Request
	private By appointmentRequestTabInActionsDropDown = By.xpath(".//*[@id='navbar-collapse']/ul[2]/li/ul/li[7]/a");
	private By appointmentRequestHeader = By.xpath("//*[contains(text(),'Manage Appointment Requests')]");

	public NBDAppointmentsPage click_appointment_request_tab_in_actions_drop_down() {
		click_button(appointmentRequestTabInActionsDropDown);
		wait_until(1);
		return this;
	}

	public NBDAppointmentsPage verify_appointment_requester_header(String headerText) {
		wait_until(2);
		verify_element_by_text(appointmentRequestHeader, headerText);
		return this;
	}
	
	public NBDAppointmentsPage click_add_appointment_button() {
		click_button(addAppointmentButton);
		wait_until(3);
		return this;
	}

	public NBDAppointmentsPage select_location(String location) {
		select_by_name(LocationDropdown, location);
		wait_until(2);
		return this;
	}

	public NBDAppointmentsPage select_department(String department) {
		select_by_name(DepartmentDropdown, department);
		wait_until(2);
		return this;
	}

	public NBDAppointmentsPage select_start_date(String mm, String dd, String yy) {
		click_button(startDateBox);
		click_button(monthAndYearSelector);
		wait_until(1);
		click_button(monthAndYearSelector);
		wait_until(1);
		click(By.xpath("//*[text()='" + yy + "']/parent::button"));
		wait_until(1);
		// click_button(startDateBox);
		// click_button(monthAndYearSelector);
		wait_until(1);
		click(By.xpath("//*[text()='" + mm + "']/parent::button"));
		wait_until(1);
		click_button(By.xpath("//*[text()='" + dd + "']/parent::button"));
		return this;
	}

	public NBDAppointmentsPage select_end_date(String mm, String dd, String yy) {
		wait_until(1);
		click_button(endDateBox);
		click_button(monthAndYearSelector);
		wait_until(1);
		click_button(monthAndYearSelector);
		wait_until(1);
		click(By.xpath("//*[text()='" + yy + "']/parent::button"));
		wait_until(1);
		// click_button(startDateBox);
		// click_button(monthAndYearSelector);
		wait_until(1);
		click(By.xpath("//*[text()='" + mm + "']/parent::button"));
		wait_until(1);
		click_button(By.xpath("//*[text()='" + dd + "']/parent::button"));
		return this;
	}
	
	public NBDAppointmentsPage select_start_date_in_the_search(String mm, String dd, String yy) {
		click_button(startDateSearchGrid);
		click_button(monthAndYearSelector);
		wait_until(1);
		click_button(monthAndYearSelector);
		wait_until(1);
		click(By.xpath("//*[text()='" + yy + "']/parent::button"));
		wait_until(1);
		// click_button(startDateBox);
		// click_button(monthAndYearSelector);
		wait_until(1);
		click(By.xpath("//*[text()='" + mm + "']/parent::button"));
		wait_until(1);
		click_button(By.xpath("//*[text()='" + dd + "']/parent::button"));
		return this;
	}

	public NBDAppointmentsPage select_one_time_appointment_start_time(String start_time) {
		select_by_name(startTime, start_time);
		wait_until(2);
		return this;
	}

	public NBDAppointmentsPage select_one_time_appointment_end_time(String end_time) {
		select_by_name(endTime, end_time);
		wait_until(2);
		return this;
	}

	public NBDAppointmentsPage enter_appointment_subject(String subject) {
		enter(subjectTextBox, subject);
		return this;
	}

	public NBDAppointmentsPage enter_appointment_description(String description) {
		enter(descriptionTextBox, description);
		wait_until(2);
		return this;
	}

	public NBDAppointmentsPage enter_invite_guest_email_in_searchbox(String email) {
		enter(emailSearchbox, email);
		wait_until(2);
		return this;
	}

	public NBDAppointmentsPage check_invite_guest_checkbox() {
		click(inviteGuestCheckbox);
		wait_until(2);
		return this;
	}

	public NBDAppointmentsPage click_save_appointment() {
		click(saveAppointmentButton);
		wait_until(2);
		return this;
	}	
	
	public NBDAppointmentsPage select_option_from_appointment_actions_of_1st_record(String action) {
		wait_until(2);
		select_by_name(actionsDropdownOf1stRecord, action);
		return this;
	}
	
	public NBDAppointmentsPage select_option_from_appointment_actions_of_2nd_record(String action) {
		wait_until(2);
		select_by_name(actionsDropdownOf2ndRecord, action);
		wait_until(2);
		return this;
	}
	
	public NBDAppointmentsPage select_option_from_appointment_actions_of_3rd_record(String action) {
		select_by_name(actionsDropdownOf3rdRecord, action);
		wait_until(2);
		return this;
	}
	
	public NBDAppointmentsPage search_appointment_subject(String appointment_subject) {
		enter(subjectSearchBox, appointment_subject);
		try {
			Robot robot = new Robot();
			robot.delay(1000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		} catch (Throwable t) {
		}
		return this;
	}
	
	public NBDAppointmentsPage click_ok_button_on_delete_confirmation_popup() {
		click(deleteAppointmentOkbutton);
		return this;
	}

	public NBDAppointmentsPage verify_no_appointment_found_msg(String msg) {
		wait_until(5);
		verify_element_by_text(noAppointmentErrorMsg, msg);
		return this;
	}
	
	public NBDAppointmentsPage click_all_future_appointments_button() {
		wait_until(1);
		click(editAllFutureAppointments);
		wait_until(2);
		return this;
	}
	
	public NBDAppointmentsPage click_following_appointments_button() {
		click(editFollowingAppointments);
		wait_until(2);
		return this;
	}
	
	public NBDAppointmentsPage click_edit_only_this_appointments_button() {
		click(editOnlyThisAppointments);
		wait_until(2);
		return this;
	}
	
	/*public NBDAppointmentsPage click_edit_recurring_appointment_link() {
		click(editRecurringAppointmentlink);
		return this;
	}*/
	
	//Recurring appointment--------------------------------------------------------------------------------------------------
	
	public NBDAppointmentsPage click_recurring_appointment_radio_button() {
		click(recurringAppointmentRadioButton);
		wait_until(2);
		return this;
	}
	
	public NBDAppointmentsPage select_option_from_repeats_dropdown(String appointment_type) {
		select_by_name(repeatsDropdown, appointment_type);
		wait_until(1);
		return this;
	}
	
	public NBDAppointmentsPage select_option_from_every_dropdown(String recurs_every) {
		select_by_value(everyDropdownForWeeklyAndWeekdaysOnlyAppoi, recurs_every);
		wait_until(2);
		return this;
	}
	
	public NBDAppointmentsPage click_done_button() {
		click(doneButton);
		wait_until(2);
		return this;
	}
	
	public NBDAppointmentsPage enter_location_in_RIA_searchbox(String location){
		wait_until(1);
		return enter(locationtSearchbox, location);
	}
	
	// Check Sunday
	public NBDAppointmentsPage check_sunday() {
		boolean ab = is_element_selected(sundayCheckBox);
		if (ab != true)
			click_button(sundayCheckBox);
		return this;
	}

	// Uncheck Sunday
	public NBDAppointmentsPage uncheck_sunday() {
		boolean ab = is_element_selected(sundayCheckBox);
		if (ab == true)
			click_button(sundayCheckBox);
		wait_until(1);
		return this;
	}

	// Check Monday
	public NBDAppointmentsPage check_monday() {
		boolean ab = is_element_selected(mondayCheckBox);
		if (ab != true)
			click_button(mondayCheckBox);
		wait_until(1);
		return this;
	}

	// Uncheck Monday
	public NBDAppointmentsPage uncheck_monday() {
		boolean ab = is_element_selected(mondayCheckBox);
		if (ab == true)
			click_button(mondayCheckBox);
		wait_until(1);
		return this;
	}

	// Check Tuesday
	public NBDAppointmentsPage check_tuesday() {
		boolean ab = is_element_selected(tuesdayCheckBox);
		if (ab != true)
			click_button(tuesdayCheckBox);
		wait_until(1);
		return this;
	}

	// Uncheck Monday
	public NBDAppointmentsPage uncheck_tuesday() {
		boolean ab = is_element_selected(tuesdayCheckBox);
		if (ab == true)
			click_button(tuesdayCheckBox);
		wait_until(1);
		return this;
	}

	// Check Monday
	public NBDAppointmentsPage check_wednesday() {
		boolean ab = is_element_selected(wednesdayCheckBox);
		if (ab != true)
			click_button(wednesdayCheckBox);
		wait_until(1);
		return this;
	}

	// Uncheck Monday
	public NBDAppointmentsPage uncheck_wednesday() {
		boolean ab = is_element_selected(wednesdayCheckBox);
		if (ab == true)
			click_button(wednesdayCheckBox);
		wait_until(1);
		return this;
	}

	// Check Monday
	public NBDAppointmentsPage check_thursday() {
		boolean ab = is_element_selected(thursdayCheckBox);
		if (ab != true)
			click_button(thursdayCheckBox);
		wait_until(1);
		return this;
	}

	// Uncheck Monday
	public NBDAppointmentsPage uncheck_thursday() {
		boolean ab = is_element_selected(thursdayCheckBox);
		if (ab == true)
			click_button(thursdayCheckBox);
		wait_until(1);
		return this;
	}

	// Check Monday
	public NBDAppointmentsPage check_friday() {
		boolean ab = is_element_selected(fridayCheckBox);
		if (ab != true)
			click_button(fridayCheckBox);
		wait_until(1);
		return this;
	}

	// Uncheck Monday
	public NBDAppointmentsPage uncheck_friday() {
		boolean ab = is_element_selected(fridayCheckBox);
		if (ab == true)
			click_button(fridayCheckBox);
		wait_until(1);
		return this;
	}

	// Check Monday
	public NBDAppointmentsPage check_saturday() {
		boolean ab = is_element_selected(saturdayCheckBox);
		if (ab != true)
			click_button(saturdayCheckBox);
		wait_until(1);
		return this;
	}

	// Uncheck Monday
	public NBDAppointmentsPage uncheck_saturday() {
		boolean ab = is_element_selected(saturdayCheckBox);
		if (ab == true)
			click_button(saturdayCheckBox);
		wait_until(1);
		return this;
	}
	
	public NBDAppointmentsPage select_start_date_from_recurring_appointmnet_popup(String mm, String dd, String yy) {
		click_button(recurringAppoinmentStartDate);
		click_button(monthAndYearSelector);
		wait_until(1);
		click_button(monthAndYearSelector);
		wait_until(1);
		click(By.xpath("//*[text()='" + yy + "']/parent::button"));
		wait_until(1);
		wait_until(1);
		click(By.xpath("//*[text()='" + mm + "']/parent::button"));
		wait_until(1);
		click_button(By.xpath("//*[text()='" + dd + "']/parent::button"));
		return this;
	}
	
	public NBDAppointmentsPage click_end_date_from_recurring_appointmnet_popup(String mm, String dd, String yy) {
		click_button(recurringAppoinmentEndDate);
		click_button(monthAndYearSelector);
		wait_until(1);
		click_button(monthAndYearSelector);
		wait_until(1);
		click(By.xpath("//*[text()='" + yy + "']/parent::button"));
		wait_until(1);
		wait_until(1);
		click(By.xpath("//*[text()='" + mm + "']/parent::button"));
		wait_until(1);
		click_button(By.xpath("//*[text()='" + dd + "']/parent::button"));
		return this;
	}
	
	public NBDAppointmentsPage verify_department_in_1st_searched_record(String department) {
		verify_element_by_text(departmentIn1stSearchedRecord, department);
		return this;
	}

	public NBDAppointmentsPage verify_department_in_2nd_searched_record(String department) {
		verify_element_by_text(departmentIn2ndSearchedRecord, department);
		return this;
	}
	
	public NBDAppointmentsPage verify_department_in_3rd_searched_record(String department) {
		verify_element_by_text(departmentIn3rdSearchedRecord, department);
		return this;
	}
	
	public NBDAppointmentsPage verify_subject_in_1st_searched_record(String subject) {
		verify_element_by_text(subjectIn1stSearchedRecord, subject);
		return this;
	}
	
	public NBDAppointmentsPage verify_subject_in_2nd_searched_record(String subject) {
		verify_element_by_text(subjectIn2ndSearchedRecord, subject);
		return this;
	}
	
	public NBDAppointmentsPage verify_subject_in_3rd_searched_record(String subject) {
		verify_element_by_text(subjectIn3rdSearchedRecord, subject);
		return this;
	}
	
	public NBDAppointmentsPage select_recurring_appointment_start_time(String start_time) {
		select_by_name(recurringAppointmentStartTime, start_time);
		wait_until(2);
		return this;
	}

	public NBDAppointmentsPage select_recurring_appointment_end_time(String end_time) {
		select_by_name(recurringAppointmentEndTime, end_time);
		wait_until(2);
		return this;
	}

	public NBDAppointmentsPage verify_appointments_tab_heading(){
		wait_until(1);
		return verify_element_by_text(appointmentsTabHeading, "Appointments");
	}
	public NBDAppointmentsPage click_back_to_home_link(){
		wait_until(1);
		return click_link(backToHomeLink);
	}
	
	public NBDAppointmentsPage click_appointment_request_tab(){
		wait_until(1);
		return click_tab(appointmentRequestTab);
	}
	
	public NBDAppointmentsPage verify_click_appointment_request_text(){
		wait_until(1);
		return verify_element_by_text(appointmentRequestTab,"Appointment Requests");
	}

	//RIA ----------------------------------------------------------------------------------------

	public NBDAppointmentsPage click_manage_appointment_request(){
		wait_until(1);
		return click_tab(manageAppointmentRequest);
	}
	
	public NBDAppointmentsPage enter_subject_in_RIA_searchbox(String subject){
		wait_until(1);
		return enter(subjectSearchbox, subject);
	}
	
	public NBDAppointmentsPage select_option_from_status_dropdown(String subject){
		wait_until(1);
		return select_by_name(StatusDropdown, subject);
	}

	public NBDAppointmentsPage select_start_date_for_RIA_request(String mm, String dd, String yy) {
		click_button(startDateRIASearchbox);
		click_button(monthAndYearSelector);
		wait_until(1);
		click_button(monthAndYearSelector);
		wait_until(1);
		click(By.xpath("//*[text()='" + yy + "']/parent::button"));
		wait_until(1);
		wait_until(1);
		click(By.xpath("//*[text()='" + mm + "']/parent::button"));
		wait_until(1);
		click_button(By.xpath("//*[text()='" + dd + "']/parent::button"));
		return this;
	}
	
	public NBDAppointmentsPage select_end_date_for_RIA_request(String mm, String dd, String yy) {
		click_button(endDateRIASearchbox);
		click_button(monthAndYearSelector);
		wait_until(1);
		click_button(monthAndYearSelector);
		wait_until(1);
		click(By.xpath("//*[text()='" + yy + "']/parent::button"));
		wait_until(1);
		wait_until(1);
		click(By.xpath("//*[text()='" + mm + "']/parent::button"));
		wait_until(1);
		click_button(By.xpath("//*[text()='" + dd + "']/parent::button"));
		return this;
	}
	
	public NBDAppointmentsPage click_checkbox_for_1st_RIA_request(){
		wait_until(1);
		return click(RIAcheckbox);
	}
	
	public NBDAppointmentsPage Select_option_from_RIA_actions_dropdown( String option){
		wait_until(2);
		return select_by_value(ActionsDropdownInRIA, option);
	}
	
	public NBDAppointmentsPage click_yes_on_accept_appointment_popup(){
		wait_until(2);
		return click(acceptAppointmentRequestYesButton);
	}
	
	public NBDAppointmentsPage verify_subject_In_RIA_Search_Result_Record1(String subject){
		wait_until(1);
		return verify_element_by_text(subjectInSearchResultRecord1, subject);
	}
	
	public NBDAppointmentsPage verify_company_name_in_RIA_Search_Result_Record1(String vendor_name){
		wait_until(1);
		return verify_element_by_text(companyResultRecord1, vendor_name);
	}
	
	public NBDAppointmentsPage verify_department_name_in_RIA_search_Result_Record1(String department){
		wait_until(1);
		return verify_element_by_text(departmentResultRecord1, department);
	}
	
	// Monthly appointment Methods
	public NBDAppointmentsPage click_repeat_by_radio_button(){
		wait_until(1);
		return click(repeatBy);
	}
	public NBDAppointmentsPage select_option_from_repeat_by_date_dropdown(String date){
		wait_until(1);
		return select_by_value(repeatByDay,date);
	}
	
	public NBDAppointmentsPage select_option_from_repeat_by_day_dropdown(String month){
		wait_until(1);
		return select_by_value(repeatByMonth,month);
	}
	
	public NBDAppointmentsPage verify_summary_message_for_monthly_appt(String monthlyApp){
		wait_until(1);
		return verify_element_by_text(summaryMessageForMonthlyAppt, monthlyApp);
	}
	
	public NBDAppointmentsPage verify_yearly_summary_message(String yearlyApp){
		wait_until(1);
		return verify_element_by_text(summaryMessageForYearlyAppt, yearlyApp);
	}
	
	
}