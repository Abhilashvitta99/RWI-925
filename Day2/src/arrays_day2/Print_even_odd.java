package arrays_day2;
import java.util.Scanner;
public class Print_even_odd {
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
	    System.out.println("Odd Elements:");
	    for(int i=0;i<n;i++)
	    {
	    	if(a[i]%2!=0)
	    	System.out.println(a[i]);
	    }
	    System.out.println("Even elements");
	    for(int i=0;i<n;i++)
	    {
	    	if(a[i]%2==0)
	    	{
	    		System.out.println(a[i]);
	    	}
	    } 
	 }
}
