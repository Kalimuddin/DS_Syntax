import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class Sorting {

	public static void main(String[] args) {
		int a[] = {10,30,20,60,50,40};
		Arrays.sort(a);
		Arrays.sort(a,1,3);
		System.out.println(Arrays.toString(a));
		
		// does work for Collections.reverseOrder()
		Integer arr[] = {1,3,2,6,5,4};
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));
		
		for(int e: arr) {
			System.out.print(e);
		}
		
		System.out.println();
		System.out.println("---------------------------------------------------");
		
		ArrayList<Integer> aList = new ArrayList<Integer>();
		aList.add(20);
		aList.add(10);
		aList.add(30);
		Collections.sort(aList);
		System.out.println(aList);
		Collections.sort(aList, Collections.reverseOrder());
		System.out.println(aList);
	}


}
