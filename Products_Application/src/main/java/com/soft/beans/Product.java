package com.soft.beans;

import java.io.Serializable;

public class Product implements Serializable{

	
	private int ProductID;
	private String ProductName;
	private int ProductQTY;
	private double ProductPrice;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int productID, String productName, int productQTY, double productPrice) {
		super();
		ProductID = productID;
		ProductName = productName;
		ProductQTY = productQTY;
		ProductPrice = productPrice;
	}
	public int getProductID() {
		return ProductID;
	}
	public void setProductID(int productID) {
		ProductID = productID;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public int getProductQTY() {
		return ProductQTY;
	}
	public void setProductQTY(int productQTY) {
		ProductQTY = productQTY;
	}
	public double getProductPrice() {
		return ProductPrice;
	}
	public void setProductPrice(double productPrice) {
		ProductPrice = productPrice;
	}
}
	