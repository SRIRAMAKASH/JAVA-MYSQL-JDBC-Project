package com.ecom.UI;

import java.util.Scanner;

import com.ecom.dao.AdminDAO;

public class AdminScreen 
{
	Scanner sc =new Scanner(System.in);
	String email,password;
	boolean status=true;
	int ch=0;
	AdminDAO admin=new AdminDAO();
	
	public void login()
	{
		System.out.println("====== Admin Login ======");
		System.out.println("Enter the email :");
		email=sc.next();
		System.out.println("Enter the Password :");
		password=sc.next();
		
		// validate with DB
		if(admin.Login(email, password)==true)
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
		System.out.println("2.Select the Product");
		System.out.println("3.Search the Product By Id");
		System.out.println("4.Update the Product");
		System.out.println("5.Delete the Product");
		System.out.println("0.Exit");
		ch = sc.nextInt();
		

		switch (ch) {
		case 1:
			System.out.println("Insert the product");
			break;
		case 2:
			System.out.println("Select the Product ");
			break;
		case 3:
			System.out.println("Search the Product By Id");
			break;
		case 4:
			System.out.println("Update the Product");
			break;
		case 5:
			System.out.println("Delete the Product");
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
