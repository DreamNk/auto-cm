package com.ghx.auto.cm.ui.angularjs.page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.ghx.auto.cm.ui.page.CMAbstractPage;

public class LoginPage extends CMAbstractPage<LoginPage> {
	
	private By user_name = By.id("j_username");
	private By pass_word = By.id("password");
	private By login_button = By.id("loginInSubmit");
	
	private By continue_button = By.id("continue");
	private By user_name_action = By.id("welcomeMenu-button");
	private By invalid_username = By.className("validation-invalid");
	private By invalid_password = By.id("loginError");
	private By remember_username = By.id("rememberUsername");
	
	
	public LoginPage invoke_url() {
		load("baseUrl");
		handle_browser_exceptions();
		return this;
	}
	
	public LoginPage invoke_url(String url) {
		loadUrl(url);
		handle_browser_exceptions();
		return this;
	}
	
	public LoginPage wait_for_login_page_to_load(){
		wait_until(ExpectedConditions.visibilityOfElementLocated(remember_username));
		return this;
	}
	
	public LoginPage enter_username(String username){
		return enter(user_name, username);
	}
	
	public LoginPage enter_password(String password){
		return enter(pass_word, password);
	}
	
	public LoginPage click_login_button(){
		return click_button(login_button);
	}
	
	public LoginPage click_continue_button(){
		try {	wait_until(ExpectedConditions.elementToBeClickable(continue_button));
		    	click_button(continue_button);
		} catch (Exception e) {
		}
		return this;
	} 
	
	public LoginPage verify_username(String msg){
		return verify_element_by_text(user_name_action, msg);
	}
	
	public LoginPage verify_invalid_username_message(String msg){
		return verify_element_by_text(invalid_username, msg);
	}
	
	public LoginPage verify_invalid_password_message(String msg){
		return verify_element_by_text(invalid_password, msg);
	}
	
}