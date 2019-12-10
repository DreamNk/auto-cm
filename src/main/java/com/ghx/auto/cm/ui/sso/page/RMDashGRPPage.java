package com.ghx.auto.cm.ui.sso.page;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;

import com.ghx.auto.cm.ui.page.CMAbstractPage;

public class RMDashGRPPage extends CMAbstractPage<RMDashGRPPage> {
 
	private By searchFein = By.xpath("//*[contains(@name,'filterForGlobalProfileString')]");	
	private By searchButton = By.id("_eventId_search");
	private By editButton = By.xpath("//*[contains(@value,'Edit')]");
	private By currentRegistrationCount = By.xpath("//tbody/tr[8]/td[4]");
	private By cancelButton = By.xpath("//input[@value='Cancel']");
	private By returnToDashButton = By.xpath("//input[@value='Return to Dashboard']");
	
	// For Test Date used in GRP zero case //
	static DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	static Date date = new Date();
	public static String paymentTermStartDate = dateFormat.format(date);
	public static String credTermStartDate =  dateFormat.format(date);
	public static String vcPaidThisTerm = "0";
	public static String grp_service_level = "Offer";
	public static String vcoid = "waynehealthcare";
	public static String status_code = "ACT";
	public static String copoun_code = "discount";
	
	public RMDashGRPPage enter_Fein(String VendorFein){
		wait_until(3);
		enter(searchFein, VendorFein);
		return this;
	}
		
	public RMDashGRPPage click_serach_button(){
		click(searchButton);
		return this;
	}
	
	public RMDashGRPPage click_edit_button(){
		wait_until(3);
		click(editButton);
		return this;
	}

	public String get_registration_count(String count){
		wait_until(3);
		count = find_element_text(currentRegistrationCount);
		return count;
	}
	
	public RMDashGRPPage click_cancel_button(){
		click(cancelButton);
		return this;
	}
	
	public RMDashGRPPage verify_registration_count(String ActualCount) {
		  return verify_element_by_text(currentRegistrationCount, ActualCount);
	}
	
	public RMDashGRPPage click_return_to_dash_button(){
		click(returnToDashButton);
		return this;
	}
}
