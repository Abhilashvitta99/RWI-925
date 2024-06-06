package arrays_day1;
import java.util.*;
public class Fequency_of_elements {
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.print("enter size:");
	  int n=sc.nextInt();
	  int a[]=new int[n];
	  System.out.print("Enter elements");
	  for(int i=0;i<n;i++)
	  {
		  a[i]=sc.nextInt();
	  }
	  System.out.print("Enter the element:");
	  int x=sc.nextInt();
	  int s=0;
	  for(int i=0;i<n;i++)
	  {
		  if(a[i]==x)
		  {
			  s++;
		  }
	  }
	  System.out.print("Frequency:"+s);
  }
}
