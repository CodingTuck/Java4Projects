package tucker4;

import java.util.Scanner;

public class Program42 {

	//Mitchell Tucker SPC ID#2429488
	//This program tests for a magic date. It's magic if the month times the day equals the year.
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);


		System.out.println("Please enter a date in the MM/DD/YY format to see if its magic:");
		System.out.println();
		System.out.println("Enter a month from 1-12: "); //holds month
		int month = input.nextInt();

		System.out.println("Enter a day: "); //holds day
		int day = input.nextInt();

		System.out.println("Enter a year: "); //holds year
		int year = input.nextInt();
		int validYearMin = 00;
		int validYearMax = 99;


		if  (month < 1 || month > 12) { //Tests if input is a valid month
			System.out.println(month + " is an invalid month.");
		}
		
		//tests February leap year and correct amount of days
		if (month == 2 && day < 1 || year % 4 != 0 && day == 29) {
			System.out.println(day + " is an invalid day.");	
		
		}
		
		//nested if to test months with 30 days
		if (month < 1 || month > 12 || month == 4 || month == 6 || month == 9
				|| month == 11) {
			if (day < 1 || day > 30)
				System.out.println(day + " is an invalid day.");
		}
		
		//nested if to test months with 31 days 
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			if (day < 1 || day > 31)
				System.out.println(day + " is an invalid day.");
		}
		
		// tests to make sure a valid 2 digit year is entered
		if (year < validYearMin || year > validYearMax) {
			System.out.println(year + " is an invalid year.");
		}
		
		//if month times day equals year it prints out
		if (month * day == year) {
			System.out.println(month + "/" + day + "/" + year + " is a magic date!");
		}
		
		else if (month > 1 && month < 12 && day > 1 && day < 32 && year >= validYearMin && year <= validYearMax) {
			System.out.println(month + "/" + day + "/" + year + " isn't a magic date!");
		}
			
		

	}

}



