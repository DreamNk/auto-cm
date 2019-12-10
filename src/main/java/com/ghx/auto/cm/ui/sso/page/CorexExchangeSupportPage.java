package com.ghx.auto.cm.ui.sso.page;

import org.openqa.selenium.By;

import com.ghx.auto.cm.ui.page.CMAbstractPage;

public class CorexExchangeSupportPage extends CMAbstractPage<CorexExchangeSupportPage> {

	private By adminTab = By.id("headerNavAdmin");
	private By compareTextOnLandingPage = By.xpath("//*[contains(text(),'Compare')]");
	private By solutionSelectorExchangeSupport = By.xpath("//*[contains(@class,'material-icons')]");
    private By selectOptionFromSolutionSelectorVendCred = By.xpath("//*[@id='headerSwitcher']/i");

	public CorexExchangeSupportPage click_admin_tab() {
		wait_until(2);
		click_tab(adminTab);
		return this;

	}
	
	public CorexExchangeSupportPage verify_compare_text_on_landing_page() {
		verify_element_by_text(compareTextOnLandingPage, "Compare");
		return this;

	}

	public CorexExchangeSupportPage select_option_from_solution_selector_exchange_support(String text) {
		wait_until(3);
		click(solutionSelectorExchangeSupport);
		wait_until(2);
		click(By.linkText(text));
		wait_until(3);
		return this;
	}
	public CorexExchangeSupportPage select_option_from_solution_selector_vendormate_credentialing(String text) {
		wait_until(3);
		click(solutionSelectorExchangeSupport);
		wait_until(2);
		click(By.linkText(text));
		wait_until(3);
		return this;
	}
	
	
}
