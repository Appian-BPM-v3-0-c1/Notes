package Week1.tues;

import java.util.Scanner;

public class Assigment3 {
	
	
	public static void main(String[] args)
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
				System.out.println("Thank you");
			}
		
		}
	
}
