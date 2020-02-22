package arrayListEx;

import java.util.ArrayList;

public class ArrayEx1 {
	public static void main(String[] args) {
//		Create ArrayList of integers
		ArrayList<Integer> myList = new ArrayList<Integer>(10);
		
//	Create array of integers
		int[] nums = {1, 12, 13, 24, 35, 66, 7, 18, 29, 10, 49};
	
//	populate the ArrayList by copying all nums items into myList
		for (int i = 0; i < nums.length; i++) {
			myList.add(nums[i]);
		}
		System.out.println(myList);
		
//	data fields
		int sumOfEven = 0;
		int sumOfOdd = 0;
				
//	Sum up all even and all odd integers separately
		for(int i = 0; i<myList.size(); i++) {
			if (myList.get(i)%2 != 0) {
				sumOfEven += myList.get(i);
			}
			if(myList.get(i) % 2 == 0 ) {
				sumOfOdd += myList.get(i);
			}
				
		}
//	print sums to console
		System.out.println("sum odd: " +sumOfEven);
		System.out.println("sum even: " +sumOfOdd);
		
		//Method 1: using backward array search
//		System.out.println(myArray);
//		System.out.println(myArray.size());
		
//		for (int i = myArray.size() - 1; i >= 0; i--) {
//			if (myArray.get(i) < 25) {
//				myArray.remove(i);
//			}
//		}
		
		
//	Remove all integers less than 25
	//Method 2: using forward array search
		for (int i = 0; i < myList.size(); i++) {
			if (myList.get(i) < 25) {
				myList.remove(i);
				i--;
			}
		}

		System.out.println("My edited list is: " + myList);

		
	}
}
