package com.kodnest.arrays.level4;

import java.util.Scanner;

public class FindSumApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter array length");
	int arr[]=new int[scan.nextInt()];
	System.out.println("Enter "+arr.length+" number of elements");
	for(int i=0;i<=arr.length-1;i++) {
		arr[i]=scan.nextInt();
	}
	FindSum findsum=new FindSum();
	int sum=findsum.arraySum(arr);
	System.out.println("Sum of all elements in array is "+sum);
}
}
