package arrays_day1;
import java.util.*;
public class Largest_element 
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
	int max=0;
	for(int i=0;i<n;i++)
	{
		if(a[i]>max)
		{
			max=a[i];
		}
	}
	System.out.print("Largest element:"+max);
 }
}