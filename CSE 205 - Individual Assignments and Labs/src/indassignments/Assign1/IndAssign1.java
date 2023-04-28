package indassignments.Assign1;
/*
Write a public static method named FahrenheitToKelvin that will take a single argument of type double and will return a double. When called, and passed a temperature value (in Fahrenheit), this method must compute and return the Kelvin temperature equivalent. You must also write a small program in the main method that will:

prompt the user to enter a temperature value in Fahrenheit
collect and store the user's input in a double variable
call the FahrenheitToKelvin method, passing the user's input as an argument
store the value returned by the FahrenheitToKelvin method in another double variable
Display the Kelvin equivalent value as shown in the Examples below
*/

import java.util.Scanner;

public class IndAssign1 {
	public static void main(String[] args) {
	// Below this comment: declare and instantiate a Scanner
	Scanner scnr = new Scanner(System.in);
	  
	// Below this comment: declare any other variables you may need
	// to store the user's input and the Kelvin equivalent value
	double tempF;
	double tempK;
	
	// Below this comment: collect the requried inputs from the user
	System.out.print("Enter temperature in Fahrenheit : ");
	tempF = scnr.nextDouble();
	
	// Below this comment: call your FahrenheitToKelvin method
	tempK = FahrenheitToKelvin(tempF);
	
	// Below this comment: disply the required results
	System.out.printf("%.2f degrees Fahrenheit is %.2f Kelvin", tempF, tempK);	          
	}
	   
	// define your FahrenheitToKelvin method here below
	public static double FahrenheitToKelvin(double tempF) {
		return (tempF - 32.0) * (5.0 / 9.0) + 273.15;
	}
}
