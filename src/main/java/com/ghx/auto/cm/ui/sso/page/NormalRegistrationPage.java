package com.ghx.auto.cm.ui.sso.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import com.ghx.auto.cm.ui.angularjs.page.RegistrationUI;
import com.ghx.auto.cm.ui.page.CMAbstractPage;

public class NormalRegistrationPage extends CMAbstractPage<NormalRegistrationPage>{

	// Locators of Health System Details page

	private By normalHealthSystemCustomerName = By.cssSelector("[ng-bind-html='customerName | trustAsHtml']");
	private By normalHealthSystemCustomerAddress = By.xpath("//*[@name='healthSystemDetails']/div[1]/div[1]/div[1]/div/label");
	private By normalHealthSystemCustomerCity = By.xpath("//*[@name='healthSystemDetails']/div[1]/div[1]/div[3]/div");
	private By normalHealthSystemCustomerZip = By.xpath("//*[@name='healthSystemDetails']/div[1]/div[1]/div[4]/div/label");
	private By normalHealthSystemCustomerUrl = By.xpath("//*[@name='healthSystemDetails']/div[1]/div[2]/label/a");
	private By normalHealthSystemNextButton = By.xpath("//button[contains(., 'Next')]");
	private By normalCompanyDetailsBusinessType = By.id("typeOfBusinessCode"); //Corporation
	private By companyDetailsNextButton = By.xpath("//button[contains(text(), 'Next')]");
	private By legalBusinessName = By.id("legalName");
	private By federalTaxId = By.id("taxId");
	private By doingBusinessAs = By.id("business");
	private By streetAddress1 = By.id("street1");
	private By streetAddress2 = By.id("street2");
	private By stateDropdown = By.id("stateProvince");
	private By city = By.id("city");
	private By zipCode = By.id("zip");
	private By countryDropdown = By.id("country");
	private By existingVendorDetailsPopupYes = By.cssSelector("[ng-click='yes()']");
	private By couponCodeTextBox = By.id("couponCode");
	private By applyCouponButton = By.xpath("//button[contains(text(), 'Apply Coupon')]");
	
	// Locators for Normal Company Relationship Page
	private By companyRelationshipExistingRelationshipYes = By.xpath("//*[@id='potential'][1]");
	private By companyRelationshipExistingRelationshipNo = By.xpath("//*[@id='potential'][2]"); 
	private By companyRelationshipSpendTier = By.id("tierCode");
	private By companyRelationshipNumberOfReps = By.id("numberOfReps");
	private By companyRelationshipOnsiteYes = By.xpath("//*[@id='onSite'][1]");
	private By companyRelationshipOnsiteNo = By.xpath("//*[@id='onSite'][2]");
	private By companyRelationshipQ1Yes = By.xpath("//*[@id='riskQuestion1'][1]");
	private By companyRelationshipQ1No = By.xpath("//*[@id='riskQuestion1'][2]");
	private By companyRelationshipQ2Yes = By.xpath("//*[@id='riskQuestion2'][1]");
	private By companyRelationshipQ2No = By.xpath("//*[@id='riskQuestion2'][2]");
	private By companyRelationshipQ3Yes = By.xpath("//*[@id='riskQuestion3'][1]");
	private By companyRelationshipQ3No = By.xpath("//*[@id='riskQuestion3'][2]");
	private By companyRelationshipQ4Yes = By.xpath("//*[@id='riskQuestion4'][1]");
	private By companyRelationshipQ4No = By.xpath("//*[@id='riskQuestion4'][2]");
	private By companyRelationshipQ5Yes = By.xpath("//*[@id='riskQuestion5'][1]");
	private By companyRelationshipQ5No = By.xpath("//*[@id='riskQuestion5'][2]");
	private By companyRelationshipPhi1Yes = By.xpath("//*[@id='employee'][1]");
	private By companyRelationshipPhi1No = By.xpath("//*[@id='employee'][2]");
	private By companyRelationshipPhi2Yes = By.xpath("//*[@id='phiOnSite'][1]");
	private By companyRelationshipPhi2No = By.xpath("//*[@id='phiOnSite'][2]");
	private By companyRelationshipNextButton = By.xpath("//button[contains(text(), 'Next')]");
	
	// Locators for Agreements page - 
		 private By relationship_no = By.cssSelector("[id='cfiRelationship'][value='false']"); 
		 private By affiliations_no = By.cssSelector("[id='cfiBoardAffl'][value='false']");
		 private By compensation_no = By.cssSelector("[id='cfiCompensation'][value='false']");
		 private By eulaLicenseAggement = By.id("licenseAgreement");
		 private By agreementPageNextButton = By.xpath("//button[contains(., 'Next')]");
	
		//  Locators related to User Relationship Page - 
		 private By repRiskQues1Yes = By.cssSelector("[id='data.RepRiskSummary.q_1'][value='true']");
		 private By repRiskQues1No = By.cssSelector("[id='data.RepRiskSummary.q_1'][value='false']");
		 private By repRiskQues2Yes = By.cssSelector("[id='data.RepRiskSummary.q_2'][value='true']");
		 private By repRiskQues2No = By.cssSelector("[id='data.RepRiskSummary.q_2'][value='false']");
		 private By repRiskQues3Yes = By.cssSelector("[id='data.RepRiskSummary.q_3'][value='true']");
		 private By repRiskQues3No = By.cssSelector("[id='data.RepRiskSummary.q_3'][value='false']");
		 private By repRiskQues4Yes = By.cssSelector("[id='data.RepRiskSummary.q_4'][value='true']");
		 private By repRiskQues4No = By.cssSelector("[id='data.RepRiskSummary.q_4'][value='false']");
		 private By repRiskQues5Yes = By.cssSelector("[id='data.RepRiskSummary.q_5'][value='true']");
		 private By repRiskQues5No = By.cssSelector("[id='data.RepRiskSummary.q_5'][value='false']");
		 private By repRiskQuesOnSiteYes = By.cssSelector("[id='data.RepRiskSummary.repOnSite'][value='true']");
		 private By repRiskQuesOnSiteNo = By.cssSelector("[id='data.RepRiskSummary.repOnSite'][value='false']");
		 private By location = By.id("data.customerChildLocation.locationOid");
		 private By department = By.id("department.id");
		 private By yourRelationshiPageNextButton = By.cssSelector("[data-ng-click='submitYourRelationship(data);']");
	
		 //Locators for Billing Info page
		 private By paymentBillingAdd = By.id("billingAddress1");
		 private By paymentBillingCity = By.name("billingCity");
		 private By paymentBillingState = By.name("billingStateCode");
		 private By paymentBillingCountry = By.id("billingCountryCode");
		 private By paymentBillingZip = By.name("billingZip");
		 private By paymentBillingEmail = By.id("billingEmail");
		 private By paymentCheckbox1 = By.id("acceptFee");
		 private By paymentCheckbox2 = By.id("acceptChangable");
		 private By paymentCheckbox3 = By.id("acceptAutoRenew");
		 private By paymentCheckbox4 = By.id("trueAndAccurate");
		 private By billingPageNextButtonPopup = By.id("nxtBtn");
		 //private By paymentChargeAndContinue_button = By.xpath("//button[contains(., 'Charge Card & Continue')]");  Old
		 private By paymentAmountBilling = By.xpath("//*[contains(@class,'amount-control ng-binding')]");
		 private By checkoutAndContinueButtonNormal = By.xpath(".//*[@id='normalPaymentDetailsForm']/div[12]/div/div[2]/button");
		 private By checkoutAndContinueButtonExpress = By.xpath(".//*[@id='expressPaymentDetailsForm']/div[8]/div[7]/div/div[2]/button");
		 private By paymentReceivedPopupNextButton = By.cssSelector("[data-ng-click='goNormalToExpress();']");
		 
		 // Locators for Checkout page 
		 private By paymentNameOncard = By.id("name");
		 private By paymentAmountCheckout = By.id("amountDisplay");
		 private By paymentCardNumber = By.id("ccNumber");
		 private By paymentVerificationnumber = By.id("CVV2");
		 private By paymentCardtype = By.id("ccType");
		 private By paymentExpirationMonth = By.id("expMonth");
		 private By paymentExpirationYear = By.id("expYear");
		 private By paymentCompleteButton = By.id("completeButton");			 
		
		 
		 
	// Code to Select type of business on Normal Company Details Page
	public NormalRegistrationPage select_normal_company_details_business_type(String business_type){
		return select_by_name(normalCompanyDetailsBusinessType, business_type);
	}
	
	// Code to click on Next Button on Normal Company Details Page 
	public NormalRegistrationPage click_normal_company_details_next_button(){
		return click(companyDetailsNextButton);
	}
	
	public NormalRegistrationPage verify_normal_health_system_details_customername(String name){
		return verify_element_by_text(normalHealthSystemCustomerName, name);
	}

	//Code to verify Customer address on Health system Details Page
	public NormalRegistrationPage verify_normal_health_system_details_customeraddress(String add){
		return verify_element_by_text(normalHealthSystemCustomerAddress, add);
	}

	//Code to verify Customer city on Health system Details Page
	public NormalRegistrationPage verify_normal_health_system_details_customercity(String city){
		return verify_element_by_text(normalHealthSystemCustomerCity, city);
	}

	//Code to verify Customer zip on Health system Details Page
	public NormalRegistrationPage verify_normal_health_system_details_customerzip(String zip){
		return verify_element_by_text(normalHealthSystemCustomerZip, zip);
	}

	//Code to verify Customer url on Health system Details Page
	public NormalRegistrationPage verify_normal_health_system_details_customerurl(String url){
		return verify_element_by_text(normalHealthSystemCustomerUrl, url);
	}

	// Code to click on Next Button on Health System Details Page
	public NormalRegistrationPage click_normal_health_system_details_next_button(){
		wait_until(3);
		return click_button(normalHealthSystemNextButton);
	}
	
//	 Methods related to Setup Your Company Page -
	 private By verify_state_on_setup_your_company_page = By.id("state");
	 private By setup_your_comapny_page_page_next_button = By.cssSelector("[data-validation-submit='registrationForm'][type='submit']");
	 
	 public NormalRegistrationPage verify_legal_business_name_on_setup_company_page(String legalName){
		 return verify_element_attribute_value(legalBusinessName, "value", legalName);
	 }
	 
	 public NormalRegistrationPage verify_fein_on_setup_company_page(String fein){
		 return verify_element_attribute_value(federalTaxId, "value", fein);
	 }
	 
	 public NormalRegistrationPage verify_street_add_1_on_setup_company_page(String address1){
		 return verify_element_attribute_value(streetAddress1, "value", address1);
	 }
	 
	 public NormalRegistrationPage verify_street_add_2_on_setup_company_page(String address2){
		 return verify_element_attribute_value(streetAddress2, "value", address2);
	 }
	 
	 public NormalRegistrationPage verify_country_on_setup_company_page(String country){
		 return verify_element_attribute_value(countryDropdown, "value", country);
	 }
	 
	 public NormalRegistrationPage verify_state_on_setup_company_page(String name){
		 return verify_element_attribute_value(verify_state_on_setup_your_company_page, "value", name);
	 }
	 
	 public NormalRegistrationPage verify_city_on_setup_company_page(String cityName){
		 return verify_element_attribute_value(city, "value", cityName);
	 }
	 
	 public NormalRegistrationPage verify_zip_on_setup_company_page(String zip){
		 return verify_element_attribute_value(zipCode, "value", zip);
	 }
	 
	 public NormalRegistrationPage verify_dba_on_setup_company_page(String dba){
		 return verify_element_attribute_value(doingBusinessAs, "value", dba);
	 }
	 
	 public NormalRegistrationPage click_next_button_on_setup_company_page() {
		 wait_until(3);
		 return click_button(setup_your_comapny_page_page_next_button);
	 }
	
	// Code to click on no option on existing company relationship on Normal Company Relationship Page
	public NormalRegistrationPage click_normal_company_relationship_existing_relationship_option(String yes_or_no){
		 if(yes_or_no.equalsIgnoreCase("yes")) {
				 boolean checkbox_selected = is_element_selected(companyRelationshipExistingRelationshipYes);
			if (checkbox_selected == false)	
				click_button(companyRelationshipExistingRelationshipYes);
			 }
			else {
			 	boolean checkbox_selected = is_element_selected(companyRelationshipExistingRelationshipNo);
				if (checkbox_selected == false)	
					click_button(companyRelationshipExistingRelationshipNo);
				 }
			return this;
	}
			
	// Code to Select spend tier on Normal Company Relationship Page
	public NormalRegistrationPage select_normal_company_relationship_spend_tier(String spend_tier){
		return select_by_name(companyRelationshipSpendTier, spend_tier);
	}
			
	public NormalRegistrationPage enter_normal_company_relationship_employee_count(String count){
		return enter(companyRelationshipNumberOfReps, count);
	}
			
	// Code to click on no option on onsite option on Normal Company Relationship Page
	public NormalRegistrationPage click_normal_company_relationship_onsite_option(String yes_or_no){
		if(yes_or_no.equalsIgnoreCase("yes")) {
			 boolean checkbox_selected = is_element_selected(companyRelationshipOnsiteYes);
		if (checkbox_selected == false)	
			click_button(companyRelationshipOnsiteYes);
		}
		else {
		 	boolean checkbox_selected = is_element_selected(companyRelationshipOnsiteNo);
			if (checkbox_selected == false)	
				click_button(companyRelationshipOnsiteNo);
			 }
		return this;
	}
			
	// Code to click on no option on VRP Q1 on Normal Company Relationship Page
	public NormalRegistrationPage click_normal_company_relationship_q1_option(String yes_or_no){
		if(yes_or_no.equalsIgnoreCase("yes")) {
			 boolean checkbox_selected = is_element_selected(companyRelationshipQ1Yes);
			 if (checkbox_selected == false)	
				 click_button(companyRelationshipQ1Yes);
			 }
			 else {
			 	boolean checkbox_selected = is_element_selected(companyRelationshipQ1No);
				if (checkbox_selected == false)	
						click_button(companyRelationshipQ1No);
				 }
			return this;
	}
			
	// Code to click on no option on VRP Q2 on Normal Company Relationship Page
	public NormalRegistrationPage click_normal_company_relationship_q2_option(String yes_or_no){
		if(yes_or_no.equalsIgnoreCase("yes")) {
			boolean checkbox_selected = is_element_selected(companyRelationshipQ2Yes);
				if (checkbox_selected == false)	
					click_button(companyRelationshipQ2Yes);
				}
				else {
					boolean checkbox_selected = is_element_selected(companyRelationshipQ2No);
					if (checkbox_selected == false)
						wait_until(2);
						click_button(companyRelationshipQ2No);
				}
			return this;
	}

	// Code to click on no option on VRP Q3 on Normal Company Relationship Page
	public NormalRegistrationPage click_normal_company_relationship_q3_option(String yes_or_no){
		if(yes_or_no.equalsIgnoreCase("yes")) {
			boolean checkbox_selected = is_element_selected(companyRelationshipQ3Yes);
				if (checkbox_selected == false)	
					click_button(companyRelationshipQ3Yes);
				}
				else {
					boolean checkbox_selected = is_element_selected(companyRelationshipQ3No);
					if (checkbox_selected == false)	
						click_button(companyRelationshipQ3No);
				}
			return this;
		}

	// Code to click on no option on VRP Q4 on Normal Company Relationship Page
	public NormalRegistrationPage click_normal_company_relationship_q4_option(String yes_or_no){
		if(yes_or_no.equalsIgnoreCase("yes")) {
				boolean checkbox_selected = is_element_selected(companyRelationshipQ4Yes);
				if (checkbox_selected == false)	
					click_button(companyRelationshipQ4Yes);
				}
				else {
					boolean checkbox_selected = is_element_selected(companyRelationshipQ4No);
					if (checkbox_selected == false)	
						click_button(companyRelationshipQ4No);
				}
			return this;
	}

	// Code to click on no option on VRP Q5 on Normal Company Relationship Page
	public NormalRegistrationPage click_normal_company_relationship_q5_option(String yes_or_no){
		if(yes_or_no.equalsIgnoreCase("yes")) {
				boolean checkbox_selected = is_element_selected(companyRelationshipQ5Yes);
				if (checkbox_selected == false)	
					click_button(companyRelationshipQ5Yes);
			}
			else {
				boolean checkbox_selected = is_element_selected(companyRelationshipQ5No);
				if (checkbox_selected == false)	
					click_button(companyRelationshipQ5No);
			}
		return this;
	}
			
	// Code to click on option on PHI Q1 on Normal Company Relationship Page
	public NormalRegistrationPage click_normal_company_relationship_phi1_option(String yes_or_no){
		if(yes_or_no.equalsIgnoreCase("yes")) {
			boolean checkbox_selected = is_element_selected(companyRelationshipPhi1Yes);
			if (checkbox_selected == false)	
				click_button(companyRelationshipPhi1Yes);
		}
		else {
			boolean checkbox_selected = is_element_selected(companyRelationshipPhi1No);
			if (checkbox_selected == false)	
				click_button(companyRelationshipPhi1No);
			}
		return this;
	} 
			
	// Code to click on option on PHI Q2 on Normal Company Relationship Page
	public NormalRegistrationPage click_normal_company_relationship_phi2_option(String yes_or_no){
		if(yes_or_no.equalsIgnoreCase("yes")) {
			boolean checkbox_selected = is_element_selected(companyRelationshipPhi2Yes);
			if (checkbox_selected == false)	
				click_button(companyRelationshipPhi2Yes);
			}
			else {
				boolean checkbox_selected = is_element_selected(companyRelationshipPhi2No);
				if (checkbox_selected == false)	
					click_button(companyRelationshipPhi2No);
			}
		return this;
	} 
			
	// Code to click Next Button on Normal Company Relationship Page
	public NormalRegistrationPage click_normal_company_relationship_next_button(){
		return click_button(companyRelationshipNextButton);
	}
	

	
	 public NormalRegistrationPage select_rep_risk_question_1(String yes_no){
		 
		 if(yes_no.equalsIgnoreCase("yes")) {
			 boolean checkbox_selected = is_element_selected(repRiskQues1Yes);
				if (checkbox_selected == false)	
					click_button(repRiskQues1Yes);
		 }
		 
		 else {
			 	boolean checkbox_selected = is_element_selected(repRiskQues1No);
				if (checkbox_selected == false)	
					click_button(repRiskQues1No);
		 }
		return this;
	 }
	 
	public NormalRegistrationPage select_rep_risk_question_2(String yes_no){
			 
			 if(yes_no.equalsIgnoreCase("yes")) {
				 boolean checkbox_selected = is_element_selected(repRiskQues2Yes);
					if (checkbox_selected == false)	
						click_button(repRiskQues2Yes);
			 }
			 
			 else {
				 	boolean checkbox_selected = is_element_selected(repRiskQues2No);
					if (checkbox_selected == false)	
						click_button(repRiskQues2No);
			 }
			return this;
		 }
	
	public NormalRegistrationPage select_rep_risk_question_3(String yes_no){
		 
		 if(yes_no.equalsIgnoreCase("yes")) {
			 boolean checkbox_selected = is_element_selected(repRiskQues3Yes);
				if (checkbox_selected == false)	
					click_button(repRiskQues3Yes);
		 }
		 
		 else {
			 	boolean checkbox_selected = is_element_selected(repRiskQues3No);
				if (checkbox_selected == false)	
					click_button(repRiskQues3No);
		 }
		return this;
	}
	
	public NormalRegistrationPage select_rep_risk_question_4(String yes_no){
		 
		 if(yes_no.equalsIgnoreCase("yes")) {
			 boolean checkbox_selected = is_element_selected(repRiskQues4Yes);
				if (checkbox_selected == false)	
					click_button(repRiskQues4Yes);
		 }
		 
		 else {
			 	boolean checkbox_selected = is_element_selected(repRiskQues4No);
				if (checkbox_selected == false)	
					click_button(repRiskQues4No);
		 }
		return this;
	}
	
	public NormalRegistrationPage select_rep_risk_question_5(String yes_no){
		 
		 if(yes_no.equalsIgnoreCase("yes")) {
			 boolean checkbox_selected = is_element_selected(repRiskQues5Yes);
				if (checkbox_selected == false)	
					click_button(repRiskQues5Yes);
		 }
		 
		 else {
			 	boolean checkbox_selected = is_element_selected(repRiskQues5No);
				if (checkbox_selected == false)	
					click_button(repRiskQues5No);
		 }
		return this;
	}
	 
	public NormalRegistrationPage select_rep_risk_on_site_question(String yes_no){
		 
		 if(yes_no.equalsIgnoreCase("yes")) {
			 boolean checkbox_selected = is_element_selected(repRiskQuesOnSiteYes);
				if (checkbox_selected == false)	
					click_button(repRiskQuesOnSiteYes);
		 }
		 
		 else {
			 	boolean checkbox_selected = is_element_selected(repRiskQuesOnSiteNo);
				if (checkbox_selected == false)	
					click_button(repRiskQuesOnSiteNo);
		 }
		return this;
	} 
	 
	public NormalRegistrationPage select_dynamic_question(int ques_no, String yes_no){
		ques_no = ques_no - 1;
		By rep_risk_dynamic_ques_yes = By.cssSelector("[id='dynamicRepQuestion[" +ques_no +"].questionOid'][value='true']");
		By rep_risk_dynamic_ques_no = By.cssSelector("[id='dynamicRepQuestion[" +ques_no +"].questionOid'][value='false']");

		 if(yes_no.equalsIgnoreCase("yes")) {
			 boolean checkbox_selected = is_element_selected(rep_risk_dynamic_ques_yes);
				if (checkbox_selected == false)	
					click_button(rep_risk_dynamic_ques_yes);
		 }
		 
		 else {
			 	boolean checkbox_selected = is_element_selected(rep_risk_dynamic_ques_no);
				if (checkbox_selected == false)	
					click_button(rep_risk_dynamic_ques_no);
		 }
		return this;
	}
	 
	public NormalRegistrationPage select_location(String locationName){
		
		List<WebElement>  ele = verify(ExpectedConditions.visibilityOfAllElementsLocatedBy(location));
		int size = ele.size();
		int a = 0;
		for (int i = 1; i <= size; i++) {
			
			String xpath1 = "(//*[@class='col-md-4 ng-scope'])[" + i +"]";
			By loc1 = By.xpath(xpath1);
			WebElement txt1 = verify(ExpectedConditions.visibilityOfElementLocated(loc1));
			if(txt1.getText().equalsIgnoreCase(locationName)) {
				
				String xpath2 = "(//*[@id='data.customerChildLocation.locationOid'])[" + i +"]";
				By loc2 = By.xpath(xpath2);
				WebElement txt2 = verify(ExpectedConditions.visibilityOfElementLocated(loc2));
				 boolean checkbox_selected = txt2.isSelected();
					if (checkbox_selected == false)	{
						txt2.click();
						break;
					} 
			} else {a++;}
		}
		
		 if(size == a)
			 Assert.fail("Location not found");
		return this;
	}
	
	public NormalRegistrationPage select_department(String departmentName){
		
		List<WebElement>  ele = verify(ExpectedConditions.visibilityOfAllElementsLocatedBy(department));
		int size = ele.size();
		System.out.println(size);
		int a = 0;
		for (int i = 1; i <= size; i++) {
			
			String xpath1 = "(//*[@class='col-md-4 marginL2 ng-scope'])[" + i +"]";
			By loc1 = By.xpath(xpath1);
			WebElement txt1 = verify(ExpectedConditions.visibilityOfElementLocated(loc1));
			System.out.println(i + " - " +txt1.getText());
			if(txt1.getText().equalsIgnoreCase(departmentName)) {
				
				String xpath2 = "(//*[@id='department.id'])[" + i +"]";
				By loc2 = By.xpath(xpath2);
				WebElement txt2 = verify(ExpectedConditions.visibilityOfElementLocated(loc2));
				 boolean checkbox_selected = txt2.isSelected();
					if (checkbox_selected == false)	{
						txt2.click();
						break;
					} 
			} else {a++;}
		}
		
		 if(size == a)
			 Assert.fail("Department not found");
		return this;
	}
	
	 
	 public NormalRegistrationPage click_your_relationship_page_next_button() {
		 wait_until(3);
		 return click_button(yourRelationshiPageNextButton);
	 } 
	 
	 
	 public NormalRegistrationPage click_relationship_no_radio_button() {
		 boolean checkbox_selected = is_element_selected(relationship_no);
		 if (checkbox_selected == false)	
			 click_button(relationship_no);
		 return this;
	 }

	 public NormalRegistrationPage verify_relationship_no_radio_button() {
		 boolean checkbox_selected = is_element_selected(relationship_no);
		 Assert.assertEquals(checkbox_selected, true);
		 return this;
	 }

	 public NormalRegistrationPage click_affiliations_no_radio_button() {
		 boolean checkbox_selected = is_element_selected(affiliations_no);
		 if (checkbox_selected == false)	
			 click_button(affiliations_no);
		 return this;
	 }

	 public NormalRegistrationPage verify_affiliations_no_radio_button() {
		 boolean checkbox_selected = is_element_selected(affiliations_no);
		 Assert.assertEquals(checkbox_selected, true);
		 return this;
	 }

	 public NormalRegistrationPage click_compensation_no_radio_button() {
		 boolean checkbox_selected = is_element_selected(compensation_no);
		 if (checkbox_selected == false)	
			 click_button(compensation_no);
		 return this;
	 }

	 public NormalRegistrationPage verify_compensation_no_radio_button() {
		 boolean checkbox_selected = is_element_selected(compensation_no);
		 Assert.assertEquals(checkbox_selected, true);
		 return this;
	 }

	 public NormalRegistrationPage check_eula_license_aggement_checkbox() {
		 boolean checkbox_selected = is_element_selected(eulaLicenseAggement);
		 if (checkbox_selected == false)	
			 click_button(eulaLicenseAggement);
		 return this;
	 }

	 public NormalRegistrationPage click_agreement_page_next_button() {
		 return click_button(agreementPageNextButton);
	 }
	
	
	 
	 //Code for Payment Page of Express Flow
	 // Code to select card type from dropdown
	 public NormalRegistrationPage select_payment_cardtype(String cardtype){
		 return select_by_name(paymentCardtype, cardtype);
	 }

	 // Code to enter card number Payment Details Page 
	 public NormalRegistrationPage enter_payment_cardnumber(String cardnumber){
		 return enter(paymentCardNumber, cardnumber);
	 }

	 // Code to enter name on card on Payment Details Page 
	 public NormalRegistrationPage enter_payment_nameoncard(String nameoncard){
		 return enter(paymentNameOncard, nameoncard);
	 }

	 // Code to select card expiration month from dropdown
	 public NormalRegistrationPage select_payment_expirationmonth(String expiremnth){
		 return select_by_name(paymentExpirationMonth, expiremnth);
	 }

	 // Code to select card expiration year from dropdown
	 public NormalRegistrationPage select_payment_expirationyear(String expireyr){
		 return select_by_name(paymentExpirationYear, expireyr);
	 }

	 // Code to enter verification number on Payment Details Page 
	 public NormalRegistrationPage enter_payment_verification_number(String verificationno){
		 return enter(paymentVerificationnumber, verificationno);
	 }

	 // Code to enter billing St on Payment Details Page 
	 public NormalRegistrationPage enter_payment_billing_address(String billingst1){
		 return enter(paymentBillingAdd, billingst1);
	 }

	 // Code to enter billing city on Payment Details Page 
	 public NormalRegistrationPage enter_payment_billing_city(String billingsct){
		 return enter(paymentBillingCity, billingsct);
	 }

	 // Code to select billing state from dropdown
	 public NormalRegistrationPage select_payment_billing_state(String billingstate){
		 return select_by_name(paymentBillingState, billingstate);
	 }

	 // Code to select billing country from dropdown
	 public NormalRegistrationPage select_payment_billing_country(String billingcountry){
		 return select_by_name(paymentBillingCountry, billingcountry);
	 }

	 // Code to enter billing zip on Payment Details Page 
	 public NormalRegistrationPage enter_payment_billing_zip(String billingzip){
		 return enter(paymentBillingZip, billingzip);
	 }

	 // Code to enter billing mail on Payment Details Page 
	 public NormalRegistrationPage enter_payment_billing_email(String billingmail){
		 return enter(paymentBillingEmail, billingmail);
	 }

	// Code to enter coupon code on Payment Details Page 
		 public NormalRegistrationPage enter_coupon_code(String coupon){
			 return enter(couponCodeTextBox, coupon);
		 }
		
	// Code to enter coupon code on Payment Details Page 
		 public NormalRegistrationPage click_apply_coupon_button(){
			 return click(applyCouponButton);
		 }
			 
	 
	 // Code to click on payment page checkbox1 on create account Chevron
	 public NormalRegistrationPage click_payment_checkbox1(){
		 boolean checkbox_selected = is_element_selected(paymentCheckbox1);
		 if (checkbox_selected == false)		
			 click_button(paymentCheckbox1);
		 return this;
	 }

	 // Code to click on payment page checkbox2 on create account Chevron
	 public NormalRegistrationPage click_payment_checkbox2(){
		 boolean checkbox_selected = is_element_selected(paymentCheckbox2);
		 if (checkbox_selected == false)		
			 click_button(paymentCheckbox2);
		 return this;
	 }

	 // Code to click on payment page checkbox3 on create account Chevron
	 public NormalRegistrationPage click_payment_checkbox3(){
		 boolean checkbox_selected = is_element_selected(paymentCheckbox3);
		 if (checkbox_selected == false)		
			 click_button(paymentCheckbox3);
		 return this;
	 }

	 // Code to click on payment page checkbox4 on create account Chevron
	 public NormalRegistrationPage click_payment_checkbox4(){
		 boolean checkbox_selected = is_element_selected(paymentCheckbox4);
		 if (checkbox_selected == false)		
			 click_button(paymentCheckbox4);
		 return this;
	 }	
	 
	 public NormalRegistrationPage switch_to_payment_iframe() {
			wait_until(1);
			return switch_to_frame("secureFrame");
		}
	 
	 public NormalRegistrationPage click_billing_page_next_button_popup(){
		 return click(billingPageNextButtonPopup);
	 }

	 // Code to click on Charge Card and Continue button on Payment Page
	 public NormalRegistrationPage click_payment_charge_and_continue_button_normal(){
		 return click_button(checkoutAndContinueButtonNormal);
	 }
	 
	 public NormalRegistrationPage click_payment_charge_and_continue_button_express(){
		 return click_button(checkoutAndContinueButtonExpress);
	 }

	 public NormalRegistrationPage verify_payment_amount_billing_info_page(String amount){
		 return verify_element_by_text(paymentAmountBilling, amount);
	 }

	 public NormalRegistrationPage click_payment_received_popup_next_button() {
		 wait_until(3);
		 return click_button(paymentReceivedPopupNextButton);
	 } 
	 
	 public NormalRegistrationPage click_payment_submit_button(){
		 return click(paymentCompleteButton);
	 }
	 
	 public NormalRegistrationPage verify_payment_amount_checkout_page(String amount){
		 return verify_element_by_text(paymentAmountCheckout, amount);
	 }

	// Wait Until loading bar dissappears -
	public NormalRegistrationPage wait_until_loading_bar_to_complete (){
		 wait_until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[class='loading']")));
		 wait_until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[class='loading ng-hide']")));
		 return this;
	 }
	
	public NormalRegistrationPage connectDatabase(){
		return this;
	}
}
