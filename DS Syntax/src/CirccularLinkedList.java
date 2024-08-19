class NodeC{
	int data;
	NodeC next;
	NodeC(int x){
		data = x;
		next = null;
	}
}
public class CirccularLinkedList {
	
	static Node insertBegin(Node head, int x) {
		Node temp = new Node(x);
		if(head==null) {
			temp.next = temp;
		}
		else {
			Node curr = head;
			while (curr.next != head) {
				curr = curr.next;
			}
			curr.next = temp;
			temp.next = head;
		}
		head = temp;
		return head;
	}
	
	public static void main(String[] args) {
		
		// Creating CircularLinkedlist with data 1000,2000,3000,4000 :
		Node head = new Node(1000);
		head.next = new Node(2000);
		head.next.next = new Node(3000);
		head.next.next.next = new Node(4000);
		head.next.next.next.next = head;
		head = insertBegin(head, 1);
		
		// Using for loop :
		System.out.print(head.data + " ");
		for(Node curr = head.next; curr != head; curr = curr.next) {
			System.out.print(curr.data + " ");
		}
		
		// Using while loop :
		System.out.println();
		Node curr = head;
		while(curr.next != head) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
		System.out.print(curr.data);
		
		// Using do while loop :
		System.out.println();
		Node cur = head;
		do {
			System.out.print(cur.data + " ");
			cur = cur.next;
		}while(cur != head);
	}

}
