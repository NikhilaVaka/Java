package com.kodnest.arrays.level4;

public class FindSum {
	int arraySum(int arr[]) {
		int sum=0;
		for(int i=0;i<=arr.length-1;i++) {
			sum=sum+arr[i];
		}
		return sum;
	}
}
