import java.util.Scanner;
public class TheJourneyCalculatorApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter speed and time as realnumbers");
		double speed=scan.nextDouble();
		double time=scan.nextDouble();
		TheJourneyCalculator thejourneycalculator=new TheJourneyCalculator();
		System.out.printf("%.2f",thejourneycalculator.calculateDistance(speed, time));
		
	}

}
