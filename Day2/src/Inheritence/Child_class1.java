package Inheritence;

public class Child_class1 extends Second_level_class{
 void child1()
 {
	 System.out.println("this is the child class1");
	 super.name();
 }
 void name()
 {
	  System.out.println("child1");
 }
 public static void main(String args[])
 {
	 Child_class1 sc=new Child_class1();
	 sc.superclas();
	 sc.secondClass();
	 sc.child1();
	 sc.name();
	 
 }
}
