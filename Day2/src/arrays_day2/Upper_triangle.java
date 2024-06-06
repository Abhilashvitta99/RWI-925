package arrays_day2;

import java.util.Scanner;

public class Upper_triangle {
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
			  for(int j=0;j<c;j++)
			  {
				  a[i][j]=sc.nextInt();
			  }
		  }
		  for(int i=0;i<r;i++)
		  {
			  for(int j=0;j<c;j++)
			  {
				  if(j<c-i)
				  {
				    System.out.print(a[i][j]);
				  }else
				  {
					  System.out.print("0");
				  }
			  }
			  System.out.println();
		  }
	  }
}
