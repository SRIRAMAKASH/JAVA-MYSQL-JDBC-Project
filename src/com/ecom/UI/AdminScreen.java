package com.ecom.UI;

import java.util.Scanner;

import com.ecom.dao.AdminDAO;
import com.ecom.dao.ProductDAO;

public class AdminScreen 
{
	Scanner sc =new Scanner(System.in);
	String email,password,name;
	int price,id;
	boolean status=true;
	int ch=0;
	AdminDAO admin=new AdminDAO();
	ProductDAO product=new ProductDAO();
	
	public void login()
	{
		System.out.println("====== Admin Login ======");
		System.out.println("Enter the email :");
		email=sc.next();
		System.out.println("Enter the Password :");
		password=sc.next();
		
		// validate with DB
		if(admin.login(email, password)==true)
		{
			product();
		}
		else
		{
			System.out.println("Email and password are Incorrect");
		}
	}
	
	public void product()
	{
		do 
		{
		System.out.println("====== Welcome to Product Of Admin ======");
		System.out.println("1.Insert the product");
		System.out.println("2.list the Product");
		System.out.println("3.Search the Product By Id");
		System.out.println("4.Update the Product");
		System.out.println("5.Delete the Product");
		System.out.println("0.Exit");
		ch = sc.nextInt();
		

		switch (ch) {
		case 1:
			System.out.println("====== Insert Product ======");
			System.out.println("Enter the name :");
			name=sc.next();
			System.out.println("Enter the price :");
			price=sc.nextInt();
			product.insertProduct(name, price);
			break;
		case 2:
			product.ListProduct();
			break;
		case 3:
			System.out.println("====== Search Product ======");
			System.out.println("Enter the id :");
			id=sc.nextInt();
			product.searchProduct(id);
			break;
		case 4:
			System.out.println("====== Update Product ======");
			System.out.println("Enter the name :");
			name=sc.next();
			System.out.println("Enter the price :");
			price=sc.nextInt();
			System.out.println("Enter the id :");
			id=sc.nextInt();
			product.updateProduct(name, price,id);
			break;
		case 5:
			System.out.println("====== Delete Product ======");
			System.out.println("Enter the name of the product :");
			name=sc.next();
			product.deleteProduct(name);
			break;
		case 0:
			System.out.println(" Thank You...");
			break;
		default:
			System.out.println("Invalide Choice");
			break;
		}
		}while(ch!=0);
	}

}
