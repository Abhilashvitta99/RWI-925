package polymorphism;

class Bike {
   void run()
   {
	   System.out.println("running");
   }
}
public class Splendor extends Bike
{
  void run()
  {
	  System.out.print("Running at 60kmph");
  }
  public static void main(String args[])
  {
	  Splendor b=new Splendor();
	  b.run();
  }
}