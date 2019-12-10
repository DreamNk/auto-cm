package com.ghx.auto.cm.ui.sso.page;

import org.openqa.selenium.By;

import com.ghx.auto.cm.ui.page.CMAbstractPage;

public class NVDCompanyProfilePage extends CMAbstractPage<NVDCompanyProfilePage>{
	
	private By companyInfoTab = By.xpath(".//div[@class='panel-group']/div[1]/div[1]/h4/a/span/a");
	private By legalNameOfBusiness = By.xpath(".//div[@class='col-sm-6 col-md-6 col-lg-6 marginB1']/div[1]/div");
	private By taxId = By.xpath(".//div[@class='col-sm-6 col-md-6 col-lg-6 marginB1']/div[3]/div");
	
	// Company contact Info
	private By companycontactInfoTab = By.xpath(".//div[@class='panel-group']/div[2]/div[1]/h4/a/span/a");
	private By streetAddress = By.xpath(".//div[@class='col-sm-12 col-md-12 col-lg-12 marginB1']/div[1]/div[1]/div");
	private By city = By.xpath(".//div[@class='col-sm-12 col-md-12 col-lg-12 marginB1']/div[1]/div[2]/div");

	//company logo
	private By companyLogoTab = By.xpath(".//div[@class='panel-group']/div[3]/div[1]");
	
	
	//Company Principal
	private By companyPrincipalsTab = By.xpath(".//div[@class='panel-group']/div[4]/div[1]/h4/a/span/a");
	private By userName = By.xpath(".//div[@class='row ng-scope']/vision-data-table/div[5]/table/tbody/tr/td[3]/div");
	private By email = By.xpath(".//div[@class='row ng-scope']/vision-data-table/div[5]/table/tbody/tr/td[4]/a/div");
	
	// Geo sales
	private By geographicSalesTab = By.xpath(".//div[@class='panel-group']/div[5]/div[1]");
	
	// Diversity Info
	private By diversityInfoTab = By.xpath(".//div[@class='panel-group']/div[6]/div[1]/h4/a/span/a");
	private By gender = By.xpath(".//div[@class='col-sm-12 col-md-12 col-lg-12 padding0']/vision-action/form/div[12]/div[2]/span");
	private By ehtnicity = By.xpath(".//div[@class='col-sm-12 col-md-12 col-lg-12 padding0']/vision-action/form/div[13]/div[2]");
	
	// compliance Office
	private By complianeOfficertab = By.xpath(".//div[@class='panel-group']/div[7]/div[1]/h4/a/span/a");
	
	//..........................................................
	
	public NVDCompanyProfilePage click_company_info_tab(){
		wait_until(2);
		return click_button(companyInfoTab);
	}
	
	public NVDCompanyProfilePage verify_company_info_text(){
		wait_until(2);
		return verify_element_by_text(companyInfoTab,"Company Information");
	}
	
	public NVDCompanyProfilePage verify_legal_name_of_business_text(String legalName){
		wait_until(2);
		return verify_element_by_text(legalNameOfBusiness,legalName);
	}
	
	public NVDCompanyProfilePage verify_tax_id_text(String fein){
		wait_until(2);
		return verify_element_by_text(taxId,fein);
	}
	//.......................................................
	
	public NVDCompanyProfilePage click_contact_info_tab(){
		wait_until(2);
		return click_button(companycontactInfoTab);
	}
	
	public NVDCompanyProfilePage verify_contact_info_text(){
		wait_until(2);
		return verify_element_by_text(companycontactInfoTab,"Company Contact Information");
	}

	public NVDCompanyProfilePage verify_street_address_text(String address){
		wait_until(2);
		return verify_element_by_text(streetAddress,address);
	}
	
	public NVDCompanyProfilePage verify_city_text(String cityNm){
		wait_until(2);
		return verify_element_by_text(city,cityNm);
	}
	//......................................................
	
	public NVDCompanyProfilePage click_company_logo_tab(){
		wait_until(2);
		return click_button(companyLogoTab);
	}

	public NVDCompanyProfilePage verify_company_logo_text(){
		wait_until(2);
		return verify_element_by_text(companyLogoTab,"Company Logo");
	}
	
	//........................................................
	
	public NVDCompanyProfilePage click_company_principal_tab(){
		wait_until(2);
		return click_button(companyPrincipalsTab);
	}
	
	public NVDCompanyProfilePage verify_company_principal_text(){
		wait_until(2);
		return verify_element_by_text(companyPrincipalsTab,"Company Principals");
	}
	
	public NVDCompanyProfilePage verify_company_principal_username_text(String cmPrincipalNm){
		wait_until(2);
		return verify_element_by_text(userName,cmPrincipalNm );
	}
	
	public NVDCompanyProfilePage verify_company_principal_email_text(String cmPrincipalEmail){
		wait_until(2);
		return verify_element_by_text(email,cmPrincipalEmail);
	}
	
	//.....................................................
	
	public NVDCompanyProfilePage click_geographical_sales_tab(){
		wait_until(2);
		return click_button(geographicSalesTab);
	}
	
	public NVDCompanyProfilePage verify_geographical_sales_text(){
		wait_until(2);
		return verify_element_by_text(geographicSalesTab,"Geographic Sales Capability");
	}
	
	//.....................................................
	
	public NVDCompanyProfilePage click_diversity_info_tab(){
		wait_until(2);
		return click_button(diversityInfoTab);
	}
	
	public NVDCompanyProfilePage verify_diversity_info_text(){
		wait_until(2);
		return verify_element_by_text(diversityInfoTab,"Diversity Information");
	}
	
	public NVDCompanyProfilePage verify_diversity_gender_text(){
		wait_until(2);
		return verify_element_by_text(gender,"Female");
	}
	
	public NVDCompanyProfilePage verify_diversity_ehtnicity_text(){
		wait_until(2);
		return verify_element_by_text(ehtnicity,"Indian");
	}
	
	//...................................................
	
	public NVDCompanyProfilePage click_compliane_officer_tab(){
		wait_until(2);
		return click_button(complianeOfficertab);
	}
	
	public NVDCompanyProfilePage verify_compliane_officer_text(){
		wait_until(2);
		return verify_element_by_text(complianeOfficertab,"Compliance Officer");
	}
	
}

