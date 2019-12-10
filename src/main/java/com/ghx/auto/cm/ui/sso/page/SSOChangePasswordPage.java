package com.ghx.auto.cm.ui.sso.page;

import org.openqa.selenium.By;

import com.ghx.auto.cm.ui.page.CMAbstractPage;

public class SSOChangePasswordPage extends CMAbstractPage<SSOChangePasswordPage> {
	
	private By profile = By.id("userprofile");
	private By changePasswordButton = By.id("changePassword");
	
	private By existingPassword = By.id("changePassword.existingPassword");
	private By newPassword = By.id("changePassword.newPassword");
	private By confirmPassword = By.id("changePassword.verifyNewPassword");
	private By saveButton = By.id("changePasswordOk");
	private By reLoginButton = By.id("changePasswordClose");
	
	private By ErrorMessage = By.xpath(".//*[@id='ng-app']/body/div[6]/div/div/div[2]/div");
	private By closeButton = By.id("changePasswordClose");
	
	
	// click on the profile option
	public SSOChangePasswordPage click_profile(){
		wait_until(2);
		return click_button(profile);
	}
	
	//click on Change password button
	public SSOChangePasswordPage click_change_password_button(){
		wait_until(2);
		return click_button(changePasswordButton);
	}
	
	// enter existing password
	public SSOChangePasswordPage enter_existing_password(String existing){
		return enter(existingPassword, existing);
	}
		
	// enter new password
	public SSOChangePasswordPage enter_new_password(String newpass){
		return enter(newPassword, newpass);
	}
	
	// re-enter new password
	public SSOChangePasswordPage enter_confirm_password(String confirmpass){
		return enter(confirmPassword, confirmpass);
	}
	
	// click on Save button
	public SSOChangePasswordPage click_save_button(){
		wait_until(2);
		return click_button(saveButton);
	}
	
	//click on Relogin button
	public SSOChangePasswordPage click_relogin_button(){
		wait_until(2);
		return click_button(reLoginButton);
	}
	
	//verify error message when tried to change password for same user within 24 hours
	public SSOChangePasswordPage verify_error_msg(String msg){
		wait_until(2);
		return verify_element_by_text(ErrorMessage, msg);
	}
	
	// click on Close button
	public SSOChangePasswordPage click_close_button(){
		wait_until(2);
		return click_button(closeButton);
	}
}
