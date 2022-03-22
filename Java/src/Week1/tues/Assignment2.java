package Week1.tues;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a ;
		int userInput;
		
		
		Scanner obj = new Scanner(System.in);
		
			
		do {
			System.out.println("Please enter a number");
			
			 userInput = obj.nextInt();
			 
			 a = userInput % 2;
			 
			 
			if( a == 0 )
			{
				
				System.out.println("Yes ");
				
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

}
