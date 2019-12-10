package com.ghx.auto.cm.ui.sso.page;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;

import com.ghx.auto.cm.ui.page.CMAbstractPage;


public class CrMDashboardPage extends CMAbstractPage<CrMDashboardPage> {
	
	// to search user using email address in payment profile section
	private By paymentProfile = By.xpath("html/body/form/table/tbody/tr/td/table/tbody/tr/td[3]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/table/tbody/tr[6]/td");
	private By startDate = By.xpath("html/body/form/table/tbody/tr/td/table/tbody/tr/td[3]/table/tbody/tr[11]/td/table/tbody/tr/td/input[1]");
	private By endDate = By.xpath("html/body/form/table/tbody/tr/td/table/tbody/tr/td[3]/table/tbody/tr[11]/td/table/tbody/tr/td/input[2]");
	private By searchKeyword = By.xpath("html/body/form/table/tbody/tr/td/table/tbody/tr/td[3]/table/tbody/tr[11]/td/table/tbody/tr/td/input[3]");
	private By continueButton = By.xpath("html/body/form/table/tbody/tr/td/table/tbody/tr/td[3]/table/tbody/tr[11]/td/table/tbody/tr/td/input[4]");
	
	//verify the column values in payment profile section
	private By customerName = By.xpath(".//*[@id='reportObject']/tbody/tr/td[2]");
	private By legalName = By.xpath(".//*[@id='reportObject']/tbody/tr/td[4]");
	private By vcStatus = By.xpath(".//*[@id='reportObject']/tbody/tr/td[7]");
	private By paymentTermStartDate = By.xpath(".//*[@id='reportObject']/tbody/tr/td[8]");
	private By vcCreateDate = By.xpath(".//*[@id='reportObject']/tbody/tr/td[9]");
	private By vcUpdatedOn = By.xpath(".//*[@id='reportObject']/tbody/tr/td[10]"); 
	private By riskProfileComment = By.xpath(".//*[@id='reportObject']/tbody/tr/td[11]");
	private By riskProfileAmount = By.xpath(".//*[@id='reportObject']/tbody/tr/td[12]");
	private By paymentDate = By.xpath(".//*[@id='reportObject']/tbody/tr/td[13]");
	private By paymentStatus = By.xpath(".//*[@id='reportObject']/tbody/tr/td[16]");
	private By renewalDate = By.xpath(".//*[@id='reportObject']/tbody/tr/td[20]");
	private By paidByRepEmail = By.xpath(".//*[@id='reportObject']/tbody/tr/td[25]");
	private By paymentSource = By.xpath(".//*[@id='reportObject']/tbody/tr/td[34]");
		
	//verify the column values in in VRPR section
	private By vendorLegalNameVrpr = By.xpath(".//*[@id='reportObject']/tbody/tr/td[2]");
	private By vcStatusVrpr = By.xpath(".//*[@id='reportObject']/tbody/tr/td[4]");
	private By vcCreateDateVrpr = By.xpath(".//*[@id='reportObject']/tbody/tr/td[5]");
	private By riskProfileCommentVrpr = By.xpath(".//*[@id='reportObject']/tbody/tr/td[8]");
	private By vcPaidThisTermVrpr = By.xpath(".//*[@id='reportObject']/tbody/tr/td[10]");
	private By repPaidForCredentialingVrpr = By.xpath(".//*[@id='reportObject']/tbody/tr/td[15]");
	
	private By backButton = By.xpath("html/body/form/table/tbody/tr/td/table/tbody/tr/td[3]/table/tbody/tr[2]/td/a/img");
	
	private By logoutButton	 = By.xpath("html/body/form/table/tbody/tr/td/table/tbody/tr/td[1]/table/tbody/tr[2]/td/p/b[2]/a");
	
	DateFormat dateFormat = new SimpleDateFormat("MM/dd/YYYY");
	Date date=new Date();
	
	//click on Payment Profile  in CrM dashboard
	public CrMDashboardPage click_payment_profile(){
		click(paymentProfile);
		wait_until(3);
		return this;
	}
	
	//enter start date in payment profile
	public CrMDashboardPage enter_start_date(String start_date){
		enter(startDate, start_date);
		wait_until(3);
		return this;
	}
	
	// Enter Todays date - MR
	public CrMDashboardPage enter_todays_date(){
		dateFormat.format(date);

  	   System.out.println("Todays Date is: "+ dateFormat.format(date));
		enter(startDate, dateFormat.format(date));
		wait_until(3);
		return this;
	}
	
	//enter end date in payment profile
	public CrMDashboardPage enter_end_date(String end_date){
		enter(endDate, end_date);
		wait_until(3);
		return this;
	}
	
	//enter user email address to search in payment profile
	public CrMDashboardPage enter_user_email(String user_email_address){
		enter(searchKeyword, user_email_address);
		wait_until(3);
		return this;
	}
	//click continue button in payment profile
		public CrMDashboardPage click_continue_button(){
			click(continueButton);
			wait_until(3);
			return this;
		}
		
		//######### VERIFICATION IN PAYMENT PROFILE SECTION ############
		
		//customer name
		public CrMDashboardPage verify_customer_name(String customer_name){
			wait_until(2);
			return verify_element_by_text(customerName, customer_name);
		}
		
		//legal name
		public CrMDashboardPage verify_legal_name(String legal_name){
			wait_until(2);
			return verify_element_by_text(legalName, legal_name);
		}
		
		//vc status
		public CrMDashboardPage verify_vc_status(String vc_status){
			wait_until(2);
			return verify_element_by_text(vcStatus, vc_status);
		}
		
		//payment term start date
		public CrMDashboardPage verify_payment_term_start_date(String payment_term_start_date){
			wait_until(2);
			return verify_element_by_text(paymentTermStartDate, payment_term_start_date);
		}
		
		//vc create date
		public CrMDashboardPage verify_vc_create_date(){
			wait_until(2);
			return verify_element_by_text(vcCreateDate, dateFormat.format(date));
		}
		
		//vc updated date
		public CrMDashboardPage verify_vc_updated_date(String vc_updated_date){
			wait_until(2);
			return verify_element_by_text(vcUpdatedOn, vc_updated_date);
		}

		//risk profile comment
		public CrMDashboardPage verify_risk_profile_comment(String risk_profile_comment){
			wait_until(2);
			return verify_element_by_text(riskProfileComment, risk_profile_comment);
		}
		//risk profile amount
		public CrMDashboardPage verify_risk_profile_amount(String risk_profile_amount){
			wait_until(2);
			return verify_element_by_text(riskProfileAmount, risk_profile_amount);
		}
		//payment date
		public CrMDashboardPage verify_payment_date(String payment_date){
			wait_until(2);
			return verify_element_by_text(paymentDate, payment_date);
		}
		//payment status
		public CrMDashboardPage verify_payment_status(String payment_status){
			wait_until(2);
			return verify_element_by_text(paymentStatus, payment_status);
		}
		//renewal date
		public CrMDashboardPage verify_renewal_date(String renewal_date){
			wait_until(2);
			return verify_element_by_text(renewalDate, renewal_date);
		}
		//paid by rep email
		public CrMDashboardPage verify_paid_by_rep_email(String paid_by_rep_email){
			wait_until(2);
			return verify_element_by_text(paidByRepEmail, paid_by_rep_email);
		}
		//payment source
		public CrMDashboardPage verify_payment_source(String payment_source){
			wait_until(2);
			return verify_element_by_text(paymentSource, payment_source);
		}
		
		//########### VERIFICATION IN VRPR SECTION ##########
		
		//vendor name
		public CrMDashboardPage verify_vendor_vrpr(String vendor_vrpr){
			wait_until(2);
			return verify_element_by_text(vendorLegalNameVrpr, vendor_vrpr);
		}
		
		//vc status
		public CrMDashboardPage verify_vc_status_vrpr(String vc_status_vrpr){
			wait_until(2);
			return verify_element_by_text(vcStatusVrpr, vc_status_vrpr);
		}
		
		//vc created date
		public CrMDashboardPage verify_vc_create_date_vrpr(){
			wait_until(2);
			return verify_element_by_text(vcCreateDateVrpr, dateFormat.format(date));
		}
		
		//risk profile comment
		public CrMDashboardPage verify_risk_profile_comment_vrpr(String risk_profile_comment_vrpr){
			wait_until(2);
			return verify_element_by_text(riskProfileCommentVrpr, risk_profile_comment_vrpr);
		}
		
		//vc paid this term
		public CrMDashboardPage verify_vc_paid_this_term_vrpr(String vc_paid_this_term_vrpr){
			wait_until(2);
			return verify_element_by_text(vcPaidThisTermVrpr, vc_paid_this_term_vrpr);
		}
		
		//rep paid for credentialing
		public CrMDashboardPage verify_rep_paid_for_credentialing_vrpr(String rep_paid_for_credentialing_vrpr){
			wait_until(2);
			return verify_element_by_text(repPaidForCredentialingVrpr, rep_paid_for_credentialing_vrpr);
		}

		//click back button in VRPR section
		public CrMDashboardPage click_back_button(){
			click(backButton);
			wait_until(3);
			return this;
		}
		
		// click on logout from CrM dashboard
		public CrMDashboardPage click_logout_button(){
			click(logoutButton);
			wait_until(3);
			return this;
		}
} 
