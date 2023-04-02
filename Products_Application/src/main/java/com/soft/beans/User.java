package com.soft.beans;

import java.io.Serializable;

public class User implements Serializable{
	
	private int userID;
	private String userName;
	private long Contact;
	private String userAddress;
	private String userEmail;
	private String userPassword;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int userID, String userName, int contact, String userAddress, String userEmail, String userPassword) {
		super();
		this.userID = userID;
		this.userName = userName;
		Contact = contact;
		this.userAddress = userAddress;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public long getContact() {
		return Contact;
	}
	public void setContact(int contact) {
		Contact = contact;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	
}