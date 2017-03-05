public class Product
{
	private String name;
	private float price = 10;
	
	public Product(String name)
	{
		setName(name);
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return this.name;
	}
}
