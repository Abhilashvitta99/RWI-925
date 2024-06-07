package abstraction;

abstract class Shape
{
	abstract void print();
}

class Rectangle extends Shape
{
	void print() 
	{
		System.out.println("Rectangle");
	}
}

class Circle extends Shape
{
	void print() 
	{
		System.out.println("Circle");
	}
}
public class Example2 
{
  public static void main(String args[])
  {
	  Shape r=new Rectangle();
	  Shape c=new Circle();
	  r.print();
	  c.print();
  }
}
