import java.util.Scanner;
import java.text.DecimalFormat;

public class PayCalculator {

	public static void main(String[] args) {
		
	
		boolean repeat = false;
		do {
		
		Scanner scanakin = new Scanner(System.in); 
		DecimalFormat newFormat = new DecimalFormat("0.00");
		
		double sales = 0;
		double pay = 0;

		System.out.println("How many knives did you sell this month?");
		sales = scanakin.nextDouble();
		
		if (sales <= 100) {
			pay = (sales * 5);
		};
		
		if (sales > 100 && sales < 201) {
			pay = (((sales - 100)*10) + 500); 
		};
		
		if (sales > 200) {
			pay = (((sales - 200)*15) + 1500); 
		};
		
		System.out.println("You have made $" + newFormat.format(pay) + " in knife sales.");
		System.out.println("Reset [Y/N])\n");
		
		char answer = scanakin.next().charAt(0);
		
		if (answer == 'Y'|| answer == 'y') {
			repeat = true;
		} else {
			repeat = false;
			System.out.println("Goodbye.");
		};
			
		
	
		} while (repeat == true);	
	
		
	};//end reset
}