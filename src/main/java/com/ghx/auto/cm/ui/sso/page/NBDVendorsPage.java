package com.ghx.auto.cm.ui.sso.page;

import org.openqa.selenium.By;

import com.ghx.auto.cm.ui.page.CMAbstractPage;

public class NBDVendorsPage extends CMAbstractPage<NBDVendorsPage> {

	private By legalName= By.id("legalName");
	private By legalNameText = By.xpath(".//*[@id='vendorDetails']/div[3]/div[1]/table/tbody/tr/td[2]/div/a");
	private By DBANameText = By.xpath(".//*[@id='vendorDetails']/div[3]/div[1]/table/tbody/tr/td[3]/div/a");
	private By exportText = By.xpath(".//div[@class='ng-scope ng-isolate-scope']/span/span[1]");
	
	//private By manageVendorPermissions = By.xpath(".//div[@class='panel-group']/div[2]/div[1]/h4/a/span/a");
	private By manageVendorPermissions = By.id("actionVendorPermissions");
	private By manageVendorPermissionsStaging=By.id("vendorPermissions");
	private By haveAppointmentPermissions = By.xpath(".//div[@class='clearfix tableResponsive']/table/thead/tr[1]/th[2]/div");
	
	
	public NBDVendorsPage enter_legal_name(String ln){
		wait_until(1);
		return enter(legalName,ln);
	}
	
	public NBDVendorsPage click_legal_name_for_search(){
		wait_until(1);
		return click(legalName);
	}
	
	public NBDVendorsPage verify_legal_name_text(String legalNm){
		wait_until(1);
		return verify_element_by_text(legalNameText, legalNm);
	}
	
	public NBDVendorsPage verify_dba_name_text(String dbaNm){
		wait_until(1);
		return verify_element_by_text(DBANameText, dbaNm);
	}
	
	public NBDVendorsPage verify_export_text(){
		wait_until(1);
		return verify_element_by_text_continue(exportText, "Export options:");
	}
	
	public NBDVendorsPage click_manage_vendor_permissions(){
		wait_until(1);
		return click(manageVendorPermissions);
	}
	public NBDVendorsPage click_manage_vendor_permissions_staging(){
		wait_until(1);
		return click(manageVendorPermissionsStaging);
	}
	
	public NBDVendorsPage verify_manage_vendor_permission_text(){
		wait_until(1);
		return verify_element_by_text(manageVendorPermissions,"Manage Vendor Permissions");
	}
	
	public NBDVendorsPage verify_manage_vendor_permission_text_staging(){
		wait_until(1);
		return verify_element_by_text(manageVendorPermissionsStaging,"Manage Vendor Permissions");
	}
	
	public NBDVendorsPage verify_have_appointment_permission_text(){
		wait_until(1);
		return verify_element_by_text_continue(haveAppointmentPermissions, "Have Appointment Permissions ?");
	}


}
