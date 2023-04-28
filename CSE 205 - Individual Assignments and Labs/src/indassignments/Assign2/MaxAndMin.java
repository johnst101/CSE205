package indassignments.Assign2;
/*
Write a public static method named maxAndMin that will take an int array as it's only argument. This method will return an int array. When called, and passed an array of int values, this method will return an array containing exactly two int values. The first value in the returned array will be the maximum of all the values in the argument array, and the second value in the returned array will be the minimum of all the values in the argument array.
 */

import java.util.Arrays;

public class MaxAndMin {
	public static void main(String[] args) {
		
	}
	
	/**
	 Finds and returns the max and min values from an int array
	 @param values, array of ints to find the min and max in
	 @return an array of two ints (the max and min values)
	 */
	public static int[] maxAndMin(int[] values) {
		int[] maxMin = new int[2];
		int min = values[0];
		int max = values[values.length - 1];
		
		for (int i = 0; i < values.length; ++i) {
			if (values[i] > max) {
				max = values[i];
			}
			if (values[i] < min) {
				min = values[i];
			}
		}
		
		maxMin[0] = max;
		maxMin[1] = min;
		
		return maxMin;
	}
}
