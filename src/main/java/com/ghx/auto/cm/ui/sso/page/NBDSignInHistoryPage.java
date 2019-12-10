package com.ghx.auto.cm.ui.sso.page;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;

import com.ghx.auto.cm.ui.page.CMAbstractPage;

public class NBDSignInHistoryPage extends CMAbstractPage<NBDSignInHistoryPage>{
	 
	 
	//Search Fields ----------------------------------------------------------------------------------------------------
	 private By signInFromDate = By.id("signedInOnLocalFrom_From");
	 private By signInToDate = By.id("signedInOnLocalFrom_To");
	 private By signOutFromDate = By.id("signedOutOnLocalFrom_From");
	 private By signOutToDate = By.id("signedOutOnLocalFrom_To");
	 private By eventType = By.id("requestType");
	 private By repInformation = By.id("userInformation");
	 private By message = By.id("message");
	 private By departmentName = By.id("departmentName");
	 private By signInLocation = By.id("signInLocation");
	 private By signInPointOfEntry = By.id("signInPointOfEntry");
	 private By contact = By.id("contact");
	 private By purposeOfVisit = By.id("purposeOfVisit");
	 private By companyStatus = By.id("companyStatus");
	 private By userStatus = By.id("userStatus");
	 private By signedInBy = By.id("signedInBy");
	 private By rulesEnforced = By.id("rulesEnforced");
	 private By badgePrinted = By.id("badgePrinted");
	 private By actionDropdown = By.id("action");
	 private By badgeRuleExceptions = By.id("badgeRuleExceptions");
	 private By signOutLocation = By.id("signOutLocation");
	 private By signOutPointOfEntry = By.id("signOutPointOfEntry");
	 private By signedOutBy = By.id("signedOutBy");
	 private By group = By.id("group");
	 private By remoteBadgePrintFromDate = By.id("remoteBadgePrintFrom_From");
	 private By remoteBadgePrintToDate = By.id("remoteBadgePrintFrom_To");
	 private By expectedArrivalFromDate = By.id("expectedArrivalFrom_From");
	 private By expectedArrivalToDate = By.id("expectedArrivalFrom_To");
	 private By monthAndYearSelector = By.xpath("//*[contains(@ng-click,'toggleMode()')]");
	 private By badgeIDField = By.xpath(".//*[@id='manageSigninHistory']/div/div[2]/div/table/tbody/tr/td[4]/div/span[1]");
	 private By signOutDateTime = By.xpath(".//*[@id='manageSigninHistory']/div/div[2]/div/table/tbody/tr[1]/td[2]");
	 
	 //Search Result--------------------------------------------------------------------------------------------------
	 
	 private By signInDate1stRecord = By.xpath("//*[contains(@ng-click,'getSignInHistoryDetails(history);')]");
	 private By signOutDate1stRecord = By.xpath("//*[contains(@ng-click,'getSignInHistoryDetails(history);')]");
	 private By eventType1stRecord = By.xpath("//*[contains(@ng-if,'!params.filter().requestType')][1]");
	 private By badgeId = By.xpath("//*[@id='manageSigninHistory']//tr[1]/td[4]/div/span[1]");
	 private By message1stRecord = By.xpath("//*[contains(@ng-if,'!params.filter().requestType')][1]");
	 private By department1stRecord = By.xpath("//*[@id='manageSigninHistory']//div[2]//tr[1]/td[6]/div");
	 private By signInLocation1stRecord = By.xpath("//*[contains(@ng-if,'!params.filter().requestType')][1]");
	 private By signInPoe1stRecord = By.xpath("//*[contains(@ng-if,'!params.filter().requestType')][1]");
	 private By contact1stRecord = By.xpath("//*[@id='manageSigninHistory']//div[2]//tr[1]/td[9]/div");
	 private By purpose1stRecord = By.xpath("//*[@id='manageSigninHistory']//div[2]//tr[1]/td[10]/div");
	 private By guestBadgeMessage= By.xpath("//*[@id='manageSigninHistory']/div/div[2]/div/table/tbody/tr/td[5]/div/a");
	 private By guestBadgePrintReason= By.xpath("//*[@id='manageSigninHistory']/div/div[2]/div/table/tbody/tr/td[17]/div/span");
	  
	 // Sign In history tab locators
	 private By signInHistoryColumnText = By.xpath(".//*[@id='containerFixed']/div[5]/div/div/div[1]/div[2]/div/accordion/div/div[1]/div[1]/h4/a/span/a");
	 private By backToHomeLink = By.id("homeIframeLink");
	 
	 
	 //Todays Date
	 DateFormat dateFormat = new SimpleDateFormat("MM/dd/YYYY hh:mm a");
	 Date date=new Date();
	 private By signInDateAndTime = By.xpath(".//*[@id='manageSigninHistory']/div/div[2]/div/table/tbody/tr[1]/td[1]/a") ;
	 
	 public NBDSignInHistoryPage enter_signin_from_date(String mm, String dd, String yy) {
	  click_button(signInFromDate);
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
	 
	 public NBDSignInHistoryPage enter_signin_to_date(String mm, String dd, String yy) {
	  click_button(signInToDate);
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
	 

	 public NBDSignInHistoryPage enter_signout_from_date(String mm, String dd, String yy) {
	  click_button(signOutFromDate);
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
	 
	 public NBDSignInHistoryPage enter_signout_to_date(String mm, String dd, String yy) {
	  click_button(signOutToDate);
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
	 
	 public NBDSignInHistoryPage select_event_type(String event_type) {
	  return select_by_name(eventType, event_type);
	 }
	 
	 public NBDSignInHistoryPage enter_rep_information(String user_information) {
	  return enter(repInformation, user_information);
	 }
	 
	 public NBDSignInHistoryPage enter_message(String msg) {
	  return enter(message, msg);
	 }
	 
	 public NBDSignInHistoryPage enter_department_name(String department) {
	  return enter(departmentName, department);
	 }
	 
	 public NBDSignInHistoryPage enter_signin_location(String signin_location) {
	  return enter(signInLocation, signin_location);
	 }
	 
	 public NBDSignInHistoryPage enter_signin_poe(String POE) {
	  return enter(signInPointOfEntry, POE);
	 }
	 
	 public NBDSignInHistoryPage enter_contact(String cont) {
	  return enter(contact, cont);
	 }
	 
	 public NBDSignInHistoryPage enter_purpose_of_visit(String subject) {
	  return enter(purposeOfVisit, subject);
	 }
	 
	 public NBDSignInHistoryPage select_company_status(String comp_status) {
	  return select_by_name(companyStatus, comp_status);
	 }
	 
	 public NBDSignInHistoryPage select_user_status(String user_status) {
	  return select_by_name(userStatus, user_status);
	 }
	 
	 public NBDSignInHistoryPage enter_signed_in_by(String signed_in_by) {
	  return enter(signedInBy, signed_in_by);
	 }
	 
	 public NBDSignInHistoryPage select_rules_enforced(String rules_enforced) {
	  return select_by_name(rulesEnforced, rules_enforced);
	 }
	 
	 public NBDSignInHistoryPage select_badge_printed(String badge_printed) {
	  return select_by_name(badgePrinted, badge_printed);
	 }
	 
	 public NBDSignInHistoryPage select_action(String action) {
	  return select_by_name(actionDropdown, action);
	 }
	 
	 public NBDSignInHistoryPage enter_signout_location(String signout_loc) {
	  return enter(signOutLocation, signout_loc);
	 }
	 
	 public NBDSignInHistoryPage enter_signout_poe(String signOut_POE) {
	  return enter(signOutPointOfEntry, signOut_POE);
	 }
	 
	 public NBDSignInHistoryPage enter_signed_out_by(String signed_out_by) {
	  return enter(signedOutBy, signed_out_by);
	 }
	 
	 public NBDSignInHistoryPage enter_group(String enter_group) {
	  return enter(group, enter_group);
	 }
	 
	 public NBDSignInHistoryPage enter_badge_rule_exceptions(String badge_rule_exceptions) {
	  return enter(badgeRuleExceptions, badge_rule_exceptions);
	 }
	 
	 public NBDSignInHistoryPage enter_remote_badge_print_from_date(String mm, String dd, String yy) {
	  click_button(remoteBadgePrintFromDate);
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
	 
	 public NBDSignInHistoryPage enter_remote_badge_print_to_date(String mm, String dd, String yy) {
	  click_button(remoteBadgePrintToDate);
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
	 
	 public NBDSignInHistoryPage enter_expected_arrival_from_date(String mm, String dd, String yy) {
	  click_button(expectedArrivalFromDate);
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
	 
	 public NBDSignInHistoryPage enter_expected_arrival_to_date(String mm, String dd, String yy) {
	  click_button(expectedArrivalToDate);
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
	 
	 public NBDSignInHistoryPage verify_signin_date_1st_record(String mm_dd_yy_time_am) {
	  return verify_element_by_text(signInDate1stRecord, mm_dd_yy_time_am);
	 }
	 
	 public NBDSignInHistoryPage verify_signout_date_1st_record(String mm_dd_yy_time_am) {
	  return verify_element_by_text(signOutDate1stRecord, mm_dd_yy_time_am);
	 }
	 
	 
	 
	 public NBDSignInHistoryPage verify_event_type_1st_record(String event_type) {
	  return verify_element_by_text(eventType1stRecord, event_type);
	 }
	 
	 public NBDSignInHistoryPage verify_badge_id(String badge_id) {
	  return verify_element_by_text(badgeId, badge_id);
	 }
	 
	 public NBDSignInHistoryPage verify_message_1st_record(String message) {
	  return verify_element_by_text(message1stRecord, message);
	 }

	 public NBDSignInHistoryPage verify_department_1st_record(String department) {
	  return verify_element_by_text(department1stRecord, department);
	 }
	 
	 public NBDSignInHistoryPage verify_signin_location_1st_record(String signInLocation) {
	  return verify_element_by_text(signInLocation1stRecord, signInLocation);
	 } 
	 
	 public NBDSignInHistoryPage verify_signin_poe_1st_record(String signInPoe) {
	  return verify_element_by_text(signInPoe1stRecord, signInPoe);
	 } 
	 
	 public NBDSignInHistoryPage verify_contact_1st_record(String contact) {
	  return verify_element_by_text(contact1stRecord, contact);
	 } 
	 
	 public NBDSignInHistoryPage verify_purpose_of_visit_1st_record(String contact) {
	  return verify_element_by_text(purpose1stRecord, contact);
	 }
	 
	 public NBDSignInHistoryPage verify_sign_in_history_column_text(String signInHistory) {
		  return verify_element_by_text(signInHistoryColumnText, signInHistory);
	 }
	 
	 public NBDSignInHistoryPage click_back_to_home_link(){
		 wait_until(1);
		 return click(backToHomeLink);
	 }
	 			//To get Badge Id from Sign In History grid//
	 public String get_badge_id(String Id){
			Id  = find_element_text(badgeIDField);
			return Id;
	}
	
	  public NBDSignInHistoryPage verify_sign_out_date_time(){
		  
		 String DateTime = find_element_text(signOutDateTime);
		 
		  if (DateTime.isEmpty()){	  
			  
			  System.out.println("FAIL");
			  throw new NullPointerException();		
		  }
		  else{
			  System.out.println(DateTime);
		  }
	
		return this;
	  }
	
	  public NBDSignInHistoryPage verify_sign_in_date_and_time(){
		  Calendar cal = Calendar.getInstance();
		  cal.add(Calendar.MINUTE, 5);	
		   System.out.println("to date = " + dateFormat.format(date));
			return verify_element_by_value(signInDateAndTime,dateFormat.format(date));
			
		}
	 
	  public NBDSignInHistoryPage verify_guest_message(String guestMessage) {
		    return verify_element_by_text(guestBadgeMessage, guestMessage);
		   }
		   public NBDSignInHistoryPage verify_guest_badge_print_reason(String guestBadgeReason) {
		    return verify_element_by_text(guestBadgePrintReason, guestBadgeReason);
		   }
	  
}	 
	 