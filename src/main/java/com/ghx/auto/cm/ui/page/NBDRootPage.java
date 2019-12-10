package com.ghx.auto.cm.ui.page;

import org.openqa.selenium.By;

public class NBDRootPage extends CMAbstractPage<NBDRootPage>{
	
	private By username_dropdown = By.id("welcomeMenu-button");
	private By change_password = By.id("chgPass");
	private By my_profile = By.linkText("My Profile");
	private By user_id_my_profile = By.xpath(".//div[@id='myProfileViewTabContent']/div[2]/div[1]/span[2]/div");
	private By log_out = By.xpath(".//div[@id='menuwithWelcomegroups']/div[1]/ul[3]/li/a");
	private By existing_password = By.id("existingPassword");
	private By new_password = By.id("newPassword");
	private By save_password = By.id("save");
	private By ok_password = By.id("ok");
	private By same_existing_and_new_password_error = By.id("existingPassword.errorspan");
	private By different_new_and_verifynew_password_error = By.id("newPassword.errorspan");
	private By verify_new_password = By.id("verifyNewPassword");
	private By password_not_meeting_requirement = By.id("newPassword.errorspan");
	private By existing_password_is_not_correct = By.xpath(".//div[@id='changepwdDiv']/span[2]");
	private By close_change_password_popup = By.xpath(".//div[@id='chgPassW_c']/div[1]/a");
	
	//Old KIOSK -----------------------------------------------------
	private By action_menu = By.id("actionMenu-button");
	private By configure_sign_in_machine = By.xpath(".//div[@id='menuwithgroups']/div[1]/ul[1]/li[1]/a");
	private By select_location = By.id("signIn.Machine.user.location");
	private By select_entry_point = By.id("signIn.Machine.user.entryPoint");
	private By vendormate_signin_link = By.linkText("Vendormate Sign-In");
	private By unconfigure_sign_in_machine = By.id("unSignInMachineMenu");
	private By unconfigure_button = By.xpath(".//div[@id='unConfigureSignInMachContentDiv']/div/div[3]/a/span/input");

	
	
	// Logged into NBD and clicked on username dropdown 
	public	NBDRootPage click_username_dropdown(){
		return click_button(username_dropdown);
}
	
	// Click on cross sign option on change password pop up
	public	NBDRootPage click_cross_sign_on_change_apssword_popup(){
		return click_button(close_change_password_popup);
}
	
	// Clicked on My Profile option from username dropdown 
	public	NBDRootPage click_my_profile(){
		return click_button(my_profile);
}

	// In My Profile accordion, verifying user ID label 
	public	NBDRootPage verify_user_id_in_my_profile(String msg){
		return verify_element_by_text(user_id_my_profile, msg);
}

	//  logging out from NBD 
	public NBDRootPage click_log_out_from_NBD(){
		wait_until(5);
		return click_button(log_out);
}
	//  click 'change password' from user drop down
	public NBDRootPage click_change_password(){
		wait_until(5);
		return click_button(change_password);
}
    // enter existing password in change password pop up
	public NBDRootPage enter_existing_password(String password){
		return enter(existing_password, password);
}

	// enter new password in change password pop up
	public NBDRootPage enter_new_password(String password){
		return enter(new_password, password);
}
	// enter 'verify new password' in change password pop up
	public NBDRootPage enter_verify_new_password(String password){
		return enter(verify_new_password, password);
}
	// click save in change password pop up
	public NBDRootPage click_save_password(){
		wait_until(3);
		return click_button(save_password);
}
	// click ok  in change password notification 
	public NBDRootPage click_ok_password(){
		wait_until(3);
		return click_button(ok_password);
}
	// verify samw password entry in existing and new password field
	public NBDRootPage verify_same_existing_and_new_password_error(String msg){
		return verify_element_by_text(same_existing_and_new_password_error, msg);

}
	// verify different passwords in new and verify new password fields
	public NBDRootPage verify_error_for_different_new_and_verifynew_password(String msg){
		return verify_element_by_text(different_new_and_verifynew_password_error, msg);

}
    // verify incomplete passowrd entry in new password field
	public NBDRootPage verify_error_for_password_not_meeting_requirement(String msg){
		return verify_element_by_text(password_not_meeting_requirement, msg);
}
   // verify wrong existing password entry
	public NBDRootPage verify_error_for_wrong_existing_password(String msg){
		return verify_element_by_text(existing_password_is_not_correct, msg);
}

//Old Kiosk---------------------------------------------------------
	
  // Click on Action menu dropdown in NBD
	public	NBDRootPage click_action_menu(){
		return click_button(action_menu);
}
		
	
  // Click on Action menu dropdown in NBD
	public	NBDRootPage click_configure_signin_machine(){
		return click_button(configure_sign_in_machine);
}
  // select location for signin
	public	NBDRootPage select_location_for_old_kiosk(String location){
		return select_by_name(select_location, location);
}
	
  // select location for signin
	public	NBDRootPage select_entry_point_for_old_kiosk(String poe){
		return select_by_name(select_entry_point, poe);
}
	
  // click vendormate sign in link
	public	NBDRootPage click_vendormate_sign_in_link(){
		return click_link(vendormate_signin_link);
}
	
 // Click unconfigure signin machine link
	public	NBDRootPage click_unconfigure_signin_machine(){
		return click_button(unconfigure_sign_in_machine);
}
	
 // Click Unconfigure button
	public	NBDRootPage click_unconfigure_button(){
		return click_button(unconfigure_button);
}
	
}

