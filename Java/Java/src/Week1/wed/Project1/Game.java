package Week1.wed.Project1;

import java.util.Scanner;

public class Game {
	
	
	
	public void startGame()
	{
		
		
		char user = ' ';
		int won= 0;
		int lost = 0;
		int draws = 0;
		Scanner scan = new Scanner(System.in);	
	
		System.out.println("Welcome to RPS");
		
		while(user != 'x')
		{
			int cpu = getRandomNumber();
			
			System.out.println("\nPick r (rock) p (paper) s (scissor) x (exit)");
		
			user = scan.nextLine().charAt(0);
		
		
			//rock
			if (user == 'r' && cpu == 0)
			{
				System.out.println("This is a draw");
				
				 draws = draws + 1;
			}
		
			else if (user == 'r' && cpu == 1)
			{
				System.out.println("CPU won!");
				 lost = lost +1;
			}	
		
			else if (user == 'r' && cpu == 2)
			{
				System.out.println("You won!");
				 won =  won + 1;
			}
		
			//paper
		
			else if(user == 'p' && cpu == 0)
			{
				System.out.println("CPU won!");
				 won =  won + 1;
			}
		
			else if(user == 'p' && cpu == 1)
			{
				System.out.println("This is a draw");
				 draws = draws + 1;
			}
		
		
			else if (user == 'p' && cpu == 2)
			{
				System.out.println("you won!");
				 lost = lost + 1;		
			}
		
			//Scissor
		
			else if(user == 's' && cpu == 0)
			{
				System.out.println("You won!");
				 won =  won + 1;
			}
		
			else if(user == 's' && cpu == 1)
			{
				System.out.println("CPU won");
				 lost = lost + 1;
			}
		
		
			else if(user == 's' && cpu == 2)
			{
				System.out.println("This is a draw");
				 draws = draws + 1;		
			}
		
			else
			{
				System.out.println("Thank you");
			}
		}	
			
		System.out.print("\tWon: "+ won);
		System.out.print("\tLost: " + lost);
		System.out.print("\tDraws: " + draws);
		
		
	}
	
	
	public int getRandomNumber()
	{
		
		return (int)(Math.random() * 3);
	}
	

	
	
	

}
