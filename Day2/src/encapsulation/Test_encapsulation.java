package encapsulation;

public class Test_encapsulation 
{
  public static void main(String args[])
  {
	  Encapsulation en=new Encapsulation();
	  en.set_accno(7560504000L);
	  en.set_mail_id("vittaabhilash@gmail.com");
	  en.set_name("Abhilash vitta");
	  en.set_amount(10000000);
	  System.out.print(en.get_name()+" "+en.get_mail_id());
  }
}
