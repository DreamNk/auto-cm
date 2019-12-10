package com.ghx.auto.cm.ui.page;

import org.openqa.selenium.By;

public class RMNavigationPage extends CMAbstractPage<RMNavigationPage> {

	private By click_edit_customer_link = By.linkText("Edit Customer");
	private By enter_customer_name = By.id("namebox");
	private By click_search_button = By.className("vBtnComplete");
	private By click_edit_button = By.xpath("/html/body/form/table/tbody/tr/td/table/tbody/tr/td[3]/table/tbody/tr[2]/td/table/tbody/tr[5]/td/table/tbody/tr/td[1]/input[2]");
	private By click_kiosk_check_box = By.id("customer.enableKioskBeta"); 
	private By click_complete_button = By.className("vBtnComplete");
	private By click_logout_link = By.linkText("log out");
	
	
	
	
	// RM clicks on Edit customer link
	public RMNavigationPage click_edit_customer_link(){
		return click_link(click_edit_customer_link);
	}
	
	// RM enters customer name in edit customer search page
	public RMNavigationPage enter_customer_name(String customername){
		return enter (enter_customer_name, customername);
}

	// RM clicks on search button
	public RMNavigationPage click_search_button(){
		return click_button(click_search_button);
}
	// RM clicks on edit button
	public RMNavigationPage click_edit_button(){
		return click_button(click_edit_button);
}
	
	// RM checks kiosk beta flag
	public RMNavigationPage enable_kiosk_check_box(){
		boolean k = is_element_selected(click_kiosk_check_box);
		if (k != true)
		click_button(click_kiosk_check_box);
		return this;	
}
	
	// RM unchecks kiosk beta flag
	public RMNavigationPage disable_kiosk_check_box(){
		boolean k = is_element_selected(click_kiosk_check_box);
		if (k == true)
		click_button(click_kiosk_check_box);
		return this;	
}	
	
	// RM clicks on complete button
		public RMNavigationPage click_complete_button(){
			return click_button(click_complete_button);
}
	// RM clicks on logout link
		public RMNavigationPage click_logout_link(){
			return click_link(click_logout_link);
}

}
