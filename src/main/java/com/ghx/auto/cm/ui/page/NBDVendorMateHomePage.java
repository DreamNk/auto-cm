package com.ghx.auto.cm.ui.page;

import org.openqa.selenium.By;

public class NBDVendorMateHomePage extends CMAbstractPage<NBDVendorMateHomePage> {
	private By vendormate_home = By.id("credential_cr_status_ac_link");
	private By cross_sign = By.id("close_x");
	private By vendor_management_iframe_id = By.id("marketingUrl");
	private By prod_total_vendors_text = By.xpath(".//div[@id='ie8VendorManagementChartLegend']/div[1]/span[2]/a");
	
	// click vendormate home link
	public  NBDVendorMateHomePage click_vendormate_home_link(){
		
		return click_link(vendormate_home);
	 }
	
	// close account management pop up on vendormate home page
	public  NBDVendorMateHomePage click_cross_sign_of_popup(){
		wait_until(25);
		switch_to_frame(vendor_management_iframe_id);
		return click_popup(cross_sign);
	 }
	
	//verify total vendors text on production vendormate home page
	public  NBDVendorMateHomePage verify_total_vendors_text_prod(String msg){
		wait_until(25);
		return verify_element_by_text(prod_total_vendors_text, msg);
	 }
}
