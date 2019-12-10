package com.ghx.auto.cm.ui.sso.page;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.NoSuchElementException;

import org.testng.Assert;
import com.ghx.auto.cm.ui.page.CMAbstractPage;
import com.ghx.auto.cm.ui.sso.page.RegistrationTestDataPage;

public class ConnectToDatabasePage extends CMAbstractPage<ConnectToDatabasePage> {
	
	
	private Connection oConnection;
	//private ResultSet resultSet;
	private String sqlQuery,jdbcConnectionString ;
	String ptsd = "2017-09-08";
	DateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd");
	
	private String vcPaidThisTerm = null , paymentSourceCode = null , paymentProfileCreatedBy = null ,paymentProfileStatusCode ,date = null,csDate = null;
	private String grp_service_level = null , status_code = null, copoun_code = null;
    
    public void fetech_payemnt_detals_from_db () {
        try {
    		
        	Class.forName("org.postgresql.Driver");
    		System.out.println("connected to database....");
    		/* connect to a database through a connection string */
    		
    		jdbcConnectionString = "jdbc:postgresql://stdb4.vmstage:5432/vmcorp";
    	    oConnection = DriverManager.getConnection(jdbcConnectionString ,"vision","vision22");
    	    
    	   
    	    sqlQuery = "select b.payment_term_start_date as Payment_Term_Start_Date,b.cred_period_start_date as Cred_Term_Start_Date,"+
    	    			"a.created_on as Payment_Profile_Created_On,b.vc_paid_this_term as VC_Paid_This_Term,"+
    	    			"a.payment_amount as Payment_Profile_Amount,a.status_code as Payment_Profile_Status_Code,"+
    	    			"a.payment_source_code as Payment_Source_Code,a.created_by as Payment_Profile_Created_By, "+
    	    			"b.status_code as VC_Status, b.grp_service_level as GRP_Service_Level, b.cupone_code as Coupon_Code, "+
    	    			"b.express_registered as Is_Express_Registered " +
    	    			"from payment_profile as a, vcrelation as b where "+
    	    			"a. vcrelation_oid = b.oid and b.customer_oid = '"+RegistrationTestDataPage.customerOid+"' and b.vendor_oid in "+
    	    			"(select c.vendor_oid from vendor_detail as c where c.ein_or_ssn ='"+RegistrationTestDataPage.taxId+"');";
        	
    	    Statement statement = oConnection.createStatement();
    	   
    	    ResultSet resultSet;
        	resultSet = statement.executeQuery(sqlQuery);
        	System.out.println(" Query : " + sqlQuery);
        
        	while(resultSet.next()){
        		
        		System.out.println(" In Result set");
        		
        		Date paymentTermStartDate =  resultSet.getDate("payment_term_start_date"); // Date
        		paymentProfileCreatedBy = resultSet.getString("payment_profile_created_by");
        		Date credTermStartDate = resultSet.getDate("cred_term_start_date"); //Date
        		
        		date= dFormat.format(paymentTermStartDate);
        		csDate = dFormat.format(credTermStartDate);
        		vcPaidThisTerm = resultSet.getString("vc_paid_this_term");
        		paymentSourceCode = resultSet.getString("payment_source_code"); // String
        		paymentProfileStatusCode = resultSet.getString("payment_profile_status_code"); //String
        		
        		System.out.println( "Payment Term Start Date:" + date);        		
        		System.out.println( "Profile Created Date: " + csDate);
        		// Validation - Expected and Actual Results of Payment 
        		try 
        		{
        		   System.out.println("In try Block");	
        		   Assert.assertEquals(date, RegistrationTestDataPage.paymentTermStartDate);
        		   Assert.assertEquals(vcPaidThisTerm, RegistrationTestDataPage.vcPaidThisTerm);
        		   Assert.assertEquals(paymentSourceCode, RegistrationTestDataPage.paymentSource);
        		   Assert.assertEquals(paymentProfileCreatedBy, RegistrationTestDataPage.paymentProfileCreatedBy);
        		   Assert.assertEquals(paymentProfileStatusCode, RegistrationTestDataPage.paymentStatus);
        		   Assert.assertEquals(csDate, RegistrationTestDataPage.credTermStartDate);
        		          		   
        		  }
        		  catch (Exception e){
        		        System.out.print(" Expected PAyment Term Start Date :" + date + " Actual is: " +RegistrationTestDataPage.paymentTermStartDate + e.getMessage());
        		        System.out.print(" Expected PAyment Term Start Date :" + vcPaidThisTerm + " Actual is: " +RegistrationTestDataPage.vcPaidThisTerm + e.getMessage());
        		        System.out.print(" Expected PAyment Term Start Date :" + paymentSourceCode + " Actual is: " +RegistrationTestDataPage.paymentSource+e.getMessage());
        		        System.out.print(" Expected PAyment Term Start Date :" + paymentProfileCreatedBy + " Actual is: " +RegistrationTestDataPage.paymentProfileCreatedBy+e.getMessage());
        		        System.out.print(" Expected PAyment Term Start Date :" + paymentProfileStatusCode + " Actual is: " +RegistrationTestDataPage.paymentStatus+e.getMessage());
        		        System.out.print(" Expected PAyment Term Start Date :" + csDate + " Actual is: " +RegistrationTestDataPage.credTermStartDate+e.getMessage());
        		 }
           	}
        	System.out.println("Connection closed");
           oConnection.close();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
       
    }
   
 
    
    
    
    public void fetch_grp_payemnt_detals_from_db (String vcCreatedBy) {
    	
    	  try {
      		
          	Class.forName("org.postgresql.Driver");
      		System.out.println("connected to database....");
      		/* connect to a database through a connection string */
      		
      		jdbcConnectionString = "jdbc:postgresql://stdb4.vmstage:5432/vmcorp";
      	    oConnection = DriverManager.getConnection(jdbcConnectionString ,"vision","vision22");
      	    
      	   
      	    sqlQuery = "select payment_term_start_date, cred_period_start_date, vc_paid_this_term, created_on, grp_service_level, status_code, created_by "+
      	    			"from vcrelation where "+
      	    			"created_by ='"+vcCreatedBy+"' AND customer_oid = '"+RMDashGRPPage.vcoid+"' AND status_code = 'ACT';";
          	
      	    Statement statement = oConnection.createStatement();
      	   
      	    ResultSet resultSet;
          	resultSet = statement.executeQuery(sqlQuery);
          	System.out.println(" Query : " + sqlQuery);
          
          	while(resultSet.next()){
          		
          		System.out.println(" In Result set");
          		
          		Date paymentTermStartDate =  resultSet.getDate("payment_term_start_date"); // Date
          		paymentProfileCreatedBy = resultSet.getString("created_by");
          		Date credTermStartDate = resultSet.getDate("created_on"); //Date
          		date= dFormat.format(paymentTermStartDate);
          		csDate = dFormat.format(credTermStartDate);
          		vcPaidThisTerm = resultSet.getString("vc_paid_this_term");
          		grp_service_level = resultSet.getString("grp_service_level"); 
          		status_code = resultSet.getString("status_code"); 
          		System.out.println( "Payment Term Start Date:" + date);
          		System.out.println( "Profile Created Date: " + csDate);
          		System.out.println( "GRP Service level: " + grp_service_level);
          
          		// Validation - Expected and Actual Results of Payment 
          		try 
          		{
          		   System.out.println("In try Block");	
          		   Assert.assertEquals(date, RMDashGRPPage.paymentTermStartDate);
          		   Assert.assertEquals(date, RMDashGRPPage.credTermStartDate);
          		   Assert.assertEquals(vcPaidThisTerm, RMDashGRPPage.vcPaidThisTerm);
          		   Assert.assertEquals(status_code, RMDashGRPPage.status_code);
          		   Assert.assertEquals(grp_service_level, RMDashGRPPage.grp_service_level);
          		   Assert.assertEquals(paymentProfileCreatedBy, vcCreatedBy);
          		   System.out.println("Verified successfully");
          		          		   
          		  }
          		  catch (Exception e){
          		       System.out.println("Check");
          			  
          			  System.out.print(" Expected Pyment Term Start Date :" + date + " Actual is: " +RMDashGRPPage.paymentTermStartDate + e.getMessage());
          		      System.out.print(" Expected VC Paid this term :" + vcPaidThisTerm + " Actual is: " +RMDashGRPPage.vcPaidThisTerm + e.getMessage());
          		      System.out.print(" Expected Payment profile created by :" + paymentProfileCreatedBy + " Actual is: " +vcCreatedBy+e.getMessage());
          		      System.out.print(" Expected GRP serive level :" + paymentProfileCreatedBy + " Actual is: " +RMDashGRPPage.grp_service_level+e.getMessage());
          		      System.out.print(" Expected Credential term start date :" + csDate + " Actual is: " +RMDashGRPPage.credTermStartDate+e.getMessage());
          		 		
          		 }
        	}
          	
          	
          	System.out.println("Connection closed");
            oConnection.close();
           
          } catch (Exception e) {
              System.err.println("Got an exception! ");
              System.err.println(e.getMessage());
               
          }
    	
    } 
    
    
    
    public void fetch_coupon_code_payemnt_detals_from_db (String vcCreatedBy){
    	
  	  try {
    		
        	Class.forName("org.postgresql.Driver");
    		System.out.println("connected to database....");
    		/* connect to a database through a connection string */
    		
    		jdbcConnectionString = "jdbc:postgresql://stdb4.vmstage:5432/vmcorp";
    	    oConnection = DriverManager.getConnection(jdbcConnectionString ,"vision","vision22");
    	    
    	   
    	    sqlQuery = "select payment_term_start_date, cred_period_start_date, vc_paid_this_term, created_on, grp_service_level, status_code, cupone_code, created_by "+
    	    			"from vcrelation where "+
    	    			"created_by ='"+vcCreatedBy+"' AND customer_oid = '"+RMDashGRPPage.vcoid+"' AND status_code = 'ACT';";
        	
    	    Statement statement = oConnection.createStatement();
    	   
    	    ResultSet resultSet;
        	resultSet = statement.executeQuery(sqlQuery);
        	System.out.println(" Query : " + sqlQuery);
        
        	while(resultSet.next()){
        		
        		System.out.println(" In Result set");
        		
        		Date paymentTermStartDate =  resultSet.getDate("payment_term_start_date"); // Date
        		paymentProfileCreatedBy = resultSet.getString("created_by");
        		Date credTermStartDate = resultSet.getDate("created_on"); //Date
        		date= dFormat.format(paymentTermStartDate);
        		csDate = dFormat.format(credTermStartDate);
        		vcPaidThisTerm = resultSet.getString("vc_paid_this_term");
        		grp_service_level = resultSet.getString("grp_service_level"); 
        		status_code = resultSet.getString("status_code"); 
        		copoun_code = resultSet.getString("cupone_code");
        		
        		System.out.println( "Date: " + date + " profile created date");
        		System.out.println( "Copoun Code: " + copoun_code);
        
        		// Validation - Expected and Actual Results of Payment 
        		try 
        		{
        		   System.out.println("In try Block");	
        		   Assert.assertEquals(date, RMDashGRPPage.paymentTermStartDate);
        		   Assert.assertEquals(date, RMDashGRPPage.credTermStartDate);
        		   Assert.assertEquals(vcPaidThisTerm, RMDashGRPPage.vcPaidThisTerm);
        		   Assert.assertEquals(status_code, RMDashGRPPage.status_code);
        		   Assert.assertEquals(copoun_code, RMDashGRPPage.copoun_code);
        		   Assert.assertEquals(paymentProfileCreatedBy, vcCreatedBy);
        		   System.out.println("Verified successfully");
        		          		   
        		  }
        		  catch (Exception e){
        		       System.out.println("Check");
        			  
        			  System.out.print(" Expected Pyment Term Start Date :" + date + " Actual is: " +RMDashGRPPage.paymentTermStartDate + e.getMessage());
        		      System.out.print(" Expected VC Paid this term :" + vcPaidThisTerm + " Actual is: " +RMDashGRPPage.vcPaidThisTerm + e.getMessage());
        		      System.out.print(" Expected Payment profile created by :" + paymentProfileCreatedBy + " Actual is: " +vcCreatedBy+e.getMessage());
        		      System.out.print(" Expected GRP serive level :" + paymentProfileCreatedBy + " Actual is: " +RMDashGRPPage.grp_service_level+e.getMessage());
        		      System.out.print(" Expected Credential term start date :" + csDate + " Actual is: " +RMDashGRPPage.credTermStartDate+e.getMessage());
        		 		
        		 }
      	}
      	System.out.println("Connection closed");
         oConnection.close();
         
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
  	
  } 
  
    public void fetch_express_payemnt_detals_from_db (String expressPaymentProfileCreatedBy){
    	
    	  try {
      		
          	Class.forName("org.postgresql.Driver");
      		System.out.println("connected to database....");
      		/* connect to a database through a connection string */
      		
      		jdbcConnectionString = "jdbc:postgresql://stdb4.vmstage:5432/vmcorp";
      	    oConnection = DriverManager.getConnection(jdbcConnectionString ,"vision","vision22");
      	    
      	   
      	  sqlQuery = "select b.payment_term_start_date as Payment_Term_Start_Date,b.cred_period_start_date as Cred_Term_Start_Date,"+
	    			"a.created_on as Payment_Profile_Created_On,b.vc_paid_this_term as VC_Paid_This_Term,"+
	    			"a.payment_amount as Payment_Profile_Amount,a.status_code as Payment_Profile_Status_Code,"+
	    			"a.payment_source_code as Payment_Source_Code,a.created_by as Payment_Profile_Created_By, "+
	    			"b.status_code as VC_Status, b.grp_service_level as GRP_Service_Level, b.cupone_code as Coupon_Code, "+
	    			"b.express_registered as Is_Express_Registered " +
	    			"from payment_profile as a, vcrelation as b where "+
	    			"a. vcrelation_oid = b.oid and b.customer_oid = '"+RegistrationTestDataPage.customerOid+"' and b.vendor_oid in "+
	    			"(select c.vendor_oid from vendor_detail as c where c.ein_or_ssn ='"+RegistrationTestDataPage.taxIdExpress+"');";
  	
	    Statement statement = oConnection.createStatement();
	   
	    ResultSet resultSet;
  	resultSet = statement.executeQuery(sqlQuery);
  	System.out.println(" Query : " + sqlQuery);
  
  	while(resultSet.next()){
  		
  		System.out.println(" In Result set");
  		
  		Date paymentTermStartDate =  resultSet.getDate("payment_term_start_date"); // Date
  		paymentProfileCreatedBy = resultSet.getString("payment_profile_created_by");
  		Date credTermStartDate = resultSet.getDate("cred_term_start_date"); //Date
  		
  		date= dFormat.format(paymentTermStartDate);
  		csDate = dFormat.format(credTermStartDate);
  		vcPaidThisTerm = resultSet.getString("vc_paid_this_term");
  		paymentSourceCode = resultSet.getString("payment_source_code"); // String
  		paymentProfileStatusCode = resultSet.getString("payment_profile_status_code"); //String
  		
  		System.out.println( "Payment Term Start Date:" + date);        		
  		System.out.println( "Profile Created Date: " + csDate);
  		// Validation - Expected and Actual Results of Payment 
  		try 
  		{
  		   System.out.println("In try Block");	
  		   Assert.assertEquals(date, RegistrationTestDataPage.paymentTermStartDate);
  		   Assert.assertEquals(vcPaidThisTerm, RegistrationTestDataPage.vcPaidThisTermExpress);
  		   Assert.assertEquals(paymentSourceCode, RegistrationTestDataPage.paymentSourceExpress);
  		   Assert.assertEquals(paymentProfileCreatedBy, expressPaymentProfileCreatedBy);
  		   Assert.assertEquals(paymentProfileStatusCode, RegistrationTestDataPage.paymentStatus);
  		   Assert.assertEquals(csDate, RegistrationTestDataPage.credTermStartDate);
  		          		   
  		  }
  		  catch (Exception e){
  		        System.out.print(" Expected PAyment Term Start Date :" + date + " Actual is: " +RegistrationTestDataPage.paymentTermStartDate + e.getMessage());
  		        System.out.print(" Expected PAyment Term Start Date :" + vcPaidThisTerm + " Actual is: " +RegistrationTestDataPage.vcPaidThisTermExpress + e.getMessage());
  		        System.out.print(" Expected PAyment Term Start Date :" + paymentSourceCode + " Actual is: " +RegistrationTestDataPage.paymentSource+e.getMessage());
  		        System.out.print(" Expected PAyment Term Start Date :" + paymentProfileCreatedBy + " Actual is: " +RegistrationTestDataPage.paymentProfileCreatedBy+e.getMessage());
  		        System.out.print(" Expected PAyment Term Start Date :" + paymentProfileStatusCode + " Actual is: " +RegistrationTestDataPage.paymentStatus+e.getMessage());
  		        System.out.print(" Expected PAyment Term Start Date :" + csDate + " Actual is: " +RegistrationTestDataPage.credTermStartDate+e.getMessage());
  		 }
     	}
  	System.out.println("Connection closed");
     oConnection.close();
  } catch (Exception e) {
      System.err.println("Got an exception! ");
      System.err.println(e.getMessage());
  }
 
}
    
}
