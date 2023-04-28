package indassignments.Assign2;
/*
Write a public static method named lessThanAverage that will take an ArrayList<Integer> as an argument. This method will return an ArrayList<Integer>. When called and passed anArrayList, this method will return an ArrayList containing all the elements in the argument ArrayList that are less than the average of all the values in the argument ArrayList. The values in the returned ArrayList must be in the same order as they are in the argument ArrayList.
 */

import java.util.ArrayList;

public class AllLessThanAverage {
	public static void main(String[] args) {
		
	}
	
	public static ArrayList<Integer> lessThanAverage(ArrayList<Integer> values) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		double avg = 0;
		double sum = 0;
		int valuesCount = 0;
		
		for (Integer num : values) {
			sum += num;
			++valuesCount;
		}
		
		avg = sum / valuesCount;
		
		for (Integer num : values) {
			if (num < avg) {
				result.add(num);
			}
		}
		
		return result;
	}
}
