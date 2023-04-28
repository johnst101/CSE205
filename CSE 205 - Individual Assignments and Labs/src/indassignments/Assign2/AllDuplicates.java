package indassignments.Assign2;
/*
Write a public static method named allDuplicates that will take an ArrayList<Integer> as an argument. This method will return an ArrayList<Integer>. When called and passed anArrayList, this method will return an ArrayList containing all the elements in the argument ArrayList that are in the argument ArrayList more than one time. Each duplicate value must appear in the returned array only once. The values in the returned ArrayList must be in the same order as they first appear in the the argument ArrayList.
 */

import java.util.ArrayList;

public class AllDuplicates {
	public static void main(String[] args) {
		
	}
	
	public static ArrayList<Integer> allDuplicates(ArrayList<Integer> values) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		int curNum = 0;
		boolean alreadyFound = false;
		
		for (int i = 0; i < values.size(); ++i) {
			curNum = values.get(i);
			for (Integer num : result) {
				if (curNum == num) {
					alreadyFound = true;
				}
			}
			if (alreadyFound) {
				continue;
			}
			for (int j = i + 1; j < values.size(); ++j) {
				if (curNum == values.get(j)) {
					result.add(curNum);
				}
			}
		}
		
		return result;
	}
}
