import java.util.Comparator;

public class IdComparator implements Comparator<EMP>{

	@Override
	public int compare(EMP o1, EMP o2) {
		return o1.getEmpId() - o2.getEmpId();
	}
	
}
