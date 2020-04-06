package arrayListEx;

public class Node {
	
//	data fields
	int data;
	Node next;
	
//	constructor
	public Node(int data) {
		this.data = data;
	}
	
//	override the toString method
	@Override
	public String toString() {
		return "LinkedList item: " + this.data;
	}
	
	//Count the nodes of a linkedlist --> size of the LinkedList
	public static int countNodes(Node head) {
		
		int count = 1;		//init count, given head, head = 1
		Node current = head;	
		
		do {
			current = current.next;
			count += 1;
				
		} while(current.next != null);
		
		return count;
	}
	
	public static void main(String[] args) {
		Node lk = new Node(100);
		System.out.println(lk +  "\n");
		
//		int[] nums = {6, 3, 4, 2, 1};
//		
//		for(int j = 0; j < nums.length; j++) {
//			LinkedList myLinkedList = new LinkedList(nums[j]);
//			System.out.println(myLinkedList);
//		}
		Node Node1 = new Node(6);
		Node Node2 = new Node(3);
		Node Node3 = new Node(4);
		Node Node4 = new Node(2);
		Node Node5 = new Node(1);
		Node Node6 = new Node(9);
		
		Node1.next = Node2;
		Node2.next = Node3;
		Node3.next = Node4;
		Node4.next = Node5;
		Node5.next = Node6;		
		
		
		int myCount = countNodes(Node1);
		System.out.println("number of nodes in the LinkedList is:" + myCount);
		System.out.println("data in node 3 is: " + Node3.data);
	}

}
