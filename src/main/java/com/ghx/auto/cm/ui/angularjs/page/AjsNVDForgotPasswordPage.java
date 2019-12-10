package com.ghx.auto.cm.ui.angularjs.page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.ghx.auto.cm.ui.page.CMAbstractPage;

public class AjsNVDForgotPasswordPage extends CMAbstractPage<AjsNVDForgotPasswordPage> {
	

	private By forgot_password_link = By.id("forgotPasswordLink");
	private By email_address_for_forgot_password = By.id("forgotPassword.email");
	private By forgot_your_password_header = By.xpath("/html/body/div[7]/div/div/div/div/div[1]/h3/b");
	private By send_button = By.id("forgotPasswordSubmit");
	private By blank_email_error = By.xpath("/html/body/div[7]/div/div/div/div/div[2]/vision-action/form/div[1]/span/span/p");
	private By invalid_email_id = By.xpath("/html/body/div[7]/div/div/div/div/div[2]/vision-action/form/div[1]/span/span/p");
	private By close_button = By.className("close");
	private By emailid_not_in_system = By.id("forgotPasswordError");
	private By email_sent_successfully = By.xpath("/html/body/div[7]/div/div/div/div/div[1]/h3/span");
	private By ok_button = By.id("emailSucess");
	private By cancel_button_on_email_successfully_sent_pop_up = By.className("close");
	private By login_button = By.id("loginInSubmit");
	
	
	
	public AjsNVDForgotPasswordPage invoke_url() {
		load("baseUrl");
		handle_browser_exceptions();
		return this;
	}
	
	public AjsNVDForgotPasswordPage invoke_url(String url) {
		loadUrl(url);
		handle_browser_exceptions();
		return this;
	}
	
	
	public AjsNVDForgotPasswordPage click_forgot_password_link(){
		return click_button(forgot_password_link);
	}
	
	public AjsNVDForgotPasswordPage click_send_button(){
		return click_button(send_button);
	}

	public AjsNVDForgotPasswordPage verify_header_of_forgot_password_popup(String msg){
		return verify_element_by_text(forgot_your_password_header, msg);
	}
	
	public AjsNVDForgotPasswordPage click_cancel_button(){
		return click_button(close_button);
	}
	
	public AjsNVDForgotPasswordPage enter_email_address(String username){
		return enter(email_address_for_forgot_password, username);
	}
	
	public AjsNVDForgotPasswordPage verify_error_msg_for_blank_email(String msg){
		return verify_element_by_text(blank_email_error, msg);
	}
	
	public AjsNVDForgotPasswordPage verify_error_msg_for_invalid_email(String msg){
		return verify_element_by_text(invalid_email_id, msg);
	}
	
	public AjsNVDForgotPasswordPage verify_error_of_emailid_not_in_system(String msg){
		return verify_element_by_text(emailid_not_in_system, msg);
	}
	
	public AjsNVDForgotPasswordPage verify_text_of_email_sent_successfully(String msg){
		return verify_element_by_text(email_sent_successfully, msg);
	}
	
	public AjsNVDForgotPasswordPage click_ok_button(){
		return click_button(ok_button);
	}
	
	public AjsNVDForgotPasswordPage click_cancel_button_on_success_popup(){
		return click_button(cancel_button_on_email_successfully_sent_pop_up);
	}
	
	public AjsNVDForgotPasswordPage wait_for_login_page_to_load(){
		wait_until(ExpectedConditions.visibilityOfElementLocated(login_button));
		return this;
	}
	
}
