import java.util.Scanner;

public class Main

{

public static void categorizeAge(int age)

{

// your code here
	if(age>=0 && age<=12) {
		System.out.println("Child");
	}
	else if(age>=13 && age<=19){
		System.out.println("Teen");
	}
	else if(age>=20 && age<=59){
		System.out.println("Adult");
	}
	else {
		System.out.println("Senior");
	}

}

public static void main(String[] args)

{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter your age");
	int age=scan.nextInt();
	categorizeAge(age);

}

}