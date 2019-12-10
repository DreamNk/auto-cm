package com.ghx.auto.cm.ui.angularjs.page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.ghx.auto.cm.ui.angularjs.page.AjsNBDRootPage;
import com.ghx.auto.cm.ui.page.CMAbstractPage;
import com.ghx.auto.cm.ui.page.NBDVendorsPage;
import com.ghx.auto.cm.ui.page.NVDCompanyProfilePage;



public class AjsNBDRootPage extends CMAbstractPage<AjsNBDRootPage> {
	
	private By change_password = By.id("headerAccount");
	//private By my_profile = By.linkText("My Profile");
	private By existing_password = By.id("changePassword.exitingPassword");
	private By new_password = By.id("changePassword.newPassword");
	private By save_password = By.id("changePasswordSubmit");
	private By ok_password = By.id("successBtn input-sm");
	private By same_existing_and_new_password_error = By.id("forgotPasswordError");
	private By different_new_and_verifynew_password_error = By.xpath("/html/body/div[7]/div/div/div/div[2]/vision-action/div/form/div[3]/div/span[3]");
	private By verify_new_password = By.id("changePassword.verifyNewPassword");
	private By password_not_meeting_requirement = By.xpath("/html/body/div[7]/div/div/div/div[2]/vision-action/div/form/div[3]/div/span[2]");
	private By existing_password_is_not_correct = By.xpath("/html/body/div[7]/div/div/div/div[2]/vision-action/div/div[2]/div");
	private By close_change_password_popup = By.id("cancelDialogClose");
	private By NBD_username_dropdown = By.id("headerUsername");
	private By tooltip_text = By.xpath("/html/body/div[7]/div/div/div/div[2]/vision-action/div/p[2]/em/span");
	private By global_search_field = By.name("search");
	private By search_results_text = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/accordion/div/div[1]/div[2]/div/div/div[1]/vision-data-table/div/div/div/div/table/tbody/tr/td[1]/a");
    private By rep_name_search_result = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/accordion/div/div[1]/div[2]/div/div/div[2]/vision-data-table/div/div/div[2]/div/table/tbody/tr/td[1]/a");
    private By rep_mailid_search_result = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/accordion/div/div[1]/div[2]/div/div/div[2]/vision-data-table/div/div/div[2]/div/table/tbody/tr/td[6]/a");
    
    //Locators for My Profile
    
    private By username_dropdown = By.xpath("/html/body/div[3]/header/div[1]/div/ul/li[1]/a/span[1]/span");
    private By my_profile = By.xpath("/html/body/div[3]/header/div[1]/div/ul/li[1]/ul/li[2]/a");
    private By user_id = By.xpath("/html/body/div[4]/div/div/div[1]/accordion/div/div/div[2]/div/div/div/div[1]/div/vision-action/form/div/div[2]/div[1]/div");
    private By edit_button = By.xpath("/html/body/div[4]/div/div/div[1]/accordion/div/div/div[2]/div/div/ul/li[2]/a");
    private By first_name = By.xpath("/html/body/div[4]/div/div/div[1]/accordion/div/div/div[2]/div/div/div/div[1]/div/vision-action/form/div/div[2]/div[3]/div");
    private By last_name = By.xpath("/html/body/div[4]/div/div/div[1]/accordion/div/div/div[2]/div/div/div/div[1]/div/vision-action/form/div/div[2]/div[3]/div");
    private By edit_first_name = By.xpath("/html/body/div[4]/div/div/div[1]/accordion/div/div/div[2]/div/div/div/div[2]/div/vision-action/form/div[2]/div[1]/div[3]/div/input");
    private By edit_last_name = By.xpath("/html/body/div[4]/div/div/div[1]/accordion/div/div/div[2]/div/div/div/div[2]/div/vision-action/form/div[2]/div[1]/div[3]/div/input");
    private By edit_phone_number = By.xpath("/html/body/div[4]/div/div/div[1]/accordion/div/div/div[2]/div/div/div/div[2]/div/vision-action/form/div[2]/div[2]/div[1]/div/input");
    private By save_button = By.xpath("/html/body/div[4]/div/div/div[1]/accordion/div/div/div[2]/div/div/div/div[2]/div/vision-action/form/div[3]/button");
    private By element_of_my_profile_page = By.xpath("/html/body/div[4]/div/div/div[1]/accordion/div/div/div[2]/div/div/ul/li[1]/a");
    
    
    //Methods for My profile Page
    public	AjsNBDRootPage click_my_profile(){
		return click_button(NBD_username_dropdown);
	}
	
    public AjsNBDRootPage verify_buyer_email(String msg){
		return verify_element_by_text(user_id, msg);
    }

    public AjsNBDRootPage verify_buyer_first_name(String msg){
		return verify_element_by_text(first_name, msg);
    }    
    
    public AjsNBDRootPage verify_buyer_last_name(String msg){
		return verify_element_by_text(last_name, msg);
    } 
    
    public	AjsNBDRootPage click_edit_tab(){
		return click_button(edit_button);
	}
    
    public AjsNBDRootPage enter_first_name(String msg){
		return enter(edit_first_name, msg);
	}
	
    public AjsNBDRootPage enter_last_name(String msg){
		return enter(edit_last_name, msg);
	}
    
    public AjsNBDRootPage edit_phone_number(String msg){
		return enter(edit_phone_number, msg);
	}
    
    public	AjsNBDRootPage click_save_button(){
		return click_button(save_button);
	}
    
    public AjsNBDRootPage wait_for_element_of_page_to_load(){
		wait_until(ExpectedConditions.visibilityOfElementLocated(element_of_my_profile_page));
		return this;
	}
    
    public AjsNBDRootPage wait_for_element_of_edit_page_to_load(){
		wait_until(ExpectedConditions.visibilityOfElementLocated(edit_first_name));
		return this;
	}
    
    
    // Logged into NBD and clicked on username dropdown 
	public	AjsNBDRootPage click_username_dropdown(){
		return click_button(NBD_username_dropdown);
	}
		
	// Click on cross sign option on change password pop up
	public	AjsNBDRootPage click_cross_sign_on_change_apssword_popup(){
		return click_button(close_change_password_popup);
	}
		
	
	//  click 'change password' from user drop down
	public AjsNBDRootPage click_change_password(){
		wait_until(ExpectedConditions.visibilityOfElementLocated(change_password));
		return click_button(change_password);
	}
	
	 // enter existing password in change password pop up
	public AjsNBDRootPage enter_existing_password(String password){
		return enter(existing_password, password);
	}

	// enter new password in change password pop up
	public AjsNBDRootPage enter_new_password(String password){
		return enter(new_password, password);
	}
	
	// enter 'verify new password' in change password pop up
	public AjsNBDRootPage enter_verify_new_password(String password){
		return enter(verify_new_password, password);
	}
	
	// click save in change password pop up
	public AjsNBDRootPage click_save_password(){
		wait_until(3);
		return click_button(save_password);
	}
	
	// click ok  in change password notification 
	public AjsNBDRootPage click_ok_password(){
		wait_until(3);
		return click_button(ok_password);
	}
	
	// verify samw password entry in existing and new password field
	public AjsNBDRootPage verify_same_existing_and_new_password_error(String msg){
		return verify_element_by_text(same_existing_and_new_password_error, msg);

	}
	
	
	// verify incomplete passowrd entry in new password field
	public AjsNBDRootPage verify_error_for_password_not_meeting_requirement(String msg){
		return verify_element_by_text(password_not_meeting_requirement, msg);
	}
	
	// verify wrong existing password entry
	public AjsNBDRootPage verify_error_for_wrong_existing_password(String msg){
		return verify_element_by_text(existing_password_is_not_correct, msg);
	}
	
	// verify tool tip text on change password pop up
	public AjsNBDRootPage verify_tooltip_text(String msg){
		return verify_element_by_text(tooltip_text, msg);
	}
	
	// verify different passwords in new and verify new password fields
	public AjsNBDRootPage verify_error_for_different_new_and_verifynew_password(String msg){
		return verify_element_by_text(different_new_and_verifynew_password_error, msg);

	}
	
	// enter text in global search field
	public AjsNBDRootPage global_search_field(String companyname) {
		return enter(global_search_field, companyname);

	}

	// global search results company name text
	public AjsNBDRootPage verify_search_results_text(String msg) {
		wait_until(10);
		return verify_element_by_text(search_results_text, msg);

	}

	// global search results rep name text
	public AjsNBDRootPage verify_rep_name_search_results_text(String msg) {
		wait_until(10);
		return verify_element_by_text(rep_name_search_result, msg);

	}

		// global search results rep name text
	public AjsNBDRootPage verify_rep_mailid_search_results_text(String msg) {
		wait_until(10);
		return verify_element_by_text(rep_mailid_search_result, msg);

	}

	public AjsNBDRootPage press_enter() {
		AjsCommonUtilities c = new AjsCommonUtilities();
		wait_until(2);
		c.pressEnter();
		wait_until(3);
		return this;
	}
	
}
