package com.kodnest.arrays.level4;
public class SumOfCorresponding {
	int[] findSum(int arr1[],int arr2[])
		{
		int res[]=new int[arr1.length];
		for(int i=0;i<=res.length-1;i++)
		{
		res[i]=arr1[i]+arr2[i];
		}
		return res;
		}
		}

