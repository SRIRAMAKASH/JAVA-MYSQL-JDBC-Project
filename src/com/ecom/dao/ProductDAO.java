package com.ecom.dao;

import java.sql.*;

public class ProductDAO {
	private Connection con;

	public ProductDAO() {
		con = DBConnection.getConnection();
	}

	public void insertProduct(String name, int price) {
		try {
			String query = "insert into product(name,price) values(?,?)";

			PreparedStatement ps;
			ps = con.prepareStatement(query);

			ps.setString(1, name);
			ps.setInt(2, price);

			int rs = ps.executeUpdate();
			if (rs == 0) {
				System.out.println("Product not added");
			} else {
				System.out.println("Product added");
			}
		} catch (SQLException e) {
			System.out.println(e);

		}

	}
	
	public void DeleteProduct(String name) {
		try {
			String query = "delete from product where name=?";

			PreparedStatement ps;
			ps = con.prepareStatement(query);

			ps.setString(1, name);

			int rs = ps.executeUpdate();
			if (rs == 0) {
				System.out.println("Product not Deleted");
			} else {
				System.out.println("Product deleted");
			}
		} catch (SQLException e) {
			System.out.println(e);

		}

	}

}
