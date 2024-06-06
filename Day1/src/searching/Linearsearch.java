package searching;
import java.util.*;
public class Linearsearch 
{
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.print("Size:");
	  int n=sc.nextInt();
	  int a[]=new int[n];
	  int flag=0;
	  System.out.print("Enter elements:");
	  for(int i=0;i<n;i++)
	  {
		  a[i]=sc.nextInt();
	  }
	  System.out.print("Enter target element");
	  int x=sc.nextInt();
	  for(int i=0;i<n;i++)
	  {
		  if(a[i]==x)
		  {
			  System.out.print(i+1);
			  flag=1;
			   break;
		  }
	  }
	  if(flag==0)
	  {
		  System.out.print(-1);
	  }
  }
}
