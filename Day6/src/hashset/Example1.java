package hashset;
import java.util.*;
public class Example1 
{
	public static void main(String args[])
	{
		HashSet<String> h=new HashSet<>();
		h.add("abhi");
		h.add("vikas");
		h.add("manoj");
		h.add("yash");
		System.out.println(h);
		h.remove("abhi");
		System.out.println(h.contains("abhi"));
		System.out.println(h.size());
		System.out.println(h.isEmpty());
		System.out.println(h);
		
		
		
		HashSet<String> h2=new HashSet<>();
		h2.add("djd");
		h2.add("abc");
		h2.addAll(h);
		
		System.out.println(h2);
		h2.removeAll(h);
		System.out.println(h2);
		h2.clear();
		System.out.println(h2);
	}

}
