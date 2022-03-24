package Week1.thur;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String [] userInput = new String [12];
		
		
		Scanner scan = new Scanner(System.in);
		
		
		
	
		for(int i = 0; i < userInput.length; i++)
		{
			System.out.println("Please enter Months from Jan to December");
			userInput[i] = scan.nextLine();
		}

		
		
		for(int i = 0; i < userInput.length; i++)
		{
			
			System.out.println(userInput[i]);
		}
		
		
		// Loops to print even and odd months.
		
		for(int i = 0; i < userInput.length; i++)
		{
			
			int a = i % 2;
		
			if (a == 0)
		
				{
					System.out.println("even months" + userInput[i]);
			
				}
		}
	
		
		for(int i = 0; i < userInput.length; i++)	
			{	
				int a = i % 2;
			
				if (a != 0)			  
			{
				System.out.println("odd months" + userInput[i]);
				
			}
		}
		
		
	}

}
