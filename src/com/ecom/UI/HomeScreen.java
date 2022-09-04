package com.ecom.UI;

import java.util.Scanner;

public class HomeScreen {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch = 0;
		
		do
		{
		System.out.println("====== Welcome to Ecommerce Web Application ======");
		System.out.println("1.Admin");
		System.out.println("2.USer");
		System.out.println("0.Exit");
		ch = sc.nextInt();

		switch (ch) {
		case 1:
			System.out.println("Admin Screen");
			break;
		case 2:
			System.out.println("User Screen ");
			break;
		case 0:
			System.out.println("Good Bye...!");
			break;
		default:
			System.out.println("Invalide Choice");
		}
		}while(ch!=0);

	}

}
