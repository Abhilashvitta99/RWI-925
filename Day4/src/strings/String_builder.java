package strings;

public class String_builder 
{
	public static void main(String args[])
	{
	 long s=System.currentTimeMillis();
	 StringBuffer sb=new StringBuffer("Hello");
	 for(int i=0;i<10000;i++)
	 {
		sb.append("abhi");
	 }
	 System.out.println("Time taken by string buffer:"+(System.currentTimeMillis()-s));
	 
	 StringBuilder sb1=new StringBuilder("Hi");
	 long st=System.currentTimeMillis();
	 for(int i=0;i<10000;i++)
	 {
		sb1.append("abhi");
	 }
	 System.out.println("Time taken  by string builder:"+(System.currentTimeMillis()-st));
	}
}
