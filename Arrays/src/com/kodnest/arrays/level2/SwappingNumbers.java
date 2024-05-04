package com.kodnest.arrays.level2;

import java.util.Scanner;

public class SwappingNumbers {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("Before swapping "+a+" "+b);
		int help;
		help=a;
		a=b;
		b=help;
		System.out.println("After swapping "+a+" "+b);
	}

}
