package arrays_day2;

public class Matrix_equality {
	public static void main(String args[])
	  {
			int a[][]={{1,2,3},{2,3,4},{3,4,5}};    
			int b[][]={{1,2,3},{2,3,4},{3,4,5}};   
			for(int i=0;i<3;i++)
			{    
			 for(int j=0;j<3;j++)
			 {    
			   if(a[i][j]!=b[i][j])
			   {
			   System.out.print("Not equal");
			   return;
			   }
			 } 
			}    
			System.out.println("Equal");
	  }
}
