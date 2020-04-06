package implementArrayList;


//Repeating all operations in ArrayEx1 this time using my own customed  
//ArrayList class which I name HazArrayList

public class ThisImplementsHazArrayList {
	public static void main(String[] args) {
		HazArrayList<Integer> myList = new HazArrayList<Integer>(); //Creates myList of type HazArrayList
//		Define an array of integers 
		int [] nums = {1, 0, 2, 45, 91, 12, 31, 9, 11, 6, 71, 20, 21, 24, 19};
		
//		Copy all elements of nums into myList
		for(int i = 0; i < nums.length; i++) {
			myList.add(nums[i]);
		}
		System.out.println("myList is: " + myList);
		System.out.println("list size = " + myList.size());
		
//		sum up evens and odds separately
		int sumOfEven = 0;
		int sumOfOdd = 0;
		for(int h = 0; h < myList.size(); h++) {
			if(myList.get(h) % 2 == 0) {
				sumOfEven += myList.get(h);
			}else
				sumOfOdd += myList.get(h);
		}
		
		System.out.println("Sum of even: " + sumOfEven);
		System.out.println("Sum of odd: " + sumOfOdd);
		
//		remove items < 25
		for(int j = 0; j < myList.size(); j++) {
			if(myList.get(j) < 25) {
				myList.remove(j);
				j--;
			}
		}
		
		System.out.println("My list after removal of item that are less than 25: " 
		+ myList);
		
		System.out.println(myList.indexOf(710));

	}

}
