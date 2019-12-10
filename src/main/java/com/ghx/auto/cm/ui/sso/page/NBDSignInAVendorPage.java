package com.ghx.auto.cm.ui.sso.page;

import org.openqa.selenium.By;

import com.ghx.auto.cm.ui.page.CMAbstractPage;

public class NBDSignInAVendorPage extends CMAbstractPage<NBDSignInAVendorPage> {
 
  private By corporateEmailTextbox = By.xpath("//*[contains(@name,'CorporateEmail')]");
  private By firstNameTextbox = By.xpath("//*[contains(@name,'firstName')]");
  private By lastNameTextbox = By.xpath("//*[contains(@name,'lastName')]");
  private By phoneTextbox = By.xpath("//*[contains(@name,'phone')]");
  private By companyTextbox = By.xpath("//*[contains(@name,'company')]");
  private By findVendorInfoButton = By.xpath("//*[contains(@id,'findVendor')]");
  private By visitingContactTextbox = By.xpath("//*[contains(@name,'visiitingContact')]");
  private By purposeOfTheVisitTextbox = By.xpath("//*[contains(@name,'purpostOfTheVisit')]");
  private By locationOfVisitDropdown = By.xpath("//*[contains(@name,'locationOfVisit')]");
  private By pointOfEntryDropdown = By.xpath("//*[contains(@name,'pointOfEntry')]");
  private By departmentOidDropdown = By.xpath("//*[contains(@name,'departmentOid')]");
  private By badgePrintButton = By.xpath("//*[contains(@class,'btn btn-success ng-binding')]");
  private By printGuestPassBtn=By.id("printGuestBadge");
  private By blockedRepPopupMessage = By.xpath("//*[@id='containerFixed']/div[5]/div/div/div[1]/div[2]/div/accordion/div/div/div[2]/div/div/div/div[4]/div[1]/div[1]/form[1]/div/div[1]/div"); 
  private By uncheckEnforceRule= By.xpath("/html/body/div[1]/div[5]/div/div/div[1]/div[2]/div/accordion/div/div/div[2]/div/div/div/div[4]/div[1]/div[1]/form[2]/div/div[11]/div/input");
  private By badgeIDTextbox = By.xpath(".//*[@name='badgeID']");
  private By signOutButton = By.xpath("//*[contains(@validation-submit,'vedorSignOut')]");
  private By signOutMessage = By.xpath("//*[contains(@ng-show,'signOutBadge')]");
  private By reasonEnforcingBadgeRule= By.xpath("/html/body/div[1]/div[5]/div/div/div[1]/div[2]/div/accordion/div/div/div[2]/div/div/div/div[4]/div[1]/div[1]/form[2]/div/div[12]/div/textarea");
  
  public NBDSignInAVendorPage enter_corporate_email(String email) {
   wait_until(2);
   enter(corporateEmailTextbox, email);
   wait_until(2);
   return this;
  }
  
  public NBDSignInAVendorPage enter_first_name(String fname) {
   enter(firstNameTextbox, fname);
   wait_until(2);
   return this;
  }
  
  public NBDSignInAVendorPage enter_last_name(String lname) {
   enter(lastNameTextbox, lname);
   wait_until(2);
   return this;
  }
  
  public NBDSignInAVendorPage enter_phone_no(String phone_no) {
   enter(phoneTextbox, phone_no);
   wait_until(2);
   return this;
  }
  
  public NBDSignInAVendorPage enter_company_name(String company_name) {
   enter(companyTextbox, company_name);
   wait_until(2);
   return this;
  }
  
  public NBDSignInAVendorPage enter_visiting_contact(String visiting_contact) {
   enter(visitingContactTextbox, visiting_contact);
   wait_until(2);
   return this;
  }
  
  public NBDSignInAVendorPage enter_purpose(String purpose_of_visit) {
   enter(purposeOfTheVisitTextbox, purpose_of_visit);
   wait_until(2);
   return this;
  }
  
  public NBDSignInAVendorPage select_location(String location) {
   select_by_name(locationOfVisitDropdown, location);
   wait_until(2);
   return this;
  }
  
  public NBDSignInAVendorPage select_poe(String poe) {
   select_by_name(pointOfEntryDropdown, poe);
   wait_until(2);
   return this;
  }
  
  public NBDSignInAVendorPage select_department(String department) {
   select_by_name(departmentOidDropdown, department);
   wait_until(2);
   return this;
  }
 
  public NBDSignInAVendorPage click_badge_print_button() {
   click(badgePrintButton);
   return this;
  }

  public NBDSignInAVendorPage click_find_vendor_info_button() {
   click(findVendorInfoButton);
   wait_until(2);
   return this;
  }
  
  public NBDSignInAVendorPage verify_blocked_Rep_Popup_Message(String msg) {
	  verify_element_by_text(blockedRepPopupMessage, msg);
	  return this;
  }
  		//Enter Badge Id//
  public NBDSignInAVendorPage enter_badge_id(String Id) {	
		wait_until(5);
		enter(badgeIDTextbox,Id);
		return this;
	 }
 
  public NBDSignInAVendorPage click_sign_out() {
		 return click(signOutButton);
     }	 
  
  public NBDSignInAVendorPage verify_sign_out_message(){
		 wait_until(2);
		 return verify_element_by_text(signOutMessage, "You have been signed out successfully.");
	  }
  
  public NBDSignInAVendorPage click_print_guest_pass_button() {
	  wait_until(2);  
	  return click(printGuestPassBtn);
	   }
  
  public NBDSignInAVendorPage click_unchek_enforce_rule() {
	  wait_until(5); 
	  return click(uncheckEnforceRule);
	  }
  
  public NBDSignInAVendorPage enter_reason_for_enforcing_badge_rule(String text_reason) {
	     enter(reasonEnforcingBadgeRule, text_reason);
	     return this;    
	  }

}