//public class EMP implements Comparable<EMP>{
public class EMP {
	
	private String name;
	private String  phone;
	private int empId;
	
//	@Override
//	public int compareTo(EMP o) {
//		//return 0;
//		return this.empId - o.empId;
//	}
	
	public EMP(String name, String phone, int empId) {
		this.name = name;
		this.phone = phone;
		this.empId = empId;
	}
	
	public String getName() {
		return this.name;
	}
	public String getPhone() {
		return this.phone;
	}
	public int getEmpId() {
		return this.empId;
	}

	// alt+shift+s
	@Override
	public String toString() {
		return "EMP [name=" + name + ", phone=" + phone + ", empId=" + empId + "]";
	}
	
}
