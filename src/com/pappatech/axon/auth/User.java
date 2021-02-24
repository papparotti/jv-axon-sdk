package com.pappatech.axon.auth;

import java.util.Optional;

public class User {
	public boolean isAuthenticated;
	
	private String _refreshToken;
	private String _accessToken;
	private String _userName;
	private String _userPassword;
	
	
	// plain user class
	// nothing will be passed in
	public User() {
		this._accessToken = null;
		this._refreshToken = null;
		this.isAuthenticated = false;
	}
	
	// pass in the email address and password, for immediate authentication
	public User(String _username, String _password, Optional<Boolean> immediateAuth) {
		this._userName = _username;
		this._userPassword = _password;
		boolean bAuth = immediateAuth.isPresent() ? immediateAuth.get() : false;
		if (bAuth) {
			authenticateUserUsingEmail();
		}
	}
	
	/*
	 *   
	 */
	
	public void authenticateUserUsingEmail() {
		// set the user to NotAuthenticated!
		this.isAuthenticated = false;
		
		
	}
	
	public void authenticateUsingRefreshToken() {
		this.isAuthenticated = false;
	}
	
}
