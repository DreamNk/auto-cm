package com.ghx.auto.cm.ui.sso.page;

import org.openqa.selenium.By;

import com.ghx.auto.cm.ui.page.CMAbstractPage;

public class KioskPage extends CMAbstractPage<KioskPage> {
 
	private By unconfigureThisMachine = By.xpath("//*[contains(@value,'Unconfigure this Machin')]");
	
	//configure or Un-configure sign-in machine in NBD---------------------------------------------------------------
	private By hereLink = By.linkText("here");
	private By vendormateCredentialingKiosk = By.linkText("Vendormate Credentialing Kiosk");
	private By signInButton = By.id("signIn");
	private By signOutButtonBadgingPage = By.id("signOut");
	private By emailAddressTextbox = By.id("email");
	private By passwordTextBox = By.id("password");
	private By findYourInfoButton = By.id("findInformation");
	private By firstName = By.id("firstName");
	private By lastName = By.id("lastName");
	private By phone = By.id("phoneNumber");
	private By companyName = By.id("company");
	private By visitingContact = By.id("visitingContact");
	private By contactTitle = By.id("contactTitle");
	private By purpose = By.id("visitingPurpose");
	private By printBadgeButton = By.id("printBadege");
	private By cancelButton = By.id("printBadgeCancel");
	private By cancelButtonSignout=By.xpath(".//*[@id='signOutContainer']/div[2]/div/input[2]");
	private By warnMessage = By.xpath(".//*[@id='printBadge.message']/span");
	private By unconfigureSigninButton = By.id("unConfigureOk");
	private By kioskLink = By.linkText("Kiosk");   		 //kiosk link in the kiosk.vendormate.net page//
	private By signOutbuttonSignOutPage = By.id("signOutOk");		
	private By badgeIdTextbox = By.id("signOut");
	private By signOutMessage = By.xpath("/html/body/app-root/main/div/ng-component/div[2]/div/form/div[1]"); 
	private By badgePrintWarnPopupMessage= By.xpath("//*[@id='mat-dialog-0']/attention/mat-dialog-content/div[1]");
	private By errorPopupOkButton=By.id("attentionClose");
	private By returnToSignInPageButton = By.id("returnSignIn");
	
	//New kiosk Angular5
	private By locationDropDownByRelPath=By.xpath("//*[@id='location']");
	private By locationDropDownByAbsXpath=By.xpath("/html/body/app-root/main/div/ng-component/div[2]/form/div/mat-form-field/div/div[1]/div/mat-select/div/div[1]");           // Add Ablsoute xpath
	//private By locationSelect=By.xpath("//*[contains(text(),'Portland')]");
	
	private By poeDropDownByRelPath=By.xpath("//*[@id='entryPoint']");
	private By poeDropDownByAbsXpath=By.xpath("/html/body/app-root/main/div/ng-component/div[2]/form/div[2]/mat-form-field/div/div[1]/div");
	private By departmentDropDownByRelPath=By.xpath("//*[@id='department']");
	private By departmentDropDownByAbsPath=By.xpath("//*[@id='department']/div/div[1]/span");
	private By emailNotFoundMsg = By.xpath(".//*[@id='kiosk.vendorSignInOutForm.emailId.errorDiv']/span");
		
		
	public KioskPage click_here() {
		click_link(hereLink);
		wait_until(3);
		return this;
	}
	
	public KioskPage click_vendormate_credentialing_kiosk_link() {
		click_link(vendormateCredentialingKiosk);
		return this;
	}

	public KioskPage click_sign_in_button() {
		click(signInButton);
		return this;
	}
	
	public KioskPage click_sign_out_button_badging_page() {
		click(signOutButtonBadgingPage);
		return this;
	}
	
	public KioskPage enter_email_id(String email) {
		enter(emailAddressTextbox, email);
		wait_until(1);
		return this;
	}
	
	public KioskPage enter_password(String email) {
		enter(passwordTextBox, email);
		wait_until(1);
		return this;
	}
	
	public KioskPage click_find_your_information() {
		click(findYourInfoButton);
		wait_until(3);
		return this;
	}
	public KioskPage enter_first_name(String fname) {
		enter(firstName, fname);
		wait_until(1);
		return this;
	}
	
	public KioskPage enter_last_name(String lname) {
		enter(lastName, lname);
		wait_until(1);
		return this;
	}
	
	public KioskPage enter_phone_no(String phone_no) {
		enter(phone, phone_no);
		wait_until(1);
		return this;
	}
	
	public KioskPage enter_company_name(String company_name) {
		enter(companyName, company_name);
		wait_until(1);
		return this;
	}
	
	public KioskPage enter_visiting_contact(String visiting_contact) {
		enter(visitingContact, visiting_contact);
		wait_until(1);
		return this;
	}
	
	public KioskPage enter_contact_title(String contact_title) {
		enter(contactTitle, contact_title);
		wait_until(1);
		return this;
	}
	
	public KioskPage enter_purpose(String purpose_of_visit) {
		enter(purpose, purpose_of_visit);
		wait_until(1);
		return this;
	}	
	public KioskPage click_print_badge_button() {
		click(printBadgeButton);
		wait_until(1);
		return this;
	}
	
	public KioskPage click_cancel_button() {
		click(cancelButton);
		return this;
	}
	
	public KioskPage click_cancel_button_signout() {
		click(cancelButtonSignout);
		return this;
	}
	
	public KioskPage click_unconfigure_this_machine() {
		click(unconfigureThisMachine);
		return this;
	}
	
	public KioskPage verify_warn_message(String msg){
		verify_element_by_text(warnMessage, msg);
		return this;
	}
	
	public KioskPage click_unconfigure_button(){
		click(unconfigureSigninButton);
		wait_until(3);
		return this;
	}
	
	//Only in Staging //
		public KioskPage click_kiosk_link(){
			 click(kioskLink);
			 return this;
	}
	
		//Enter Badge Id//
	public KioskPage enter_badge_id(String Id) {	
		wait_until(5);
		enter(badgeIdTextbox,Id);
		return this;
	}

	public KioskPage click_Sign_Out_button_signout_page(){
		click(signOutbuttonSignOutPage);
		return this;
	}

	public KioskPage verify_sign_out_message(){
		wait_until(2);
		verify_element_by_text(signOutMessage, "You have been signed out successfully.");
		return this;
	}
			//To configure kiosk from kiosk.vendormate.net//
	public KioskPage invoke_kioskURL(String kioskURL) {
		load(kioskURL);
		handle_browser_exceptions();
		return this;
	}

	public KioskPage verify_kiosk_warn_message(String msg){
		verify_element_by_text(badgePrintWarnPopupMessage,msg);
		return this;
	}
	
	public KioskPage click_popup_ok_button() {
		click(errorPopupOkButton);
		return this;
	}

	public KioskPage click_return_to_sign_in_page_button() {
		click(returnToSignInPageButton);
		return this;
	}
	public KioskPage verify_email_not_found_message(){
		wait_until(2);
		verify_element_by_text(emailNotFoundMsg, "Email is not found, please sign-in by filling out information below.");
		return this;
	}
	
	public KioskPage click_location_dropdown(){
		try{
			wait_until(5);
			click(locationDropDownByRelPath);
			}
		catch(Exception E){
			wait_until(5);
			click(locationDropDownByAbsXpath);
			}
		return this;
	}
	
	public KioskPage click_location(String location){
		click(By.xpath("//*[contains(text(),'"+location+"')]"));
		return this;
	}
	
	
	public KioskPage click_poe_dropdown(){
		try{
			wait_until(5);
			click(poeDropDownByRelPath);
			}
		catch(Exception E){
			wait_until(5);
			click(poeDropDownByAbsXpath);
			}
		return this;
	}
	
	public KioskPage click_poe(String poe){
		click(By.xpath("//*[contains(text(),'"+poe+"')]"));
		return this;
	}
	
	public KioskPage click_department_dropdown(){
		try{
			wait_until(5);
			click(departmentDropDownByRelPath);
			}
		catch(Exception E){
			wait_until(5);
			click(departmentDropDownByAbsPath);
			}
		return this;
	}
	
	public KioskPage click_department(String department){
		click(By.xpath("//*[contains(text(),'"+department+"')]"));
		return this;
	}
	public KioskPage wait_for_text_appear(String text){
		wait_until_text_appears_on_page(text);
		return this;
	}
	

}