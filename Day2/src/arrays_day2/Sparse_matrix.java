package arrays_day2;

import java.util.Scanner;

public class Sparse_matrix {
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
		  int z=0;
		  for(int i=0;i<r;i++)
		  {
			  for(int j=0;j<c;j++)
			  {
				  if(a[i][j]==0)
				  {
					  z++;
				  }
			  }
		  }
		  if(z>(a.length/2))
		  {
			  System.out.println("Sparse matrix");
		  }else
		  {
			  System.out.println("Not a sparse matrix");
		  }
	  }
}
