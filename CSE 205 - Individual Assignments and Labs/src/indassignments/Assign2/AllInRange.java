package indassignments.Assign2;
/*
Write a public static method named inRange that will take an ArrayList<Integer>, and two additional int values as arguments. This method will return an ArrayList<Integer>. When called, and passed an ArrayList and a min value and a max value, this method will return an ArrayList containing all the elements in the argument ArrayList that are between the second argument value and the third argument value (inclusive). You can safely assume that the second argument value will always be less than or equal to the third argument value. The values in the returned ArrayList must be in the same order as they are in the argument ArrayList.
 */

import java.util.ArrayList;

public class AllInRange {
	public static void main(String[] args) {
		
	}
	
	/**
	 Finds all values that are between a given min and max value in an ArrayList of Integers and adds them to an ArrayList
	 @param values, an ArrayList of Integers to look for matches in
	 @param min, the minimum threshold for matches
	 @param max, the maximum threshold for matches
	 @return result, an ArrayList of Integers that match the conditions set above
	 */
	public static ArrayList<Integer> inRange(ArrayList<Integer> values, int min, int max) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		for (Integer num : values) {
			if ((num >= min) && (num <= max)) {
				result.add(num);
			}
		}
		
		return result;
	}
}
