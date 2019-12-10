package com.ghx.auto.cm.ui.angularjs.page;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.ghx.auto.cm.ui.page.CMAbstractPage;
import com.ghx.auto.cm.ui.page.NVDMyDocumentPage;



	public class AjsNVDCompanyProfilePage extends CMAbstractPage<AjsNVDCompanyProfilePage> {
		
		
	            private By username_dropdown = By.xpath("/html/body/div[3]/header/div[1]/div/ul/li[1]/a/span[1]/span");
	            private By company_profile = By.id("companyProfile");
		// Locators for Company Profile Page
				private By company_profile_page_footer_title = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/strong");
				private By company_profile_page_footer_text = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/p");
		// Locators for Company Information Accordion
				private By company_information_accordion_title = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/accordion/div/div[1]/div[2]/div/div[1]/div/div[1]/div/div/vision-action/div[1]/h3");
				private By legal_name = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/accordion/div/div[1]/div[2]/div/div[1]/div/div[1]/div/div/vision-action/div[4]/div[1]/div[1]/div");
				private By tax_id = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/accordion/div/div[1]/div[2]/div/div[1]/div/div[1]/div/div/vision-action/div[4]/div[1]/div[3]/div");
				private By company_information_help = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/accordion/div/div[1]/div[2]/div/div[1]/div/div[1]/div/div/vision-action/div[2]/label/a");
				private By company_information_help_text = By.xpath("/html/body/div[7]/div/div/div/div[2]/p");
				private By company_information_help_popupclose = By.xpath("/html/body/div[7]/div/div/div/div[1]/button");
		// Locators for Company Contact Information Accordion
				private By company_contact_information_accordion = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/accordion/div/div[2]/div[1]/h4/a/span/a/i");
				private By company_contact_information_accordion_title = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/accordion/div/div[2]/div[2]/div/div[1]/div/div[1]/div/div/div[1]/h3");
				private By headquarter_city = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/accordion/div/div[2]/div[2]/div/div[1]/div/div[1]/div/div/vision-action/div/div[1]/div[2]/div");
				private By company_contact_information_help = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/accordion/div/div[2]/div[2]/div/div[1]/div/div[1]/div/div/div[2]/label/a");
				private By company_contact_information_help_text = By.xpath("/html/body/div[7]/div/div/div/div[2]/p");
				private By company_contact_information_help_popupclose = By.xpath("/html/body/div[7]/div/div/div/div[1]/button");	
		
		// Locators for Company Principals Accordion
				/*private By company_principals_accordion = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/accordion/div/div[3]/div[1]/h4/a/span/a/i");
				private By company_principals_username = By.xpath(".//div[@id='companyPrincipalGridContent_Content']/table/tbody[3]/tr/td[3]/div");
				private By company_principals_email = By.xpath(".//div[@id='companyPrincipalGridContent_Content']/table/tbody[3]/tr/td[4]/div/a");
				private By company_principals_addbutton = By.xpath(".//div[@id='companyPrincipalTabContent']/div[2]/div[2]/div[2]/span/input");
				private By company_principals_addbutton_popup_title = By.xpath(".//div[@id='companyPrincipalsPopupDiv_c']/div[1]/div[1]/h3");
				private By company_principals_addbutton_popupclose = By.xpath(".//div[@id='companyPrincipalsPopupDiv']/a");
				private By company_principals_addbutton_enter_firstname = By.xpath(".//div[@id='companyPrincipalsAddContent']/form/div[3]/div[2]/span[2]/input");
				private By company_principals_addbutton_enter_lastname = By.xpath(".//div[@id='companyPrincipalsAddContent']/form/div[3]/div[6]/span[2]/input");
				private By company_principals_addbutton_enter_email = By.xpath(".//div[@id='companyPrincipalsAddContent']/form/div[3]/div[8]/span[2]/input");
				private By company_principals_addbutton_save_button = By.xpath(".//div[@id='companyPrincipalsAddContent']/form/div[5]/span/input[1]");
				private By company_principals_help = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/accordion/div/div[3]/div[2]/div/div/div/vision-data-table/div[1]/label/a");		
				private By company_principals_help_text = By.xpath("/html/body/div[7]/div/div/div/div[2]/p");
				private By company_principals_help_popupclose = By.id("HelpCloseIcon");*/
		
		
	   // Locators for Compliance Officer Accordion
				private By compliance_officer_accordion = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/accordion/div/div[5]/div[1]/h4/a/span/a/i");
				private By compliance_officer_accordion_title = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/accordion/div/div[5]/div[2]/div/div[1]/div/div[1]/div/div/vision-action/div[1]/h3");
				private By compliance_officer_accordion_firstname = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/accordion/div/div[5]/div[2]/div/div[1]/div/div[1]/div/div/vision-action/div[4]/div[1]/div[2]/div");
				private By compliance_officer_accordion_lastname = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/accordion/div/div[5]/div[2]/div/div[1]/div/div[1]/div/div/vision-action/div[4]/div[1]/div[4]/div");
				private By compliance_officer_accordion_email = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/accordion/div/div[5]/div[2]/div/div[1]/div/div[1]/div/div/vision-action/div[4]/div[1]/div[7]/div");
				private By compliance_officer_accordion_help = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/accordion/div/div[5]/div[2]/div/div[1]/div/div[1]/div/div/vision-action/div[2]/label/a");			
				private By compliance_officer_accordion_help_text = By.xpath("/html/body/div[7]/div/div/div/div[2]/p");
				private By compliance_officer_accordion_help_popupclose = By.xpath("/html/body/div[7]/div/div/div/div[1]/button");
		
	
			
				
				
				public AjsNVDCompanyProfilePage click_username_dropdown(){
					return click_button(username_dropdown);
						
		}		
				
				public AjsNVDCompanyProfilePage click_company_profile(){
					return click_button(company_profile);
						
		}
				
				
		//Methods for Company Profile Page
		//Method to check Company profile Page footer title
				public AjsNVDCompanyProfilePage verify_company_profile_page_footer_title(String msg){
					return verify_element_by_text(company_profile_page_footer_title, msg);
		}
		
		//Method to check Company Profile Page Footer Text		
				public AjsNVDCompanyProfilePage verify_company_profile_page_footer_text(String msg){
					return verify_element_by_text(company_profile_page_footer_text, msg);
		}
		
		// Methods for Company Information Accordion
		//Method to check Company Information Accordion Title 
				public AjsNVDCompanyProfilePage verify_company_information_accordion_title(String msg){
					return verify_element_by_text(company_information_accordion_title, msg);
		}
		
		//Method to check Company Information Accordion Vendor Legal Name 
				public AjsNVDCompanyProfilePage verify_legal_name(String msg){
					return verify_element_by_text(legal_name, msg);
		}
		
		//Method to check Company Information Accordion Tax Id 
				public AjsNVDCompanyProfilePage verify_tax_id(String msg){
					return verify_element_by_text(tax_id, msg);
		}
		
		/*Method to check Company Information Accordion Duns Number 
				public AjsNVDCompanyProfilePage verify_duns_number(String msg){
					return verify_element_by_text(duns_number, msg);
		}*/
		
		//Method to click Company Information Accordion help link
				public AjsNVDCompanyProfilePage click_company_information_help_link(){
					return click_link(company_information_help);
						
		}
		
		//Method to check Company Information Accordion help text 
				public AjsNVDCompanyProfilePage verify_company_information_help_text(String msg){
					return verify_element_by_text(company_information_help_text, msg);
						
		}
		
		//Method to close Company Information Accordion help pop up 
				public AjsNVDCompanyProfilePage click_company_information_help_popupclose(){
					return click_button(company_information_help_popupclose);
						
		}
		
		//Methods for Company Contact Information Accordion
		//   Method to click Company Contact Information Accordion 
				public AjsNVDCompanyProfilePage click_company_contact_information_accordion(){
					return click_button(company_contact_information_accordion);
						
		}
		
		//   Method to check Company Contact Information Accordion Title
				public AjsNVDCompanyProfilePage verify_company_contact_information_accordion_title(String msg){
					return verify_element_by_text(company_contact_information_accordion_title, msg);
			
		}
		
		//   Method to check Company Contact Information Accordion head quarter city
				public AjsNVDCompanyProfilePage verify_headquarter_city(String msg){
					return verify_element_by_text(headquarter_city, msg);
			
		}
		
	    //   Method to click Company Contact Information Accordion Help Link
				public AjsNVDCompanyProfilePage click_company_contact_information_help_link(){
					return click_link(company_contact_information_help);
						
		}
		
		//   Method to check Company Contact Information Accordion Help Link Text
				public AjsNVDCompanyProfilePage verify_company_contact_information_help_text(String msg){
					return verify_element_by_text(company_contact_information_help_text, msg);
						
		}
		
		//   Method to close Company Contact Information Accordion help pop up
				public AjsNVDCompanyProfilePage click_company_contact_information_help_popupclose(){
					return click_button(company_contact_information_help_popupclose);
						
		}
		
	
		// Methods for Company Principals Accordion
		/*//  Method to verify company principals accordion		
				public AjsNVDCompanyProfilePage click_company_principals_accordion(){
					return click_button(company_principals_accordion);
								
				}
				
		//  Verify username for company principals
				public AjsNVDCompanyProfilePage verify_company_principals_username(String msg){
					return verify_element_by_text(company_principals_username, msg);
					
				}	
				
		//  Verify email if of company principals		
				public AjsNVDCompanyProfilePage verify_company_principals_email(String msg){
					return verify_element_by_text(company_principals_email, msg);
					
				}	
				
		//  Verify the button name 'Add' in company principals accordion
				public AjsNVDCompanyProfilePage verify_company_principals_addbutton(String msg){
					return verify_element_by_text(company_principals_addbutton, msg);
					
				}
		
		//  Method to click on Add button in company principals accordion		
				public AjsNVDCompanyProfilePage click_company_principals_addbutton(){
					wait_until(2);
					return click_button(company_principals_addbutton);
								
				}
		
		//  Method to verify the Pop title after clcking add button company principals		
				public AjsNVDCompanyProfilePage verify_company_principals_addbutton_popup_title(String msg){
					wait_until(2);
					return verify_element_by_text(company_principals_addbutton_popup_title, msg);
					
				}
		
		//  Method to close the pop up on Company Principals accordion Add button		
				public AjsNVDCompanyProfilePage click_company_principals_addbutton_popupclose(){
					wait_until(2);
					return click_button(company_principals_addbutton_popupclose);
								
				}
				
		//  Method to click on Company Principals Help Link
				public AjsNVDCompanyProfilePage click_company_principals_help(){
					return click_button(company_principals_help);
								
				}
				
		//  Method to verify Company Principals Help Text		
				public AjsNVDCompanyProfilePage verify_company_principals_help_text(String msg){
					return verify_element_by_text(company_principals_help_text, msg);
					
				}
				
		//  Method to close the help pop up in Company Principals Accordion
				public AjsNVDCompanyProfilePage click_company_principals_help_popupclose(){
					return click_button(company_principals_help_popupclose);
								
				}*/
				
	
					
		// Methods for Compliance Officer Accordion
		//  Method to click on Compliance Officer Accordion		
				public AjsNVDCompanyProfilePage click_compliance_officer_accordion(){
					return click_button(compliance_officer_accordion);
								
				}					
				
		//  Method to verify Compliance Officer Accordion Title		
				public AjsNVDCompanyProfilePage verify_compliance_officer_accordion_title(String msg){
					return verify_element_by_text(compliance_officer_accordion_title, msg);
					
				}			
							
		//  Method to verify first name of compliance officer on Compliance Officer Accordion		
				public AjsNVDCompanyProfilePage verify_compliance_officer_accordion_firstname(String msg){
					return verify_element_by_text(compliance_officer_accordion_firstname, msg);
					
				}			
				
		//  Method to verify Last Name of compliance officer on Compliance Officer Accordion		
				public AjsNVDCompanyProfilePage verify_compliance_officer_accordion_lastname(String msg){
					return verify_element_by_text(compliance_officer_accordion_lastname, msg);
					
				}			
							
		//  : Method to verify email of commpliance officer on Compliance Officer Accordion		
				public AjsNVDCompanyProfilePage verify_compliance_officer_accordion_email(String msg){
					return verify_element_by_text(compliance_officer_accordion_email, msg);
					
				}			
				
		//  Method to click on help on Compliance Officer Accordion		
				public AjsNVDCompanyProfilePage click_compliance_officer_accordion_help(){
					return click_button(compliance_officer_accordion_help);
								
				}
				
		//  Method to verify help text on Compliance Officer Accordion		
				public AjsNVDCompanyProfilePage verify_compliance_officer_accordion_help_text(String msg){
					return verify_element_by_text(compliance_officer_accordion_help_text, msg);
					
				}
				
		//  Method to close help pop up on Compliance Officer Accordion		
				public AjsNVDCompanyProfilePage click_compliance_officer_accordion_help_popupclose(){
					return click_button(compliance_officer_accordion_help_popupclose);
								
				}
							
				
		// Methods to Add/Update /Delete Company Principals
		/*//  Method to Add First name of Principals
				public AjsNVDCompanyProfilePage enter_company_principals_addbutton_enter_firstname(String firstname){
					return enter(company_principals_addbutton_enter_firstname, firstname);
				}
				
		//  Method to Add Last name of Principals
				public AjsNVDCompanyProfilePage enter_company_principals_addbutton_enter_lastname(String lastname){
					return enter(company_principals_addbutton_enter_lastname, lastname);
				}
				
		//  Method to Add Email of Principals
				public AjsNVDCompanyProfilePage enter_company_principals_addbutton_enter_email(String email){
					return enter(company_principals_addbutton_enter_email, email);
				}
				
		//  Method to click on Save Button on Add Principals Popup		
				public AjsNVDCompanyProfilePage click_company_principals_addbutton_save_button(){
					return click_button(company_principals_addbutton_save_button);
										
				}*/
}
