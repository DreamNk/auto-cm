package com.ghx.auto.cm.ui.page;

import org.openqa.selenium.By;

public class NVDFooterLinksPage extends CMAbstractPage<NVDFooterLinksPage>{

	
	private By footer_support_center = By.xpath(".//div[@id='footer']/div/a[1]");
	private By header_support_center = By.id("supportCenter");
	private By a_fax_cover_sheet = By.linkText("a Fax Cover Sheet");
	private By privacy_policy = By.linkText("Privacy Policy");
	private By terms_of_use = By.linkText("Terms of Use");
	private By forgot_password = By.linkText("Forgot password?"); 
	
	
	
 //AD: Click Footer Support Center Link	
 public NVDFooterLinksPage click_footer_support_center_link(){
		wait_until(10);
		return click_link(footer_support_center);
 } 
 
 
 //AD:Click Header Support Center Link	
 public NVDFooterLinksPage click_header_support_center_link(){
		wait_until(10);
		return click_link(header_support_center);
 }

 
 //AD: Click Fax Cover Sheet Link	
 public NVDFooterLinksPage click_fax_cover_sheet_link(){
		wait_until(10);
		return click_link(a_fax_cover_sheet);
 }  

 
 //AD: Click Privacy policy link
 public NVDFooterLinksPage click_privacy_policy_link(){
	wait_until(10);
	return click_link(privacy_policy);
 }  

 
 
 //AD: Click terms of use link
 public NVDFooterLinksPage click_terms_of_use_link(){
	wait_until(10);
	return click_link(terms_of_use);
 }  

 
 
 //AD: Click Forgot password link of NVD login page
 public NVDFooterLinksPage click_forgot_password_link(){
	wait_until(10);
	return click_link(forgot_password);
 } 	
	
	
	
	
	
	
	
	
	
	
	
}
