package com.ghx.auto.cm.ui.sso.page;

import org.openqa.selenium.By;

import com.ghx.auto.cm.ui.page.CMAbstractPage;

public class NBDMyProfilePage extends CMAbstractPage<NBDMyProfilePage>{
	
	private By userId = By.xpath(".//div[@class='row marginT1']/div[2]/div[1]/div");
	private By firstName = By.xpath(".//div[@class='row marginT1']/div[2]/div[3]/div");
	private By lastName = By.xpath(".//div[@class='row marginT1']/div[2]/div[5]/div");
	private By workPhone = By.xpath(".//div[@class='row marginT1']/div[2]/div[7]/div");
	private By recieveEmailUponSignIn = By.xpath(".//div[@class='row marginT1']/div[3]/div[7]/div/span");
	
	private By editButton = By.xpath(".//div[@class='ng-isolate-scope']/ul/li[2]/a");
	private By contactAndPersonalInfo = By.xpath(".//div[@class='panel-heading']/h4/a/span/a");
	
	public NBDMyProfilePage verify_user_id_text(String usrId){
		wait_until(1);
		return verify_element_by_text(userId, usrId);
	}
	
	public NBDMyProfilePage verify_first_name_text(String firstNm){
		wait_until(1);
		return verify_element_by_text(firstName, firstNm);
	}
	
	public NBDMyProfilePage verify_last_name_text(String lastNm){
		wait_until(1);
		return verify_element_by_text(lastName, lastNm);
	}
	
	public NBDMyProfilePage verify_work_phone_text(String workPhn){
		wait_until(1);
		return verify_element_by_text(workPhone, workPhn);
	}
	
	public NBDMyProfilePage verify_recieve_email_text(String recieveEmail){
		wait_until(1);
		return verify_element_by_text(recieveEmailUponSignIn, recieveEmail);
	}
	
	public NBDMyProfilePage click_edit_button(){
		wait_until(1);
		return click_button(editButton);
	}
	
	public NBDMyProfilePage verify_contact_and_personal_info_tab_text(String contacInfo){
		wait_until(1);
		return verify_element_by_text(contactAndPersonalInfo, contacInfo);
	}
	
}
