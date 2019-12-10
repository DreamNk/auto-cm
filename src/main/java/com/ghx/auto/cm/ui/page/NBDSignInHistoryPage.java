package com.ghx.auto.cm.ui.page;

import org.openqa.selenium.By;

public class NBDSignInHistoryPage extends CMAbstractPage <NBDSignInHistoryPage> {
	
	
	
	private By from_signin_date_field = By.id("loadSignInSignOutGrid_filterFromDate_signedInOnLocalForDisplay");
	private By to_signin_date_field = By.id("loadSignInSignOutGrid_filterToDate_signedInOnLocalForDisplay");
	private By select_from_date = By.xpath(".//div[@id='popupCalContainer']/table/tbody/tr[1]/td[4]/a");
	private By select_to_date = By.xpath(".//div[@id='popupCalContainer']/table/tbody/tr[3]/td[4]/a");
	private By filter_button = By.id("loadSignInSignOutGrid_SignInSignOutLogGrid_dataTableFilterContainer");
	private By signin_history_tab = By.xpath(".//div[@id='mainTab']/ul/li[6]/a/em");
	private By signin_column_text = By.xpath(".//div[@id='SignInSignOutLogGrid_Content']/div[3]/table/tbody[3]/tr/td[1]/div/a");
	private By clear_link = By.id("loadSignInSignOutGrid_SignInSignOutLogGrid_ClearAnchor");
	private By event_type_all_text = By.xpath(".//div[@id='SignInSignOutLogGrid_Content']/div[3]/table/tbody[3]/tr[1]/td[3]/div");
	private By click_event_type_dropdown = By.id("loadSignInSignOutGrid_SignInSignOutLogGrid_signInLocalBadgeType");
	private By event_type_printed_on_site_text = By.xpath(".//div[@id='SignInSignOutLogGrid_Content']/div[3]/table/tbody[3]/tr/td[3]/div");
	private By event_type_printed_remotely_text = By.xpath(".//div[@id='SignInSignOutLogGrid_Content']/div[3]/table/tbody[3]/tr/td[3]/div");
	private By user_information_filter_field = By.id("loadSignInSignOutGrid_SignInSignOutLogGrid_userInformation");
	private By user_information_rep_name_text = By.xpath(".//div[@id='SignInSignOutLogGrid_Content']/div[3]/table/tbody[3]/tr/td[4]/div/a[1]");
 	private By message_filter_field = By.id("loadSignInSignOutGrid_SignInSignOutLogGrid_message");
 	private By message_text = By.xpath(".//div[@id='SignInSignOutLogGrid_Content']/div[3]/table/tbody[3]/tr/td[5]/div/a");
 	private By select_month = By.id("popupCalContainer_nav_month");
 	private By dept_filter_field = By.id("loadSignInSignOutGrid_SignInSignOutLogGrid_departmentForDisplay");
 	private By dept_name_text = By.xpath(".//div[@id='SignInSignOutLogGrid_Content']/div[3]/table/tbody[3]/tr/td[6]/div");
 	private By signin_loc_field = By.id("loadSignInSignOutGrid_SignInSignOutLogGrid_locationForDisplay");
 	private By signin_loc_text = By.xpath(".//div[@id='SignInSignOutLogGrid_Content']/div[3]/table/tbody[3]/tr[1]/td[7]/div");
 	private By signin_poe_filter_field = By.id("loadSignInSignOutGrid_SignInSignOutLogGrid_poeForDisplay");
 	private By signin_poe_text = By.xpath(".//div[@id='SignInSignOutLogGrid_Content']/div[3]/table/tbody[3]/tr[1]/td[8]/div");
 	private By contact_field = By.id("loadSignInSignOutGrid_SignInSignOutLogGrid_personVisiting");
 	private By contact_text = By.xpath(".//div[@id='SignInSignOutLogGrid_Content']/div[3]/table/tbody[3]/tr[1]/td[9]/div");
 	private By purpose_of_visit_field = By.id("loadSignInSignOutGrid_SignInSignOutLogGrid_purposeOfVisit");
 	private By purpose_pf_visit_text = By.xpath(".//div[@id='SignInSignOutLogGrid_Content']/div[3]/table/tbody[3]/tr/td[10]/div");
    private By company_status_dropdown = By.id("loadSignInSignOutGrid_SignInSignOutLogGrid_vcStatusForDisplay");
    private By unregistered_text = By.xpath(".//div[@id='SignInSignOutLogGrid_Content']/div[3]/table/tbody[3]/tr[1]/td[11]/div");
    private By registered_text = By.xpath(".//div[@id='SignInSignOutLogGrid_Content']/div[3]/table/tbody[3]/tr[2]/td[11]/div");
    private By signed_by_field = By.id("loadSignInSignOutGrid_SignInSignOutLogGrid_taskPerformedBy");
    private By signed_in_by_text = By.xpath(".//div[@id='SignInSignOutLogGrid_Content']/div[3]/table/tbody[3]/tr[1]/td[13]/div/a");
    private By rules_enforced_dropdown = By.id("loadSignInSignOutGrid_SignInSignOutLogGrid_overrideRulesForDisplay");
    private By rules_enforced_false_text = By.xpath(".//div[@id='SignInSignOutLogGrid_Content']/div[3]/table/tbody[3]/tr[1]/td[14]/div");
    private By rules_enforced_true_text = By.xpath(".//div[@id='SignInSignOutLogGrid_Content']/div[3]/table/tbody[3]/tr[2]/td[15]/div");
    private By badge_printed_dropdown = By.id("loadSignInSignOutGrid_SignInSignOutLogGrid_badgePrintStatusCodeForDisplay");
    private By true_text = By.xpath(".//div[@id='SignInSignOutLogGrid_Content']/div[3]/table/tbody[3]/tr[2]/td[15]/div");
    private By false_text = By.xpath(".//div[@id='SignInSignOutLogGrid_Content']/div[3]/table/tbody[3]/tr[1]/td[15]/div");
    private By action_dropdown = By.id("loadSignInSignOutGrid_SignInSignOutLogGrid_badgePrintStatusDesc");
    private By printed_text = By.xpath(".//div[@id='SignInSignOutLogGrid_Content']/div[3]/table/tbody[3]/tr[1]/td[16]/div");
    private By printed_with_warning_text = By.xpath(".//div[@id='SignInSignOutLogGrid_Content']/div[3]/table/tbody[3]/tr[1]/td[16]/div");
    private By rejected_text = By.xpath(".//div[@id='SignInSignOutLogGrid_Content']/div[3]/table/tbody[3]/tr/td[16]/div");
    private By year_dropdown = By.id("popupCalContainer_nav_year");
    private By message_text_in_second_row = By.xpath(".//div[@id='SignInSignOutLogGrid_Content']/table/tbody[3]/tr[2]/td[5]/div/a");
    private By badge_exception_field = By.id("loadSignInSignOutGrid_SignInSignOutLogGrid_overrideRulesReason");
    private By sign_out_location = By.id("loadSignInSignOutGrid_SignInSignOutLogGrid_signoutLocationName");
    private By sign_out_poe = By.id("loadSignInSignOutGrid_SignInSignOutLogGrid_signoutPoeName");
    private By signed_out_by = By.id("loadSignInSignOutGrid_SignInSignOutLogGrid_signedOutBy");
    private By group_field = By.id("loadSignInSignOutGrid_SignInSignOutLogGrid_groupForDisplay");
    private By sign_out_loc_text = By.xpath(".//div[@id='SignInSignOutLogGrid_Content']/div[3]/table/tbody[3]/tr/td[18]/div");
    private By sign_out_poe_text = By.xpath(".//div[@id='SignInSignOutLogGrid_Content']/div[3]/table/tbody[3]/tr/td[19]/div");
    private By signed_out_by_text = By.xpath(".//div[@id='SignInSignOutLogGrid_Content']/div[3]/table/tbody[3]/tr/td[20]/div/a");
    private By group_text = By.xpath(".//div[@id='SignInSignOutLogGrid_Content']/div[3]/table/tbody[3]/tr/td[21]/div");
    private By badge_rule_exception_text = By.xpath(".//div[@id='SignInSignOutLogGrid_Content']/div[3]/table/tbody[3]/tr/td[17]/div");
    private By remote_badge_print_from_date_field = By.id("loadSignInSignOutGrid_filterFromDate_badgePrintedOnLocal");
	private By remote_badge_print_to_date_field = By.id("loadSignInSignOutGrid_filterToDate_badgePrintedOnLocal");
	private By remote_badge_date_text = By.xpath(".//div[@id='SignInSignOutLogGrid_Content']/div[3]/table/tbody[3]/tr/td[22]/div/a");
	private By arrival_from_date_field = By.id("loadSignInSignOutGrid_filterFromDate_expectedArrivalForDisplay");
	private By arrival_to_date_field = By.id("loadSignInSignOutGrid_filterToDate_expectedArrivalForDisplay");
	private By arrival_date_text = By.xpath(".//div[@id='SignInSignOutLogGrid_Content']/div[3]/table/tbody[3]/tr/td[23]/div");
	private By click_signin_from_date = By.id("loadSignInSignOutGrid_filterFromDate_signedInOnLocalForDisplay");
	private By click_signin_to_date = By.id("loadSignInSignOutGrid_filterToDate_signedInOnLocalForDisplay");
	private By select_year = By.id("popupCalContainer_nav_year");
	
	
	// Click sign in history tab in NBD
	public NBDSignInHistoryPage click_signinhistory_tab() {
		return click_tab(signin_history_tab);
	}

	// Click in sign in 'from' date field on sign in history page
	public NBDSignInHistoryPage click_in_signin_from_date_field() {
		return click_button(from_signin_date_field);
	}

	// Click in sign in 'to' date field on sign in history page
	public NBDSignInHistoryPage click_in_signin_to_date_field() {
		return click_button(to_signin_date_field);
	}

	// Select 'from' sign in date from date menu on sign in history page
	public NBDSignInHistoryPage select_signin_from_date(String todate) {
		return click_link(By.linkText(todate));
	}

	// Select 'to' sign in date from date menu on sign in history page
	public NBDSignInHistoryPage select_signin_to_date(String date) {
		return click_link(By.linkText(date));
	}
	
	// Click in remote badge print 'from' date field on sign in history page
	public NBDSignInHistoryPage click_in_remotebadgeprint_from_date_field() {
		return click_button(remote_badge_print_from_date_field);
	}
	
	// Click in remote badge print 'to' date field on sign in history page
	public NBDSignInHistoryPage click_in_remotebadgeprint_to_date_field() {
		return click_button(remote_badge_print_to_date_field);
	}
	
	// Click in expected arrival 'from' date field on sign in history page
	public NBDSignInHistoryPage click_in_expectedarrival_from_date_field() {
		return click_button(arrival_from_date_field);
	}
		
	// Click in expected arrival 'to' date field on sign in history page
	public NBDSignInHistoryPage click_in_expectedarrival_to_date_field() {
		return click_button(arrival_to_date_field);
	}
	
	//Select year from calendar drop down on sign in history page
	public NBDSignInHistoryPage select_year_from_dropdown() {
		return select_by_name(year_dropdown, "2015");

	}

	// Click filter button on sign in history page
	public NBDSignInHistoryPage click_filter_button() {
		return click_button(filter_button);

	}

	// Click clear link on sign in history page
	public NBDSignInHistoryPage click_clear_link() {
		return click_link(clear_link);

	}

	// select printed on site from event type drop down on sign in history page
	public NBDSignInHistoryPage select_eventtype_from_dropdown(String eventtype) {
		return select_by_name(click_event_type_dropdown, eventtype);

	}

	
	// select printed remotely from event type drop down on sign in history page
	public NBDSignInHistoryPage select_month_from_dropdown(String month) {
		return select_by_name(select_month, month);

	}
	
	//select current date in "from date" field:
	public NBDSignInHistoryPage select_current_date_for_from_date() {
		wait_until(2);
		click_button(from_signin_date_field);
		CommonUtilities common = new CommonUtilities();
		String date = common.get_current_date()[1];
		String month = common.get_current_date()[0];
		String year = common.get_current_date()[2];
		select_by_name(year_dropdown, year);
		wait_until(2);
		select_by_name(select_month, month);
		wait_until(2);
		click_link(By.linkText(date));
		return this;
	}
	
	
	
	// select 'registered' from company status drop down on sign in history page
	public NBDSignInHistoryPage select_registered_from_dropdown() {
		return select_by_name(company_status_dropdown, "Registered");

	}
	
	// select 'unregistered' from company status drop down on sign in history page
	public NBDSignInHistoryPage select_unregistered_from_dropdown() {
		return select_by_name(company_status_dropdown, "UnRegistered");

	}
	
	// select 'All' from company status drop down on sign in history page
	public NBDSignInHistoryPage select_all_from_dropdown() {
		return select_by_name(company_status_dropdown, "All");

	}
	
	// select 'All' from rules enforced drop down on sign in history page
	public NBDSignInHistoryPage select_all_from_rules_enforced_dropdown() {
		return select_by_name(rules_enforced_dropdown, "All");

	}
	
	// select 'False' from rules enforced drop down on sign in history page
	public NBDSignInHistoryPage select_false_from_rules_enforced_dropdown() {
		return select_by_name(rules_enforced_dropdown, "False");

	}
	
	// select 'False' from rules enforced drop down on sign in history page
	public NBDSignInHistoryPage select_true_from_rules_enforced_dropdown() {
		return select_by_name(rules_enforced_dropdown, "True");

	}
	
	// select 'all' from badge printed drop down on sign in history page
	public NBDSignInHistoryPage select_all_from_badge_printed_dropdown() {
		return select_by_name(badge_printed_dropdown, "All");

	}
	
	// select 'True' from badge printed drop down on sign in history page
	public NBDSignInHistoryPage select_true_from_badge_printed_dropdown() {
		return select_by_name(badge_printed_dropdown, "True");

	}
	
	// select 'False' from badge printed drop down on sign in history page
	public NBDSignInHistoryPage select_false_from_badge_printed_dropdown() {
		return select_by_name(badge_printed_dropdown, "False");

	}
	
	// select 'Printed' from action drop down on sign in history page
	public NBDSignInHistoryPage select_printed_from_action_dropdown() {
		return select_by_name(action_dropdown, "Printed");

	}
	
	// select 'Printed with warning' from action drop down on sign in history page
	public NBDSignInHistoryPage select_printed_with_warning_from_action_dropdown() {
		return select_by_name(action_dropdown, "Printed with warning");

	}
	
	// select 'Rejected' from action drop down on sign in history page
	public NBDSignInHistoryPage select_rejected_from_action_dropdown() {
		return select_by_name(action_dropdown, "Rejected");

	}
	
	// enter badge id in user information filter field on sign in history page
	public NBDSignInHistoryPage enter_user_information_in_filter_field(String badgeid) {
		return enter(user_information_filter_field, badgeid);
	}

	// enter rep name in user information filter field on sign in history page
	public NBDSignInHistoryPage enter_rep_name_in_filter_field(String repname) {
		return enter(user_information_filter_field, repname);
	}

	// enter text in message filter field on sign in history page
	public NBDSignInHistoryPage enter_message_in_filter_field(String repname) {
		return enter(message_filter_field, repname);
	}

	// enter text in sign in location filter field on sign in history page
	public NBDSignInHistoryPage enter_signin_loc_in_filter_field(String loc) {
		return enter(signin_loc_field, loc);
	}

	// enter text in dept filter field on sign in history page
	public NBDSignInHistoryPage enter_dept_in_filter_field(String deptname) {
		return enter(dept_filter_field, deptname);
	}

	// enter text in signin poe filter field on sign in history page
	public NBDSignInHistoryPage enter_signin_poe_in_filter_field(String poe) {
		return enter(signin_poe_filter_field, poe);
	}

	// enter text in contact filter field on sign in history page
	public NBDSignInHistoryPage enter_contact_in_filter_field(String contactname) {
		return enter(contact_field, contactname);
	}

	// enter text in purpose of visit filter field on sign in history page
	public NBDSignInHistoryPage enter_purpose_of_visit_in_filter_field(
			String purposeofvisit) {
		return enter(purpose_of_visit_field, purposeofvisit);
	}
	
	// enter text in signed in by filter field on sign in history page
	public NBDSignInHistoryPage enter_signed_in_by_in_filter_field(
			String signedinby) {
		return enter(signed_by_field, signedinby);
	}
	
	// enter text in badge exception field by filter field on sign in history page
	public NBDSignInHistoryPage enter_badge_exception_text_in_filter_field(
			String badgeexceptiontext) {
		return enter(badge_exception_field, badgeexceptiontext);
	}
	
	// enter text in sign out location filter field on sign in history page
	public NBDSignInHistoryPage enter_signout_loc_in_filter_field(String signoutloc) {
		return enter(sign_out_location, signoutloc);
	}
	
	// enter text in signout poe filter field on sign in history page
	public NBDSignInHistoryPage enter_signout_poe_in_filter_field(String signoutpoe) {
		return enter(sign_out_poe, signoutpoe);
	}
	
	// enter text in signed out by filter field on sign in history page
	public NBDSignInHistoryPage enter_signed_out_by_in_filter_field(
		String signedoutby) {
		return enter(signed_out_by, signedoutby);
	}
	
	// enter text in group filter field on sign in history page
	public NBDSignInHistoryPage enter_group_in_filter_field(
		String group) {
		return enter(group_field, group);
	}
	
	// verify 'printed on site' text in event type column on sign in history
	// page
	public NBDSignInHistoryPage verify_printed_on_site_text_in_eventtype_column(
			String msg) {
		return verify_element_by_text(event_type_printed_on_site_text, msg);

	}

	// verify 'printed remotely' text in event type column on sign in history
	// page
	public NBDSignInHistoryPage verify_printed_remotely_text_in_eventtype_column(
			String msg) {
		return verify_element_by_text(event_type_printed_remotely_text, msg);

	}

	// verify 'All' text in event type column on sign in history page
	public NBDSignInHistoryPage verify_all_text_in_eventtype_column(String msg) {
		return verify_element_by_text(event_type_all_text, msg);

	}

	// verify Rep name text in user information column on sign in history page
	public NBDSignInHistoryPage verify_repname_text_in_user_information_column(String msg) {
		return verify_element_by_text(user_information_rep_name_text, msg);

	}

	// verify message text in message column on sign in history page
	public NBDSignInHistoryPage verify_message_text_in_message_column(String msg) {
		return verify_element_by_text(message_text, msg);

	}
	//verify message text in second row on sign in history page
	public NBDSignInHistoryPage verify_message_text_in_message_secondrow(String msg) {
		return verify_element_by_text(message_text_in_second_row, msg);

	}
	
	// verify sign in text in sign in column on sign in history page
	public NBDSignInHistoryPage verify_signin_date_text_in_signin_column(String msg) {
		return verify_element_by_text(signin_column_text, msg);

	}

	// verify sign in location text in sign in location column on sign in
	// history page
	public NBDSignInHistoryPage verify_signin_loc_text_in_signin_loc_column(String msg) {
		return verify_element_by_text(signin_loc_text, msg);

	}

	// verify dept name text in department column on sign in history page
	public NBDSignInHistoryPage verify_deptname_in_dept_column(String msg) {
		return verify_element_by_text(dept_name_text, msg);

	}

	// verify signin poe text in signin poe column on sign in history page
	public NBDSignInHistoryPage verify_signin_poe_in_poe_column(String msg) {
		return verify_element_by_text(signin_poe_text, msg);

	}

	// verify contact text in contact column on sign in history page
	public NBDSignInHistoryPage verify_contactname_in_contact_column(String msg) {
		return verify_element_by_text(contact_text, msg);

	}

	// verify purpose of visit text in purpose of visit column on sign in
	// history page
	public NBDSignInHistoryPage verify_purposeofvisit_in_purposeofvisit_column(String msg) {
		return verify_element_by_text(purpose_pf_visit_text, msg);
	}
	
	// verify unregistered text in company status column on sign in
	// history page
	public NBDSignInHistoryPage verify_unregistered_in_companystatus_column(String msg) {
		return verify_element_by_text(unregistered_text, msg);
	}
	
	// verify registered text in company status column on sign in
	// history page
	public NBDSignInHistoryPage verify_registered_in_companystatus_column(String msg) {
		return verify_element_by_text(registered_text, msg);
	}
	
	// verify signed in by text in signed in by column on sign in
	// history page
	public NBDSignInHistoryPage verify_text_in_signedinby_column(String msg) {
		return verify_element_by_text(signed_in_by_text, msg);
	}
	
	// verify 'false' text in rules enforced column on sign in
	// history page
	public NBDSignInHistoryPage verify_false_in_rulesenforced_column(String msg) {
		return verify_element_by_text(rules_enforced_false_text, msg);
	}
	
	// verify 'true' text in rules enforced column on sign in
	// history page
	public NBDSignInHistoryPage verify_true_in_rulesenforced_column(String msg) {
		return verify_element_by_text(rules_enforced_true_text, msg);
	}
	
	// verify 'true' text in badge printed column on sign in
	// history page
	public NBDSignInHistoryPage verify_true_in_badgeprinted_column(String msg) {
		return verify_element_by_text(true_text, msg);
	
	}
	
	// verify 'false' text in badge printed column on sign in
	// history page
	public NBDSignInHistoryPage verify_false_in_badgeprinted_column(String msg) {
		return verify_element_by_text(false_text, msg);
		
	}
	
	// verify 'printed' text in action column on sign in
	// history page
	public NBDSignInHistoryPage verify_printed_in_action_column(String msg) {
		return verify_element_by_text(printed_text, msg);
		
	}
	
	// verify 'printed with warning' text in action column on sign in
	// history page
	public NBDSignInHistoryPage verify_printed_with_warning_in_action_column(String msg) {
		return verify_element_by_text(printed_with_warning_text, msg);
			
	}
	
	// verify 'rejected' text in action column on sign in
	// history page
	public NBDSignInHistoryPage verify_rejected_in_action_column(String msg) {
		return verify_element_by_text(rejected_text, msg);
				
	}
	
	// verify 'signed out loc' text in signed out loc column on sign in
	// history page
	public NBDSignInHistoryPage verify_signedoutloc_in_signedoutloc_column(String msg) {
		return verify_element_by_text(sign_out_loc_text, msg);
					
	}
	
	// verify 'signed out poe' text in signed out poe column on sign in
	// history page
	public NBDSignInHistoryPage verify_signedoutpoe_in_signedoutpoe_column(String msg) {
		return verify_element_by_text(sign_out_poe_text, msg);
						
	}
	
	// verify 'signed out by' text in signed out by column on sign in
	// history page
	public NBDSignInHistoryPage verify_signedoutbytext_in_signedoutby_column(String msg) {
		return verify_element_by_text(signed_out_by_text, msg);
							
	}
	 
	// verify 'group' text in group column on sign in
	// history page
	public NBDSignInHistoryPage verify_groupnametext_in_group_column(String msg) {
		return verify_element_by_text(group_text, msg);
								
	}
	
	// verify 'badge rule exception' text in badge rule exception column on sign in
	// history page
	public NBDSignInHistoryPage verify_badgeruleexceptiontext_in_badgeruleexception_column(String msg) {
		return verify_element_by_text(badge_rule_exception_text, msg);
									
	}
	
	// verify remote badge print date text in remote badge print date column on sign in history page
	public NBDSignInHistoryPage verify_remotebadgeprint_date_text_in_remotebadgeprint_column(String msg) {
		return verify_element_by_text(remote_badge_date_text, msg);

	}
	
	// verify expected arrival date text in expected arrival date column on sign in history page
	public NBDSignInHistoryPage verify_expectedarrival_date_text_in_expectedarrival_column(String msg) {
		return verify_element_by_text(arrival_date_text, msg);

	}
	
	// Select From Date in Sign-In History Column 		
		public NBDSignInHistoryPage select_from_date() {
			wait_until(2);
			click_button(click_signin_from_date);
			CommonUtilities common = new CommonUtilities();
			String date = common.get_current_date()[1];
			String month = common.get_current_date()[0];
			String year = common.get_current_date()[2];
			select_by_name(select_year, year);
			wait_until(2);
			select_by_name(select_month, month);
			wait_until(2);
			click_link(By.linkText(date));
			return this;
	}
				
					
	// Select To Date in Sign-In History Column 		
		public NBDSignInHistoryPage select_to_date() {
			wait_until(2);
			click_button(click_signin_to_date);
			CommonUtilities common = new CommonUtilities();
			String date = common.get_current_date()[1];
			String month = common.get_current_date()[0];
			String year = common.get_current_date()[2];
			select_by_name(select_year, year);
			wait_until(2);
			select_by_name(select_month, month);
			wait_until(2);
			click_link(By.linkText(date));
			return this;
	}
}
