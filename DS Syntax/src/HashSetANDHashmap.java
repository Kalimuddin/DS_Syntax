import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.*
;public class HashSetANDHashmap {
	public static void main(String args[]) {
		Set<String> hs = new HashSet<String>();
		//HashSet<String> hs = new HashSet<String>();
		hs.add("Kd1");
		hs.add("kd2");
		hs.add("kd3");
		System.out.println(Math.abs(-2));
		System.out.println(hs);
		System.out.println(hs.size());
		hs.remove("kd2");
		for(String e : hs) {
			System.out.println(e);
		}
		System.out.println(hs.isEmpty());
		System.out.println(hs.contains("kd2"));
		System.out.println("-------------------------------------------");
		HashMap<String,Integer> m = new HashMap<String,Integer>();
		m.put("kd1", 1);
		m.put("kd2", 2);
		m.put("kd3", 3);
		System.out.println(m);
		System.out.println(m.size());
		System.out.println(m.containsKey("kd2"));
		System.out.println(m.containsValue(2));
		System.out.println(m.get("kd100"));
		for(Map.Entry<String,Integer> e: m.entrySet()) {
			System.out.println(e.getKey()+" : "+e.getValue());
		}
		
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		map.put(1, 10);
		map.put(2, 200);
		System.out.println(map.get(1));
	}
}
