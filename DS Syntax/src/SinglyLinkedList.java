class Node{
	int data;
	Node next;
	Node(int x){
		data = x;
		next = null;
	}
}

public class SinglyLinkedList {
	
	static Node insertBegin(Node head, int x) {
		Node temp = new Node(x);
		temp.next = head;
		head = temp;
		return head;
	}
	
	public static void main(String[] args) {
		// Creating SinglyLinkedlist with data 10,20,30,40 :
		Node head = new Node(10);
		Node temp1 = new Node(20);
		Node temp2 = new Node(30);
		Node temp3 = new Node(40);
		head = insertBegin(head, 1);
		
		head.next = temp1;
		temp1.next = temp2;
		temp2.next = temp3;
		
		Node curr = head;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
	}

}

