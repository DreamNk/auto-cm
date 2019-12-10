package com.ghx.auto.cm.ui.angularjs.page;

import org.openqa.selenium.By;

import com.ghx.auto.cm.ui.page.CMAbstractPage;

public class AjsKioskResetPasswordPage extends CMAbstractPage<AjsKioskResetPasswordPage> {

	
	
	private By reset_password_button = By.id("resetPasswordForm");
	private By invalid_exisisting_password_error_msg = By.xpath("/html/body/div[4]/div/div/div/div/div/form/div[2]/div/span/p");
	private By minimum_password_requirement_error_msg = By.xpath("/html/body/div[4]/div/div/div/div/div/form/div[3]/div/span[1]/p");
	private By password_is_required_error_msg = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/form/div[4]/div/span[1]/p");
	private By password_requirement_instruction_msg = By.xpath("/html/body/div[4]/div/div/div/div/div/p");
	private By verify_new_password_error_msg = By.xpath("/html/body/div[4]/div/div/div/div/div/form/div[4]/div/span");
	
	
	private By existing_password_textbox = By.id("resetPassword.existingPassword");
	private By new_password_textbox = By.id("resetPassword.newPassword");
	
	
	public AjsKioskResetPasswordPage click_reset_button(){
		return click_button(reset_password_button);
	}

	public AjsKioskResetPasswordPage verify_invalid_exisisting_password_error_msg(String error_msg){
		return verify_element_by_text(invalid_exisisting_password_error_msg, error_msg);
	}
	
	public AjsKioskResetPasswordPage verify_minimum_password_requirement_error_msg_in_new_password(String error_msg){
		return verify_element_by_text(minimum_password_requirement_error_msg, error_msg);
	}
	
	public AjsKioskResetPasswordPage verify_password_is_required_error_msg(String error_msg){
		return verify_element_by_text(password_is_required_error_msg, error_msg);
	}
	
	public AjsKioskResetPasswordPage verify_password_requirement_instruction_msg(String msg){
		return verify_element_by_text(password_requirement_instruction_msg, msg);
	}
	
	public AjsKioskResetPasswordPage verify_new_password_error_msg(String msg){
		return verify_element_by_text(verify_new_password_error_msg, msg);
	}
	
	public AjsKioskResetPasswordPage enter_existing_password(String msg){
		return enter(existing_password_textbox, msg);
	}
	
	public AjsKioskResetPasswordPage enter_new_password(String msg){
		return enter(new_password_textbox, msg);
	}
}

	

