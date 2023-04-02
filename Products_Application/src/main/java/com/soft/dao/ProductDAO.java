package com.soft.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.soft.beans.Product;

public class ProductDAO {

	public List<Product> findAllproduct() {

		List<Product> productlist = new ArrayList();
		try {
			DBConnection dbcon = new DBConnection();
			Connection con = dbcon.creatConnection();
			Statement sm = con.createStatement();
			ResultSet rs = sm.executeQuery("SELECT * FROM product_application.prouduct");

			while(rs.next()) {
            Product prod = new Product();
            prod.setProductID(rs.getInt(1));
            prod.setProductName(rs.getString(2));
            prod.setProductQTY(rs.getInt(3));
            prod.setProductPrice(rs.getDouble(4));
            productlist.add(prod);
				
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
		return productlist;

	}
	
	public Product findBypid(int ProductID) {
		Product exitProduct = new Product();
		try {
			DBConnection dbcon = new DBConnection();
			Connection con = dbcon.creatConnection();

			PreparedStatement ps = con.prepareStatement("SELECT * FROM product_application.prouduct where ProductID=?");
			ps.setInt(1, ProductID);
			
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				exitProduct.setProductID(rs.getInt(1));
				exitProduct.setProductName(rs.getString(2));
				exitProduct.setProductQTY(rs.getInt(3));
				exitProduct.setProductPrice(rs.getInt(4));
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return exitProduct;
		
	}
}
