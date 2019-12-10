package com.ghx.auto.cm.ui.sso.page;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.ghx.auto.cm.ui.page.CMAbstractPage;

public class RegistrationTestDataPage extends CMAbstractPage<RegistrationTestDataPage> {
	
	static DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	static Date date = new Date();
	
	static String taxId="593748930";  
	static String customerOid="waynehealthcare";
	
	//Vc Relation table
	public static String vcStatus = "ACT";
	
	public static String repPaidForCredentialing = "Yes";
	
	// Payment Profile Table for Normal Registration // 
	
	public static String paymentTermStartDate = dateFormat.format(date);
	public static String credTermStartDate =  dateFormat.format(date);
	public static String vcPaidThisTerm = "550";
	public static String paymentSource = "RRP";
	public static String paymentProfileCreatedBy = "macro.rubbio@gmail.com";
	
	
	public static String startDate = "11/07/2017";
	public static String endDate = "11/07/2017";
	public static String vcUpdatedDate = "Nov 07, 2017";
	public static String riskProfileAmount = "1000";
	public static String vcCreatedDate = "Nov 07, 2017";
	public static String paymentDate = "Nov 07, 2017";
	public static String paymentStatus = "OPYS";
	public static String renewalDate = "Nov 07, 2018";
	public static String vcCreateDate = "11/07/2017";
	public static String riskProfileComment = "Only spend Tier";


	// Payment Profile Table for Express Registration // 
	static String taxIdExpress="710329353";
	public static String vcPaidThisTermExpress = "50";
	public static String paymentSourceExpress = "ERP";
	public static String startDateExpress = "11/07/2017";
	public static String riskProfileAmountExpress = "50";
	public static String paymentStatusExpress = "OPYS";
	

}
