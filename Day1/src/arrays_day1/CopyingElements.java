package arrays_day1;
import java.util.*;
public class CopyingElements 
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
	int b[]=new int[n];
	for(int i=0;i<n;i++)
	{
		b[i]=a[i];
	}
	System.out.print("elements in new array:");
	for(int i=0;i<n;i++)
	{
		System.out.print(b[i]);
	}
 }
}
