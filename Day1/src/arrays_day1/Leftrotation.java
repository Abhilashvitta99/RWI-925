package arrays_day1;
import java.util.*;
public class Leftrotation 
{
	public static void main(String args[])
	{
      Scanner sc=new Scanner(System.in);
      int a[]= {1,2,3,4,5};
      System.out.println("Elements before rotation");
      for(int i=0;i<a.length;i++)
      {
    	  System.out.println(a[i]);
      }
      int temp=a[0];
       for(int i=0;i<a.length-1;i++)
      {
	   a[i]=a[i+1];
      }
      a[a.length-1]=temp;
      System.out.println("Elements after rotation:");
      for(int i=0;i<a.length;i++)
      {
    	  System.out.println(a[i]);
      }
	}
}
