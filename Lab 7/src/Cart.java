import java.util.*;

public class Cart  
{
	ArrayList<Product> cart = new ArrayList<Product>();
	
	Database d;
	
	public void Add(Product p, int quantity)
	{
		while(quantity > 0)
		{
			if(d.Search(p))
			{
				ArrayList c = d.cat;
				
				for(int i = 0 ; i < c.size() ; i++)
				{
					if(c.get(i).equals(p))
						p.Sale();
				}
				cart.add(p);
			}
			else
			{
				System.out.println("No product!");
			}	
		}
		quantity--;
	}
	
	public ArrayList CheckOut()
	{
		return cart;
	}
	
}