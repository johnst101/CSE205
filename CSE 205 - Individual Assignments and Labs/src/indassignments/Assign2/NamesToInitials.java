package indassignments.Assign2;
/*
Write a public static method named getInitials that will take a single argument of type String and will return a String. When called, and passed a name, this method must compute and return a String value with the initials for the given name.

Note that the argument to this method may be a String containing just a first name (i.e. "Bob"), just first name and last name (i.e. "Bob Smith"), or the first name and middle name and last name (i.e. "Bob Allen Smith").

You must also write a small program in the main method that will:
prompt the user to enter a name
collect and store the user's input in a String variable
call the getInitials method, passing the user's input as an argument
store the value returned by the getInitials method in another String variable
Display the name and initials as shown in the examples below

The indexOf method can be very helpful for finding things like space characters in a String
Java has an overloaded indexOf method with takes an extra int argument indicating where to start a search in a String
Java also has an lastIndexOf method, which searches a String starting at the end.
The substring method can be very helpful for extracting one or more characters from a String
You may need to wrtie some to code to make decisions based on whether the input has one (just first), two (first and last), or three (first, middle, and last) names.
The number of spaces in the input can help you determine how many names are in the input.
It can be helpful to know and understand the difference between the Scanner methods next and nextLine
 */

// Below this comment: import the Scanner
import java.util.Scanner;

public class NamesToInitials {
   public static void main(String[] args) {
      // Below this comment: declare and instantiate a Scanner
      Scanner scnr = new Scanner(System.in);
      
      // Below this comment: declare any other variables you may need
      String name = "";
      String initials = "";
      
      // Below this comment: collect the required inputs
      System.out.print("Enter name : ");
      name = scnr.nextLine();
      
      // Below this comment: call your required method
      initials = getInitials(name);
      
      // Below this comment: disply the required results
      System.out.println("Initials for " + name + " : " + initials);
   }
   
   // define your required method here below
   public static String getInitials(String name) {
	   int countSpaces = 0;
	   String firstInitial = "";
	   String secondInitial = "";
	   String thirdInitial = "";
	   
	   for (int i = 0; i < name.length(); ++i) {
		   if (name.charAt(i) == ' ') {
			   ++countSpaces;
		   }
	   }
	   
	   if (countSpaces == 2) {
		   firstInitial = name.charAt(0) + ".";
		   secondInitial = name.substring(name.indexOf(" ") + 1, name.indexOf(" ") + 2) + ".";
		   thirdInitial = name.substring(name.lastIndexOf(" ") + 1, name.lastIndexOf(" ") + 2) + ".";
		   
		   return firstInitial + " " + secondInitial + " " + thirdInitial;
	   }
	   else if (countSpaces == 1) {
		   firstInitial = name.charAt(0) + ".";
		   secondInitial = name.substring(name.indexOf(" ") + 1, name.indexOf(" ") + 2) + ".";
		   return firstInitial + " " + secondInitial;
	   }
	   else {
		   firstInitial = name.charAt(0) + ".";
		   return firstInitial;
	   }
   }
   
}