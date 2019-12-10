package com.ghx.auto.cm.ui.angularjs.page;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.By;
import com.ghx.auto.cm.ui.page.CMAbstractPage;

public class AjsCommonUtilities extends CMAbstractPage<AjsCommonUtilities> {
	
	private By user_name_dropdown = By.id("headerUsername");
	private By log_out = By.id("headerLogout");
	private By close_popup = By.linkText("Close");
	
	// NBD log out
	private By NBD_username_dropdown = By.id("headerUsername");
	private By NBD_log_out = By.id("headerLogout");
	
	
	//Logout from CPM & Kiosk
	public AjsCommonUtilities do_log_out(){
        click_button(user_name_dropdown);
		wait_until(5);
		click_link(log_out);
		return wait_until(10);
	}
	
	//Logout from NBD
	public AjsCommonUtilities do_log_out_from_NBD() {
		wait_until(3);
		click_button(NBD_username_dropdown);
		wait_until(5);
		click_button(NBD_log_out);
		return wait_until(5);
	}
	
	//Press Enter 
	 public AjsCommonUtilities pressEnter()  {
	    try {    
		 	Robot robot = new Robot();
			robot.delay(1000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
	    } catch (Throwable t){}
		return this;
	 }
	 
	 //Close Popup
	 public AjsCommonUtilities click_close_popup() {
			wait_until(7);
			return click_link(close_popup);
	}
	
	 // Get current date -	 
	 public String get_current_date_mm_dd_yyyy(){
		 Date date = new Date();
		 String DATE_FORMAT = "MM/dd/yy";
		 SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
		 String current_date = sdf.format(date);
		 return current_date;
	 }	
	 
	 public String get_current_yy_mm_dd_sss_number(){
		 Date date = new Date();
		 String DATE_FORMAT = "yyMMddSSS";
		 SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
		 String current_date = sdf.format(date);
		 return current_date;
	 }	
	 
	// Save / Download File
	 public  AjsCommonUtilities saveFile() {
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
}
