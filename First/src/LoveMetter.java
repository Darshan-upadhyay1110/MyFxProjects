import java.util.*;

public class LoveMetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Gender");
		String g=sc.next();
		if(g=="M"||g=="m"||g=="F"||g=="f")
		{
			System.out.println("give correct info");
			
		}
		else {
		System.out.println("enter your name");
		String you=sc.next();
		System.out.println("enter your partners name");
		String part=sc.next();
		Set<Character> y=new LinkedHashSet<>();
		for(int i=0;i<you.length();i++)
		{
			y.add(you.charAt(i));
		}
		Set<Character> p=new LinkedHashSet<>();
		for(int i=0;i<part.length();i++)
		{
			p.add(part.charAt(i));
		}
		y.retainAll(p);
		if(y.size()==you.length())
		{
			System.out.println("95%");
		}
		else if(y.size()>=you.length()/2 && y.size()<you.length())
		{
			System.out.println("70%");
		}
		else {
			System.out.println("%45");
		}
	}

	}

}
