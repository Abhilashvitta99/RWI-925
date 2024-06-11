package collections;
import java.util.*;
public class Arraylist2 
{
  public static void main(String args[])
  {
	  ArrayList<String> a=new ArrayList<>();
	  a.add("apple");
	  a.add("mango");
	  a.add("grapes");
	  a.add("banana");
	  Collections.sort(a);
	  System.out.println(a);
	  ArrayList<Integer> b=new ArrayList<>();
	  b.add(20);
	  b.add(67);
	  b.add(22);
	  b.add(1);
	  b.add(44);
	  Collections.sort(b);
	  for(Integer i:b)
	  {
	   System.out.println(i);
	  }
  }
}
