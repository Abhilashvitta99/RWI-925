package patternprinting;

public class Class 
{
  public static void main(String args[])
  {
	for(int i=0;i<5;i++)
	{
		for(int j=4;j>=0;j--)
		{
		  if(j==i && i!=2 )
		  {
			  System.out.print("A");
		  }else if(i!=2 && j!=i)
		  {
			  System.out.print(" ");
		  }
		  
		}
		for(int k=1;k<5;k++)
		{
			if(i==k && i!=2)
			{
				System.out.print("A");
			}else if(i!=2 && i!=k)
			{
				System.out.print(" ");
			}
		}
		for(int a=0;a<9;a++)
		{
			if(i==2)
			{
				if(a>=2 && a<7)
				{
			      System.out.print("A");
				}
				else {
					System.out.print(" ");
				}
			}
		}
		System.out.println();
	 }
	
  }
}
