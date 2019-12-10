package com.ghx.auto.cm.ui.sso.page;

import org.openqa.selenium.By;

import com.ghx.auto.cm.ui.page.CMAbstractPage;

public class NVDResourceCenterPage extends CMAbstractPage<NVDResourceCenterPage>{

	//private By adminResourcesVendor = By.linkText("RAYMOND NATHAN Admin Resources");
	private By adminResourcesVendor = By.xpath(".//*[@id='containerFixed']/div[4]/div/div/div[1]/div[2]/div/accordion/div/div[1]/div[1]/h4/a/span/a/span[1]");
	private By associateCompaniesName = By.xpath(".//div[@class='panel-group']/div[1]/div[2]/div/div/div[2]/div/div[2]/div/select");
	private By adminResourceDocument = By.linkText("Vendor Admin Resource");
	
	//private By repResourcesVendor = By.linkText("RAYMOND NATHAN Admin Resources");
	private By repResourcesVendor = By.xpath(".//*[@id='containerFixed']/div[4]/div/div/div[1]/div[2]/div/accordion/div/div[2]/div[1]/h4/a/span/a/span[1]");
	private By repAssociateCompaniesName = By.xpath(".//div[@class='panel-group']/div[2]/div[2]/div/div/div[2]/div/div[2]/div/select");
	private By repResourceDocument = By.linkText("Rep Resource");
	
	private By adminResourceGlobal = By.linkText("Vendormate Credentialing Admin Resources");
	private By adminResourceDocumentLink = By.linkText("Test Document");
	
	private By repResourceGlobal = By.linkText("Vendormate Credentialing Rep Resources");
	//private By globalRepdocumentLink = By.linkText("Test Rep Document");
	
	private By healthSystemPoliciesLibrary = By.linkText("Health System Policies Library");
	private By healthSystemName = By.xpath(".//div[@class='minHeight200 ng-scope']/div[2]/vision-action/div[4]/div/select");
	private By healthSystemPolicy	= By.xpath(".//div[@class='minHeight200 ng-scope']/div[2]/vision-action/div[5]/div[2]/div/select");
	private By viewSinglePolicy = By.id("viewSinglePolicyBtn");
	private By downloadAllPoliciesZip = By.id("DownloadAllPolicies");
	
	//...........................................................................
	
	public NVDResourceCenterPage click_admin_resources_vendor(){
		wait_until(1);
		return click_button(adminResourcesVendor);
	}
	
	public NVDResourceCenterPage click_associate_companies_name(){
		wait_until(1);
		return click(associateCompaniesName);
	}
	
	
	public NVDResourceCenterPage verify_associate_companies_text(String assComp){
		wait_until(3);
		return verify_element_by_value(associateCompaniesName, assComp);
	}
	
	public NVDResourceCenterPage verify_admin_resource_document_text(){
		wait_until(1);
		return verify_element_by_text(adminResourceDocument, "Vendor Admin Resource");
	}
	
	public NVDResourceCenterPage click_rep_resources_vendor(){
		wait_until(1);
		return click_button(repResourcesVendor);
	}
	
	public NVDResourceCenterPage click_rep_associate_companies_name(){
		wait_until(1);
		return click(repAssociateCompaniesName);
	}
	
	public NVDResourceCenterPage verify_rep_associate_companies_text(String repAssCompanyName){
		wait_until(3);
		return verify_element_by_value(repAssociateCompaniesName, repAssCompanyName);
	}
	
	public NVDResourceCenterPage verify_rep_resource_document(){
		wait_until(1);
		return verify_element_by_text(repResourceDocument, "Rep Resource");
	}
	
	public NVDResourceCenterPage click_admin_resources_global(){
		wait_until(1);
		return click_button(adminResourceGlobal);
	}
	public NVDResourceCenterPage click_rep_resources_global(){
		wait_until(1);
		return click_button(repResourceGlobal);
	}
	public NVDResourceCenterPage click_health_system_policies_library(){
		wait_until(1);
		return click_button(healthSystemPoliciesLibrary);
	}
	
	public NVDResourceCenterPage verify_admin_resources_global(String adminResourceDoc){
		wait_until(1);
		return verify_element_by_text(By.linkText(adminResourceDoc),adminResourceDoc);
	}
	
	public NVDResourceCenterPage verify_rep_resources_global(String text){
		wait_until(1);
		return verify_element_by_text(By.linkText(text),text);
	}
	
	public NVDResourceCenterPage select_health_system_name(){
		wait_until(1);
		return select_by_name(healthSystemName, "St. Rose Hospital");
	}
	
	public NVDResourceCenterPage select_health_system_policy(){
		wait_until(1);
		return select_by_name(healthSystemPolicy, "Individual Policy");
	}
	
	public NVDResourceCenterPage verify_view_single_policy(){
		wait_until(1);
		return verify_element_by_text(viewSinglePolicy,"View Single Policy");
	}
	
	public NVDResourceCenterPage verify_downloadal_policies_zip(){
		wait_until(1);
		return verify_element_by_text(downloadAllPoliciesZip,"Download All Policies As .Zip File");
	}
}
