import java.util.Scanner;

public class Shape 
{
	int num; // greater than 3
	Point centre;

	Point list[] = new Point[num];

	public Shape(int n)
	{
		num = n;
	}
	
	public Shape(Point[] lis)
	{
		int c1 = 0;
		int c2 = 0;

		if(lis[0].p1 == lis[lis.length-1].p1 || lis[0].p2 == lis[lis.length-1].p2)
		{
			list = lis;
		}
		

		for(int i = 0; i < list.length; i++)
		{
			c1 = c1 + list[i].p1;
			c2 = c2 + list[i].p2;
		}

		c1 = c1/num;
		c2 = c2/num	;		

		Point centre = new Point(c1, c2);	
	}

	public static boolean Cross(Shape a, Shape b)
	{
		for(int i = 0; i < a.list.length; i++)
		{
			if(a.list[i].p1 < b.list[0].p1 || a.list[i].p2 < b.list[0].p2)
			{
				return true;
			}
		}

		for(int i = 0; i < a.list.length; i++)
		{
			if(b.list[i].p1 < a.list[0].p1 || b.list[i].p2 < a.list[0].p2)
			{
				return true;
			}
		}

		return false;
	}

	// public static int Encircle(Shape a, Shape b)
	// {
	// 	if(b.centre  )
	// }

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		Shape ar[] = new Shape[n];
	
		for(int k = 0; k < n; k++)
		{
			String a = input.nextLine();	
			
			String s = input.nextLine();	
			System.out.println(s);
			String st[] = s.split("");
			int[] arr = new int[st.length];

			for(int i = 0 ; i < st.length; i++)
			{
				arr[i] = Integer.parseInt(st[i]);
			}	

			Point list[] = new Point[st.length/2];	

			for(int i = 0; i < st.length-2; i++)
			{
				Point p = new Point(arr[i],(int) arr[i+1]);
				list[i] = p; 
			}
			
			Shape sh = new Shape(list);
			ar[k] = sh;	
		}	

		for(int i = 1; i < ar.length; i++)
		{
			System.out.println("a crosses b" + Cross(ar[0],ar[i]));
		}

	}
}
