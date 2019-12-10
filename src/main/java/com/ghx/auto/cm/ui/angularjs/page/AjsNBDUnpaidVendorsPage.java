package com.ghx.auto.cm.ui.angularjs.page;

import org.openqa.selenium.By;

import com.ghx.auto.cm.ui.page.CMAbstractPage;
import com.ghx.auto.cm.ui.page.NBDHomePage;


public class AjsNBDUnpaidVendorsPage extends CMAbstractPage<AjsNBDUnpaidVendorsPage> {
	private By unpaid_vendors = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/div/div/div[2]/div/div[2]/div/vision-action/div[2]/a");
	private By first_name_filter_field = By.xpath("/html/body/div[4]/div/div/div[1]/accordion/div/div/div[2]/div/div/vision-data-table/div[5]/div/div[1]/table/thead/tr[2]/th[1]/div/div/div/input");
	private By last_name_filter_field = By.xpath("/html/body/div[4]/div/div/div[1]/accordion/div/div/div[2]/div/div/vision-data-table/div[5]/div/div[1]/table/thead/tr[2]/th[2]/div/div/div/input");
	private By company_filter_field = By.xpath("/html/body/div[4]/div/div/div[1]/accordion/div/div/div[2]/div/div/vision-data-table/div[5]/div/div[1]/table/thead/tr[2]/th[3]/div/div/div/input");
	private By clear_filter_icon = By.xpath("/html/body/div[4]/div/div/div[1]/accordion/div/div/div[2]/div/div/vision-data-table/div[4]/button");
	private By back_to_home_link = By.id("unpaidBackToHomeLink");
	private By reps_of_unpaid_vendors = By.xpath("/html/body/div[4]/div/div/div[1]/accordion/div/div/div[1]/h4/a/span/a");
	private By first_name_text = By.xpath("/html/body/div[4]/div/div/div[1]/accordion/div/div/div[2]/div/div/vision-data-table/div[5]/div/div[1]/table/tbody/tr/td[1]");
	private By last_name_text = By.xpath("/html/body/div[4]/div/div/div[1]/accordion/div/div/div[2]/div/div/vision-data-table/div[5]/div/div[1]/table/tbody/tr/td[2]");
	private By company_name_text = By.xpath("/html/body/div[4]/div/div/div[1]/accordion/div/div/div[2]/div/div/vision-data-table/div[5]/div/div[1]/table/thead/tr[2]/th[3]/div/div/div/input");
	
	// click unpaid vendors link on NBD home page
	public AjsNBDUnpaidVendorsPage click_unpaid_vendors(){
		return click_link(unpaid_vendors);
	}
		
	// verify accordion text on unpaid vendors page
	public AjsNBDUnpaidVendorsPage verify_unpaid_vendors_header_text(String msg){
		return verify_element_by_text(reps_of_unpaid_vendors, msg);
	}
	
	//verify first name text on unpaid vendors page
	public AjsNBDUnpaidVendorsPage verify_first_name_text(String msg) {
		wait_until(10);
		return verify_element_by_text(first_name_text, msg);

	}
	
	//verify last name text on unpaid vendors page
	public AjsNBDUnpaidVendorsPage verify_last_name_text(String msg) {
		wait_until(10);
		return verify_element_by_text(last_name_text, msg);

	}
	
	//verify company name text on unpaid vendors page
	public AjsNBDUnpaidVendorsPage verify_company_name_text(String msg) {
		wait_until(10);
		return verify_element_by_text(company_name_text, msg);

	}
	
	// enter company name in company name filter field on unpaid vendors page
	public AjsNBDUnpaidVendorsPage enter_company_name_in_filter_field(String legalname) {
		wait_until(10);
		return enter(company_filter_field, legalname);

	}
	
	// enter first name in first name filter field on unpaid nvendors page
	public AjsNBDUnpaidVendorsPage enter_first_name_in_filter_field(String firstname) {
		wait_until(10);
		return enter(first_name_filter_field, firstname);

	}
	
	// enter last name in last name filter field on unpaid vendors page
	public AjsNBDUnpaidVendorsPage enter_last_name_in_filter_field(String lastname) {
		wait_until(10);
		return enter(last_name_filter_field, lastname);

	}
	
	public AjsNBDUnpaidVendorsPage press_enter() {
		AjsCommonUtilities c = new AjsCommonUtilities();
		wait_until(2);
		c.pressEnter();
		wait_until(3);
		return this;
	}
	
	// Click clear link on unpaid vendors page
	public AjsNBDUnpaidVendorsPage click_clear_link() {
		return click_button(clear_filter_icon);

	}
}
