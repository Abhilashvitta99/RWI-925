package arrays_day2;
import java.util.*;
public class Identity_matrix 
{
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("no of rows:");
	  int r=sc.nextInt();
	  System.out.println("no of columns:");
	  int c=sc.nextInt();
	  int a[][]=new int[r][c];
	  
	  System.out.println("Enter elements");
	  for(int i=0;i<r;i++)
	  {
		  for(int j=0;j<r;j++)
		  {
			  a[i][j]=sc.nextInt();
		  }
	  }
	  if(r!=c)
	  {
		  System.out.println("Not an identity matrix");
		  return;
	  }
	  for(int i=0;i<r;i++)
	  {
		  for(int j=0;j<r;j++)
		  {
			  if(i==j)
			  {
				  if(a[i][j]!=1)
				  {
					  System.out.println("Not an identity matrix");
					  return;
				  }
			  }
			  if(i!=j)
			  {
				  if(a[i][j]!=0)
				  {
					  System.out.println("Not an identity matrix");
					  return;
				  }
			  }
		  }
	  }
	  System.out.println("Identity matrix");
		  
  }
}
