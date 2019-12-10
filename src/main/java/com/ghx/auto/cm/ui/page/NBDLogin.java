package com.ghx.auto.cm.ui.page;

import groovyjarjarasm.asm.tree.TryCatchBlockNode;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class NBDLogin extends CMAbstractPage<NBDLogin> {
	private By user_name = By.id("j_username_outer");
	private By pass_word = By.id("j_password_outer");
	private By login_button = By.id("login");
	private By continue_button = By.id("continue");
	private By user_name_action = By.id("welcomeMenu-button");
	private By invalid_username = By.id("userName.errorspan");
	private By invalid_password = By.id("errorDiv");
	
	//   enter username
	public NBDLogin enter_username(String username){
		return enter(user_name, username);
	}
	//  enter password
	public NBDLogin enter_password(String password){
		return enter(pass_word, password);
	}
	//   click log in button
	public NBDLogin click_login_button(){
		return click_button(login_button);
	}
	//   load login url
	public NBDLogin invoke_loginurl(String url) {
		load(url);
		handle_browser_exceptions();
		return this;
	}
	
	//   click continue button
	public NBDLogin click_continue_button(){
		try {
			wait_until(ExpectedConditions.elementToBeClickable(continue_button));
		    return click_button(continue_button);
		} catch (Exception e) {
			return this;// TODO: handle exception
		}
		
		
} 
	
	//  verify username
	public NBDLogin verify_username(String msg){
		wait_until(10);
		return verify_element_by_text(user_name_action, msg);
		
	
	}
	
	//  verify invalid username
	public NBDLogin verify_invalid_username_message(String msg){
		return verify_element_by_text(invalid_username, msg);
	}
	
	//  verify invalid password
	public NBDLogin verify_invalid_password_message(String msg){
		return verify_element_by_text(invalid_password, msg);
	}
	
}
