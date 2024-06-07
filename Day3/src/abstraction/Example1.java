package abstraction;

abstract class Bike
{
	abstract void run();
}
public class Example1 extends Bike 
{
	 void run()
	 {
		 System.out.println("Running successfully");
	 }
 public static void main(String args[])
 {
	Bike b=new Example1();
	b.run();
 }
}
