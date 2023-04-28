package indassignments.Assign2;
/*
Write a public static method named avgAndSum that will take an int array as it's only argument. This method will return a double array. When called, and passed an array of int values, this method will return an array containing exactly two double values. The first value in the returned array will be the average of all the values in the argument array, and the second value in the returned array will be the sum of all the values in the argument array
 */

import java.util.Arrays;

public class AverageAndSum {
	public static void main(String[] args) {
		int[] values = {1, 2, 3, 4, 5, 6};
		System.out.println(avgAndSum(values));
	}
	
	/**
	 Computes the average and the sum of the values in an array of ints and returns them in an array of doubles.
	 @param values, the array of values
	 @return the double array containing average and sum
	 */
	public static double[] avgAndSum(int[] values) {
		double avg = 0;
		double sum = 0;
		int count = 0;
		
		for (int num : values) {
			sum += num;
			++count;
		}
		
		avg = sum / count;
		double[] calcs = new double[2];
		calcs[0] = avg;
		calcs[1] = sum;
		
		return calcs;
	}
}
