package indassignments.Assign2;
/*
Write a public static method named oddAndEven that will take an int array as it's only argument. This method will return an int array. When called, and passed an array of int values, this method will return an array containing exactly two int values. The first value in the returned array will be the count of all the odd values in the argument array, and the second value in the returned array will be the count of all the even values in the argument array.
 */

import java.util.Arrays;

public class OddAndEven {
	public static void main(String[] args) {
		
	}
	
	/**
	 Counts the number of odd values and the number of even values in an array of ints
	 @param values, array of ints that are being counted
	 @return result, array of 2 ints (count of odd values and count of even values)
	 */
	public static int[] oddAndEven(int[] values) {
		int[] result = new int[2];
		int odd = 0;
		int even = 0;
		
		for (int num : values) {
			if (Math.abs((num % 2)) == 0) {
				++even;
			}
			else if (Math.abs((num % 2)) == 1) {
				++odd;
			}
			else {}
		}
		
		result[0] = odd;
		result[1] = even;
		
		return result;
	}
}
