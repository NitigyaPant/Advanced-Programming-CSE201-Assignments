
public class Vehicle // Both engine and non-engine powered
{
	String name;
	String model;
	int wheels;
	boolean engine = true;
	int energy = 100;
	public double self = 0;
	public double onlook = 0;
	
	public Vehicle(String n, String m, int w, boolean e )
	{
		name = n;
		model = m;
		wheels = w;
		engine = e;
	}
	
	public float damage()
	{
		this.energy = this.energy - 20;
		float damage = 20;
		return damage;
	}
	
	public void Collide( Vehicle v2)
	{
		this.damage();
		v2.damage();
	}
}