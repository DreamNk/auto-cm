package com.ghx.auto.cm.ui.sso.page;

import org.openqa.selenium.By;

import com.ghx.auto.cm.ui.page.CMAbstractPage;

public class SSOUserManagementPage extends CMAbstractPage<SSOUserManagementPage> {
	
	// UNLOCK user
		private By unlockUserSearchTextBox = By.xpath("//*[contains(@data-ng-model, 'search.userName')]");
		private By unlockUserSearchIcon = By.id("searchUnlockUser");
		private By unlockIcon = By.xpath("//*[contains(@class, 'fa fa-unlock-alt')]");
		private By userUnlockSuccessMsg = By.xpath("//*[contains(@class, 'alert alert-success ng-binding ng-scope')]");
		private By emailIdinSearchResult = By.xpath("//*[contains(@data-title, 'common.email')]");
		private By backToAdministrationConsole = By.linkText("Back to Administration Console");
		
		//REFRESH user
		private By refreshUser = By.xpath(".//*[@id='contentBody']/div[1]/div/div/div[2]/div[2]/ul/li[3]/a");
		private By searchUser = By.xpath(".//*[@id='refreshUsersList']/div[3]/div/div/input");
		private By searchIcon = By.id("searchActiveUser");
		private By emailColumn = By.xpath(".//*[@id='refreshUsersList']/tbody/tr/td[3]");
		private By resetLink = By.xpath(".//*[@id='refreshUsersList']/tbody/tr/td[5]/a");
		private By successMsg = By.xpath(".//*[@id='refreshUsersList']/div[3]/strong");

		public SSOUserManagementPage enter_userId_and_search(String user_id) {
			enter(unlockUserSearchTextBox, user_id);
			wait_until(3);
			click(unlockUserSearchIcon);
			wait_until(5);
			return this;
		}

		public SSOUserManagementPage verify_userId_in_search_result(String user_id) {
			verify_element_by_text(emailIdinSearchResult, user_id);
			return this;
		}

		public SSOUserManagementPage click_unlock_user_icon() {
			click(unlockIcon);
			wait_until(5);
			return this;
		}

		public SSOUserManagementPage verify_user_unclock_successfully_msg(String msg) {
			wait_until(5);
			verify_element_by_text_partial_match(userUnlockSuccessMsg, msg);
			return this;
		}

		public SSOUserManagementPage click_back_to_administration_console_link() {
			return click_link(backToAdministrationConsole);
		}
		
		//click Refresh user section
		public SSOUserManagementPage click_refresh_user(){
			wait_until(2);
			return click(refreshUser);
		}
		
		//enter email address to search to reset
		public SSOUserManagementPage enter_email_to_search(String email){
				return enter(searchUser, email);
		}
		
		//click search icon
		public SSOUserManagementPage click_search_icon(){
				return click(searchIcon);
		}
		
		//verify searched email address in the email column
		public SSOUserManagementPage verify_searched_email(String email){
			return verify_element_by_text(emailColumn, email);
		}
		
		// click reset link
		public SSOUserManagementPage click_reset_link(){
			return click(resetLink);
		}
		
		//verify message for successfully refreshing the user - mail sent for reset password
		public SSOUserManagementPage verify_success_msg(String msg){
			wait_until(5);
			return verify_element_by_text(successMsg, msg);
		}		


}
