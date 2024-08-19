import java.util.ArrayList;
import java.util.Collections;

public class ArrayLst {
	public static void main(String args[]) {
		System.out.println("Hi");
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(15);
		arr.add(20);
		arr.add(20);
		arr.add(1,18);
		arr.add(25);
		arr.set(0, 100);
		System.out.println(arr);
		Collections.reverse(arr);
		System.out.println(arr);
		System.out.println(arr.contains(20));
		System.out.println(arr.get(1));
		System.out.println(arr.indexOf(18));
		System.out.println(arr.indexOf(0));
		arr.remove(3);
		System.out.println(arr);
		System.out.println(arr.size());
		int a = 1, b=2, c=3;
		System.out.print(a+" ");
		System.out.print(b+" ");
		System.out.print(c);
		
		System.out.println("Lambda : ");
		arr.forEach((n) -> System.out.println(n));
		//arr.forEach(() -> System.out.println("No parameter"));
		
	}
}