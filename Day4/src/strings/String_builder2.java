package strings;

public class String_builder2
{
  public static void main(String args[])
  {
	  StringBuilder s=new StringBuilder();
	  s.append("abhilash");
	  System.out.print(s.length()+" ");
	  s.replace(4,8,"");
	  System.out.println(s+" "+s.length());
  }
}
