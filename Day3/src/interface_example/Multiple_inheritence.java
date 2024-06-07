package interface_example;

interface Drawable1
{
	void draw();
}

interface Writable
{
    void write();	
}

public class Multiple_inheritence implements Drawable,Writable
{

	 public void write() 
	 {
 		System.out.println("writes");	
   	 }

	 @Override
	 public void draw() 
	 {
		System.out.println("draw rectangle");	
	 }
	public static void main(String args[])
	{
	 Drawable d=new Multiple_inheritence();
	 Writable r=new Multiple_inheritence();
	 r.write();
	 d.draw();
	}
}

