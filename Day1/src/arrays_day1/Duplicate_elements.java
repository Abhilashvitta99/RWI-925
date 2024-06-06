package arrays_day1;
import java.util.*;
public class Duplicate_elements 
{
  public static void main(String args[])
  {
	  int a[]= {1,3,4,5,4,6,1,3,7,7,};
	  System.out.println("Elements of the array");
	  for(int i=0;i<a.length;i++)
	  {
		  System.out.println(a[i]);
	  }
	  System.out.println("Duplicate elements:");
	  for(int i=0;i<a.length-1;i++)
	  {
		  for(int j=i+1;j<a.length;j++)
		  {
			  if(a[i]==a[j])
			  {
				  System.out.print(a[i]+" ");
			  }
		  }
	  }
  }
}
