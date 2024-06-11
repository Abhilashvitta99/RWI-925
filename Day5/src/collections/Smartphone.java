package collections;
public class Smartphone 
{
	String brand;
	String model;
	int rating;
	int price;
    Smartphone(String brand,String model,int rating,int price)
    {
    	this.brand=brand;
    	this.model=model;
    	this.price=price;
    	this.rating=rating;
    	
    }
    public void setbrand(String brand)
    {
    	this.brand=brand;
    }
    public void setmodel(String model)
    {
    	this.model=model;
    }
    public void setprice(int price)
    {
    	this.price=price;
    }
    public void setrating(int rating)
    {
    	this.rating=rating;
    }
    public String getbrand()
    {
    	return brand;
    }
    public String getmodel()
    {
    	return model;
    }
    public int rating()
    {
    	return rating;
    }
    public int price()
    {
    	return price;
    }
    public int compareto(Smartphone sp)
    {
    	return this.rating-sp.rating;
    }

}


