package Inheritence;

public class Child_class2 extends Second_level_class 
{
	void childclass2()
	{
		System.out.println("this is child class 2");
	}
	 void name()
	  {
		  System.out.println("child2");
	  }
	public static void main(String args[])
	{
		Child_class2 c2=new Child_class2();
		c2.childclass2();
		c2.secondClass();
		c2.superclas();
		
	}

}
