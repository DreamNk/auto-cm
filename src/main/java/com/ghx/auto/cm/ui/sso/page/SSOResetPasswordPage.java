package com.ghx.auto.cm.ui.sso.page;

import org.openqa.selenium.By;

import com.ghx.auto.cm.ui.page.CMAbstractPage;

public class SSOResetPasswordPage extends CMAbstractPage<SSOResetPasswordPage> {

	private By existingPassword = By.id("existingPassword");
	private By newPassword = By.id("newPassword");
	private By confirmPassword = By.id("confirmPassword");
	private By saveButton = By.id("passwordSaveBtn");
	

	public SSOResetPasswordPage enter_existing_password(String existing_pwd) {
		enter(existingPassword, existing_pwd);
		return this;
	}

	public SSOResetPasswordPage enter_new_password(String new_pwd) {
		enter(newPassword, new_pwd);
		return this;
	}

	public SSOResetPasswordPage enter_confirm_password(String confirm_pwd) {
		enter(confirmPassword, confirm_pwd);
		return this;
	}
	
	public SSOResetPasswordPage click_save_button(){
		return click(saveButton);
	}
	

}
