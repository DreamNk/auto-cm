package com.ghx.auto.cm.ui.angularjs.page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.ghx.auto.cm.ui.angularjs.page.AjsNVDRootPage;
import com.ghx.auto.cm.ui.page.CMAbstractPage;

public class AjsNVDRootPage extends CMAbstractPage<AjsNVDRootPage> {
	
	  //Change password Locators
	private By change_password = By.id("changePassword");
	//private By my_profile = By.linkText("My Profile");
	private By existing_password = By.id("changePassword.exitingPassword");
	private By new_password = By.id("changePassword.newPassword");
	private By save_password = By.id("changePasswordSubmit");
	private By ok_password = By.id("successBtn ");
	private By same_existing_and_new_password_error = By.id("forgotPasswordError");
	private By different_new_and_verifynew_password_error = By.xpath("/html/body/div[7]/div/div/div/div[2]/vision-action/div/form/div[3]/div/span[3]");
	private By verify_new_password = By.id("changePassword.verifyNewPassword");
	private By password_not_meeting_requirement = By.xpath("/html/body/div[7]/div/div/div/div[2]/vision-action/div/form/div[3]/div/span[2]");
	private By existing_password_is_not_correct = By.xpath("/html/body/div[7]/div/div/div/div[2]/vision-action/div/div[2]/div");
	private By close_change_password_popup = By.id("complianceCautionCloseIcon");
	private By NVD_username_dropdown = By.id("headerUsername");
	private By tooltip_text = By.xpath("/html/body/div[7]/div/div/div/div[2]/vision-action/div/p[2]/em/span");
	private By login_button = By.id("loginInSubmit");
	
	
	//Locators for change username
	
	private By change_username = By.id("changeUser");
    private By existing_password_to_change_username = By.id("changeUsername.exitingPassword");
	private By new_username = By.id("changeUsername.newUsernamed");
	private By verify_new_username = By.id("changeUsername.confirmUsername");
	private By save_username = By.id("changeUsernameSubmit");
	private By close_change_username_popup = By.id("complianceCautionCloseIcon");
	private By ok_username = By.id("complianceCautionCloseIcon");
	private By invalid_email_address = By.xpath("/html/body/div[7]/div/div/div/div[2]/vision-action/div/form/div[3]/div/span[1]/p");
	private By invalid_existing_password = By.xpath("/html/body/div[7]/div/div/div/div[2]/vision-action/div/div[2]");
	
	
	
	
	
	
	
	//Methods for change password in NVD
	
	// Logged into NVD and clicked on username dropdown 
	public	AjsNVDRootPage click_username_dropdown(){
		return click_button(NVD_username_dropdown);
	}
		
	// Click on cross sign option on change password pop up
	public	AjsNVDRootPage click_cross_sign_on_change_password_popup(){
		return click_button(close_change_password_popup);
	}
		
	
	//  click 'change password' from user drop down
	/*public NVDRootPage click_change_password(){
		wait_until(ExpectedConditions.visibilityOfElementLocated(change_password));
		return click_button(change_password);
	}*/
	
	public	AjsNVDRootPage click_change_password(){
		return click_button(change_password);
	}
	
	
	 // enter existing password in change password pop up
	public AjsNVDRootPage enter_existing_password(String password){
		return enter(existing_password, password);
	}

	// enter new password in change password pop up
	public AjsNVDRootPage enter_new_password(String password){
		return enter(new_password, password);
	}
	
	// enter 'verify new password' in change password pop up
	public AjsNVDRootPage enter_verify_new_password(String password){
		return enter(verify_new_password, password);
	}
	
	// click save in change password pop up
	public AjsNVDRootPage click_save_password(){
		wait_until(3);
		return click_button(save_password);
	}
	
	// click ok  in change password notification 
	public AjsNVDRootPage click_ok_password(){
		wait_until(3);
		return click_button(ok_password);
	}
	
	// verify samw password entry in existing and new password field
	public AjsNVDRootPage verify_same_existing_and_new_password_error(String msg){
		return verify_element_by_text(same_existing_and_new_password_error, msg);

	}
	
	
	// verify incomplete passowrd entry in new password field
	public AjsNVDRootPage verify_error_for_password_not_meeting_requirement(String msg){
		return verify_element_by_text(password_not_meeting_requirement, msg);
	}
	
	// verify wrong existing password entry
	public AjsNVDRootPage verify_error_for_wrong_existing_password(String msg){
		return verify_element_by_text(existing_password_is_not_correct, msg);
	}
	
	// verify tool tip text on change password pop up
	public AjsNVDRootPage verify_tooltip_text(String msg){
		return verify_element_by_text(tooltip_text, msg);
	}
	
	// verify different passwords in new and verify new password fields
	public AjsNVDRootPage verify_error_for_different_new_and_verifynew_password(String msg){
		return verify_element_by_text(different_new_and_verifynew_password_error, msg);

	}
	
	
		
	
	//Methods for Change username in NVD
	
	public AjsNVDRootPage click_change_username(){
		return click_button(change_username);
		
	}
		
	public AjsNVDRootPage enter_new_username(String username){
		return enter(new_username, username);
	}

	public AjsNVDRootPage enter_existing_password_to_change_username(String password){
		return enter(existing_password_to_change_username, password);
	}
	
	public AjsNVDRootPage enter_verify_new_username(String username){
		return enter(verify_new_username, username);
	}
	
	public AjsNVDRootPage click_save_username(){
		return click_button(save_username);
	
	}	

	public AjsNVDRootPage click_cancel_button_on_change_username(){
		return click_button(close_change_username_popup);
	
	}
	
	public AjsNVDRootPage click_ok_button_on_change_username(){
		return click_button(ok_username);
	
	}
	
	public AjsNVDRootPage verify_error_for_wrong_existing_password_while_changing_username(String msg){
		return verify_element_by_text(invalid_existing_password, msg);
	}
	
	public AjsNVDRootPage verify_error_for_invalid_username(String msg){
		return verify_element_by_text(invalid_email_address, msg);
	}
	
	public AjsNVDRootPage wait_for_login_page_to_load(){
		wait_until(ExpectedConditions.visibilityOfElementLocated(login_button));
		return this;
	}
	
}

	  




