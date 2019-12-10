
package com.ghx.auto.cm.ui.angularjs.page;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

import com.ghx.auto.cm.ui.page.CMAbstractPage;

public class AjsCPMLoginPage extends CMAbstractPage<AjsCPMLoginPage> {
	
	private By user_name = By.id("j_username");
	private By pass_word = By.id("password");
	private By login_button = By.id("loginInSubmit");
	
	private By continue_button = By.id("continue");
	private By user_name_dropdown = By.id("headerUsername");
	private By invalid_username = By.className("validation-invalid");
	private By remember_username = By.id("rememberUsername");
	private By username_or_password_is_invalid = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/div/div/div/div[2]");
	private By log_out = By.id("headerLogout");
	private By username_is_required = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/div/div/div/div[3]/span[2]");
	private By password_is_required = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/div/div/div/div[4]/span");
	
	public AjsCPMLoginPage invoke_url() {
		load("cpmUrl");
		handle_browser_exceptions();
		return this;
	}
	
	public AjsCPMLoginPage invoke_url(String url) {
		loadUrl(url);
		handle_browser_exceptions();
		return this;
	}
	
	public AjsCPMLoginPage wait_for_login_page_to_load(){
		wait_until(ExpectedConditions.visibilityOfElementLocated(remember_username));
		return this;
	}
	
	public AjsCPMLoginPage enter_username(String username){
		wait_until(ExpectedConditions.visibilityOfElementLocated(user_name));
		wait_until(5);
		return enter(user_name, username);
	}
	
	public AjsCPMLoginPage enter_password(String password){
		return enter(pass_word, password);
	}
	
	public AjsCPMLoginPage click_login_button(){
	    click_button(login_button);
		return wait_until(5);
	}
	
	public AjsCPMLoginPage click_continue_button(){
		try {	wait_until(ExpectedConditions.elementToBeClickable(continue_button));
		    	click_button(continue_button);
		} catch (Exception e) {
		}
		return this;
	} 
	
	public AjsCPMLoginPage verify_username(String msg){
		return verify_element_by_text(user_name_dropdown, msg);
	}
	
	public AjsCPMLoginPage verify_invalid_username_message(String msg){
		return verify_element_by_text(invalid_username, msg);
	}
	
	public AjsCPMLoginPage verify_invalid_password_message(String msg){
		return verify_element_by_text(username_or_password_is_invalid, msg);
	}
	
	
	public AjsCPMLoginPage verify_username_is_required(String msg){
		return verify_element_by_text(username_is_required, msg);
	}
	
	public AjsCPMLoginPage verify_password_is_required(String msg){
		return verify_element_by_text(password_is_required, msg);
	}
	
	public AjsCPMLoginPage Do_log_out_from_cpm(){
        click_button(user_name_dropdown);
		wait_until(5);
		click_link(log_out);
		return wait_until(10);
	}
	
}