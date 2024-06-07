package interface_example;

interface Drawable
{
	void draw();
}
class Rectangle implements Drawable 
{
   public void draw()
   {
	   System.out.println("draw rectangle");
   }
}
class Circle implements Drawable 
{
   public void draw()
   {
	   System.out.println("draw circle");
   }
}
public class Interface1
{
	public static void main(String args[])
	{
		Drawable d=new Rectangle();
		d.draw();
		Drawable c=new Circle();
		c.draw();
	}
}
