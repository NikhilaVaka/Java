package com.kodnest.arrays.level5;

import java.util.Scanner;

public class BinarySearchApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array length");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" elements to store in array");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter key to search");
		int key=scan.nextInt();
		BinarySearch binarysearch=new BinarySearch();
		int res=binarysearch.binarySearch(arr,key);
		if(res==-1) {
			System.out.println("Key not found");
		}
		else {
			System.out.println("Key found at the index "+res);
		}
		
	}
}
