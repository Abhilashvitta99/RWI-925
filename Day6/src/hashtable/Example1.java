package hashtable;
import java.util.*;
public class Example1 
{
 public static void main(String args[])
 {
	 Hashtable<Integer,String> h=new Hashtable<>();
	 h.put(1,"a");
	 h.put(2, "b");
	 h.put(3, "c");
	 h.put(4, "d");
	 for(Map.Entry<Integer,String> m:h.entrySet())
	 {
		 System.out.println(m.getKey()+" "+m.getValue());
	 }
 }
}
