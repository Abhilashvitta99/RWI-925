package collections;
import java.util.*;
public class Linkedlist 
{
	public static void main(String args[])
	{
		LinkedList<Integer> l=new LinkedList<>();
		l.add(7);
		l.add(67);
		l.add(99);
		l.add(3);
		Iterator<Integer> it=l.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next());
		}
	}
}
