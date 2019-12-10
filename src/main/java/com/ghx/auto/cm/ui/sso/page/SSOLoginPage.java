package com.ghx.auto.cm.ui.sso.page;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.ghx.auto.cm.ui.page.CMAbstractPage;
import com.ghx.auto.cm.ui.page.NBDLogin;

public class SSOLoginPage extends CMAbstractPage<SSOLoginPage> {

	String baseUrl = "http:login-stg.awsdsi.ghx.com";
	private By GhxLogin = By.xpath("html/body/div[3]/div/div/div/div/div[2]/form/h4/b");
	private By emailId = By.id("j_username");
	private By password = By.id("j_password");
	private By loginButton = By.id("btnLogin");
	private By forgotPassword = By.linkText("Forgot Password?");
	private By newSupplierRegistration = By.linkText("New Supplier Registration?");

	// Footer links-----------------------------------------------------------------------
	private By termOfUserFooter = By.linkText("Terms of Use");
	private By privacyPolicyFooter = By.linkText("Privacy Policy");
	private By supportFooter = By.linkText("Support");

	// User Account lock------------------------------------------------------------------
	private By userNameOrPasswordInvalidMsg = By.id("errMsg");
	private By errorMsgOf4thOr5thAttempt = By.xpath("//*[contains (@class, 'alert alert-danger')]");
	
	
	// Expired Password //
	private By newPwd = By.id("newPassword");
	private By confirmPwd = By.id("confirmPassword");
	private By saveButton = By.id("passwordSaveBtn");
	private By passwordResetSuccessMsg = By.xpath("//*[contains(@class,'alert alert-success')]");
	String successText = "Your password has been updated successfully. Please login with new credentials.";
	static int cellval2 ;
	static int Number;
	static String Char;
	
	
	
	// load login url
	public SSOLoginPage invoke_loginURL(String URL) {
		load(URL);
		wait_until(2);
		handle_browser_exceptions();
		return this;
	}

	// enter username
	public SSOLoginPage enter_username(String username) {
		return enter(emailId, username);
	}

	// enter password
	public SSOLoginPage enter_password(String pwd) {
		return enter(password, pwd);
	}

	// click log in button
	public SSOLoginPage click_login_button() {
		click_button(loginButton);
		return wait_until(9);
	}

	public SSOLoginPage verify_username_or_password_invalid_msg(String msg) {
		return verify_element_by_text(userNameOrPasswordInvalidMsg, msg);
	}

	public SSOLoginPage verify_error_msg_of_4th_attempt(String msg) {
		return verify_element_by_text(errorMsgOf4thOr5thAttempt, msg);
	}

	public SSOLoginPage verify_error_msg_of_5th_attempt(String msg) {
		return verify_element_by_text(errorMsgOf4thOr5thAttempt, msg);
	}

	public SSOLoginPage verify_password_reset_success_msg(String msg) {
		return verify_element_by_text(passwordResetSuccessMsg, msg);
	}
	
	public SSOLoginPage click_forgot_password_link(){
		return click(forgotPassword);
	}
	
	public SSOLoginPage verify_text_in_login_page(String text) {
		return verify_element_by_text(GhxLogin, text);
	}

	public SSOLoginPage verify_password_expired_or_not(String filePath, String fileName, String sheetName) throws Exception {
	  String username = sheetName;
	  if(is_text_present_on_page("Reset"))
		{
			System.out.println("Password has been Expired");
			FileInputStream inputStream=new FileInputStream(filePath);
			Workbook Test = null;
			String fileExtensionName = fileName.substring(fileName.indexOf(".")); 
			
			//Check condition if the file is xlsx file//
			if(fileExtensionName.equals(".xlsx")){
			Test = new XSSFWorkbook(inputStream);
		     }
			Sheet sh=Test.getSheet(sheetName);
			Row row=sh.getRow(1);                               // Row 1 //
			Cell cell1=row.getCell(1);							// Cell B2 //
			String cellval1=cell1.getStringCellValue();
			Char = cellval1;
			Cell cell2=row.getCell(2);							//  Cell C2 // 
			cellval2 = (int) cell2.getNumericCellValue();
			Number = ++cellval2; 
			cell2.setCellValue(Number);
			Cell cell3 = row.createCell(4);						// Cell E4 //
		    cell3.setCellValue(Char+Number);			
		    String newPassword = Char+Number;
		    FileOutputStream outputStream = new FileOutputStream(filePath);
		    Test.write(outputStream);
			outputStream.close();
			
		    enter(newPwd, newPassword);
		    enter(confirmPwd, newPassword);
		    click(saveButton);
		    wait_until(5);
		  //  verify_element_by_text(passwordResetSuccessMsg, successText);
		    enter(emailId, username);
		    enter(password, newPassword);
		    click_button(loginButton);
		   System.out.println("New Password has been set for user "+username);
		}
		
		return this;
	}


}