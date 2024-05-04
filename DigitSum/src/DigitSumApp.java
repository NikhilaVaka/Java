import java.util.Scanner;

public class DigitSumApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=scan.nextInt();
		DigitSum digitsum=new DigitSum();
		int sum=digitsum.findDigitSum(n);
		System.out.println("Sum of digit of the number "+n+"is "+sum);
	}

}
