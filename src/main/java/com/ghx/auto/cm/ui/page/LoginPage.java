/*
 * Copyright (c) 2015 Global Healthcare Exchange, LLC. All rights reserved.
 */

package com.ghx.auto.cm.ui.page;

import org.openqa.selenium.By;


public class LoginPage extends CMAbstractPage<LoginPage> {

    private By username_txt = By.id("j_username_outer");

    private By password_txt = By.id("j_password_outer");

    private By login_btn = By.id("login");
       
    public LoginPage enter_user_name(String username) {
        return enter(this.username_txt, username);
    }

    public LoginPage enter_password(String password) {
        return enter(this.password_txt, password);
    }

    public LoginPage click_login() {
        return click_button(this.login_btn);
    }
    
    public void doLogin() {
    	doLogin("baseUrl",getConfigParamValue("username"),getConfigParamValue("password"));
    }
    
    public void doLogin(String url, String username, String password) {
    	load(url);
        handle_browser_exceptions();
        enter_user_name(username);
        enter_password(password);
        click_login();
    }
    
}
