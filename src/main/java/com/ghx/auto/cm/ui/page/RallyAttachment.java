package com.ghx.auto.cm.ui.page;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RallyAttachment  extends CMAbstractPage<RallyAttachment>{


	private By user_id = By.id("j_username");
	private By password = By.id("j_password");
	private By sign_in = By.id("login-button");
	private By search_icon = By.xpath(".//div[@id='header']/div[2]/div[3]/a/div");
	private By search_box = By.xpath(".//div[@id='container-1328-innerCt']/table/tbody/tr/td[2]/input");
	private By project_dropdown = By.xpath(".//div[@id='header']/div[1]/div[2]/div[2]/div/div");
	private By vision = By.id("x4-gen2177");
	private By acctachment_1 = By.xpath(".//div[@id='detailContent']/table/tbody/tr[6]/td/a[1]/img");
	private By acctachment_2 = By.xpath(".//div[@id='detailContent']/table/tbody/tr[6]/td/a[2]/img");
	private By acctachment_3 = By.xpath(".//div[@id='detailContent']/table/tbody/tr[6]/td/a[3]/img");
	private By acctachment_4 = By.xpath(".//div[@id='detailContent']/table/tbody/tr[6]/td/a[4]/img");
	private By acctachment_5 = By.xpath(".//div[@id='detailContent']/table/tbody/tr[6]/td/a[5]/img");
	private By acctachment_6 = By.xpath(".//div[@id='detailContent']/table/tbody/tr[6]/td/a[6]/img");
	private By acctachment_7 = By.xpath(".//div[@id='detailContent']/table/tbody/tr[6]/td/a[7]/img");
	private By acctachment_8 = By.xpath(".//div[@id='detailContent']/table/tbody/tr[6]/td/a[8]/img");
	private By acctachment_9 = By.xpath(".//div[@id='detailContent']/table/tbody/tr[6]/td/a[9]/img");
	private By acctachment_10 = By.xpath(".//div[@id='detailContent']/table/tbody/tr[6]/td/a[10]/img");
	private By acctachment_11 = By.xpath(".//div[@id='detailContent']/table/tbody/tr[6]/td/a[11]/img");
	
	
	
	public RallyAttachment enter_user_id(String name) {
		return enter(user_id,name);
	}
	
		
	public RallyAttachment enter_password(String pwd) {
		return enter(password,pwd);
	}
	
	
	public RallyAttachment click_sign_in_button() {
		return click_button(sign_in);
	}
	
	public RallyAttachment click_search_icon() {
		return click_button(search_icon);
	}
	
	public RallyAttachment enter_user_story_number(String us) {
		wait_until(2);
		return enter(search_box, us);
	}
	
	public RallyAttachment click_acctachment_1() {
		return click_button(acctachment_1);
	}
	
	//press enter after entering entity name
	 public RallyAttachment press_enter(){ 
	 CommonUtilities c = new CommonUtilities();
	     wait_until(2);
	     c.pressEnter();
	     wait_until(3);
	     return this;
	 }
	
	 public RallyAttachment click_project_dropdown() {
			return click_button(project_dropdown);
		}
	 
	 public RallyAttachment click_vision_option() {
			return click_link(vision);
		}
}
