package tucker4;

import java.util.Scanner;

public class Program44 {
	//Mitchell Tucker SPC ID #2429488
	//program takes a triangle with 2 given sides and one angle and calculates the other 2 angles and side
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		double a = Math.sqrt(Math.pow(34, 2) - Math.pow(30, 2)); // holds leg a
		double b = Math.sqrt(Math.pow(34, 2) - Math.pow(16, 2)); //holds leg b
		double c = Math.sqrt(Math.pow(16, 2) + Math.pow(30, 2));// holds hypotenuse c
		
		double A = Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c))); //holds angle A
		double B = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c))); //holds angle B
		double C = Math.toDegrees(Math.acos((c * c - b * b - a * a) / (-2 * a * b))); //holds angle C
		
		System.out.printf("The length of side b is: %.3f", b ); //prints b with 3 decimal spots
		System.out.println();
		System.out.printf("The angle of A is: %.3f", A); //prints A with 3 decimal spots
		System.out.println();
		System.out.printf("The angle of B is: %.3f", B); //Prints B with 3 decimal spots
		
		}

}
