package com.spec;

import java.util.Scanner;

public class CalculatorUsingSwitch {
	public static void main(String[] args) {
		int a,b;
		char op;
		Scanner sc=new Scanner((System.in));
		System.out.println("Enter two numbers");
		a=sc.nextInt();b=sc.nextInt();
		System.out.println("Enter operator");
		op=sc.next().charAt(0);
		switch(op) {
		case '+':System.out.println(a+b);
		break;
		case '/':System.out.println((float)a/b);
		break;
		case '*':System.out.println(a*b);
		break;
		case '-':System.out.println(a-b);
		break;
		default:System.out.println("invalid operator");
		}
	}

}
