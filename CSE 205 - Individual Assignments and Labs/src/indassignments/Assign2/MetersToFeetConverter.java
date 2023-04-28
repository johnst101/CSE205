package indassignments.Assign2;
/*
Write a public static method named MetersToFeetAndInches that will take a single argument of type double and will return a String. When called, and passed a distance value (in Meters), this method must compute and return a String value with the equivalent distance in Feet and Inches

You must also write a small program in the main method that will:
prompt the user to enter a distance in Meters
collect and store the user's input in a double variable
call the MetersToFeetAndInches method, passing the user's input as an argument
store the value returned by the MetersToFeetAndInches method in another String variable
Display the Feet and Inches equivalent value as shown in the Examples below

A Meter is 39.37 Inches (use this value for your computations)
A Foot is 12 Inches
A single quote mark is a common notation for a value specified in Feet. For example 3 Feet is often expressed as 3'
A double quote mark is a common notation for a value specified in Inches. For example 7.5 Inches is often expressed as 7.5"
You may need to cast or convert some values from one data type to another.
Remember that you can use String.format to construct a String value with a specified number of decimal places.
*/

import java.util.Scanner;

public class MetersToFeetConverter {
	public static void main(String[] args) {
	// Below this comment: declare and instantiate a Scanner
	Scanner scnr = new Scanner(System.in);
	
	// Below this comment: declare any other variables you may need
	// to store the user's input and the Feet and Inches equivalent value
	double meters = 0;
	String feetInches = "";
	
	// Below this comment: collect the required inputs
	System.out.print("Enter distance in Meters : ");
	meters = scnr.nextDouble();
	
	// Below this comment: call your MetersToFeetAndInches method
	feetInches = MetersToFeetAndInches(meters);
	
	// Below this comment: disply the required results
	System.out.printf("%.2f meters in Feet and Inches is : %s\n", meters, feetInches);
	}
	
	// define your MetersToFeetAndInches method here below
	public static String MetersToFeetAndInches(double meters) {
		final double INCHES_IN_METER = 39.37;
		double totalInches = meters * INCHES_IN_METER;
		int feet = (int)(totalInches / 12);
		double remainingInches = totalInches % 12;
		String feetAndInches = String.valueOf(feet) + "\' " + String.valueOf(String.format("%.2f", remainingInches)) + "\"";
		
		return feetAndInches;
	}
}