package com.ghx.auto.cm.ui.angularjs.page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.ghx.auto.cm.ui.page.CMAbstractPage;
import com.ghx.auto.cm.ui.page.CommonUtilities;
import com.ghx.auto.cm.ui.page.NBDLogin;

public class AjsNVDLoginPage extends CMAbstractPage<AjsNVDLoginPage> {
	private By user_name = By.name("j_username");
	private By pass_word = By.name("password");
	private By login_button = By.id("loginInSubmit");
	private By continue_button = By.id("hideMessageBtn");
	private By username_or_password_invalid_message = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/div/div[1]/div/div[2]");
	private By username_is_req = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/div/div[1]/div/div[3]/span[2]");
	private By password_is_req = By.className("validation-invalid ng-binding");
	private By username_invalid = By.className("validation-invalid");
	private By username_on_home_page = By.className("ng-binding");
	private By username_dropdown = By.xpath("/html/body/div[3]/header/div[1]/div/ul/li[1]/a/span[2]");
	private By log_out = By.xpath("/html/body/div[3]/header/div[1]/div/ul/li[1]/ul/li[5]/a");
	private By remember_username_checkbox = By.id("rememberUsername");
	private By element_on_home_page = By.id("connectWithANewHealthSystem");
	
	public AjsNVDLoginPage invoke_url() {
		load("nvdUrl");
		handle_browser_exceptions();
		return this;
	}
	
	public AjsNVDLoginPage invoke_url(String url) {
		loadUrl(url);
		handle_browser_exceptions();
		return this;
	}
	
	public AjsNVDLoginPage enter_username(String username){
		wait_until(ExpectedConditions.visibilityOfElementLocated(user_name));
		 return enter(user_name, username);
		 
	}
	
	public AjsNVDLoginPage enter_password(String password){
		return enter(pass_word, password);
	}
	
	public AjsNVDLoginPage click_login_button(){
		return click_button(login_button);
	}
	
	public AjsNVDLoginPage click_continue_button(){
		return click_button(continue_button);
	}
	
	public AjsNVDLoginPage verify_invalid_username_message(String msg){
		return verify_element_by_text(username_invalid, msg);
	}
	
	public AjsNVDLoginPage verify_invalid_password_message(String msg){
		return verify_element_by_text(username_or_password_invalid_message, msg);
	}
	
	public AjsNVDLoginPage verify_password_req_message(String msg){
		return verify_element_by_text(password_is_req, msg);
	}
	
	public AjsNVDLoginPage verify_username_req_message(String msg){
		wait_until(ExpectedConditions.visibilityOfElementLocated(username_is_req));
		return verify_element_by_text(username_is_req, msg);
	}
	
	public AjsNVDLoginPage verify_username(String msg){
		wait_until(ExpectedConditions.visibilityOfElementLocated(username_on_home_page));
		return verify_element_by_text(username_on_home_page, msg);
	}
	
	public AjsNVDLoginPage do_log_out_from_NVD() {
		wait_until(3);
		click_button(username_dropdown);
		wait_until(2);
		click_button(log_out);
		return wait_until(5);
	}
	
	public AjsNVDLoginPage wait_for_login_page_to_load(){
		wait_until(ExpectedConditions.visibilityOfElementLocated(login_button));
		return this;
	}
	
	public AjsNVDLoginPage wait_for_element_of_home_page_to_load(){
		wait_until(ExpectedConditions.visibilityOfElementLocated(element_on_home_page));
		return this;
	}
	

	
}
