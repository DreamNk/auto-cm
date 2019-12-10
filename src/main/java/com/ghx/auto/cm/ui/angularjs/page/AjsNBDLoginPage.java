package com.ghx.auto.cm.ui.angularjs.page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.ghx.auto.cm.ui.page.CMAbstractPage;
import com.ghx.auto.cm.ui.page.CommonUtilities;
import com.ghx.auto.cm.ui.page.NBDLogin;

public class AjsNBDLoginPage extends CMAbstractPage<AjsNBDLoginPage> {
	private By user_name = By.name("j_username");
	private By pass_word = By.name("password");
	private By login_button = By.id("loginInSubmit");
	private By username_or_password_invalid_message = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/div/div[1]/div/div[2]");
	private By username_is_req = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/div/div[1]/div/div[3]/span[2]");
	private By password_is_req = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/div/div[1]/div/div[4]/span");
	private By username_invalid = By.className("validation-invalid");
	private By username_action = By.xpath("/html/body/div[3]/header/div[1]/div/ul/li[1]/a/span[2]");
	private By NBD_username_dropdown = By.id("headerUsername");
	private By remember_username = By.name("remember");
	private By continue_button = By.id("hideMessageBtn");
	
	
	public AjsNBDLoginPage invoke_url() {
		load("nbdUrl");
		handle_browser_exceptions();
		return this;
	}
	
	public AjsNBDLoginPage invoke_url(String url) {
		loadUrl(url);
		handle_browser_exceptions();
		return this;
	}
	
		
	public AjsNBDLoginPage enter_username(String username){
		wait_until(ExpectedConditions.visibilityOfElementLocated(user_name));
		 return enter(user_name, username);
		 
	}
	
	public AjsNBDLoginPage verify_emailid(String emailid){
		 wait_until(10);
		 return verify_element_by_text(user_name, emailid);
		 
	}
	
	public AjsNBDLoginPage enter_password(String password){
		return enter(pass_word, password);
	}
	
	public AjsNBDLoginPage click_login_button(){
		return click_button(login_button);
	}
	
	public AjsNBDLoginPage verify_invalid_username_message(String msg){
		return verify_element_by_text(username_invalid, msg);
	}
	
	public AjsNBDLoginPage verify_invalid_password_message(String msg){
		return verify_element_by_text(username_or_password_invalid_message, msg);
	}
	
	public AjsNBDLoginPage verify_password_req_message(String msg){
		return verify_element_by_text(password_is_req, msg);
	}
	
	public AjsNBDLoginPage verify_username_req_message(String msg){
		wait_until(ExpectedConditions.visibilityOfElementLocated(username_is_req));
		return verify_element_by_text(username_is_req, msg);
	}
	
	public AjsNBDLoginPage verify_username(String msg){
		wait_until(ExpectedConditions.visibilityOfElementLocated(username_action));
		return verify_element_by_text(username_action, msg);
	}
	
	
	
	public AjsNBDLoginPage wait_for_login_page_to_load(){
		wait_until(ExpectedConditions.visibilityOfElementLocated(remember_username));
		return this;
	}
	
	public AjsNBDLoginPage wait_for_post_login_page_to_load(){
		return wait_until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Unpaid Vendors")));
		
	}
	
//  click continue button
	public AjsNBDLoginPage click_continue_button(){
		try {
			wait_until(ExpectedConditions.elementToBeClickable(continue_button));
		    return click_button(continue_button);
		} catch (Exception e) {
			return this; // TODO: handle exception
		}
	}

	public AjsNBDLoginPage check_remember_me_checkbox(){
		 boolean ab = is_element_selected(remember_username);
		 if (ab != true) 
		 click_button(remember_username);
		 return this;
		 
	}
	
	public AjsNBDLoginPage uncheck_remember_me_checkbox(){
		 boolean ab = is_element_selected(remember_username);
		 if (ab != false) 
		 click_button(remember_username);
		 return this;
		 
	}
	}





