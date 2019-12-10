package com.ghx.auto.cm.ui.page;

import org.openqa.selenium.By;

public class NVDRootPage extends CMAbstractPage<NVDRootPage>{

	private By log_out = By.xpath(".//div[@id='menuwithWelcomegroups']/div[1]/ul[5]/li/a");
	private By user_name_dropdown = By.id("welcomeMenu-button");
	
	//----------------------------------------------------------------------------------------------
	//User dropdown
	
	private By change_password = By.id("chgPass");
	private By change_username = By.id("chgUsername");
	private By my_profile = By.id("myProfile");
	private By company_profile = By.id("companyProfile");
	private By existing_password = By.id("existingPassword");
	private By new_password = By.id("newPassword");
	private By verify_new_password = By.id("verifyNewPassword");
	private By save_password = By.id("save");
	private By ok_password = By.id("ok");
	private By existing_password_for_changing_username = By.id("changeUsername.existingPassword");
	private By new_username = By.id("changeUsername.newUsername");
	private By verify_new_username = By.id("changeUsername.verifyNewUsername");
	private By save_username = By.id("changeUsername.save");
	private By ok_username = By.id("changeUsernameCfm.ok");
	private By same_existing_and_new_password_error = By.id("existingPassword.errorspan");
	private By different_new_and_verifynew_password_error = By.id("newPassword.errorspan");
	private By wrong_password_for_username_change = By.id("changeUsername.existingPassword.errorspan");
	private By new_username_is_same_as_existing_username = By.id("changeUsername.newUsername.errorspan");
	private By new_username_verify_new_username_mismatch = By.id("changeUsername.newUsername.errorspan");
	private By password_not_meeting_requirement = By.id("newPassword.errorspan");
	private By existing_password_is_not_correct = By.xpath(".//div[@id='changepwdDiv']/span[2]");
	private By credential_manager_button = By.id("credentialingMenu-button");
	private By sourcing_manager_link = By.id("credential_cmedzo_status_ac_link");
	private By welcome_wizard_work_email = By.xpath(".//div[@id='welcomeProfileDetails']/div[11]/span[2]");
	private By welcome_wizard_cancel_button = By.cssSelector("[type='button']");
	private By credential_manager_tab_in_sourcing_manager_home = By.xpath(".//div[@id='mainmenu']/ul/li[5]/a");
	private By close_button_on_change_username_popup = By.xpath(".//div[@id='chgUsernameDiv']/a");
	private By close_button_on_change_password_popup = By.xpath(".//div[@id='chgPassW']/a");
	
	
	
	//AD: Click User Name Dropdown
	public NVDRootPage click_user_name_dropdown(){
		wait_until(5);
		return click_link(user_name_dropdown);	
	}
	
	public NVDRootPage click_change_password(){
		wait_until(5);
		return click_button(change_password);
    }
	
	public NVDRootPage click_username(){
		wait_until(5);
		return click_button(change_username);
    }
	
	public NVDRootPage click_my_profile(){
		wait_until(5);
		return click_button(my_profile);
    }
	
	public NVDRootPage click_company_profile(){
		wait_until(5);
		return click_button(company_profile);
    }
	
	
	public NVDRootPage select_option_from_username_dropdown(String name){
		wait_until(5);
		return select_by_name(user_name_dropdown, name);
    }
	
	
	public NVDRootPage enter_existing_password(String password){
		return enter(existing_password, password);
	}
	
	
	public NVDRootPage enter_new_password(String password){
		return enter(new_password, password);
	}
	
	public NVDRootPage enter_verify_new_password(String password){
		return enter(verify_new_password, password);
	}
	
	public NVDRootPage click_save_password(){
		wait_until(3);
		return click_button(save_password);
	}
	
	public NVDRootPage click_ok_password(){
		wait_until(3);
		return click_button(ok_password);
	}
	

	
	public NVDRootPage verify_same_existing_and_new_password_error(String msg){
		return verify_element_by_text(same_existing_and_new_password_error, msg);

	}
	
	public NVDRootPage verify_error_for_different_new_and_verifynew_password(String msg){
		return verify_element_by_text(different_new_and_verifynew_password_error, msg);

	}
	
	
	
	//AD: Click Logout
	public NVDRootPage click_log_out_from_NVD(){
		wait_until(3);
		return click_link(log_out);
    }

	
	public NVDRootPage click_change_username(){
		wait_until(3);
		return click_button(change_username);
	}
	
	public NVDRootPage enter_existing_password_to_change_username(String password){
		return enter(existing_password_for_changing_username, password);
	}
	
	public NVDRootPage enter_new_username(String password){
		return enter(new_username, password);
	}
	
	public NVDRootPage enter_verify_new_username(String password){
		return enter(verify_new_username, password);
	}
	
	public NVDRootPage click_save_username(){
		wait_until(3);
		return click_button(save_username);
	}
	
	public NVDRootPage click_ok_username(){
		wait_until(3);
		return click_button(ok_username);
	}
	
	public NVDRootPage verify_error_for_same_existing_and_new_username(String msg){
		return verify_element_by_text(new_username_is_same_as_existing_username, msg);
 }
	
	public NVDRootPage verify_error_for_wrong_password_to_change_username(String msg){
		return verify_element_by_text(wrong_password_for_username_change, msg);
 }

	public NVDRootPage verify_error_for_new_username_and_verify_new_username_mismatch(String msg){
		return verify_element_by_text(new_username_verify_new_username_mismatch, msg);
 }

	public NVDRootPage verify_error_for_password_not_meeting_requirement(String msg){
		return verify_element_by_text(password_not_meeting_requirement, msg);
}
	public NVDRootPage verify_error_for_wrong_existing_password(String msg){
		return verify_element_by_text(existing_password_is_not_correct, msg);
}

	public NVDRootPage click_credential_manager_button(){
		wait_until(5);
		return click_link(credential_manager_button);	
	}
	
	public NVDRootPage click_sourcing_manager_button(){
		wait_until(5);
		return click_link(sourcing_manager_link);	
	}

	public NVDRootPage verify_welcome_wizard_work_email(String msg){
		wait_until(5);
		return verify_element_by_text(welcome_wizard_work_email, msg);	
	}

	public NVDRootPage click_welcome_wizard_cancel_button(){
		wait_until(5);
		return click_link(welcome_wizard_cancel_button);	
	}

	public NVDRootPage click_credential_manager_in_sourcing_manager_home(){
		wait_until(5);
		return click_link(credential_manager_tab_in_sourcing_manager_home);	
	}
	
	//close button of change username pop up
	
	public NVDRootPage click_close_button_of_username_popup(){
		wait_until(5);
		return click_link(close_button_on_change_username_popup);	
	}
	
	//close button of change password pop up
	
	public NVDRootPage click_close_button_of_password_popup(){
		wait_until(5);
		return click_link(close_button_on_change_password_popup);	
	}
}