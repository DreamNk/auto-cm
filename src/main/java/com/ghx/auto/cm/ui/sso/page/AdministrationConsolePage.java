package com.ghx.auto.cm.ui.sso.page;

import org.openqa.selenium.By;

import com.ghx.auto.cm.ui.page.CMAbstractPage;

public class AdministrationConsolePage extends CMAbstractPage<AdministrationConsolePage> {

	private By productManagement = By.id("productManagement");
	private By SSOClientManagement = By.id("clientManagement");
	private By productRolesSubscription = By.id("roleSubscription");
	private By userManagement = By.id("userManagement");
	private By tokenManagement = By.id("refreshToken");

	public AdministrationConsolePage click_user_management() {
		wait_until(3);
		click(userManagement);
		return this;
	}

	public AdministrationConsolePage click_product_management() {
		wait_until(3);
		click(productManagement);
		return this;
	}

	public AdministrationConsolePage click_sso_client_management() {
		wait_until(3);
		click(SSOClientManagement);
		return this;
	}

	public AdministrationConsolePage click_product_roles_subscription() {
		wait_until(3);
		click(productRolesSubscription);
		return this;
	}

	public AdministrationConsolePage click_token_management() {
		wait_until(3);
		click(tokenManagement);
		return this;
	}

}
