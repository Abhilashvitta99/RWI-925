package arrays_day1;
import java.util.*;
public class Sorting 
{
	public static void main(String args[])
	 {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.print("Enter elements");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
	    System.out.println("Elements before sorting");
	    for(int i=0;i<n;i++)
	    {
	    	System.out.println(a[i]);
	    }
	    for(int i=0;i<n;i++)
	    {
	    	int min=i;
	    	for(int j=i;j<n;j++)
	    	{
	    		if(a[j]<a[min])
	    		{
	    			min=j;
	    		}
	    	}
	    	int temp=a[i];
	    	a[i]=a[min];
	    	a[min]=temp;
	    }
	    System.out.println("Elements after sorting:");
	    for(int i=0;i<n;i++)
	    {
	    	System.out.println(a[i]);
	    }
	 }
}
