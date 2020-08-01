import java.util.ArrayList;

public class Database 
{
	ArrayList<Category> cat = new ArrayList<Category>();
	
	public Database(ArrayList<Category> c)
	{
		cat = c;
	}
	
	public void Insert(Category p)
	{
		cat.add(p);
	}
	
	public void Delete(Category p)
	{
		cat.remove(p);
	}
	
	public boolean Search(Product p)
	{
		for(int i = 0; i < cat.size(); i++)
		{
			Category c = cat.get(i);
			if(c.category.contains(p))
			{
				return true;
			}
		}
		return false;
	}

}
