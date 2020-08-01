import java.util.Scanner;


public class Main_class 
{
	public static void Main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int players = input.nextInt();
		
		while(players > 0)
		{
			Game g = new Game();
			for(int i = 0 ; i < 10 ; i++)
			{
				int cord1 = input.nextInt();
				int cord2 = input.nextInt();
				
				int guess = input.nextInt();
				
				g.Play(cord1, cord2, guess);
			}
		}
	}
}
