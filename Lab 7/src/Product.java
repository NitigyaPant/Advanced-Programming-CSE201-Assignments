
public class Product
{
	int price;
	int number;
	
	public Product(int p, int n)
	{
		price = p;
		number = n;
	}
	
	public Product(int p)
	{
		price = p;
	}
	
	public void Modify(int p, int n)
	{
		this.price = p;
		this.number = n;
	}
	
	public void Sale()
	{
		if(this.number > 0)
		{
			this.number--;
		}
		else
		{
			System.out.println("Sold out!");
		}
	}
}
