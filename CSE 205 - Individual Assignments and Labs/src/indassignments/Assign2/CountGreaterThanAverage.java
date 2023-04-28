package indassignments.Assign2;
/*
Write a public static method named countGreaterThanAverage that will take an int array as it's only argument. This method will return an int value. When called, and passed an array of int values, this method will compute and return the number of values in the argument array that are greater than the average of all the values in the argument array.
 */

import java.util.Arrays;

public class CountGreaterThanAverage {
	public static void main(String[] args) {
		
	}
	
	/**
	 Computes the average and finds the number of values in an array of ints that are greater than the average
	 @param values, the array of values
	 @return result, count of the values in the array that are greater than the average
	 */
	public static int countGreaterThanAverage(int[] values) {
		double avg = 0;
		double sum = 0;
		int valuesCount = 0;
		int greaterThanCount = 0;
		
		for (int num : values) {
			sum += num;
			++valuesCount;
		}
		
		avg = sum / valuesCount;
		
		for (int num : values) {
			if (num > avg) {
				++greaterThanCount;
			}
		}
		
		return greaterThanCount;
	}
}
