package Week1.thur.Practice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Hangman {

	public void startGame()
	{
		//char[] words;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a word to be guess");
		
		char[] words = scan.next().toLowerCase().toCharArray();
		
		char[] hidden = new char[words.length];
		int life;
		
		
		
		
		//Verification
		
	//	  for(char a : words) { System.out.print(a); }
		  
		  for (int i = 0; i < hidden.length; i++) {
		  
		  System.out.print(hidden[i] = '*'); }
		 
		
		
		  
		  
		
		  System.out.println("\nPlease enter a letter"); 
		  
		  char[] guess = scan.next().toCharArray();
		  
		 
		  for (int i = 0; i < words.length; i++)
		  {
			  if(guess.equals(hidden[i]));
			  {
				  System.out.println("yes");
			  }
		  }
		  
		  System.out.println("Guess Again");
				 
		  System.out.println(guess);
//	 System.out.println(b);
		  
		 
		
		// 
		 
	}
}
