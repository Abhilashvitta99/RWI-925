package arrays_day1;
import java.util.*;
public class Elements_in_reverseorder 
{
	public static void main(String args[])
	 {
		 Scanner sc=new Scanner(System.in);
			System.out.println("Enter size of array");
			int n=sc.nextInt();
			int a[]=new int[n];
			System.out.println("Enter elements");
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			for(int i=n-1;i>=0;i--)
			{
				System.out.println(a[i]);
			}
	 }
}
