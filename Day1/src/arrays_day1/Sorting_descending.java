package arrays_day1;

import java.util.Scanner;

public class Sorting_descending 
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
	    for(int i=a.length-1;i>=0;i--)
	    {
	    	int max=i;
	    	for(int j=i;j>=0;j--)
	    	{
	    		if(a[j]<a[max])
	    		{
	    			max=j;
	    		}
	    	}
	    	int temp=a[i];
	    	a[i]=a[max];
	    	a[max]=temp;
	    }
	    System.out.println("Elements after sorting:");
	    for(int i=0;i<n;i++)
	    {
	    	System.out.println(a[i]);
	    }
	 }

}
