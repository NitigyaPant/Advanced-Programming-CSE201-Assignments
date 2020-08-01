import java.util.ArrayList;

public class Game extends Board 
{
	int[] list = new int[5];
	int points = 0;
	
	ArrayList<Integer> prize = new ArrayList<>();
	
	public void Play(int c1, int c2, int guess)
	{
		Hit(c1, c2);
		
		if(this.board2[c1][c2] > 0)
		{
			if(this.board2[c1][c2] == guess)
			{
				for(int i = 0 ; i < this.list.length ; i++)
				{
					if(guess == list[i])
					{
						//add to prize
						prize.add(guess);
						
						if(this.board2[c1][c2] == 1)
							points = points + 10;
						else if(this.board2[c1][c2] == 2)
							points = points + 20;
						else
							points = points + 5;
					}
				}
			}
			else
			{
				points = this.board2[c1][c2] - guess;
			}
		}
		
		else 
		{
			points = points/2;
			System.out.println("No prize");
		}
	
	}
}
