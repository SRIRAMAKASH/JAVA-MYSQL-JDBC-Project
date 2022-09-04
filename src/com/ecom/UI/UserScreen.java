package com.ecom.UI;

import java.util.Scanner;

public class UserScreen {
	Scanner sc = new Scanner(System.in);
	String email, password;
	boolean status = true;
	int ch = 0;

	void choice() {
		do {
			System.out.println("====== Welcome to User Page ======");
			System.out.println("1.Register");
			System.out.println("2.Login");
			System.out.println("0.Exit");
			ch = sc.nextInt();

			switch (ch) {
			case 1:
				System.out.println("Register Page");
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
	
	public void login()
	{
		System.out.println("====== User Login ======");
		System.out.println("Enter the email :");
		email=sc.next();
		System.out.println("Enter the Password :");
		password=sc.next();
		
		// validate with DB
		if(status==true)
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
