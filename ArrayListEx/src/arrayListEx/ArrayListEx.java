package arrayListEx;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Double> myList = new ArrayList();
		
		myList.add(10.0);	//to add elements in the array
		myList.add(20D);	//to add elements in the array
		myList.add(1, 15D);	//to add elements in the array
		
		System.out.println(myList);
		
		System.out.println("\n\n");

		myList.set(0, 45D);	//Sets element at index 0 to 45.0
		System.out.println(myList);	
		
		myList.set(2, 2.1);	// set element at index 2 to 2.1
		System.out.println("\n\n");

		int sum = 0;
		for(int i = 0; i < myList.size(); i++) {
			sum += myList.get(i);
		}
		System.out.println(sum);
		
		Double haz = myList.get(2); //returns the element at index 2
		System.out.println(myList.indexOf(2.1));		//returns the index the index of 2.1 in the array
		System.out.println(haz);
		
		myList.clear();
		System.out.println(myList);

	}

}
