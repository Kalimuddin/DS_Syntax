import java.util.Arrays;

public class Strng {
	public static void main(String args[]) {
		String kdkd = null;
		//System.out.println(kdkd.length());
		String kd = "Kalimuddin";
		//System.out.println(kd[1]);
		System.out.println(kd.charAt(2));
		
		StringBuffer kbuf = new StringBuffer();
		StringBuilder kbuild = new StringBuilder();
		kbuild.append("builderadding");
		kbuf.append("bufferadding");
		kbuf.append(456);
		kbuf.append(true);
		System.out.println(kbuf);
		System.out.println(kbuild);
		
	
		System.out.println('b'-'d');
		char c = 'a';
		char d = '9';
		char z = '5';
		String st = "0024";
		//st = st + '4';
		System.out.println(Integer.parseInt(st));
		System.out.println(Character.getNumericValue(d)+Character.getNumericValue(z));
		System.out.println(Character.isDigit(d));
		System.out.println(c);
		System.out.println((int)c + "------------");
		System.out.println((char)(97));
		
		String k = "kalimuddinali";
		String k2 = "abcdefgh";
		char chA[] = k2.toCharArray();
		for (char e : chA) {
			System.out.println(e);
		}
		System.out.println(k.length());
		k = k + k.charAt(0);
		System.out.println(k);
		k = k + k.substring(0,2);
		System.out.println(k);
		System.out.println(k.contains("kali"));
		System.out.println(k.indexOf("ali"));
		for(int i=0; i<k.length();i++) {
			System.out.print(k.charAt(i) + k.substring(1,3) + "...");
		}
		
		System.out.println();
		String gfg = "welcome to gfg";
		System.out.println(gfg);
		String gfga[] = gfg.split(" ");
		String gfgstr = String.join(" ", gfga);
		System.out.println("IMP : " + gfgstr);
		String gfgs = Arrays.toString(gfga);
		System.out.println(gfgs);
		for (String s: gfga) {
			System.out.print(s + " ");
		}
		
		String kdgfg = "welecome to kd  gfg ";
		String kdgfga[] = kdgfg.split("");
		System.out.println();
		System.out.println(Arrays.asList(kdgfga));
		String ls = null;
		String ls2 = "abcdef";
		if(ls=="abcdef") {
			System.out.println(ls);
		}
		else {
			System.out.println(ls2);
		}
	}
}