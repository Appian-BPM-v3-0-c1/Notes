package Week1.thur.Practice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Hangman {

	public void startGame()
	{
		
		Scanner scan = new Scanner(System.in);
		 
		  System.out.println("Please enter a word to be guess");
		  
		  String[] words = {"america", "jupiter","amazon", "computer"};
		  
		  //= scan.nextLine().toLowerCase();
		  
		  char[] hidden = new char[words.length()];
		  
		  
		  
		  
		  
		  //Verification
		  
		  // for(char a : words) { System.out.print(a); }
		  
		  for (int i = 0; i < hidden.length; i++) {
		  
		  System.out.print(hidden[i] = '*'); }
		  
		  System.out.println("\nPlease enter a word to be guess");
		
		  String guess = scan.nextLine().toLowerCase();
			  
		  
		
		
		  for(int i = 0; i < word.length(); i++)
		  {
			  if(word.charAt(i) == guess.charAt(0))
			  {
				  System.out.println("yes");
			  }
			  
			  else if (word.charAt(i) != guess.charAt(0))
			  {
				  System.out.println("Guess again");
			  }
			 
		  }
		
		  
		
				
		
	}
}
