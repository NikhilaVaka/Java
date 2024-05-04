package com.kodnest.arrays.level2;

import java.util.Scanner;

public class SwappingArrayIndexes {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array length");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" elements to store in array");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("==================");
		for(int X:arr) {
			System.out.print(X+" ");
		}
		System.out.println("==================");
		System.out.println("Enter 2 indexes whose elements has to swapped");
		int x=scan.nextInt();
		int y=scan.nextInt();
		int help;
		help=arr[x];
		arr[x]=arr[y];
		arr[y]=help;
		System.out.println("===================");
		for(int a:arr) {
			System.out.print(a+" ");
		}
	}

}
