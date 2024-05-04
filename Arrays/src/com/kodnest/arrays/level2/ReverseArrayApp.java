package com.kodnest.arrays.level2;

public class ReverseArrayApp {
	void printArray(int arr[]) {
		System.out.println("Array contents in forward direction");
		for(int x:arr) {
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.println("=============");
		System.out.println("Array contents in reverse direction");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}

}
