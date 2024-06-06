package switchstatement;
import java.util.*;
public class Age 
{
   public static void main(String args[])
   {
	   Scanner sc=new Scanner(System.in);
	   System.out.print("Age:");
	   int n=sc.nextInt();
	   int chk=n>=18?1:0;
	   switch(chk)
	   {
		   case 1:
			   System.out.print("eligible to vote");
			   break;
		   case 0:
			   System.out.print("not eligible to vote");
			   break;
	   }	   
   }
}
