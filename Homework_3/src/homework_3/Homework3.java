package homework_3;
//import java.text.DecimalFormat;
import java.util.Scanner;
public class Homework3 {
	
	public static void main (String[] args){
		
		Scanner keyboard=new Scanner(System.in);
		/*
		//Declare Variables
		float grossPay, federalTax, ficaTax, stateTax, netPay=0;
		String wage;
		String time;
		float hoursWorked;
		float hourlyRate;
		
		System.out.println("Question 1");
		System.out.println();
		
		//get Wage and then convert it to a float
		System.out.println("Enter your hourly wage: (Use range"
					+ "of $10-$30)");
			wage=keyboard.nextLine();
			hourlyRate=Float.valueOf(wage);
			//Validation loop
			while((hourlyRate<10) || (hourlyRate>30))
			{
				System.out.println("Incorrect Value for Wage. Please "
						+ "enter a valid value: ");
				wage=keyboard.nextLine();
				hourlyRate=Float.valueOf(wage);
			}
			
			//get hours worked and convert it to a float
			System.out.println("Enter number of hours worked: (Please"
					+ "use range of 15-45 hours.");
			time=keyboard.nextLine();
			hoursWorked=Float.valueOf(time);
			
			//validation loop
			while((hoursWorked<15) || (hoursWorked>45))
			{
				System.out.println("Incorrect Value for Hours worked. Please "
						+ "enter a valid value: ");
				time=keyboard.nextLine();
				hoursWorked=Float.valueOf(time);
			}
			//declare variables
			grossPay=hourlyRate*hoursWorked;
			federalTax=grossPay*0.15f;
			ficaTax=grossPay*0.0765f;
			stateTax=grossPay*0.0435f;
			netPay=grossPay-federalTax-ficaTax-stateTax;
			
			//Print values
			System.out.printf("%-10s %-13.2f %n","Hourly Rate: $",hourlyRate);
			System.out.printf("%-10s %-13.2f %n","Hours Worked:",hoursWorked);
			System.out.println();
			System.out.printf("%-11s %-14.2f %n","Gross Pay",grossPay);
			System.out.printf("%-10s %-13.2f %n","Federal Tax",federalTax);			
			System.out.printf("%-11s %-14.2f %n","FICA Tax",ficaTax);	
			System.out.printf("%-11s %-14.2f %n","State Tax",stateTax);
			System.out.printf("%-11s %-14.2f %n","Net Pay",netPay);
			System.out.println();
			System.out.println("End of Question 1");*/
			
			
			
			/*System.out.println("Start of Question 2");  
			
			//declare variables
			String appName;
			double wholesalePrice;
			double retailPrice;
			
			//get name of App
			System.out.println("Name of Appliance:");
			appName=keyboard.nextLine();
			
			//get wholesale price and convert it to double
			System.out.println("Wholesale price of appliance: ");
			wholesalePrice=Double.parseDouble(keyboard.nextLine());
			
			//validation loop
			while(wholesalePrice<0)
			{
				System.out.println("Wholesale price cannot be less"
						+ "than zero. Enter correct value: ");
				wholesalePrice=Double.parseDouble(keyboard.nextLine());
			}
			
			//get retail price and convert it to double
			System.out.println("Retail price of appliance: ");
			retailPrice=Double.parseDouble(keyboard.nextLine());
			
			//validation loop
			while(retailPrice<wholesalePrice)
			{
				System.out.println("Retail price cannot be less"
						+ "than wholesale price. Enter correct value:");
				retailPrice=Double.parseDouble(keyboard.nextLine());
			}
			
			//declare variables
			double profit=retailPrice-wholesalePrice;
			double commission=profit*0.02;
			double salesTax=retailPrice*0.06;
			double totalCost=retailPrice+salesTax;
			
			//print results
			System.out.printf("%-10s %7s %n","Appliance Name:",appName);
			System.out.printf("%-10s %-13.2f %n","Wholesale Price: ",wholesalePrice);
			System.out.printf("%-10s %9.2f %n","Retail Price: ",retailPrice);
			System.out.printf("%-10s %13.2f %n","Profit:",profit);
			System.out.printf("%-10s %10.2f %n","Commission:",commission);
			System.out.printf("%-10s %12.2f %n","Sales Tax:",salesTax);
			System.out.printf("%-10s %12.2f %n","Total Cost:",totalCost);

			System.out.println("End of Question 2");
			System.out.println();*/
		
		
		
			System.out.println("Start Of Question 3");
			
			int IV1=1;
			System.out.println("Loop 1");
			for(int i=0;i<35;i++)
			{
				IV1=IV1*2;
				System.out.printf("%-10s %7d %n","Loop 1 Count:",i);
				System.out.printf("%-10s %7d %n","Value of IV:",IV1);
				System.out.println();

				
			}
			System.out.println();
			int IV2=1;
			System.out.println("Loop 2");
			for(int i=0;i<35;i++)
			{
				IV2=StrictMath.multiplyExact(IV2, 2);
				System.out.printf("%-10s %7d %n","Loop 2 Count:",i);
				System.out.printf("%-10s %7d %n","Value of IV:",IV2);
				System.out.println();

			}
			
			
		
		
		
		
		
		keyboard.close();
	}
}
