package encapsulation;
public class Encapsulation
{
	private long accno;
	private String name;
	private String mail_id;
	private float amount;
   public long get_accno()
   {
	   return accno;
   }
   
   public void set_accno(long accno)
   {
	   this.accno=accno;
   }
   
   public String get_name()
   {
	   return name;
   }
   
   public void set_name(String name)
   {
	   this.name=name;
   }
   
   public String get_mail_id()
   {
	   return mail_id;
   }
   
   public void set_mail_id(String mail_id)
   {
	   this.mail_id=mail_id;
   }
   
   public float get_amount()
   {
	   return amount;
   }
   
   public void set_amount(float amount)
   {
	   this.amount=amount;
   }
}
 
