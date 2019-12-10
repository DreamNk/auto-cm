package com.ghx.auto.cm.ui.sso.page;

import org.openqa.selenium.By;

import com.ghx.auto.cm.ui.page.CMAbstractPage;

public class CorexUserManagementPage extends CMAbstractPage<CorexUserManagementPage> {
	
	private By productTitle = By.id("headerUsersTitle");
	private By solutionSelector = By.xpath("//*[@id='headerSwitcher']/i");
	private By vendormateCredentialingOption = By.linkText("Vendormate Credentialing");

	//verify product header name
	public CorexUserManagementPage verify_product_name (String name) {
		wait_until(5);
		verify_element_by_text(productTitle, name);
		return this;
	}
	
	// click solution selector
	public CorexUserManagementPage click_solution_selector() {
		wait_until(3);
		click(solutionSelector);
		return this;
	}
	
	//to click product from solution selector
	public CorexUserManagementPage select_option_from_solution_selector() {
		wait_until(3);
		click(vendormateCredentialingOption);
		return this;
	}
}
