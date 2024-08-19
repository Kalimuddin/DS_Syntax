import java.util.ArrayList;
import java.util.Collections;

public class SortingComparableComparator {

	public static void main(String[] args) {
		ArrayList<EMP> emps = new ArrayList<>();
		emps.add(new EMP("Sachin","72388",30));
		emps.add(new EMP("Kalim","63988",20));
		emps.add(new EMP("AD","53466",40));
		
		System.out.println(emps);
		// Comparable :
//		Collections.sort(emps);
//		System.out.println(emps);
		
		// Comperator : (for comparator don't change the EMP source code, have to create extra class for each logic)
		Collections.sort(emps, new IdComparator());
		System.out.println(emps);
		
		System.out.println("*******************************************************************************************");
		ArrayList<EMP> emps1 = new ArrayList<>(emps);
		System.out.println(emps1);
		Collections.sort(emps1, new NameComparator());
		System.out.println(emps1);
	}

}
