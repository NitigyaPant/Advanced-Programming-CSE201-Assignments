import java.util.*;

public class Category 
{
	TreeSet<Product> category = new TreeSet<Product>(); 
	
	public Category(TreeSet<Product> t)
	{
		category = t;
	}
	
	public void Insert(Product p)
	{
		category.add(p);
	}

	public void Delete(Product p)
	{
		category.remove(p);
	}
}
