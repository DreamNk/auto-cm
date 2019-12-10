package com.ghx.auto.cm.ui.page;

import org.openqa.selenium.By;

public class NVDMyProfileTabPage extends CMAbstractPage<NVDMyProfileTabPage>{

	//Locators for navigation and view only operations
	private By first_name = By.xpath(".//div[@id='contactPersonalInfoViewTabContent']/div[2]/div[2]/span[2]/div");
	private By address_and_information_accordion = By.id("MyProfileAccordion-2-label");
	private By your_work_email = By.xpath(".//div[@id='businessAddressInformationViewTabContent']/div[2]/div[1]/span[2]/div");
	private By badge_photo_accordion = By.id("MyProfileAccordion-3-label");
	private By badge_photo_text = By.xpath(".//*[@id='BadgePhoto']/div[2]/p");
	private By product_and_service_offering_accordion = By.id("MyProfileAccordion-4-label");
	private By product_service_offering = By.xpath(".//div[@id='productServiceOfferingViewTabContent']/div[1]/div[1]/h3");
	private By sales_territory_accordion = By.id("MyProfileAccordion-5-label");
	private By sales_territory = By.xpath(".//div[@id='tabSubPI1']/div[2]/div[1]/div[1]/h3");
	private By sales_territory_help = By.id("SalesTerritoryViewHelp");
	private By supervisor_information_accordion = By.id("MyProfileAccordion-6-label");
	private By supervisor_information = By.xpath(".//div[@id='supervisorInfoViewTabContent']/div[1]/div[1]/h3");
	private By references_accordion = By.id("MyProfileAccordion-7-label");
	private By references = By.xpath(".//div[@id='referencesViewTabContent']/div[1]/div[1]/h3");
	
	
	//Locators of Edit options
	
	private By Edit_badge_photo_button = By.id ("badgePhotoEditActiveButton");
	private By browse_button = By.id("confirmSaveSup");
	private By save_badge_photo_button = By.id("confirmSaveBadgePhoto");
	private By delete_badge_photo_button = By.id("deleteBadgePhoto");
	private By confirm_delete = By.id("badgephoto.delete.confirm.delete");
	
	
	//Methods to verify the accordion contents of My profile tab (Navigations and View Only)
	
	public NVDMyProfileTabPage verify_contact_and_personal_information(String msg){
		return verify_element_by_text(first_name, msg);
	
	}

	public NVDMyProfileTabPage click_address_and_information_accordion(){
		wait_until(5);
		return click_button(address_and_information_accordion);
    
	}
	
	public NVDMyProfileTabPage verify_work_email_in_address_and_information_accordion(String msg){
		return verify_element_by_text(your_work_email, msg);
	
	}

	
	public NVDMyProfileTabPage click_badge_photo_accordion(){
		wait_until(5);
		return click_button(badge_photo_accordion);
    
	}
	
	 public NVDMyProfileTabPage verify_badge_photo_text(String msg){
			return verify_element_by_text(badge_photo_text, msg);
	
}	

	 
	 public NVDMyProfileTabPage click_product_and_service_accordion(){
			wait_until(5);
			return click_button(product_and_service_offering_accordion);
	    
		}
	 
	 public NVDMyProfileTabPage verify_product_and_service_offering(String msg){
			return verify_element_by_text(product_service_offering, msg);
	
     }	
	 
	 public NVDMyProfileTabPage click_sales_territory_accordion(){
			wait_until(5);
			return click_button(sales_territory_accordion);
	    
		}
	
	 
	 public NVDMyProfileTabPage verify_sales_territory(String msg){
			return verify_element_by_text(sales_territory, msg);
	
  }
	
	 public NVDMyProfileTabPage verify_sales_territory_help(String msg){
			return verify_element_by_text(sales_territory_help, msg);
	
}
	 
	 public NVDMyProfileTabPage click_supervisor_information_accordion(){
			wait_until(5);
			return click_button(supervisor_information_accordion);
	    
		}
	 
	
	 public NVDMyProfileTabPage verify_supervisor_information(String msg){
			return verify_element_by_text(supervisor_information, msg);
	
   }
	
	 
	 public NVDMyProfileTabPage click_references_accordion(){
			wait_until(5);
			return click_button(references_accordion);
	    
		} 
	 
	 public NVDMyProfileTabPage verify_references(String msg){
			return verify_element_by_text(references, msg);
	
}
	 
	//Methods to edit the accordion contents of My profile tab (Edit transactions)
	 
	 
	 public NVDMyProfileTabPage click_edit_badge_photo(){
			return click_button(Edit_badge_photo_button);
	 }  
	 
	 public NVDMyProfileTabPage click_browse_files_to_upload(){
		 wait_until(30);
			return click_button(browse_button);
	    }  
     
	 public NVDMyProfileTabPage click_save_badge_photo(){
			return click_button(save_badge_photo_button);
	    }

	 public NVDMyProfileTabPage click_delete_badge_photo(){
			return click_button(delete_badge_photo_button);
	    }
     
	 public NVDMyProfileTabPage click_confirm_to_delete_badge_photo(){
			return click_button(confirm_delete);
	    }
  
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

