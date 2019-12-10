package com.ghx.auto.cm.ui.page;

import org.openqa.selenium.By;

public class NVDRemoteBadgePrintPage extends CMAbstractPage<NVDRemoteBadgePrintPage>{
	
//Locators
	
	private By action_dropdown_button = By.id("actionMenu-button");
	private By print_badge = By.xpath(".//div[@id='menuwithgroups']/div[1]/ul[3]/li[1]/a");
	private By cleared_for_access = By.xpath(".//div[@id='menuwithgroups']/div[1]/ul[3]/li[2]/a");
	private By account_dropdown = By.id("printBadge.account");
	private By appointments_dropdown = By.id("printBadge.appointments");
	private By location_dropdown = By.id("printBadge.location");
	private By department_dropdown = By.id("printBadge.department");
	private By date_of_visit = By.id("printBadge.dateOfVisitButton");
	private By print_badge_button = By.xpath(".//div[@id='printBadgeAccordionDiv']/ul/li/div/div[2]/div/form/div[3]/div[6]/span[2]/span[1]/span[1]/input");
	private By cleared_for_access_button = By.xpath(".//div[@id='printBadgeAccordionDiv']/ul/li/div/div[2]/div/form/div[3]/div[6]/span[2]/span[1]/span[3]/input");
	private By reprint_button = By.xpath(".//div[@id='printBadgeAccordionDiv']/ul/li/div/div[2]/div/form/div[3]/div[6]/span[2]/span[2]/span[1]/input");
	private By clear_button = By.xpath(".//div[@id='printBadgeAccordionDiv']/ul/li/div/div[2]/div/form/div[3]/div[6]/span[2]/span[2]/span[2]/input");
	private By help = By.id("CompanyContactInfoViewHelp");
	private By text_in_help_dialoguebox = By.xpath(".//div[@id='sectionHelpDialogContent']/ul[2]/li");
	private By appointment_found_message = By.xpath(".//div[@id='printBadge.commonInfo.errorDiv']/span[2]");
	
	public NVDRemoteBadgePrintPage click_action_dropdown_button(){
		wait_until(3);
		return click_button(action_dropdown_button);
    }

	public NVDRemoteBadgePrintPage click_print_badge_option(){
		wait_until(3);
		return click_button(print_badge);
    }
	
	public NVDRemoteBadgePrintPage click_cleared_for_access_option(){
		wait_until(3);
		return click_button(cleared_for_access);
    }
	
	public NVDRemoteBadgePrintPage select_account(String name){
		wait_until(3);
		return select_by_name(account_dropdown, name);
    }

	public NVDRemoteBadgePrintPage select_appointment(String name){
		return select_by_name(appointments_dropdown, name);
    }
    
	public NVDRemoteBadgePrintPage select_location(String name){
		return select_by_name(location_dropdown, name);
    } 
	
	public NVDRemoteBadgePrintPage select_department(String name){
		return select_by_name(department_dropdown, name);
    }
	
	public NVDRemoteBadgePrintPage select_date_of_visit(String name){
		return select_by_name(date_of_visit, name);
    }
	
	public NVDRemoteBadgePrintPage click_print_button(){
		wait_until(3);
		return click_button(print_badge_button);
    }
	
	public NVDRemoteBadgePrintPage click_reprint_button(){
		wait_until(3);
		return click_button(reprint_button);
    }
	
	public NVDRemoteBadgePrintPage click_cleared_for_access_button(){
		return click_button(cleared_for_access_button);
    }
	
	public NVDRemoteBadgePrintPage click_clear_button(){
		return click_button(clear_button);
    }
    
	public NVDRemoteBadgePrintPage click_help(){
		return click_button(help);
    }
     
	public NVDRemoteBadgePrintPage verify_text_in_help_box(String msg){
		return verify_element_by_text(text_in_help_dialoguebox, msg);
	
	}

	public NVDRemoteBadgePrintPage verify_appointment_present_message(String msg){
		return verify_element_by_text(appointment_found_message, msg);
	
	}
}


