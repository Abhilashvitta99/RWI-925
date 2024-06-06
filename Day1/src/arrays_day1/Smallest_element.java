package arrays_day1;
import java.util.*;
import java.math.*;
public class Smallest_element 
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
		int max=Integer.MAX_VALUE;
		for(int i=0;i<n;i++)
		{
			if(a[i]<max)
			{
				max=a[i];
			}
		}
		System.out.print("Smallest element:"+max);
	 }
}
