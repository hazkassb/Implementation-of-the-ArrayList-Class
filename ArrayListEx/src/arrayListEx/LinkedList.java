package arrayListEx;

public class LinkedList {
	
//	data fields
	int data;
	LinkedList next;
	
//	constructor
	public LinkedList(int data) {
		this.data = data;
	}
	
//	override the toString method
	@Override
	public String toString() {
		return "LinkedList item: " + this.data;
	}
	
	//Count the nodes of a linkedlist --> size of the LinkedList
	public static int countNodes(LinkedList head) {
		
		int count = 1;
		LinkedList current = head;
		
		do {
			current = current.next;
			count += 1;
				
		} while(current.next != null);
		
		return count;
	}
	
	public static void main(String[] args) {
		LinkedList lk = new LinkedList(100);
		System.out.println(lk +  "\n");
		
//		int[] nums = {6, 3, 4, 2, 1};
//		
//		for(int j = 0; j < nums.length; j++) {
//			LinkedList myLinkedList = new LinkedList(nums[j]);
//			System.out.println(myLinkedList);
//		}
		LinkedList myLinkedList1 = new LinkedList(6);
		LinkedList myLinkedList2 = new LinkedList(3);
		LinkedList myLinkedList3 = new LinkedList(4);
		LinkedList myLinkedList4 = new LinkedList(2);
		LinkedList myLinkedList5 = new LinkedList(1);
		LinkedList myLinkedList6 = new LinkedList(9);
		
		myLinkedList1.next = myLinkedList2;
		myLinkedList2.next = myLinkedList3;
		myLinkedList3.next = myLinkedList4;
		myLinkedList4.next = myLinkedList5;
		myLinkedList5.next = myLinkedList6;		
		
		
		int myCount = countNodes(myLinkedList1);
		System.out.println(myCount);
		
	}

}
