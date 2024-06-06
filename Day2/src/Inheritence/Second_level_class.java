package Inheritence;

public class Second_level_class extends Superclass 
{
  void secondClass()
  {
	  System.out.println("this is second level class inheriting from super class");
  }
  void name()
  {
	  System.out.println("second level");
  }
  public static void main(String args[])
  {
	  Second_level_class s=new Second_level_class();
	  s.superclas();
	  s.secondClass();
  }
}
