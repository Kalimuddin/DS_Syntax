import java.util.Comparator;

public class NameComparator implements Comparator<EMP> {

	@Override
	public int compare(EMP o1, EMP o2) {
		return o1.getName().compareTo(o2.getName());
	}
	
}
