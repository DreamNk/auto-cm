package com.ghx.auto.cm.ui.page;

import org.openqa.selenium.By;
import org.testng.Assert;

// This Class is created by Abhijit Ranade 

public class NVDCompanyProfilePage extends CMAbstractPage<NVDCompanyProfilePage> {
	
	// Locators for Company Profile Page
			private By company_profile_page_footer_title = By.xpath(".//div[@id='commonHiddenTab']/div[2]/h6");
			private By company_profile_page_footer_text = By.xpath(".//div[@id='commonHiddenTab']/div[2]/p");
	// Locators for Company Information Accordion
			private By company_information_accordion = By.id("CompanyProfileAccordion-1-label");
			private By company_information_accordion_title = By.xpath(".//div[@id='companyInfoViewTabContent']/div[1]/div[1]/h3");
			private By legal_name = By.xpath(".//div[@id='companyInfoViewTabContent']/div[2]/div[1]/span[2]/div");
			private By tax_id = By.xpath(".//div[@id='companyInfoViewTabContent']/div[2]/div[3]/span[2]/div");
			private By duns_number = By.xpath(".//div[@id='companyInfoViewTabContent']/div[2]/div[4]/span[2]/div");
			private By company_information_help = By.linkText("help");
			private By company_information_help_text = By.xpath(".//div[@id='sectionHelpDialogContent']/p");
			private By company_information_help_popupclose = By.xpath(".//div[@id='sectionHelpDialog']/a");
	// Locators for Company Contact Information Accordion
			private By company_contact_information_accordion = By.id("CompanyProfileAccordion-2-label");
			private By company_contact_information_accordion_title = By.xpath(".//div[@id='companyContactInfoViewTabContent']/div[1]/div[1]/h3");
			private By headquarter_city = By.xpath(".//div[@id='companyContactInfoViewTabContent']/div[2]/div[4]/span[2]/div");
			private By headquarter_state = By.xpath(".//div[@id='companyContactInfoViewTabContent']/div[2]/div[5]/span[2]/div");
			private By headquarter_zipcode = By.xpath(".//div[@id='companyContactInfoViewTabContent']/div[2]/div[6]/span[2]/div");
			private By company_contact_information_help = By.linkText("help");
			private By company_contact_information_help_text = By.xpath(".//div[@id='sectionHelpDialogContent']/p");
			private By company_contact_information_help_popupclose = By.xpath(".//div[@id='sectionHelpDialog']/a");	
	// Locators for Company Logo Accordion
			private By company_logo_accordion = By.id("CompanyProfileAccordion-3-label");
			private By company_logo_accordion_title = By.xpath(".//div[@id='companyLogoEditTabContent']/form/div[1]/div/h3");
			private By company_logo_text = By.xpath(".//div[@id='companyLogoEditTabContent']/form/div[2]/p");
			private By company_logo_edit_button = By.xpath(".//div[@id='companyLogoEditDiv']/input");
			private By company_logo_file_name = By.xpath(".//div[@id='companyLogoEditTabContent']/form/div[4]/div[2]/div[2]");
			private By company_logo_browse_button = By.xpath(".//div[@id='companyLogoUploaderContainer']/div/a/div/embed");
			private By company_logo_save_button = By.xpath("/html/body/div[8]/div[2]/div[1]/div[2]/div/div[5]/div[2]/div[1]/div/ul/li[3]/div/div[2]/div/div/div[2]/form/div[4]/div[2]/div[3]/div[3]/input");
			private By company_logo_delete_button = By.xpath("/html/body/div[8]/div[2]/div[1]/div[2]/div/div[5]/div[2]/div[1]/div/ul/li[3]/div/div[2]/div/div/div[2]/form/div[4]/div[2]/div[3]/div[1]/input");
			private By company_logo_delete_popup_yes_button = By.xpath(".//div[@id='companyLogoDeleteDialog']/div[3]/div[1]/span/div[1]/button");
	// Locators for Company Principals Accordion
			private By company_principals_accordion = By.id("CompanyProfileAccordion-4-label");
			private By company_principals_username = By.xpath(".//div[@id='companyPrincipalGridContent_Content']/table/tbody[3]/tr/td[3]/div");
			private By company_principals_email = By.xpath(".//div[@id='companyPrincipalGridContent_Content']/table/tbody[3]/tr/td[4]/div/a");
			private By company_principals_addbutton = By.xpath(".//div[@id='companyPrincipalTabContent']/div[2]/div[2]/div[2]/span/input");
			private By company_principals_addbutton_popup_title = By.xpath(".//div[@id='companyPrincipalsPopupDiv_c']/div[1]/div[1]/h3");
			private By company_principals_addbutton_popupclose = By.xpath(".//div[@id='companyPrincipalsPopupDiv']/a");
			private By company_principals_addbutton_enter_firstname = By.xpath(".//div[@id='companyPrincipalsAddContent']/form/div[3]/div[2]/span[2]/input");
			private By company_principals_addbutton_enter_lastname = By.xpath(".//div[@id='companyPrincipalsAddContent']/form/div[3]/div[6]/span[2]/input");
			private By company_principals_addbutton_enter_email = By.xpath(".//div[@id='companyPrincipalsAddContent']/form/div[3]/div[8]/span[2]/input");
			private By company_principals_addbutton_save_button = By.xpath(".//div[@id='companyPrincipalsAddContent']/form/div[5]/span/input[1]");
			private By company_principals_help = By.xpath(".//div[@id='companyPrincipalTabContent']/div[2]/div[2]/div[1]/a");		
			private By company_principals_help_text = By.xpath(".//div[@id='sectionHelpDialog_c']/div[1]/div[2]/p");
			private By company_principals_help_popupclose = By.xpath(".//div[@id='sectionHelpDialog_c']/div[1]/a");
	// Locators for Geographic Sales Capability Accordion
			private By geographic_sales_capability_accordion = By.id("CompanyProfileAccordion-5-label");
			private By geographic_sales_capability_accordion_title = By.xpath(".//div[@id='geographicSalesCapabilityViewTabContent']/div[1]/div[1]/h3");
			private By geographic_sales_capability_accordion_states = By.xpath(".//div[@id='geographicSalesCapabilityViewTabContent']/div[2]/div");
			private By geographic_sales_capability_accordion_countries = By.xpath(".//div[@id='geographicSalesCapabilityViewTabContent']/div[3]/div");
			private By geographic_sales_capability_accordion_help = By.id("geoGraphicSalesCapabilityHelp");
			private By geographic_sales_capability_accordion_help_text = By.xpath(".//div[@id='sectionHelpDialog_c']/div[1]/div[2]/p");
			private By geographic_sales_capability_accordion_help_popupclose = By.xpath(".//div[@id='sectionHelpDialog_c']/div[1]/a");
	// Locators for Diversity Information Accordion
			private By diversity_information_accordion = By.id("CompanyProfileAccordion-6-label");
			private By diversity_information_accordion_title = By.xpath(".//div[@id='diversityInfoViewTabContent']/div[1]/div[1]/h3");
			private By diversity_information_accordion_womanowned_agency = By.xpath(".//div[@id='diversityInfoTabContent']/div/div[1]/div[2]/div[7]/span[2]");
			private By diversity_information_accordion_womanowned_expiration = By.xpath(".//div[@id='diversityInfoTabContent']/div/div[1]/div[2]/div[11]/span[2]");
			private By diversity_information_accordion_womanowned_certificationview = By.xpath(".//div[@id='diversityInfoViewTabContent']/div[12]/span[2]/a");
			private By diversity_information_accordion_help = By.id("diversityInfoHelp");
			private By diversity_information_accordion_help_text = By.xpath(".//div[@id='sectionHelpDialog_c']/div[1]/div[2]/p");
			private By diversity_information_accordion_help_popupclose = By.xpath(".//div[@id='sectionHelpDialog_c']/div[1]/a");
			private By diversity_information_accordion_gender = By.xpath(".//div[@id='diversityInfoViewTabContent']/div[30]/span[2]");
			private By diversity_information_accordion_ethnicity = By.xpath(".//div[@id='diversityInfoViewTabContent']/div[31]/span[2]");
	// Locators for Compliance Officer Accordion
			private By compliance_officer_accordion = By.id("CompanyProfileAccordion-7-label");
			private By compliance_officer_accordion_title = By.xpath(".//div[@id='complianceOfficerViewTabContent']/div[1]/div[1]/h3");
			private By compliance_officer_accordion_firstname = By.xpath(".//div[@id='complianceOfficerViewTabContent']/div[2]/div[2]/span[2]/div");
			private By compliance_officer_accordion_lastname = By.xpath(".//div[@id='complianceOfficerViewTabContent']/div[2]/div[4]/span[2]/div");
			private By compliance_officer_accordion_email = By.xpath(".//div[@id='complianceOfficerViewTabContent']/div[2]/div[7]/span[2]/div");
			private By compliance_officer_accordion_help = By.id("complianceOfficerHelp");			
			private By compliance_officer_accordion_help_text = By.xpath(".//div[@id='sectionHelpDialog_c']/div[1]/div[2]/p");
			private By compliance_officer_accordion_help_popupclose = By.xpath(".//div[@id='sectionHelpDialog_c']/div[1]/a");
	//   Locators for Add , Update and Delete of Diversity details in Diversity Information Accordion					
			private By diversity_information_accordion_editbutton = By.xpath(".//div[@id='diversityInfoTabContent']/ul/li[2]/a/em");
			private By diversity_information_accordion_minority_yesradio = By.xpath(".//div[@id='tabHolderDiversityT']/span[2]/input[1]");
			private By diversity_information_accordion_minority_type = By.xpath(".//div[@id='minorityOwnedSection']/div[1]/span[2]/select");
			private By diversity_information_accordion_minority_type_asian = By.xpath(".//div[@id='minorityOwnedSection']/div[1]/span[2]/select/option[3]");
			private By diversity_information_accordion_minority_agency = By.xpath(".//div[@id='minorityOwnedSection']/div[3]/span[2]/select");
			private By diversity_information_accordion_minority_agency_chicago = By.xpath(".//div[@id='minorityOwnedSection']/div[3]/span[2]/select/option[9]");
			private By diversity_information_accordion_minority_number = By.xpath(".//div[@id='minorityOwnedSection']/div[7]/span[2]/input");
			private By diversity_information_accordion_minority_effective = By.xpath(".//div[@id='minorityOwnedSection']/div[9]/span[2]/input");
			private By diversity_information_accordion_minority_expiration = By.xpath(".//div[@id='minorityOwnedSection']/div[11]/span[2]/input");
			private By diversity_information_accordion_minority_uploadbutton = By.xpath(".//div[@id='minorityOwnedSection']/div[14]/span[2]/div[2]/div/a/div/embed");
			private By diversity_information_accordion_savebutton = By.xpath(".//div[@id='diversityInfoTabContent']/div/div[2]/div[2]/form/div[39]/span[2]/input");
			private By diversity_information_accordion_minority_deletebutton = By.xpath(".//div[@id='diversityInfoEditTabContent']/form/div[5]/div[13]/span[2]/div[2]/a");
			private By diversity_information_accordion_minority_viewyesradio = By.xpath(".//div[@id='diversityInfoViewTabContent']/div[4]/span[2]");
			private By diversity_information_accordion_minority_viewtype = By.xpath(".//div[@id='diversityInfoViewTabContent']/div[5]/span[2]");
			private By diversity_information_accordion_minority_viewagency = By.xpath(".//div[@id='diversityInfoViewTabContent']/div[6]/span[2]");
			private By diversity_information_accordion_minority_viewnumber = By.xpath(".//div[@id='diversityInfoViewTabContent']/div[8]/span[2]/div");
			private By diversity_information_accordion_minority_vieweffective = By.xpath(".//div[@id='diversityInfoViewTabContent']/div[9]/span[2]/div");
			private By diversity_information_accordion_minority_viewexpiration = By.xpath(".//div[@id='diversityInfoViewTabContent']/div[10]/span[2]");
			private By diversity_information_accordion_minority_viewcertificate = By.xpath(".//div[@id='diversityInfoViewTabContent']/div[11]/span[2]/a");
			private By diversity_information_accordion_minority_type_black = By.xpath(".//div[@id='minorityOwnedSection']/div[1]/span[2]/select/option[2]");
			private By diversity_information_accordion_minority_agency_florida = By.xpath(".//div[@id='minorityOwnedSection']/div[3]/span[2]/select/option[15]");
			private By diversity_information_accordion_minority_noradio = By.xpath(".//div[@id='tabHolderDiversityT']/span[2]/input[2]");
			private By diversity_information_accordion_minority_viewnoradio = By.xpath(".//div[@id='diversityInfoViewTabContent']/div[4]/span[2]");
			private By diversity_information_minority_owned_certificate = By.xpath(".//div[@id='viewerContainer']/div/div/div[2]/div");
			private By no_diversity_uploade = By.xpath(".//div[@id='diversityInfoViewTabContent']/div[4]/span[2]");

			
			
	//Methods for Company Profile Page
	//Method to check Company profile Page footer title
			public NVDCompanyProfilePage verify_company_profile_page_footer_title(String msg){
				return verify_element_by_text(company_profile_page_footer_title, msg);
	}
	
	//Method to check Company Profile Page Footer Text		
			public NVDCompanyProfilePage verify_company_profile_page_footer_text(String msg){
				return verify_element_by_text(company_profile_page_footer_text, msg);
	}
	
	// Methods for Company Information Accordion
	//Method to check Company Information Accordion Title 
			public NVDCompanyProfilePage verify_company_information_accordion_title(String msg){
				return verify_element_by_text(company_information_accordion_title, msg);
	}
	
	//Method to check Company Information Accordion Vendor Legal Name 
			public NVDCompanyProfilePage verify_legal_name(String msg){
				return verify_element_by_text(legal_name, msg);
	}
	
	//Method to check Company Information Accordion Tax Id 
			public NVDCompanyProfilePage verify_tax_id(String msg){
				return verify_element_by_text(tax_id, msg);
	}
	
	//Method to check Company Information Accordion Duns Number 
			public NVDCompanyProfilePage verify_duns_number(String msg){
				return verify_element_by_text(duns_number, msg);
	}
	
	//Method to click Company Information Accordion help link
			public NVDCompanyProfilePage click_company_information_help_link(){
				return click_link(company_information_help);
					
	}
	
	//Method to check Company Information Accordion help text 
			public NVDCompanyProfilePage verify_company_information_help_text(String msg){
				return verify_element_by_text(company_information_help_text, msg);
					
	}
	
	//Method to close Company Information Accordion help pop up 
			public NVDCompanyProfilePage click_company_information_help_popupclose(){
				return click_button(company_information_help_popupclose);
					
	}
	
	//Methods for Company Contact Information Accordion
	//   Method to click Company Contact Information Accordion 
			public NVDCompanyProfilePage click_company_contact_information_accordion(){
				return click_button(company_contact_information_accordion);
					
	}
	
	//   Method to check Company Contact Information Accordion Title
			public NVDCompanyProfilePage verify_company_contact_information_accordion_title(String msg){
				return verify_element_by_text(company_contact_information_accordion_title, msg);
		
	}
	
	//   Method to check Company Contact Information Accordion headquarter city
			public NVDCompanyProfilePage verify_headquarter_city(String msg){
				return verify_element_by_text(headquarter_city, msg);
		
	}
	
	//   Method to check Company Contact Information Accordion headquarter state
			public NVDCompanyProfilePage verify_headquarter_state(String msg){
				return verify_element_by_text(headquarter_state, msg);
		
	}
	
	//   Method to check Company Contact Information Accordion headquarter zipcode
			public NVDCompanyProfilePage verify_headquarter_zipcode(String msg){
				return verify_element_by_text(headquarter_zipcode, msg);
		
	}
	
	//   Method to click Company Contact Information Accordion Help Link
			public NVDCompanyProfilePage click_company_contact_information_help_link(){
				return click_link(company_contact_information_help);
					
	}
	
	//   Method to check Company Contact Information Accordion Help Link Text
			public NVDCompanyProfilePage verify_company_contact_information_help_text(String msg){
				return verify_element_by_text(company_contact_information_help_text, msg);
					
	}
	
	//   Method to close Company Contact Information Accordion help pop up
			public NVDCompanyProfilePage click_company_contact_information_help_popupclose(){
				return click_button(company_contact_information_help_popupclose);
					
	}
	
	// Methods for Company Logo Accordion
	//  Method to click on Company Logo Accordion		
			public NVDCompanyProfilePage click_company_logo_accordion(){
				return click_button(company_logo_accordion);
							
			}
			
	//  Method to verify Company Logo Accordion title		
			public NVDCompanyProfilePage verify_company_logo_accordion_title(String msg){
				return verify_element_by_text(company_logo_accordion_title, msg);
				
			}		
			
	//  Method to verify company logo accordion logo text
			public NVDCompanyProfilePage verify_company_logo_text(String msg){
				return verify_element_by_text(company_logo_text, msg);
				
			}
			
	//  Method to click on Company Logo Edit Button		
			public NVDCompanyProfilePage click_company_logo_edit_button(){
				return click_button(company_logo_edit_button);
							
			}
			
	//  Method to click on Company Logo Browse Button		
			public NVDCompanyProfilePage click_company_logo_browse_button(){
				return click_button(company_logo_browse_button);
							
			}	
	
	//  Method to click on Company Logo Save Button		
			public NVDCompanyProfilePage click_company_logo_save_button(){
				return click_button(company_logo_save_button);
									
			}
			
	//  Method to click on Company Logo Delete Button		
			public NVDCompanyProfilePage click_company_logo_delete_button(){
				return click_button(company_logo_delete_button);
										
			}		
			
	//  Method to click on Company Logo Delete Pop up 'Yes' Option Button		
			public NVDCompanyProfilePage click_company_logo_delete_popup_yes_button(){
				return click_button(company_logo_delete_popup_yes_button);
											
			}		
				
	//  Method to verify company logo file name 		
			public NVDCompanyProfilePage verify_company_logo_file_name(String msg){
				return verify_element_by_text(company_logo_file_name, msg);
				
			}
			
	//  Method to verify if company logo file name is npot present when there is no logo uploaded for company
			public NVDCompanyProfilePage verify_company_logo_not_present(String text) {
				try {
					verify_element_by_text(company_logo_file_name, text);
					Assert.fail("Element Present on the Page");
				} catch (Exception e) {
				}
				
				return this;
			}

	// Methods for Company Principals Accordion
	//  Method to verify company principals accordion		
			public NVDCompanyProfilePage click_company_principals_accordion(){
				return click_button(company_principals_accordion);
							
			}
			
	//  Verify username for company principals
			public NVDCompanyProfilePage verify_company_principals_username(String msg){
				return verify_element_by_text(company_principals_username, msg);
				
			}	
			
	//  Verify email if of company principals		
			public NVDCompanyProfilePage verify_company_principals_email(String msg){
				return verify_element_by_text(company_principals_email, msg);
				
			}	
			
	//  Verify the button name 'Add' in company principals accordion
			public NVDCompanyProfilePage verify_company_principals_addbutton(String msg){
				return verify_element_by_text(company_principals_addbutton, msg);
				
			}
	
	//  Method to click on Add button in company principals accordion		
			public NVDCompanyProfilePage click_company_principals_addbutton(){
				wait_until(2);
				return click_button(company_principals_addbutton);
							
			}
	
	//  Method to verify the Pop title after clcking add button company principals		
			public NVDCompanyProfilePage verify_company_principals_addbutton_popup_title(String msg){
				wait_until(2);
				return verify_element_by_text(company_principals_addbutton_popup_title, msg);
				
			}
	
	//  Method to close the pop up on Company Principals accordion Add button		
			public NVDCompanyProfilePage click_company_principals_addbutton_popupclose(){
				wait_until(2);
				return click_button(company_principals_addbutton_popupclose);
							
			}
			
	//  Method to click on Company Principals Help Link
			public NVDCompanyProfilePage click_company_principals_help(){
				return click_button(company_principals_help);
							
			}
			
	//  Method to verify Company Principals Help Text		
			public NVDCompanyProfilePage verify_company_principals_help_text(String msg){
				return verify_element_by_text(company_principals_help_text, msg);
				
			}
			
	//  Method to close the help pop up in Company Principals Accordion
			public NVDCompanyProfilePage click_company_principals_help_popupclose(){
				return click_button(company_principals_help_popupclose);
							
			}
			
	// Methods for Geographic Sales Capability Accordion	
	//  Method to click on Geographic Sales Capability Accordion 		
			public NVDCompanyProfilePage click_geographic_sales_capability_accordion(){
				return click_button(geographic_sales_capability_accordion);
							
			}
			
	//  Method to verify Geographic Sales Capability Accordion Title 		
			public NVDCompanyProfilePage verify_geographic_sales_capability_accordion_title(String msg){
				return verify_element_by_text(geographic_sales_capability_accordion_title, msg);
				
			}
			
	//  Method to Verify State in Geographic Sales Capability Accordion		
			public NVDCompanyProfilePage verify_geographic_sales_capability_accordion_states(String msg){
				return verify_element_by_text(geographic_sales_capability_accordion_states, msg);
				
			}
			
	//  Method to verify country in Geographic Sales Capability Accordion		
			public NVDCompanyProfilePage verify_geographic_sales_capability_accordion_countries(String msg){
				return verify_element_by_text(geographic_sales_capability_accordion_countries, msg);
				
			}
			
	//  Method to click on Geographic Sales Capability Accordion Help		
			public NVDCompanyProfilePage click_geographic_sales_capability_accordion_help(){
				return click_button(geographic_sales_capability_accordion_help);
							
			}
			
	//  Method to verify help text on Geographic Sales Capability Accordion		
			public NVDCompanyProfilePage verify_geographic_sales_capability_accordion_help_text(String msg){
				return verify_element_by_text(geographic_sales_capability_accordion_help_text, msg);
				
			}
			
	//  Method to close help pop up on Geographic Sales Capability Accordion		
			public NVDCompanyProfilePage click_geographic_sales_capability_accordion_help_popupclose(){
				return click_button(geographic_sales_capability_accordion_help_popupclose);
							
			}
		
	// Methods for Diversity Information Accordion	
	//  Method to click on Diversity information Accordion 		
			public NVDCompanyProfilePage click_diversity_information_accordion(){
				return click_button(diversity_information_accordion);
							
			}
			
	//  Method to verify Diversity information Accordion Title		
			public NVDCompanyProfilePage verify_diversity_information_accordion_title(String msg){
				return verify_element_by_text(diversity_information_accordion_title, msg);
				
			}
			
			
			public NVDCompanyProfilePage verify_no_or_yes_in_1strecord_of_diversity_information_accordion(String msg){
				return verify_element_by_text(no_diversity_uploade, msg);
				
			}		
			
			
			
	//  Method to verify Certification agency for woman owned diversity on Diversity information Accordion 		
			public NVDCompanyProfilePage verify_diversity_information_accordion_womanowned_agency(String msg){
				return verify_element_by_text(diversity_information_accordion_womanowned_agency, msg);
				
			}
			
	//  Method to verify Expiration date for woman owned diversity on Diversity information Accordion		
			public NVDCompanyProfilePage verify_diversity_information_accordion_womanowned_expiration(String msg){
				return verify_element_by_text(diversity_information_accordion_womanowned_expiration, msg);
				
			}
			
	//  Method to click on certification view on Diversity information Accordion		
			public NVDCompanyProfilePage click_diversity_information_accordion_womanowned_certificationview(){
				return click_button(diversity_information_accordion_womanowned_certificationview);
							
			}
			
	//  Method to verify page title of woman owned diversity document uploaded on Diversity information Accordion		
			public NVDCompanyProfilePage verify_diversity_information_woman_owned_certificate(){
				return verify_page_title();
		    }
			
	//  	Method to help link on Diversity information Accordion	
			public NVDCompanyProfilePage click_diversity_information_accordion_help(){
				return click_button(diversity_information_accordion_help);
							
			}
			
	//  Method to verify help text on Diversity information Accordion		
			public NVDCompanyProfilePage verify_diversity_information_accordion_help_text(String msg){
				return verify_element_by_text(diversity_information_accordion_help_text, msg);
		    }
			
	//  Method to close the help text pop up on Diversity information Accordion		
			public NVDCompanyProfilePage click_diversity_information_accordion_help_popupclose(){
				return click_button(diversity_information_accordion_help_popupclose);
							
			}
			
	//  Method to verify the gender field on Diversity information Accordion		
			public NVDCompanyProfilePage verify_diversity_information_accordion_gender(String msg){
				return verify_element_by_text(diversity_information_accordion_gender, msg);
		    }
			
	//  Method to verify ethnicity on Diversity information Accordion		
			public NVDCompanyProfilePage verify_diversity_information_accordion_ethnicity(String msg){
				return verify_element_by_text(diversity_information_accordion_ethnicity, msg);
		    }
				
	// Methods for Compliance Officer Accordion
	//  Method to click on Compliance Officer Accordion		
			public NVDCompanyProfilePage click_compliance_officer_accordion(){
				return click_button(compliance_officer_accordion);
							
			}					
			
	//  Method to verify Compliance Officer Accordion Title		
			public NVDCompanyProfilePage verify_compliance_officer_accordion_title(String msg){
				return verify_element_by_text(compliance_officer_accordion_title, msg);
				
			}			
						
	//  Method to verify first name of compliance officer on Compliance Officer Accordion		
			public NVDCompanyProfilePage verify_compliance_officer_accordion_firstname(String msg){
				return verify_element_by_text(compliance_officer_accordion_firstname, msg);
				
			}			
			
	//  Method to verify Last Name of compliance officer on Compliance Officer Accordion		
			public NVDCompanyProfilePage verify_compliance_officer_accordion_lastname(String msg){
				return verify_element_by_text(compliance_officer_accordion_lastname, msg);
				
			}			
						
	//  : Method to verify email of commpliance officer on Compliance Officer Accordion		
			public NVDCompanyProfilePage verify_compliance_officer_accordion_email(String msg){
				return verify_element_by_text(compliance_officer_accordion_email, msg);
				
			}			
			
	//  Method to click on help on Compliance Officer Accordion		
			public NVDCompanyProfilePage click_compliance_officer_accordion_help(){
				return click_button(compliance_officer_accordion_help);
							
			}
			
	//  Method to verify help text on Compliance Officer Accordion		
			public NVDCompanyProfilePage verify_compliance_officer_accordion_help_text(String msg){
				return verify_element_by_text(compliance_officer_accordion_help_text, msg);
				
			}
			
	//  Method to close help pop up on Compliance Officer Accordion		
			public NVDCompanyProfilePage click_compliance_officer_accordion_help_popupclose(){
				return click_button(compliance_officer_accordion_help_popupclose);
							
			}
						
	// Methods for Add , Update and Delete of Diversity details in Diversity Information Accordion
	//  Method to click edit button on Diversity information accordion		
			public NVDCompanyProfilePage click_diversity_information_accordion_editbutton(){
				return click_button(diversity_information_accordion_editbutton);
							
			}	
			
	//  Method to click on 'yes' radio button option for minority owned diversity		
			public NVDCompanyProfilePage click_diversity_information_accordion_minority_yesradio(){
				return click_button(diversity_information_accordion_minority_yesradio);
							
			}
			
	//  Method to click on minority type dropdown on diversity information accordion 		
			public NVDCompanyProfilePage click_diversity_information_accordion_minority_type(){
				return click_button(diversity_information_accordion_minority_type);
							
			}
			
	//  Method to select Asian option in minority type dropdown on diversity information accordion 		
			public NVDCompanyProfilePage click_diversity_information_accordion_minority_type_asian(){
				return click_button(diversity_information_accordion_minority_type_asian);
							
			}
			
	//  Method to select African American option in minority type dropdown on diversity information accordion 		
			public NVDCompanyProfilePage click_diversity_information_accordion_minority_type_black(){
				return click_button(diversity_information_accordion_minority_type_black);
							
			}		
			
	//  Method to click on Agency dropdown on diversity information accordion 		
			public NVDCompanyProfilePage click_diversity_information_accordion_minority_agency(){
				return click_button(diversity_information_accordion_minority_agency);
							
			}
			
	//  Method to select Chicago option on Agency dropdown on diversity information accordion 		
			public NVDCompanyProfilePage click_diversity_information_accordion_minority_agency_chicago(){
				return click_button(diversity_information_accordion_minority_agency_chicago);
							
			}
			
	//  Method to select Florida option on Agency dropdown on diversity information accordion 		
			public NVDCompanyProfilePage click_diversity_information_accordion_minority_agency_florida(){
				return click_button(diversity_information_accordion_minority_agency_florida);
							
			}		
			
	//  Method to add certification number on diversity information accordion for minority owned	
			public NVDCompanyProfilePage enter_diversity_information_accordion_minority_number(String certificationnumber){
				return enter(diversity_information_accordion_minority_number, certificationnumber);
			}	
			
	//  Method to add effective date on diversity information accordion for minority owned	
			public NVDCompanyProfilePage enter_diversity_information_accordion_minority_effective(String effectivedate){
				return enter(diversity_information_accordion_minority_effective, effectivedate);
			}
	
	//  Method to add expiration date on diversity information accordion for minority owned	
			public NVDCompanyProfilePage enter_diversity_information_accordion_minority_expiration(String expirationdate){
				return enter(diversity_information_accordion_minority_expiration, expirationdate);
			}
			
	//  Method to click on upload button on diversity information accordion for minority owned 		
			public NVDCompanyProfilePage click_diversity_information_accordion_minority_uploadbutton(){
				return click_button(diversity_information_accordion_minority_uploadbutton);
							
			}	
			
	//  Method to click on delete button in minority owned on diversity information accordion	
			public NVDCompanyProfilePage click_diversity_information_accordion_savebutton(){
				return click_button(diversity_information_accordion_savebutton);
							
			}
			
	//  Method to click on save button on diversity information accordion	
			public NVDCompanyProfilePage click_diversity_information_accordion_minority_deletebutton(){
				return click_button(diversity_information_accordion_minority_deletebutton);
							
			}		
			
	//  Method to verify that minority owned checkbox is Yes
			public NVDCompanyProfilePage verify_diversity_information_accordion_minority_viewyesradio(String msg){
				return verify_element_by_text(diversity_information_accordion_minority_viewyesradio, msg);
				
			}	
			
	//  Method to verify that minority type
			public NVDCompanyProfilePage verify_diversity_information_accordion_minority_viewtype(String msg){
				return verify_element_by_text(diversity_information_accordion_minority_viewtype, msg);
				
			}
			
	//  Method to verify that minority certification agency
			public NVDCompanyProfilePage verify_diversity_information_accordion_minority_viewagency(String msg){
				return verify_element_by_text(diversity_information_accordion_minority_viewagency, msg);
				
			}
	
	//  Method to verify that minority certification number
			public NVDCompanyProfilePage verify_diversity_information_accordion_minority_viewnumber(String msg){
				return verify_element_by_text(diversity_information_accordion_minority_viewnumber, msg);
				
			}
			
	//  Method to verify that minority effective date
			public NVDCompanyProfilePage verify_diversity_information_accordion_minority_vieweffective(String msg){
				return verify_element_by_text(diversity_information_accordion_minority_vieweffective, msg);
				
			}	
			
	//  Method to verify that minority expiration date
			public NVDCompanyProfilePage verify_diversity_information_accordion_minority_viewexpiration(String msg){
				return verify_element_by_text(diversity_information_accordion_minority_viewexpiration, msg);
				
			}
			
	//  Method to click on view certificate button on diversity information accordion for minority owned	
			public NVDCompanyProfilePage click_diversity_information_accordion_minority_viewcertificate(){
				return click_button(diversity_information_accordion_minority_viewcertificate);
							
			}
			
	//  Method to verify page title of minority owned diversity document uploaded on Diversity information Accordion		
			public NVDCompanyProfilePage verify_diversity_information_minority_owned_certificate(String msg){
				return verify_element_by_text(diversity_information_minority_owned_certificate, msg);
		    }		
	
	//  Method to click on 'no' radio button option for minority owned diversity		
			public NVDCompanyProfilePage click_diversity_information_accordion_minority_noradio(){
				return click_button(diversity_information_accordion_minority_noradio);
							
			}
			
	//  Method to verify that minority owned checkbox is No
			public NVDCompanyProfilePage verify_diversity_information_accordion_minority_viewnoradio(String msg){
				return verify_element_by_text(diversity_information_accordion_minority_viewnoradio, msg);
				
			}	
			
	// Methods to Add/Update /Delete Company Principals
	//  Method to Add First name of Principals
			public NVDCompanyProfilePage enter_company_principals_addbutton_enter_firstname(String firstname){
				return enter(company_principals_addbutton_enter_firstname, firstname);
			}
			
	//  Method to Add Last name of Principals
			public NVDCompanyProfilePage enter_company_principals_addbutton_enter_lastname(String lastname){
				return enter(company_principals_addbutton_enter_lastname, lastname);
			}
			
	//  Method to Add Email of Principals
			public NVDCompanyProfilePage enter_company_principals_addbutton_enter_email(String email){
				return enter(company_principals_addbutton_enter_email, email);
			}
			
	//  Method to click on Save Button on Add Principals Popup		
			public NVDCompanyProfilePage click_company_principals_addbutton_save_button(){
				return click_button(company_principals_addbutton_save_button);
									
			}		
			
			
			
			
			
			
			
			
			
			
			
}
