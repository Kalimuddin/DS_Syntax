import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class StackQueueDeque {

	public static void main(String[] args) {
		System.out.println("Stack implementation : ---------------------------");
		Stack<Integer> sk1 = new Stack<Integer>();
		ArrayDeque<Integer> sk2 = new ArrayDeque<Integer>();
	
		sk1.push(1);
		sk1.push(2);
		sk1.push(3);
		
		sk2.push(10);
		sk2.push(20);
		sk2.push(30);
		
		System.out.println(sk1);
		System.out.println(sk1.peek());
		System.out.println(sk1.size());
		System.out.println(sk1.isEmpty());
		System.out.println(sk1.pop());
		System.out.println(sk1);
		
		System.out.println(sk2.peek());
		
		System.out.println("Queue implementation : ---------------------------");
		ArrayDeque<Integer> q1 = new ArrayDeque<Integer>();
		q1.offer(10);
		q1.offer(20);
		q1.offer(30);
		
		System.out.println(q1);
		System.out.println(q1.peek());
		System.out.println(q1.size());
		System.out.println(q1.isEmpty());
		System.out.println(q1.poll());
		System.out.println(q1);	
		
		System.out.println("DeQue implementation : ---------------------------");
		ArrayDeque<Integer> dq = new ArrayDeque<Integer>();
		dq.offerFirst(10);
		dq.offerFirst(20);
		dq.offerLast(30);
		
		System.out.println(dq);
		System.out.println(dq.peekFirst());
		System.out.println(dq.peekLast());
		System.out.println(dq.size());
		System.out.println(dq.isEmpty());
		System.out.println(dq.pollFirst());
		System.out.println(dq.pollLast());
		System.out.println(dq);
		
	}

}
