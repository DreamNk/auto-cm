package com.ghx.auto.cm.ui.page;

import org.openqa.selenium.By;

public class NBDHomePage extends CMAbstractPage<NBDHomePage> {

	private By unpaid_vendors = By.id("unpaidvendors");
	private By vendors_reg = By.id("vendorsregistered");
	private By reps_reg = By.id("repsregistered");
	private By unpaid_back_to_home = By.id("unpaidVendorsBackToListAnchor");
	private By reg_vendors_back_to_home = By.id("vendorsBackToListAnchor");
	private By reg_reps_back_to_home = By.id("repsBackToListAnchor");
	private By reps_of_unpaid_vendors = By.id("unPaidVendorsAccordion-1-label");
	private By vendors = By.id("vendorsAccordion-1-label");
	private By reps = By.id("repsAccordion-1-label");
	private By visit_last_30_days = By.id("visitinlast30days");
	private By sign_history = By.id("signInOutAccordion-1-label");
	private By visit_back_to_home = By.id("reportsBackToListAnchor");
	private By recent_visitors_link = By.xpath(".//div[@id='recentVisitorGridHeading']/div/h5/a");
	private By signin_history_accordian_header_text = By.id("signInOutAccordion-1-label");
	private By signinhistory_back_to_home = By.id("reportsBackToListAnchor");
	private By click_home_tab = By.xpath(".//div[@id='mainTab']/ul/li[1]/a/em");
	
	// click unpaid vendors link on NBD home page
	public NBDHomePage click_unpaid_vendors(){
		
		return click_link(unpaid_vendors);
	}
	
	// click vendors registered link on NBD home page
	public NBDHomePage click_vendors_reg_link(){
		
		return click_link(vendors_reg);
}
	
	// click reps registered link on NBD home page
	public NBDHomePage click_reps_reg_link(){
		
		return click_link(reps_reg);
}
	
	// click recent visitors link on NBD home page
	public NBDHomePage click_recent_visitors_link(){
		
		return click_link(recent_visitors_link);
}
	
	// click back to home link on unpaid vendors page
	public NBDHomePage back_to_home_unpaid_vendors(){
		
		return click_link(unpaid_back_to_home);
}
	
	// click back to home link on vendors registered page
	public NBDHomePage back_to_home_vendors_reg_link(){
		
		return click_link(reg_vendors_back_to_home);
}
	
	// click back to home link on reps registered page
	public NBDHomePage back_to_home_reps_reg_link(){
		
		return click_link(reg_reps_back_to_home);
}
	
	 
	 // click visit in last 30 days link on NBD home page
	 public  NBDHomePage click_visitinlast30days(){
		
		return click_link(visit_last_30_days);
}
	 
	 // click back to home link on visit in last 30 days page
	 public  NBDHomePage click_visitinlast30Days_backtohome(){
		wait_until(7);
		return click_link(visit_back_to_home);
	}
	 
	// click back to home link on sign in history page
	 public  NBDHomePage click_signinhistory_backtohome(){
		wait_until(7);
		return click_link(signinhistory_back_to_home);
}
	 
	 // verify accordion text on unpaid vendors page
	 public NBDHomePage verify_unpaid_vendors_header_text(String msg){
			return verify_element_by_text(reps_of_unpaid_vendors, msg);
	 }
	 
	 
	 // verify accordion text on vendors registered page
	 public NBDHomePage verify_vendors_registered_header_text(String msg){
			return verify_element_by_text(vendors, msg);
	 }
	 
	 // verify accordion text on reps registered page
	 public NBDHomePage verify_reps_registered_header_text(String msg){
			return verify_element_by_text(reps, msg);
	 }
	 
	 // verify accordion text on visit in last 30 days page
	 public NBDHomePage verify_visit_in_last30days_header_text(String msg){
			return verify_element_by_text(sign_history, msg);
	 }
	 
	 
	 // verify sign in history accordion text on sign in history page
	 public NBDHomePage verify_signin_history_header_text(String msg){
			return verify_element_by_text(signin_history_accordian_header_text , msg);
	 }
	 
	// Home tab is clicked	
		public NBDHomePage click_home_tab(){
			return click_button(click_home_tab);
	}
}
