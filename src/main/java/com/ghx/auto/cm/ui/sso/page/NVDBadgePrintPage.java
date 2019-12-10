package com.ghx.auto.cm.ui.sso.page;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;

import com.ghx.auto.cm.ui.page.CMAbstractPage;

public class NVDBadgePrintPage extends CMAbstractPage<NVDBadgePrintPage> {
	
	private By accountDropdown = By.xpath("//*[contains(@name,'account')]");
	private By appointmentsDropdown = By.xpath("//*[contains(@name,'appointments')]");
	private By appointmentsRecord1st = By.xpath(".//*[@id='appointments']/option[2]");
	private By locationDropdown = By.xpath("//*[contains(@name,'location')]");
	private By departmentDropdown = By.xpath("//*[contains(@id,'department')]");
	private By dateOfVisit = By.xpath("//*[contains(@id,'dateOfVisit')]");
	private By timeOfVisit = By.xpath("//*[contains(@name,'timeOfVisit')]");
	private By visitingContact = By.xpath("//*[contains(@name,'visitingContact')]");
	private By contactTitle = By.xpath("//*[contains(@name,'contactTitle')]");
	private By visitDetails = By.xpath("//*[contains(@name,'visitDetails')]");
	private By printBadgeButton = By.xpath("//*[contains(@name,'printBadge')]");
	private By cleardAccessresetIcon = By.xpath("//*[contains(@id,'cleardAccessresetIcon')]");
	private By warningMessage = By.xpath(".//*[@id='containerFixed']/div[4]//div[2]//div[2]//text()");
	
	DateFormat dateFormat = new SimpleDateFormat("MM/dd/YYYY");
	Date date=new Date();

	
	public NVDBadgePrintPage select_option_from_account_dropdown(String account) {
		select_by_name(accountDropdown, account);
		wait_until(2);
		return this;
	}

	public NVDBadgePrintPage select_appointments() {
		click(appointmentsDropdown);
		wait_until(2);
		click(appointmentsRecord1st);
		wait_until(2);
		//select_by_name(appointmentsDropdown, appointment);
		return this;
	}
	
	public NVDBadgePrintPage select_location(String location) {
		click(locationDropdown);
		wait_until(2);
		select_by_name(locationDropdown, location);
		wait_until(1);
		return this;
	}

	
	public NVDBadgePrintPage enter_time_of_visit(String time_of_visit) {
		enter(timeOfVisit, time_of_visit);
		wait_until(2);
		return this;
	}
	
	public NVDBadgePrintPage enter_visit_details(String visit_details) {
		enter(visitDetails, visit_details);
		wait_until(2);
		return this;
	}
	
	public NVDBadgePrintPage click_view_access_status_button() {
		click(cleardAccessresetIcon);
		wait_until(2);
		return this;
	}

	public NVDBadgePrintPage enter_visiting_contact(String visiting_contact) {
		enter(visitingContact, visiting_contact);
		wait_until(2);
		return this;
	}
	
	public NVDBadgePrintPage enter_contact_title(String contact_title) {
		enter(contactTitle, contact_title);
		wait_until(2);
		return this;
	}
	
	public NVDBadgePrintPage select_department(String department) {
		click(departmentDropdown);
		wait_until(2);
		select_by_name(departmentDropdown, department);
		wait_until(1);
		return this;
	}
	
	public NVDBadgePrintPage click_print_badge_button() {
		click(printBadgeButton);
		wait_until(2);
		return this;
	}
	
	
	public NVDBadgePrintPage select_date_of_visit(String todays_dd) {
		click_button(dateOfVisit);
		wait_until(2);
		click(By.xpath("//span[contains(text(),'"+todays_dd+"')][contains(@class,'ng-binding text-info')]"));
		wait_until(2);
		return this;
	}
	
	public NVDBadgePrintPage verify_warning_message(String warn_msg) {
		verify_element_by_text(warningMessage, warn_msg);
		wait_until(2);
		return this;
	}
	/*public NVDBadgePrintPage todays_date(){
		System.out.println("to date = " + dateFormat.format(date));
		//return verify_element_by_value(toDate,dateFormat.format(date));
		
	}*/

}
