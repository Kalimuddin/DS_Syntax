class NodeD{
	int data;
	NodeD next;
	NodeD prev;
	NodeD(int x){
		data = x;
		next = null;
		prev = null;
	}
}
public class DoublyLinkedList {

	public static void main(String[] args) {
		// Creating DoublyLinkedlist with data 100,200,300,400 :
		NodeD head = new NodeD(100);
		NodeD temp1 = new NodeD(200);
		NodeD temp2 = new NodeD(300);
		NodeD temp3 = new NodeD(400);
		
		head.next = temp1;
		temp1.prev = head;
		
		temp1.next = temp2;
		temp2.prev = temp1;
		
		temp2.next = temp3;
		temp3.prev = temp2;
		
		NodeD curr = head;
		while(curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}

	}

}
