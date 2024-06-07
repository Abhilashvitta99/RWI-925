package abstraction;
abstract class Bike1 
{
	Bike1()
	{
		System.out.println("Bike is created");
	}
	void gear()
	{
		System.out.println("with 5 gears");
	}
	abstract void company();
}

class Royal_enfield extends Bike1
{
	 void company()
	{
		System.out.println("Royal enfield");
	}
}

class Yamaha extends Bike1
{
	void company()
	{
		System.out.println("Yamaha");
	}
}
	
public class Example3
{
	public static void main(String args[])
	{
		Bike1 r=new Royal_enfield();
		Bike1 y=new Yamaha();
		r.company();
		y.company();
		r.gear();
	}
}
