package com.ghx.auto.cm.ui.sso.page;

import org.openqa.selenium.By;

import com.ghx.auto.cm.ui.page.CMAbstractPage;

public class RMDashEditCustomerPage extends CMAbstractPage<RMDashEditCustomerPage> {
	
	
	private By customeSearchBox = By.xpath("//*[contains(@id,'namebox')]");
	private By searchButton = By.xpath("//*[contains(@value,'Search')]");
	private By editButton = By.xpath("//*[contains(@value,'Edit')]");
	private By passwordRequiredCheckBox = By.xpath("//*[contains(@id,'customer.signinRequiredPassword')]");
	private By completeButton = By.xpath("//*[contains(@value,'Complete')]");

	private By viewButton = By.xpath("//*[contains(@value,'View')]");
	private By manageNSORDetailsButton= By.xpath("//*[contains(@value,'Manage Background Check Details')]");
	private By checkNSORCheckbox= By.xpath("//*[contains(@id,'credentialManagerCustomer')]");
	private By datePicker = By.xpath("//*[contains(@id,'activationDateAnchor')]");
	private By nextMonthIcon = By.xpath(".//*[@id='calendarDiv']/table/tbody/tr/td/center/table[1]/tbody/tr/td[3]/a");
	private By nextMonthDate= By.xpath(".//*[@id='calendarDiv']/table/tbody/tr/td/center/table[2]/tbody/tr[5]/td[1]/a");
	private By completeNSORButton = By.xpath("//*[contains(@type,'submit')]");
	private By logout_link = By.xpath("/html/body/form/table/tbody/tr/td/table/tbody/tr/td[1]/table/tbody/tr[2]/td/p/b[2]/a");
	private By todayDate=By.xpath("//*[@id='calendarDiv']/table/tbody/tr/td/center/table[2]/tbody/tr[8]/td/a");
	
	// Location Blocking Page //
	private By configureRepBlockingLocation=By.xpath("/html/body/form/table/tbody/tr/td/table/tbody/tr/td[3]/table/tbody/tr[2]/td/table/tbody/tr[7]/td/table/tbody/tr[47]/td[3]/a"); 
	private By disabledAllLocation=By.id("allDisable");
    private By enableBlockingLocation=By.xpath("//*[@name='Boston']//following::input");
    private By blockingCompleteButton=By.xpath("//input[@value='Complete']");
    private By enableAllLocation=By.id("allEnable");

	public RMDashEditCustomerPage enter_customer_name_in_the_searchbox(String cust_name) {
		enter(customeSearchBox, cust_name);
		wait_until(2);
		return this;
	}
	
	public RMDashEditCustomerPage click_search_button() {
		click(searchButton);
		wait_until(3);
		return this;
	}
	
	public RMDashEditCustomerPage click_edit_button() {
		click(editButton);
		wait_until(3);
		return this;
	}
	
	// Check password required
	public RMDashEditCustomerPage check_password_required() {
		boolean ab = is_element_selected(passwordRequiredCheckBox);
		if (ab != true)
			click_button(passwordRequiredCheckBox);
		return this;
	}

	// Uncheck password required
	public RMDashEditCustomerPage uncheck_password_required() {
		boolean ab = is_element_selected(passwordRequiredCheckBox);
		if (ab == true)
			click_button(passwordRequiredCheckBox);
		wait_until(1);
		return this;
	}
	
	public RMDashEditCustomerPage click_complete_button() {
		boolean c = is_element_displayed(completeButton);
		if (c == true)
			click(completeButton);
		wait_until(3);
		return this;
	}
	//NSOR check
		public RMDashEditCustomerPage click_view_button() {
			click(viewButton);
			wait_until(5);
			return this;
		}
		public RMDashEditCustomerPage click_manage_nsor_details_button() {
			click(manageNSORDetailsButton);
			wait_until(5);
			return this;
		}
		public RMDashEditCustomerPage check_nsor_checkbox(){
			click(checkNSORCheckbox);
			wait_until(3);
			return this;
		}
		public RMDashEditCustomerPage click_date_picker(){
			click(datePicker);
			wait_until(3);
			return this;
		}
		//move to next month in date picker
		public RMDashEditCustomerPage click_next_month_icon(){
			click(nextMonthIcon);
			wait_until(3);
			return this;
		}
		
		
		//Select the next month date 4th Row 1st column every time i.e the customer will be in grace period
		public RMDashEditCustomerPage select_next_month_date() {
			click(nextMonthDate);
			wait_until(2);
			return this;
		}
		public RMDashEditCustomerPage select_today_date(){
			click(todayDate);
			wait_until(2);
			return this;
		}
		
		public RMDashEditCustomerPage click_nsor_complete_button() {
			click(completeNSORButton);
			wait_until(2);
			return this;
		}
		//RM logout//
			public RMDashEditCustomerPage click_logout_link(){
				click(logout_link);
				return this;
			}

		// Location blocking Page methods//
			public RMDashEditCustomerPage click_configure_rep_blocking_location_link(){
				click(configureRepBlockingLocation);
				wait_until(3);
				return this;
			}
			public RMDashEditCustomerPage click_disable_all_location(){
				click(disabledAllLocation);
				wait_until(3);
				return this;
			}
			public  RMDashEditCustomerPage click_enable_all_location(){
				click(enableAllLocation);
				wait_until(3);
				return this;
			}
			public RMDashEditCustomerPage click_enable_blocking_location(){
				click(enableBlockingLocation);
				wait_until(3);
				return this;
			}
			public RMDashEditCustomerPage click_blocking_complete_button(){
				click(blockingCompleteButton);
				wait_until(3);
				return this;
			}
}
