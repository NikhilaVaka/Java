package AdditionOperation;
import java.util.*;
public class GalaciticArithmetic {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		long num1=scan.nextLong();
		long num2=scan.nextLong();
		long result=galacticAddition(num1, num2);
		System.out.println(result);
		
	}
public static long galacticAddition(long num1, long num2) 
{
	return num1+num2;
}
}