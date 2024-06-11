package collections;
import java.util.*;
public class ArrayList_descendingorder 
{
	public static void main(String args[])
	{
		ArrayList<Integer> a=new ArrayList<>();
		a.add(2);
		a.add(6);
		a.add(1);
		a.add(57);
		a.add(44);
		a.add(50);
		Collections.sort(a,Collections.reverseOrder());
		System.out.print(a);
		/*Collections.reverse(a);
		System.out.print(a);
	*/
	}

}
