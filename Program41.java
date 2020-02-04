package tucker4;

import java.util.Scanner;

public class Program41 {
	//Mitchell Tucker SPC ID #2429488
	//This program tests for valid java variable names in which the first letter is legal or not
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter a legal first character or legal Java variable name: ");
		String legal = input.next(); //holds user string input
		char ch = legal.charAt(0); //selects first character

		if ((ch >= 'a' && ch <= 'z') || ch >= 'A' && ch <= 'Z' || ch == '$' || ch == '_') {
			System.out.println("The character entered is " + ch + " and that is a legal first character!" );//tests for legal identifiers
		}

		//not sure how to test for legal keywords
		else {
			System.out.println(ch + " is an invalid input.");
		}
	}

}
