
public class Matrix {
	public static void main(String args[]) {
		int arr[][] = new int[5][];
		int ar[][] = {{1,2},{3,4}};
		int a[] = {10,20};
		arr[0] = new int[2];
		arr[1] = new int[3];
		arr[0][0] = 50;
		arr[1][0] = 100;
		System.out.println(arr[1][0]);
		System.out.println(ar[1][0]);
		System.out.println(arr[0].length);
	}
}
