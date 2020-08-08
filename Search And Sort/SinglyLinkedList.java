package Critical;

public class SinglyLinkedList {
	
	// first we need to create an instance variable of type ListNode
	
	private ListNode head;
	
	// we need to create a class called ListNode
	
	private static class ListNode {
		// data property
		// point to the next node in the list
		
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	public void display() {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + "--> ");
			current = current.next;
		}
		System.out.print("null");
	}
	
	public static void main(String[] args) {
		
		SinglyLinkedList object = new SinglyLinkedList();
		
		object.head = new ListNode(10);
		System.out.println("Values inside head :: " + object.head.data + " and pointing to " + object.head.next);
		
		// instantiating the inner class to add other nodes
		
		ListNode second = new ListNode(1);
		ListNode third = new ListNode(8);
		ListNode fourth = new ListNode(11);
		
		// Now we have 4 nodes and we need to connect them to form a chain
		
		//System.out.println("something :: " + second);
		
		object.head.next = second;
		second.next = third;
		third.next = fourth;
		
		
		object.display();
		
		
	}

}
