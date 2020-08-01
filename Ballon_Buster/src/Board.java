import java.util.Random;

public class Board 
{	
	int ballons = 10;
	int chances = 10;
	
	boolean[][] board1 = new boolean[10][10];
	int[][] board2 = new int[10][10];
	
	public void Board()
	{
		Random randi = new Random();
		
		for(int i = 0 ; i < 10 ; i++)
		{
			for(int k = 0 ; k < 10 ; k++)
			{
				board2[k][i] = randi.nextInt(10);
			}
		}
	}
	
	public void Hit(int c1, int c2)
	{
		this.ballons--;
		this.chances--;
	
		if(!this.board1[c1][c2])
		{
			this.board1[c1][c2] = true;
		}	
	}	
}

