package com.ghx.auto.cm.ui.sso.page;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;

import com.ghx.auto.cm.ui.page.CMAbstractPage;
import com.ibm.icu.util.Calendar;

import ch.qos.logback.core.net.SyslogOutputStream;

public class SSOCommonUtilities extends CMAbstractPage<SSOCommonUtilities> {

	private By close_popup = By.linkText("Close");
	private By solutionSelector = By.xpath("//*[contains(@class,'fa fa-th fa-white')]");
	private By continueButton = By.xpath("//*[contains(text(),'Continue')]");
	private By browseButton = By.xpath("//*[contains(@type,'file')]");
	private By usernameDropdown = By.id("headerUsername");
	
	private By clickHere = By.linkText("click here");
	private By vendormateCredentialingLink = By.linkText("Vendormate Credentialing");
	private By vendormateCredentialingHeader = By.id("headerAppName");
	private By TVIcon = By.id("systemInformation");
	private By GHXSystemStatus = By.xpath("//div[2]//h3");
	private By closeSystemStatusButton = By.id("systemInformationClose");
	private By homeInSolutionSelector = By.xpath(".//*[@id='multiAppContent']/div/ul/li[2]/div/ul/li/a/span");
	private By homeInSolutionSelectorOfCPMInStg = By.xpath(".//*[@id='multiAppContent']/div/ul/li[7]/div/ul/li/a/span");
	private By homeInSolutionSelectorOfCPMInProd = By.xpath(".//*[@id='multiAppContent']/div/ul/li[8]/div/ul/li/a/span");
	private By homeInSolutionSelectorInStag = By.xpath(".//*[@id='multiAppContent']/div/ul/li[3]/div/ul/li/a/span");
	private By homeInSolutionSelectorInStag1 = By.xpath("//*[@id='multiAppContent']/div/ul/li[2]/div/ul/li/a/span");
	private By scrollDownfromSolutionSelector = By.xpath("//*[contains(@id,'scrollDown')]");
	private By scrollDownfromSolutionSelectorForRep = By.xpath(".//*[@id='multiAppContent']/div/ul/li[2]/div/ul/li/a/span");
	
	private By logout = By.id("headerLogout");
	
	
	// Press Enter
	public SSOCommonUtilities pressEnter() {
		try {
			Robot robot = new Robot();
			robot.delay(1000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		} catch (Throwable t) {
		}
		return this;
	}

	// Close Popup
	public SSOCommonUtilities click_close_popup() {
		wait_until(7);
		return click_link(close_popup);
	}
	// Close Popup Window using Robot class
public SSOCommonUtilities close_popup_window() {
		
		try {
			Robot robot = new Robot();
			robot.delay(1000);
			robot.keyPress(KeyEvent.VK_ALT);
			robot.keyPress(KeyEvent.VK_F4);
			robot.keyRelease(KeyEvent.VK_ALT);
			robot.keyRelease(KeyEvent.VK_F4);
		} catch (Throwable t) {
		}
		return this;
	}
	// Get current date -
	public String get_current_date_mm_dd_yyyy() {
		Date date = new Date();
		String DATE_FORMAT = "MM/dd/yy";
		SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
		String current_date = sdf.format(date);
		return current_date;
		
		
	}
		
	public String get_current_yy_mm_dd_sss_number() {
		Date date = new Date();
		String DATE_FORMAT = "yyMMddSSS";
		SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
		String current_date = sdf.format(date);
		return current_date;
	}

	// Save / Download File
	public SSOCommonUtilities saveFile() {
		try {
			Robot robot = new Robot();
			robot.delay(10000);
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			robot.delay(2000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			robot.delay(2000);
			robot.keyPress(KeyEvent.VK_ESCAPE);
			robot.keyRelease(KeyEvent.VK_ESCAPE);
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return this;
	}
	
	//Solution selector method
	public SSOCommonUtilities select_option_from_solution_selector(String text) {
		wait_until(3);
		click(solutionSelector);
		wait_until(2);
		click(By.linkText(text));
		wait_until(3);
		return this;
	}
	
	
	//click continue button
	public SSOCommonUtilities click_continue_button() {
		wait_until(7);
		return click(continueButton);
	}
	
	//upload file
	public SSOCommonUtilities upload_file(String file_path) {
		return enter(browseButton, file_path);
	}
	
	//Select from Username dropdown
	public SSOCommonUtilities select_option_from_userName_dropdown(String text) {
		click(usernameDropdown);
		click(By.linkText(text));
		wait_until(5);
		return this;
	}
	
	public SSOCommonUtilities click_solution_selector() {
		wait_until(3);
		click(solutionSelector);
		return this;
	}
	
	public SSOCommonUtilities click_username_dropdown(){
		click(usernameDropdown);
        return this;
    }
	public SSOCommonUtilities click_home_from_solution_selector() {
		wait_until(3);
		click(homeInSolutionSelector);
		return this;
	}
	
	public SSOCommonUtilities click_home_from_solution_selector_in_stag() {
		wait_until(3);
		try{
		click(homeInSolutionSelectorInStag);
		}catch(Exception e)
		{
		click(homeInSolutionSelectorInStag1);
		}
		
		return this;
	}
	
	
	public SSOCommonUtilities click_home_in_solution_selector_of_CPM_Stag() {
		wait_until(3);
		click(homeInSolutionSelectorOfCPMInStg);
		return this;
	}
	
	public SSOCommonUtilities click_home_in_solution_selector_of_CPM_Prod() {
		wait_until(3);
		click(homeInSolutionSelectorOfCPMInProd);
		return this;
	}	
		
	public SSOCommonUtilities verify_username(String username) {
		verify_element_by_text(usernameDropdown, username);
		wait_until(2);
		return this;
	}
	// GHX TV Icon
	public SSOCommonUtilities click_tv_icon(){
		wait_until(1);
		return click_button(TVIcon);
	}
	
	public SSOCommonUtilities verify_GHX_system_status(){
		wait_until(5);
		return verify_element_by_text(GHXSystemStatus, "GHX System Status");
	}
	
	public SSOCommonUtilities click_close_system_status_button(){
		wait_until(1);
		return click_button(closeSystemStatusButton);
	}
	
	// code for access denied link
	public SSOCommonUtilities checkAccessDeniedMessage(){
		
		//String clickHereString = find_element_text(clickHere);
		//System.out.println(" verify " + clickHereString );		
			
		if(is_text_present_on_page("click here")){
			System.out.println("in if");
			click_link(clickHere);
			wait_until(1);
			click_link(vendormateCredentialingLink);
		}
		else{
			System.out.println("in else");
			return null;
			//verify_element_by_text(vendormateCredentialingHeader, "Vendormate Credentialing");
		}
		return this;
	}
	// code for skipping vendormate credentialing link
	public SSOCommonUtilities checkSSOLandingPageLink(){
		
		
		if(is_text_present_on_page("My Exchange")){
			System.out.println("in if");
			click_link(vendormateCredentialingLink);
		}
		else{
			System.out.println("in else 2");
			return null;
		}
		return this;
	}
	
	public SSOCommonUtilities verify_userName(String uesrname) {
		verify_element_by_text_continue(usernameDropdown, uesrname);
		wait_until(2);
		return this;
	}
	
	public SSOCommonUtilities click_scroll_down_from_solution_selector() {
		click(scrollDownfromSolutionSelector);
		wait_until(1);
		return this;
	}
	
	public SSOCommonUtilities click_scroll_down_from_solution_selector_for_rep() {
		click(scrollDownfromSolutionSelectorForRep );
		wait_until(1);
		return this;
	}
	
	// logout from SSO portal
	public SSOCommonUtilities click_logout(){
		wait_until(2);
		return click_button(logout);
	}

	public SSOCommonUtilities clear_current_session(){
		clear_session();
		return this;
	}
	public SSOCommonUtilities wait_for_text_appear(String text){
		wait_until_text_appears_on_page(text);
		return this;
	}
	public SSOCommonUtilities close_vendor_manager_tab(){
		verify_element_by_text(By.xpath("/html/body/div[3]/div[5]/div/div[1]/div/div/div/div/p/span[1]"), "Vendor");
		System.out.println("Exception");
	/*	try{			close_popup_window();
		}
		catch(Exception e){
			System.out.println("Exception");
		}
		*/
		return this;
	}
}
