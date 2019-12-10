package com.ghx.auto.cm.ui.sso.page;

import org.openqa.selenium.By;

import com.ghx.auto.cm.ui.page.CMAbstractPage;

public class CorexUsersDashboardPage extends CMAbstractPage<CorexUsersDashboardPage> {

	private By searchUserTextBox = By.id("crudTableAdvancedSearch");
	private By searchIcon = By.xpath("//*[contains(@ng-show, '!crudParams.query')]");

	// Searched User Details----------------------------------------------------------------------------
	private By changePasswordLink = By.linkText("Change Password");
	private By newPasswordTextBox = By.id("newPassword");
	private By confirmPassword = By.id("passwordRepeat");
	private By setPasswordButton = By.id("changePasswordSet");

	public CorexUsersDashboardPage enter_userId_and_search(String user_id) {
		enter(searchUserTextBox, user_id);
		wait_until(4);
		click_button(searchIcon);
		wait_until(3);
		return this;

	}

	public CorexUsersDashboardPage click_userId_link(String user_id) {
		wait_until(4);
		click_link(By.linkText(user_id));
		return this;
	}

	public CorexUsersDashboardPage click_change_password() {
		wait_until(2);
		click_link(changePasswordLink);
		return this;
	}

	public CorexUsersDashboardPage enter_new_password(String pwd) {
		wait_until(2);
		
		enter(newPasswordTextBox, pwd);
		return this;
	}

	public CorexUsersDashboardPage enter_confirm_password(String pwd) {
		wait_until(2);
		enter(confirmPassword, pwd);
		return this;
	}

	public CorexUsersDashboardPage click_set_password_button() {
		wait_until(2);
		click_link(setPasswordButton);
		return this;
	}

}
