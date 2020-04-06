package arrayListEx;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> myList = new LinkedList<Integer>();
		myList.add(12);
		myList.add(23);
		myList.addFirst(10);
//		myList.removeLast();
		System.out.println(myList);
		System.out.println(myList.size());
		
		Object[] nums;		//create an array object
		nums = myList.toArray();		//convert myList to an array on numbers
		
		for(int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);

		}
		
		System.out.println(myList.indexOf(23));
		
		
//		Array Bubble Sort
		int[] arr = {2,5,1,9,3,0,4};
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < arr.length - i - 1; j++) {
				if(arr[j] > arr[j + 1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
			
		}
		
		
		System.out.println(Arrays.toString(arr));
		
		
//		Array Insertion Sorting
		int[] array = {2, 4, 1, 0, 9, 6, 8, 4, 0, 7};
		for(int k = 0; k < array.length; k++) {
			int current = array[k];
			int t = k - 1;
			
			while(t >= 0 && array[t] > current) {
				array[t+1] = array[t];
				t--;	
				array[t+1] = current;
			}
		}
		
		System.out.println(Arrays.toString(array));
		
	}

}
