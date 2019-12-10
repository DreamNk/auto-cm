package com.ghx.auto.cm.ui.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class NVDloginPage extends CMAbstractPage<NVDloginPage>{
	
	private By user_name = By.id("j_username_outer");
	private By pass_word = By.id("j_password_outer");
	private By login_button = By.id("login");
	private By invalid_username = By.id("userName.errorspan");
	private By invalid_password = By.id("errorDiv");
	private By continue_button = By.id("continue");
	private By user_name_action = By.id("welcomeMenu-button");
	private By change_password = By.id("chgPass");
	private By verify_username = By.xpath(".//div[@id='yui-gen1']/div[3]/div[1]/span[2]/div/label");
	private By close_popup = By.xpath(".//*[@id='complianceAlertDiv']/a");
	
	
	//  Enter Username in NVD Login page
	public NVDloginPage enter_username(String username){
		return enter(user_name, username);
	}
	
	//  Enter Password in NVD login Page
	public NVDloginPage enter_password(String password){
		return enter(pass_word, password);
	}
	
	//  Click Login Button
	public NVDloginPage click_login_button(){
		return click_button(login_button);
	}
	
	//  Verify Invalid Username Error Message
	public NVDloginPage verify_invalid_username_message(String msg){
		return verify_element_by_text(invalid_username, msg);
	}
	
	public NVDloginPage doLogin(String url, String username, String password) {
    	load(url);
        handle_browser_exceptions();
        enter_username(username);
        enter_password(password);
        click_login_button();
        return this;
    }
	
	
	//  Verify invalid Password Error Message
	public NVDloginPage verify_invalid_password_message(String msg){
		return verify_element_by_text(invalid_password, msg);
	}
	
	
	//  Click On Continue Button
	public NVDloginPage click_continue_button(){
		try {
			wait_until(ExpectedConditions.elementToBeClickable(continue_button));
		    return click_button(continue_button);
		} catch (Exception e) {
			return this;// TODO: handle exception
		} 
		
    } 
	
	public NVDloginPage invokeLoginUrl(String url) {
		load(url);
		handle_browser_exceptions();
		return this;
	}
	
	//  Click Username Dropdown
	public NVDloginPage click_username_action_dropdown() throws Throwable{
		wait_until(5);
		return click_button(user_name_action);
	}
	
	
	//  Click Change Password link from Username Dropdown
	public NVDloginPage click_change_password() throws Throwable{
		wait_until(6);
		return click_button(change_password);
	}
	
	
	//  Verify the Username on the Username Dropdown of NVD
	public NVDloginPage verify_username(String msg){
		wait_until(10);
		return verify_element_by_text(user_name_action, msg);
		
	
	}
}