package com.ghx.auto.cm.ui.sso.page;

import org.openqa.selenium.By;

import com.ghx.auto.cm.ui.page.CMAbstractPage;

public class ConnectToMailBoxPage extends CMAbstractPage<ConnectToMailBoxPage>{
	
	private By mailId= By.id("identifierId");
	private By mailNextButton= By.xpath("//*[contains(@id,'identifierNext')]");
	private By mailPassword= By.xpath("//*[contains(@name,'password')]");
	private By passwordNextButton= By.xpath(".//*[contains(@id,'passwordNext')]");
	private By mailIcon= By.xpath("//*[contains(@aria-label,'Mail')]");
	//private By mailSignIn= By.xpath("//*[contains(@name,'password')]");
	private By mailSearchField= By.xpath("//*[contains(@aria-label,'Search')]");  
	private By mailSearchButton= By.id("gbqfb");
	private By subjectPath= By.xpath("//*[contains(@class,'av')]");
	private By setPasswordLink= By.linkText("Set Password");
	private By mailSelectorOption = By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[5]/div[1]/a/span");
	private By mailSignOut = By.xpath(".//*[@id='gb_71']");
	//reset password mail of the existing user trying to reset password
	private By resetPasswordLink = By.linkText("Reset Password");
	
	// Invoke Gmail URL//
	public ConnectToMailBoxPage invoke_gmailURL(String URL) {
		load(URL);
		handle_browser_exceptions();
		return this;
	}
	// Enter Gmail id //
	public ConnectToMailBoxPage enter_mailId(String gmailId) {
		return enter(mailId, gmailId);}

	// Enter Gmail password //
	public ConnectToMailBoxPage enter_password(String gmail_password) {
		return enter(mailPassword, gmail_password);}

	// Click Next button
	public ConnectToMailBoxPage click_next_button() {
		click_button(mailNextButton);
		return wait_until(2);}

	// Click Sign In button
	public ConnectToMailBoxPage click_signIn_button() {
		click_button(passwordNextButton);
		return wait_until(2);}

	// Click Mail Box button
	public ConnectToMailBoxPage click_mail_Inbox_button() {
		try	{
			click_button(mailIcon);
		}catch (Exception e){
			click_mail_search_field();
		}return wait_until(1);}

	//Click in the Mail Search Field
	public ConnectToMailBoxPage click_mail_search_field() {
		click_button(mailSearchField);
		return click_button(mailSearchField);
	}
	// Search for Set Password Mail		
	public ConnectToMailBoxPage enter_mail_subject(String subject) {
		wait_until(2);
		return enter(mailSearchField, subject);

	}
	// Click Mail Search button
	public ConnectToMailBoxPage click_search_mail_button() {
		return click_button(mailSearchButton);
	}
	// Click Set Password Mail
	public ConnectToMailBoxPage click_set_password_mail() {
		click_button(subjectPath);
		return wait_until(2);
	}
	// Click Set Password Link
	public ConnectToMailBoxPage click_set_password_link() {
		click_button(setPasswordLink);
		return wait_until(2);
	}
	
	// in the password reset mail for resetting password of existing user
		public ConnectToMailBoxPage click_reset_password_link(){
			return click(resetPasswordLink);
		}
	
		public ConnectToMailBoxPage click_sign_out(){
	    	click(mailSignOut); 
	    	return wait_until(2);
		}

		public ConnectToMailBoxPage click_name_selector(){
		click(mailSelectorOption);
		return wait_until(2);
}
}