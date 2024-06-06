package searching;
import java.util.*;
public class Binarysearch 
{
 public static void main(String args[])
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.print("size:");
	 int n=sc.nextInt();
	 System.out.print("enter elements:");
	 int a[]=new int[n];
	 for(int i=0;i<n;i++)
	 {
		 a[i]=sc.nextInt();
	 }
	 int flag=0;
	 Arrays.sort(a);
	 System.out.print("Enter element to be searched");
	 int x=sc.nextInt();
	 int l=0,r=n-1;
	 while(l<=r)
	 {
		 int m=l+(r-l)/2;
		 if(a[m]==x)
		 {
			 System.out.print("position of the target element:"+(m+1));
			 flag=1;
			 break;
		 }else if(x>a[m])
		 {
			 l=m+1;
		 }else
		 {
			 r=m-1;
		 }
	 }
	 if(flag==0)
	 {
		 System.out.print("Element not found"+"-1");
	 }
 }
}
