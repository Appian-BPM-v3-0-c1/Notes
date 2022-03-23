package Week1.tues;

import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input1, input2;
		int sum = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Your result is: " + sum);
		
		
			do {
				
				System.out.println("Enter -1 to exit the program");
				
				System.out.println("Please enter first number to be add");
				
				input1 = scanner.nextInt();
				
				System.out.println("Please enter second number to be add");
				
				input2 = scanner.nextInt();
				
				
				sum = input1 + input2;
				
				System.out.println("Your result is: " + sum);
				
			}
			
			while (input1 != -1 || input2 != -1);
						
			{
				System.out.println("Thank you for participating");
				
			}
					
		
		
		
		

	}

}
