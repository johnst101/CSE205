package indassignments.Assign2;
/*
Write a java program that will collect the following 4 inputs from the user:

width of the box
height of the box
border character
interior character
Your program must collect the inputs in the order described above.

With these inputs, your program must print out a box made of the border and interior characters, and with the specified height and width.

It can help to break this process down into steps.
To print the box, you must print a number of lines of text (specifically height lines of text)
For each line of text that you print, you must print a number of characters (Specifically width characters)
Each character is either a border character or an interior character
You can use a loop to iterate through each line of the box
You can use a nested loop to iterate through each character in this line of the box
You can use a decision statement to decide to print either a border character or an interior character
For example,
if the current line is the first line, then the printed character will be the border character
if the current character is the first character on this line, then the printed character will be the border character
etc.
After each line, you can print a newline character to start the next line
 */

import java.util.Scanner;

public class MakeBox {
   public static void main(String[] args) {
      // Below this comment: declare and instantiate a Scanner
      Scanner scnr = new Scanner(System.in);
      
      // Below this comment: declare any other variables you may need
      int width;
      int height;
      String border;
      String interior;
      
      // Below this comment: collect the required inputs
      System.out.print("Enter width    : ");
      width = scnr.nextInt();
      System.out.print("Enter height   : ");
      height = scnr.nextInt();
      System.out.print("Enter border    : ");
      border = scnr.next();
      System.out.print("Enter interior : ");
      interior = scnr.next();
      
      // Below this comment: display the required results
      for (int i = 1; i <= height; ++i) {
    	  for (int j = 1; j <= width; ++j) {
    		  if (i == 1 || i == height) {
    			  System.out.print(border);
    		  }
    		  else {
    			  if (j == 1 || j == width) {
    				  System.out.print(border);
    			  }
    			  else {
    				  System.out.print(interior);
    			  }
    		  }
    	  }
    	  System.out.print("\n");
      }
   }
}
