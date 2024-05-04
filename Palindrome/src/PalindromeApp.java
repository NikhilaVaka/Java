import java.util.Scanner;

public class PalindromeApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number to reverse");
		int n=scan.nextInt();
		Palindrome palindrome=new Palindrome();
		int rev=palindrome.reverseNumber(n);
		System.out.println("Reverse of Number"+n+" is "+rev);
	}

}
