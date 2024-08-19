import java.util.Arrays;

public class ArraysA {

	public static void main(String[] args) {
		// normal array :
		int arr[] = new int[5];
		System.out.println(arr[2]);
		arr[2] = 5;
		arr[2]++;
		Arrays.fill(arr,10);
		System.out.println(arr[0]);
		System.out.println(5!=2);
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		System.out.println("------------------------");
		int a1[] = new int[5];
		Arrays.fill(a1,50);
		System.out.println(Arrays.asList(a1));
		System.out.println(Arrays.toString(a1));
		
		String a2[] = new String[5];
		Arrays.fill(a2,"KD");
		System.out.println(Arrays.asList(a2));
	}

}
