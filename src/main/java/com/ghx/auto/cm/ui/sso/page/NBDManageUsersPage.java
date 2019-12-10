package com.ghx.auto.cm.ui.sso.page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.ghx.auto.cm.ui.page.CMAbstractPage;

public class NBDManageUsersPage extends CMAbstractPage<NBDManageUsersPage> {
	
	private By userStatus = By.xpath(".//div[@class='row']/div[1]/div[2]/select");
	private By firstName = By.xpath(".//div[@class='ng-scope']/div/div/vision-data-table/div[2]/table/tbody/tr/td[2]/div");
	private By lastName = By.xpath(".//div[@class='ng-scope']/div/div/vision-data-table/div[2]/table/tbody/tr/td[3]/div");
	private By email = By.xpath(".//div[@class='ng-scope']/div/div/vision-data-table/div[2]/table/tbody/tr/td[4]/div/a");
	private By emailId=By.id("emailId");
	
	private By workPhone = By.xpath(".//div[@class='ng-scope']/div/div/vision-data-table/div[2]/table/tbody/tr/td[5]/div");
	private By lastNameText=By.id("lastName");
	private By firstNameText = By.id("firstName");
	
	public NBDManageUsersPage verify_user_status(String userSts){
		wait_until(1);
		return verify_element_by_text(userStatus, userSts);
	}
	
	public NBDManageUsersPage verify_select_user_status(String name){
		wait_until(1);
		return select_by_name(userStatus, name);
	}
	public NBDManageUsersPage verify_first_name(String firstNm){
		
		
		wait_until(1);
		return verify_element_by_text(firstName, firstNm);
	}
	public NBDManageUsersPage verify_last_name(String lastNm){
		wait_until(1);
		return verify_element_by_text(lastName, lastNm);
	}
	public NBDManageUsersPage verify_email_id(String emailId){
		wait_until(1);
		return verify_element_by_text(email, emailId);
	}
	public NBDManageUsersPage verify_work_phone(String workPh){
		wait_until(1);
		return verify_element_by_text(workPhone, workPh);
	}
	
	public NBDManageUsersPage enter_email_address(String emailAd){
		wait_until(1);
		return enter(emailId,emailAd);
		
	}

}
