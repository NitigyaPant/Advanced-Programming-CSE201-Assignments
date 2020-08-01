
public class Insurance extends Vehicle
{
	boolean exp;
	
	public Insurance(boolean e)
	{
		exp = e;
	}
	
	public void settle( Vehicle v2)
	{
		self = 0;
		onlook = 0;
		Collide(v2);
		
		if(this.engine == true)
		{
			if(this.wheels == 4)
			{
				self = 0.5*(this.damage());
				onlook = 0.8*(v2.damage());
			}
			
			else
			{
				self = 0.1*(this.damage());;
				onlook = 0.5*(v2.damage());
			}
		}
		self = 0;
		onlook = 0;
	}
}