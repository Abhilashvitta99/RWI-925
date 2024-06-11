package collections;
import java.util.*;
public class Linkedlist2 
{
public static void main(String args[])
{
	List<Book> b=new LinkedList<>();
	    Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);  
	    Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
	    Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
	    b.add(b3);
	    b.add(b2);
	    b.add(b1);
	    for(Book i:b)
	    {
	    	System.out.println(i.id);
	    }
}
}
