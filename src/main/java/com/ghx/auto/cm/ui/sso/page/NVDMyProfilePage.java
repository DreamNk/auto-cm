package com.ghx.auto.cm.ui.sso.page;

import org.openqa.selenium.By;

import com.ghx.auto.cm.ui.page.CMAbstractPage;


public class NVDMyProfilePage extends CMAbstractPage<NVDMyProfilePage> {
	
	private By contactAndPersonalInfo = By.xpath("html/body/div[1]/div[4]/div/div/div[1]/div/div/accordion/div/div[1]/div[1]");
	private By firstName = By.xpath(".//div[@class='col-sm-6 col-md-6 col-lg-6']/div[2]/p");
	private By lastName = By.xpath(".//div[@class='col-sm-6 col-md-6 col-lg-6']/div[4]/p");
	
	// Address & Info Tab
	private By addressAndInfoTab = By.xpath("html/body/div[1]/div[4]/div/div/div[1]/div/div/accordion/div/div[2]/div[1]");
	private By emailId = By.xpath(".//div[@class='col-sm-6 col-md-6 col-lg-6']/div[1]/p");
	
	// Badge Photo
	private By badgePhotoTab = By.xpath(".//div[@class='panel-group']/div[3]/div[1]/h4/a/span/a");
	private By backToHomeLink = By.xpath(".//div[@class='ng-scope']/div[2]/div[1]/a");
	private By editButton = By.xpath(".//div[@class='ng-scope']/div[2]/div[2]/div[2]/div[1]/div[3]/button");
	private By saveButton = By.xpath(".//div[@class='ng-scope']/div[2]/div[2]/div[3]/button[3]");
	private By deleteButton = By.xpath(".//div[@class='ng-scope']/div[2]/div[2]/div[3]/button[2]");
	private By deletePopupWindow = By.id("deleteSuccess");
	
	// Product and services
	private By productAndServiceTab = By.xpath(".//div[@class='panel-group']/div[4]/div[1]/h4/a/span/a");
	
	// sales Territory
	private By salesTerritoryTab = By.xpath(".//div[@class='panel-group']/div[5]/div[1]/h4/a/span/a");
	
	// supervisor info
	private By supervisorInfoTab = By.xpath(".//div[@class='panel-group']/div[6]/div[1]/h4/a/span/a");
	
	// References
	private By referencesTab = By.xpath(".//div[@class='panel-group']/div[7]/div[1]/h4/a/span/a");
		
	// Methods .....................................................
	
	// My profile tab 
	public NVDMyProfilePage verify_contact_and_personal_info_text(){
		return verify_element_by_text(contactAndPersonalInfo, "Contact & Personal Information");
	}
	
	public NVDMyProfilePage verify_first_name_text(String repFirstName){
		return verify_element_by_text(firstName, repFirstName);
	}
	
	public NVDMyProfilePage verify_last_name_text(String repLastName){
		return verify_element_by_text(lastName, repLastName);
	}
	
	public NVDMyProfilePage click_address_and_info_tab(){
		wait_until(2);
		return click_button(addressAndInfoTab);
	}

	public NVDMyProfilePage verify_address_abd_info_text(){
		wait_until(2);
		return verify_element_by_text(addressAndInfoTab, "Address & Information");
	}
	
	public NVDMyProfilePage verify_email_id(String repMailId){
		wait_until(2);
		return verify_element_by_text(emailId, repMailId);
	}
	
	public NVDMyProfilePage click_badge_photo_tab(){
		wait_until(2);
		return click_button(badgePhotoTab);
	}
	
	public NVDMyProfilePage verify_badge_photo_text(){
		wait_until(2);
		return verify_element_by_text(badgePhotoTab, "Badge Photo");
	}
	
	public NVDMyProfilePage click_product_and_service_tab(){
		wait_until(2);
		return click_button(productAndServiceTab);
	}
	
	public NVDMyProfilePage verify_product_and_service_text(){
		wait_until(2);
		return verify_element_by_text(productAndServiceTab, "Product & Service Offering");
	}
	
	public NVDMyProfilePage click_sales_territory_tab(){
		wait_until(2);
		return click_button(salesTerritoryTab);
	}
	
	public NVDMyProfilePage verify_sales_territory_text(){
		wait_until(2);
		return verify_element_by_text(salesTerritoryTab, "Sales Territory");
	}
	
	public NVDMyProfilePage click_supervisor_tab(){
		wait_until(2);
		return click_button(supervisorInfoTab);
	}
	
	public NVDMyProfilePage verify_supervisor_text(){
		wait_until(2);
		return verify_element_by_text(supervisorInfoTab, "Supervisor Information");
	}
	
	public NVDMyProfilePage click_reference_tab(){
		wait_until(2);
		return click_button(referencesTab);
	}
	
	public NVDMyProfilePage verify_reference_text(){
		wait_until(2);
		return verify_element_by_text(referencesTab, "References");
	}
	
	// Upload Badge photo
	public NVDMyProfilePage click_edit_button(){
		wait_until(1);
		return click_button(editButton);
	}
	
	public NVDMyProfilePage click_save_button(){
		wait_until(1);
		return click_button(saveButton);
	}
	
	public NVDMyProfilePage click_back_to_home_link(){
		wait_until(2);
		return click_link(backToHomeLink);
	}
	
	public NVDMyProfilePage click_delete_button(){
		wait_until(2);
		return click_button(deleteButton);
	}
	
	public NVDMyProfilePage click_delete_popup_window(){
		wait_until(2);
		return click_button(deletePopupWindow);
	}
	
}
