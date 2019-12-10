package com.ghx.auto.cm.ui.sso.page;

import org.openqa.selenium.By;

import com.ghx.auto.cm.ui.page.CMAbstractPage;

public class NVDRequestAppointmentPage extends CMAbstractPage<NVDRequestAppointmentPage>{
	
	
	//Action Dropdown--------------------------------------------------------------------------------------------------
	private By actionDropdown = By.xpath("//*[contains(@class,'glyphicon glyphicon-cog')]");
	
	//One time RIA ----------------------------------------------------------------------------------------------------
	private By accountDropdown = By.xpath("//*[contains(@id,'account')]");
	private By requestStaffDropdown = By.xpath("//*[contains(@id,'requestStaff')]");
	private By locationDropdown = By.xpath("//*[contains(@id,'locationName')]");
	private By departmentDropdown = By.xpath("//*[contains(@id,'departmentName')]");
	private By startDateBox = By.xpath("//*[contains(@id,'startdate')]");
	private By endDateBox = By.xpath("//*[contains(@id,'endDate')]");
	private By startTime = By.xpath("//*[contains(@id,'addAppointmentForm.startTime')]");
	private By endTime = By.xpath("//*[contains(@id,'addAppointmentForm.endTime')]");
	private By subjectTextBox = By.xpath("//*[contains(@id,'subject')]");
	private By descriptionTextBox = By.xpath("//*[contains(@id,'description')]");
	private By sendRequestButton = By.xpath("//*[contains(@id,'saveAppointment')]");
	private By cancel = By.xpath("//*[contains(@id,'cancel')]");
	private By okSuccessButton = By.xpath("//*[contains(@name,'okBtn')]");

	
	//Recurring RIA ---------------------------------------------------------------------------------------------------
	private By recurringAppointmentRadioButton = By.xpath("//*[contains(@value,'recurring')]");
	private By Repeats = By.xpath("//*[contains(@name,'repeats')]");
	private By recStartsDate = By.xpath("//*[contains(@id,'recurringStartdate')]");
	private By recEndDate = By.xpath("//*[contains(@id,'recurringEnddate')]");
	private By doneButton = By.xpath("//*[contains(text(),'Done')]");
	private By monthAndYearSelector = By.xpath("//*[contains(@ng-click,'toggleMode()')]");
	private By sundayCheckBox = By.xpath("//*[contains(@value, 'Sunday')]");
	private By mondayCheckBox = By.xpath("//*[contains(@value, 'Monday')]");
	private By tuesdayCheckBox = By.xpath("//*[contains(@value, 'Tuesday')]");
	private By wednesdayCheckBox = By.xpath("//*[contains(@value, 'Wednesday')]");
	private By thursdayCheckBox = By.xpath("//*[contains(@value, 'Thursday')]");
	private By fridayCheckBox = By.xpath("//*[contains(@value, 'Friday')]");
	private By saturdayCheckBox = By.xpath("//*[contains(@value, 'Saturday')]");
	
	//View Appointment Request search box ----------------------------------------------------------------------------------------
	private By requestStatusDropdown= By.xpath("//*[contains(@name,'requestStatus')]");
	private By subjectSearchTextbox= By.xpath("//*[contains(@id,'subject')]");
	private By accountSearchTextbox = By.xpath("//*[contains(@id,'customerName')]");
	private By appointmentStartTimeSearchField = By.xpath("//*[contains(@id,'apptStartTime')]");
	private By appointmentEndTimeSearchField = By.xpath("//*[contains(@id,'apptEndTime')]");
	private By locationTextBox = By.xpath("//*[contains(@id,'locationName')]");
	//View Appointment Request Result ----------------------------------------------------------------------------------------
	private By accountResult = By.xpath("//*[contains(@sortable,'customerName')]");
	private By departmentResult = By.xpath("//*[contains(@sortable,'departmentName')]");
	private By locationResult = By.xpath("//*[contains(@sortable,'locationName')]");
	private By subjectResult = By.xpath("//*[contains(@sortable,'subject')]");

	
	public NVDRequestAppointmentPage select_an_account(String customer_name) {
		select_by_name(accountDropdown, customer_name);
		wait_until(2);
		return this;
	}

	public NVDRequestAppointmentPage select_requested_staff(String buyer_name) {
		select_by_name(requestStaffDropdown, buyer_name);
		wait_until(2);
		return this;
	}
	
	public NVDRequestAppointmentPage select_location(String location) {
		select_by_name(locationDropdown, location);
		return this;
	}

	public NVDRequestAppointmentPage select_department(String department) {
		select_by_name(departmentDropdown, department);
		return this;
	}
	

	public NVDRequestAppointmentPage select_start_date_for_one_time_appointment(String mm, String dd, String yy) {
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
		wait_until(2);
		click_button(By.xpath("//*[text()='" + dd + "']/parent::button"));
		return this;
	}

	public NVDRequestAppointmentPage select_end_date_for_one_time_appointment(String mm, String dd, String yy) {
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
	
	public NVDRequestAppointmentPage select_one_time_appointment_start_time(String start_time) {
		select_by_name(startTime, start_time);
		return this;
	}

	public NVDRequestAppointmentPage select_one_time_appointment_end_time(String end_time) {
		select_by_name(endTime, end_time);
		return this;
	}

	public NVDRequestAppointmentPage enter_appointment_subject(String subject) {
		enter(subjectTextBox, subject);
		return this;
	}

	public NVDRequestAppointmentPage enter_appointment_description(String description) {
		enter(descriptionTextBox, description);
		return this;
	}
	
	public NVDRequestAppointmentPage enter_appointment_location(String location) {
		enter(locationTextBox, location);
		return this;
	}
	
	public NVDRequestAppointmentPage click_send_appointment_button() {
		click(sendRequestButton);
		return this;
	}

	public NVDRequestAppointmentPage click_actions() {
		click(actionDropdown);
		return this;
	}

	public NVDRequestAppointmentPage click_options_from_action(String link) {
		click( By.linkText(link));
		return this;
	}
	
	public NVDRequestAppointmentPage select_options_from_request_status_dropdown(String status) {
		select_by_name(requestStatusDropdown, status);
		return this;
	}
	
	public NVDRequestAppointmentPage click_cancel_button() {
		click( cancel);
		return this;
	}
	
	public NVDRequestAppointmentPage click_ok_RIA_successfully_created_button() {
		click(okSuccessButton);
		return this;
	}
	
	public NVDRequestAppointmentPage enter_subject_in_searchbox(String subject) {
		enter(subjectSearchTextbox, subject);
		wait_until(2);
		return this;
	}

	public NVDRequestAppointmentPage enter_account_name_in_searchbox(String account) {
		enter(accountSearchTextbox, account);
		wait_until(2);
		return this;
	}
	
	
	public NVDRequestAppointmentPage select_start_date_from_search_field(String mm, String dd, String yy) {
		click_button(appointmentStartTimeSearchField);
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
		wait_until(2);
		return this;
	}

	public NVDRequestAppointmentPage select_end_date_from_search_field(String mm, String dd, String yy) {
		wait_until(1);
		click_button(appointmentEndTimeSearchField);
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
		wait_until(2);
		return this;
	}
	

	public NVDRequestAppointmentPage verify_account_name(String account_name) {
		verify_element_by_text(accountResult, account_name);
		return this;
	}
	
	public NVDRequestAppointmentPage verify_department_name(String department_name) {
		verify_element_by_text(departmentResult, department_name);
		return this;
	}
	
	public NVDRequestAppointmentPage verify_location_name(String location_name) {
		verify_element_by_text(locationResult, location_name);
		return this;
	}
	
	public NVDRequestAppointmentPage verify_subject(String subject) {
		verify_element_by_text(subjectResult, subject);
		return this;
	}
	
	//recurring appoi ---------------------------------------------------------------------------------------
	
	public NVDRequestAppointmentPage click_recurring_appointment_radio_button() {
		click(recurringAppointmentRadioButton);
		return this;
	}
	
	public NVDRequestAppointmentPage select_option_from_repeats_dropdown(String repeats) {
		select_by_name(Repeats, repeats);
		return this;
	}
	
	// Check Sunday
		public NVDRequestAppointmentPage check_sunday() {
			boolean ab = is_element_selected(sundayCheckBox);
			if (ab != true)
				click_button(sundayCheckBox);
			return this;
		}

		// Uncheck Sunday
		public NVDRequestAppointmentPage uncheck_sunday() {
			boolean ab = is_element_selected(sundayCheckBox);
			if (ab == true)
				click_button(sundayCheckBox);
			wait_until(1);
			return this;
		}

		// Check Monday
		public NVDRequestAppointmentPage check_monday() {
			boolean ab = is_element_selected(mondayCheckBox);
			if (ab != true)
				click_button(mondayCheckBox);
			wait_until(1);
			return this;
		}

		// Uncheck Monday
		public NVDRequestAppointmentPage uncheck_monday() {
			boolean ab = is_element_selected(mondayCheckBox);
			if (ab == true)
				click_button(mondayCheckBox);
			wait_until(1);
			return this;
		}

		// Check Tuesday
		public NVDRequestAppointmentPage check_tuesday() {
			boolean ab = is_element_selected(tuesdayCheckBox);
			if (ab != true)
				click_button(tuesdayCheckBox);
			wait_until(1);
			return this;
		}

		// Uncheck Monday
		public NVDRequestAppointmentPage uncheck_tuesday() {
			boolean ab = is_element_selected(tuesdayCheckBox);
			if (ab == true)
				click_button(tuesdayCheckBox);
			wait_until(1);
			return this;
		}

		// Check Monday
		public NVDRequestAppointmentPage check_wednesday() {
			boolean ab = is_element_selected(wednesdayCheckBox);
			if (ab != true)
				click_button(wednesdayCheckBox);
			wait_until(1);
			return this;
		}

		// Uncheck Monday
		public NVDRequestAppointmentPage uncheck_wednesday() {
			boolean ab = is_element_selected(wednesdayCheckBox);
			if (ab == true)
				click_button(wednesdayCheckBox);
			wait_until(1);
			return this;
		}

		// Check Monday
		public NVDRequestAppointmentPage check_thursday() {
			boolean ab = is_element_selected(thursdayCheckBox);
			if (ab != true)
				click_button(thursdayCheckBox);
			wait_until(1);
			return this;
		}

		// Uncheck Monday
		public NVDRequestAppointmentPage uncheck_thursday() {
			boolean ab = is_element_selected(thursdayCheckBox);
			if (ab == true)
				click_button(thursdayCheckBox);
			wait_until(1);
			return this;
		}

		// Check Monday
		public NVDRequestAppointmentPage check_friday() {
			boolean ab = is_element_selected(fridayCheckBox);
			if (ab != true)
				click_button(fridayCheckBox);
			wait_until(1);
			return this;
		}

		// Uncheck Monday
		public NVDRequestAppointmentPage uncheck_friday() {
			boolean ab = is_element_selected(fridayCheckBox);
			if (ab == true)
				click_button(fridayCheckBox);
			wait_until(1);
			return this;
		}

		// Check Monday
		public NVDRequestAppointmentPage check_saturday() {
			boolean ab = is_element_selected(saturdayCheckBox);
			if (ab != true)
				click_button(saturdayCheckBox);
			wait_until(1);
			return this;
		}

		// Uncheck Monday
		public NVDRequestAppointmentPage uncheck_saturday() {
			boolean ab = is_element_selected(saturdayCheckBox);
			if (ab == true)
				click_button(saturdayCheckBox);
			wait_until(1);
			return this;
		}
	
		public NVDRequestAppointmentPage select_start_date_for_recurring_appointment(String mm, String dd, String yy) {
			click_button(recStartsDate);
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
			wait_until(2);
			return this;
		}

		public NVDRequestAppointmentPage select_end_date_for_recurring_appointment(String mm, String dd, String yy) {
			wait_until(1);
			click_button(recEndDate);
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
			wait_until(2);
			return this;
		}
		
		public NVDRequestAppointmentPage click_done_button() {
			click(doneButton);
			return this;
		}
		
		
		
}
