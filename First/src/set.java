import java.util.*;

public class set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start=(int) System.currentTimeMillis();
		Set<String> s=new LinkedHashSet<>();
		s.add("D");
		s.add("a");
		s.add("r");
		s.add("s");
		s.add("h");
		s.add("a");
		s.add("n");
		int end=(int) System.currentTimeMillis();
		System.out.println(end-start);
		System.out.println(s);
		start=(int) System.currentTimeMillis();
		Set<String> r=new TreeSet<>();
		r.add("D");
		r.add("h");
		r.add("r");
		r.add("u");
		r.add("v");
		end=(int) System.currentTimeMillis();
		System.out.println(end-start);
		System.out.println(r);
		s.addAll(r);
		System.out.println(s);

		s.retainAll(r);
		System.out.println(s);
		
		System.out.println(r.containsAll(s));

	}

}
