package com.ecom.UI;

import java.util.Scanner;

import com.ecom.dao.UserDAO;
import com.ecom.model.User;

public class UserScreen {
	Scanner sc = new Scanner(System.in);
	String name,email, password,status;
	int mobile;
	int ch = 0;
	User user;
	UserDAO users=new UserDAO();

	void choice() {
		do {
			System.out.println("====== Welcome to User Page ======");
			System.out.println("1.Register");
			System.out.println("2.Login");
			System.out.println("0.Exit");
			ch = sc.nextInt();

			switch (ch) {
			case 1:
				register();
				break;
			case 2:
				login();
				break;
			case 0:
				System.out.println("Thank You...!");
				break;
			default:
				System.out.println("Invalide Choice");
			}
		} while (ch != 0);
	}
	
	public void register()
	{
		System.out.println("====== User Register ======");

		System.out.println("Enter your name :");
		name=sc.next();
		System.out.println("Enter your email :");
		email=sc.next();
		System.out.println("Enter your Password :");
		password=sc.next();
		System.out.println("Enter your mobile :");
		mobile=sc.nextInt();
		
		user=new User(name,email,password,mobile);
		if(users.register(user)==true)
		{
			System.out.println("Register successfully");
		}
		else
		{
			System.out.println("Register failed");
		}
	}
	
	public void login()
	{
		System.out.println("====== User Login ======");
		System.out.println("Enter the email :");
		email=sc.next();
		System.out.println("Enter the Password :");
		password=sc.next();
		
		status=users.login(email, password);
		if(status!=null)
		{
			System.out.println("Welcome "+status);
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
		System.out.println("====== Welcome to Product Of User ======");
		System.out.println("1.Search the Product");
		System.out.println("2.List All the Product");
		System.out.println("3.Add to cart");
		System.out.println("4.Bill The Price");
		System.out.println("0.Exit");
		ch = sc.nextInt();
		

		switch (ch) {
		case 1:
			System.out.println("Search the Product");
			break;
		case 2:
			System.out.println("List All the Product ");
			break;
		case 3:
			System.out.println("Add to cart");
			break;
		case 4:
			System.out.println("Bill The Price");
			break;
		case 0:
			System.out.println("Thank You...");
			break;
		default:
			System.out.println("Invalide Choice");
			break;
		}
		}while(ch!=0);
	}

}
