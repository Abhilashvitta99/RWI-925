package collections;

import java.util.Comparator;

public class Ratingcomparator implements Comparator<Smartphone> 
{

	@Override
	public int compare(Smartphone r1, Smartphone r2) {
		
		return r1.rating>r2.rating?1:r1.rating<r2.rating?-1:0;
	}
	

}
