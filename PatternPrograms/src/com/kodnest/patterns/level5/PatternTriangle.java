package com.kodnest.patterns.level5;

public class PatternTriangle {
	public static void main(String[] args) {
		for(int i=3;i>=1;i--) {
			for(int j=i-1;j>=0;j--) {
				System.out.print(" ");
			}
			for(int k=3;k>=i;k--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
