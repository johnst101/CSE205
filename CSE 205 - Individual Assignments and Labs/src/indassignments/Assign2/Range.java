package indassignments.Assign2;
/*
Write a public static method named range that will take an int array as it's only argument. This method will return an int value. When called, and passed an array of int values, this method will compute and return the positive difference between the minimum of all the values in the argument array, and the maximum of all the values in the argument array.
 */

import java.util.Arrays;

public class Range {
	public static void main(String[] args) {
		
	}
	
	/**
	 Finds and returns the range of the values in an int array
	 @param values, array of ints to find the range from
	 @return range, an int value of the positive difference of the max and the min in the array
	 */
	public static int range(int[] values) {
		int min = values[0];
		int max = values[values.length - 1];
		int range = 0;
		
		for (int i = 0; i < values.length; ++i) {
			if (values[i] > max) {
				max = values[i];
			}
			if (values[i] < min) {
				min = values[i];
			}
		}
		
		range = Math.abs(max - min);
		
		return range;
	}
}
