package Week1.wed;

import java.util.Scanner;

public class Problem1 {

	public int easy(int a, int b)
	{				
		return a + b;
	}

	
	public void mediun()
	{
		
		
		int a;	
		int userInput;
		
		
		Scanner obj = new Scanner(System.in);
		
			
		do {
			System.out.println("Please enter a number");
			
			 userInput = obj.nextInt();
			 
			 a = userInput % 2;
			 
			 
			if( a == 0 )
			{
				
				System.out.println ("Yes ");
				
			}
			 
			
			
			else if ( a == 1) 
			{
				
				System.out.println("No ");
			}
			
			else
			{
				
				System.out.println("You didn't enter a number");
			}
			
		}
		while (userInput != -1);
		{
			System.out.println("Thank you");
		}
		
	
	}	
	
	
	
	public void Hard()
	{
		Scanner obj = new Scanner(System.in);
		String userInput;
		
		do {
			System.out.println("Please enter a word or enter exit to closed the program");
			
			userInput = obj.nextLine();
				 
			 	if(userInput.length() <= 10)
			 	{
				
			 		System.out.println(userInput + " " + userInput.length());
				
			 	}
			
			 	else 
		
			 	{
				
			 		System.out.println( userInput.charAt(0) +""+ (userInput.length() - 2) + "" + userInput.charAt(userInput.length() - 1)) ;
			
			 	}
	
		}
		 while (userInput != "exit");
			 	{
			 		System.out.println ("thank you");
			 	}
		
	}
}


