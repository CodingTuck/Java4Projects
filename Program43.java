package tucker4;

import java.util.Scanner;

public class Program43 {
	//Mitchell Tucker SPC ID#2429488
	//This program has the user enter their name and calculates total characters, alphabetically, and displays initials
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Please enter your first, middle, and last name separated by spaces: ");
		String first = input.next(); //holds first name
		String middle = input.next(); //holds middle name
		String last = input.next(); //holds last name
		
		
		char firstInitial = first.charAt(0); //gets first initial
		char middleInitial = middle.charAt(0);// gets middle initial
		char lastInitial = last.charAt(0);//gets last initial
		
		//concatenates the character strings rather than combining their numbers and outputs
		System.out.println("Your initials are: " + firstInitial + "" + middleInitial + "" + lastInitial);
		
		String fullName = first + middle + last; //counts the total characters excluding spaces in the full name
		System.out.println("Your full name ignoring spaces is: " + fullName.length());
		
		//tests all options of the full name and sorts it alphabetically
		if (first.compareTo(middle) < 0 && first.compareTo(last) < 0 && middle.compareTo(last) < 0) 
			System.out.println("Your name sorted alphabetically is: " + first + " " + middle + " " + last + ".");
		
		if (first.compareTo(middle) < 0 && first.compareTo(last) < 0 && middle.compareTo(last) > 0) 
			System.out.println("Your name sorted alphabetically is: " + first + " " + last + " " + middle + ".");
		
		if (first.compareTo(middle) > 0 && first.compareTo(last) > 0 && middle.compareTo(last) > 0) 
			System.out.println("Your name sorted alphabetically is: " + last + " " + middle + " " + first + ".");
		
		
		if (middle.compareTo(first) < 0 && middle.compareTo(last) < 0 && last.compareTo(first) < 0) 
			System.out.println("Your name sorted alphabetically is: " + middle + " " + last + " " + first + ".");
		
		
		if
			(last.compareTo(first) < 0 && last.compareTo(middle) < 0 && first.compareTo(middle) < 0)
			System.out.println("Your name sorted alphabetically is: " + last + " " + first + " " + middle + ".");
		
		
		if (middle.compareTo(first) < 0 && middle.compareTo(last) < 0 && last.compareTo(first) > 0)
			System.out.println("Your name sorted alphabetically is: " + middle + " " + first + " " + last + ".");
	}

}
