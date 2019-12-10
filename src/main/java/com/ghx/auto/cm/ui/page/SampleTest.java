/*package com.vendormate.auto.pcm.ui.page;

import org.openqa.selenium.By;

public class SampleTest extends PCMAbstractPage<SampleTest>{
	
	private By user_name = By.id("j_username_outer");
	private By pass_word = By.id("j_password_outer");
	private By login_button = By.id("PCMLoginSubmit");
	private By invalid_username = By.id("userName.errorspan");
	private By invalid_password = By.id("errorDiv");
	
	
	public SampleTest enterUsername(String username){
		return enter(user_name, username);
	}
	
	public SampleTest enterPassword(String password){
		return enter(pass_word, password);
	}
	
	public SampleTest loginButton(){
		return click_button(login_button);
	}
	
	public SampleTest verifyInvalidUsernameMessage(String msg){
		return verify_element_by_text(invalid_username, msg);
	}
	
	public SampleTest verifyInvalidPasswordMessage(String msg){
		return verify_element_by_text(invalid_password, msg);
	}
	
	public SampleTest involeLoginUrl(String url){
		load(url);
		handle_browser_exceptions();
		return this;
	}
}
*/