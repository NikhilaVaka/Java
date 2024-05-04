import java.util.Scanner;

public class BubbleSortApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter array length");
	int arr[]=new int[scan.nextInt()];
	System.out.println("Enter "+arr.length+" elements to store in array");
	for(int i=0;i<=arr.length-1;i++) {
		arr[i]=scan.nextInt();
	}
	System.out.println("Array elements before sorting...");
	for(int x:arr) {
		System.out.print(x+" ");
	}
	System.out.println();
	BubbleSort bubblesort=new BubbleSort();
	bubblesort.bubbleSort(arr);
	System.out.println("Array elements after sorting...");
	for(int x:arr) {
		System.out.print(x+" ");
	}
}
}
