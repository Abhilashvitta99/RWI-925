package hashset;
import java.util.*;
public class Example2 
{
	public static void main(String args[])
	{
		HashSet<Book> h=new HashSet<>();
		h.add(new Book(100,20,"godfather","mario puzo"));
		h.add(new Book(101,25,"CHM","david"));
		for(Book b:h)
		{
			System.out.println(b.id+" "+b.quantity+" "+b.name+" "+b.author);
		}
	}

}
