package com.ghx.auto.cm.ui.page;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;

import javax.imageio.ImageIO;

public class CommonUtilities extends CMAbstractPage<CommonUtilities> {
	
	private By next_page = By.className("yui-pg-next");
	private By last_page = By.className("yui-pg-last");
	private By previous_page = By.className("yui-pg-previous");
	private By first_page = By.cssSelector("[class='yui-pg-first'][title='First Page']");
	private By change_pagination = By.className("yui-pg-rpp-options");
	private By close_popup = By.linkText("Close");
	private By log_out = By.id("welcomeMenu");
	private By log_out_link = By.linkText("Logout");
	
// Log out from NVD
	private By NVD_log_out = By.xpath(".//div[@id='menuwithWelcomegroups']/div[1]/ul[5]/li/a");
	private By user_name_dropdown = By.id("welcomeMenu-button");
// Log out from NBD
	private By NBD_username_dropdown = By.id("welcomeMenu-button");
	private By NBD_log_out = By.xpath(".//div[@id='menuwithWelcomegroups']/div[1]/ul[3]/li/a");
	
	// Click on the Next Page
	public CommonUtilities clickNextPage() {
		wait_until(2);
		return click_button(next_page);
	}

	// Click on the Last Page
	public CommonUtilities clickLastPage() {
		wait_until(2);
		return click_button(last_page);
	}

	// Click on the Previous Page
	public CommonUtilities clickPrevPage() {
		wait_until(2);
		return click_button(previous_page);
	}

	// Click on the First Page
	public CommonUtilities clickFirstPage() {
		wait_until(3);
		return click_button(first_page);
	}
		 
	// Press Enter
	public CommonUtilities pressEnter() {
		try {
			Robot robot = new Robot();
			robot.delay(1000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return this;
	}

	// Click on the Pagination Number
	public CommonUtilities clickPaginationNumber(String number) {
		wait_until(3);
		return click_link(By.linkText(number));
	}

	// Change the pagination Number of records
	public CommonUtilities changePagination(String pagination) {
		wait_until(5);
		return select_by_value(change_pagination, pagination);
	}

	// Close Pop Up Window
	public CommonUtilities closePopUp() {
		wait_until(4);
		return click_button(close_popup);
	}

	// Document Upload
	public CommonUtilities browseFile(String path) {
		try {
			StringSelection ss = new StringSelection(path);
			Toolkit.getDefaultToolkit().getSystemClipboard()
					.setContents(ss, null);
			Robot robot = new Robot();
			robot.delay(5000);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.delay(2000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			robot.delay(7000);
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return this;
	}

	// Save / Download File
	public CommonUtilities saveFile() {
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

	// Take Screen Shots -
	public CommonUtilities takeScreenShot(String path) {
		try {
			wait_until(2);
			BufferedImage image = new Robot()
					.createScreenCapture(new Rectangle(Toolkit
							.getDefaultToolkit().getScreenSize()));
			ImageIO.write(image, "jpg", new File(path));
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return this;
	}

	// Logout
	public CommonUtilities doLogout() {
		wait_until(10);
		mouseover(log_out).mouseover(log_out).click_link(log_out_link);
		wait_until(10);
		return this;
	}
	
	public String[] get_current_date(){
		Date date = new Date();
		String DATE_FORMAT = "MMMM/dd/yyyy";
		SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
		String current_date = sdf.format(date);
		String[] parts = current_date.split("/");
		String month = parts[0]; // month
		String currentdate = parts[1]; // date
		String year = parts[2]; // year
		return parts;
	}
	
	public String get_current_time_stamp(){
		Date date = new Date();
		String DATE_FORMAT = "MM/dd/yyyy";
		SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
		String current_date = sdf.format(date);
		String[] parts = current_date.split("/");
		String month = parts[0]; // month
		String currentdate = parts[1]; // date
		String year = parts[2]; // year
		String datestamp = month+currentdate+year;
		return datestamp;
	}
 
		 
	public String get_clipboard_data(){
		String actual_url = null;
		try {	actual_url = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);}
		catch (Exception e) { e.printStackTrace();}
		return actual_url;
	}
	//-------------------------------------------------------------------------------------------------------------//	 
		//Credential Manager Common Utility 
		 
	private By back_to_home = By.linkText("back to Home");

	public CommonUtilities clickBackToHome() {
		wait_until(10);
		return click_link(back_to_home);
	}

	public CommonUtilities click_log_out_from_NVD() {
		wait_until(3);
		click(user_name_dropdown);
		wait_until(2);
		click_link(NVD_log_out);
		return wait_until(10);
	}

	// changed wait time from 5 to 2 seconds after clicking username drop down
	public CommonUtilities do_log_out_from_NBD() {
		wait_until(3);
		click_button(NBD_username_dropdown);
		wait_until(2);
		click_button(NBD_log_out);
		return wait_until(10);
	}
}





