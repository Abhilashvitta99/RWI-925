package arrays_day1;
import java.util.Scanner;

import java.util.*;
public class Sum_of_elements 
{
	public static void main(String args[])
	 {
		 Scanner sc=new Scanner(System.in);
			System.out.println("Enter size of array");
			int n=sc.nextInt();
			int a[]=new int[n];
			System.out.println("Enter elements");
			int s=0;
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
				s+=a[i];
			}
			
			System.out.print("Sum of elements:"+s);
	 }
}
