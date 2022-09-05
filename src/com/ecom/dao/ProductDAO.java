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

	public void deleteProduct(String name) {
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

	public void searchProduct(int id) {
		try {
			String query = "select * from product where id =?";

			PreparedStatement ps;
			ps = con.prepareStatement(query);

			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();
			if (rs.next()==true) {
				System.out.println("The Product is "+rs.getString(2)+" "+rs.getInt(3));
			} else {
				System.out.println("Invalide id");
			}
		} catch (SQLException e) {
			System.out.println(e);

		}

	}

	public void updateProduct(String name,int price,int id) {
		try {
			String query = "update product set name=?,price=? where id =?";

			PreparedStatement ps;
			ps = con.prepareStatement(query);

			ps.setString(1, name);
			ps.setInt(2, price);
			ps.setInt(3,id);

			int rs = ps.executeUpdate();
			if (rs == 0) {
				System.out.println("Product not Update");
			} else {
				System.out.println("Product update");
			}
		} catch (SQLException e) {
			System.out.println(e);

		}

	}

	public void ListProduct() {
		try {
			String query = "select * from product";

			PreparedStatement ps;
			ps = con.prepareStatement(query);

			ResultSet rs = ps.executeQuery();
			while(rs.next()==true) 
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			
				
			}
				
		} catch (SQLException e) {
			System.out.println(e);

		}

	}
}
