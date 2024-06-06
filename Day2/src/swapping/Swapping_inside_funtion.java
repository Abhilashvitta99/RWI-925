package swapping;

public class Swapping_inside_funtion {
   public static void swap(int x,int y)
	  {
		  int temp=x;
		  x=y;
		  y=temp;
		  System.out.print("a:"+x+"  b:"+y);
	  }
  public static void main(String args[])
  {
	  int a=55;
	  int b=100;
	  swap(a,b);
	 
  }
 
}
