package com.ghx.auto.cm.ui.sso.page;

import org.openqa.selenium.By;

import com.ghx.auto.cm.ui.page.CMAbstractPage;

public class CorexExchangeSupportAdminPage extends CMAbstractPage<CorexExchangeSupportAdminPage> {

	private By usersIcon = By.id("adminUsers");
	private By rolesIcon = By.id("adminRoles");

	public CorexExchangeSupportAdminPage click_users_icon() {
		wait_until(3);
		click(usersIcon);
		return this;

	}

}
