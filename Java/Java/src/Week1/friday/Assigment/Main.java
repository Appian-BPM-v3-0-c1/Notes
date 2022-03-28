package Week1.friday.Assigment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static <T> void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Rectangle> list = new ArrayList();
		Rectangle obj1 = new Rectangle();
		int random = getRandom();
		int random2 = getRandom();
		
		
		
		
		list.add(new Rectangle ("First ",12 , 6));
		list.add(new Rectangle ("Second ",13 , 7));
		list.add(new Rectangle ("Third ",5 , 9));
		list.add(new Rectangle ("Fourth ",7 , 3));
		list.add(new Rectangle ("Fifth ",9 , 5));
		list.add(new Rectangle ("Six",18 , 12));
		list.add(new Rectangle ("Seven ",3 ,10));
		list.add(new Rectangle ("Eight ",11 , 2));
		list.add(new Rectangle ("Nine ",4 , 4));
		list.add(new Rectangle ("Ten ",8 , 1));
		
		
		
	//	System.out.println(list);
		
		
		
		
		//Run the list in the Rectangle class with all three parameters	
		for(int i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i));
			
			
		}
		
		//Run the list using the getter comparingRectangleByArea and the random method
		for(int i = 0; i < list.size(); i++)
		{
		
			System.out.println("The area of the rectangles are equals: "
				+obj1.comparingRectangleByArea(list.get(random).getLength(),
						list.get(random2).getLength()));
		}
		
		
		//Run the list using the getter comparingRectanglesByPerimeter and the random method
		for(int i = 0; i < list.size(); i++)
		{
		
			System.out.println("The perimeter of the rectangles are equals: "
			+obj1.comparingRectanglesByPerimeter(list.get(random2).getWidth(),
					list.get(random).getWidth()));
					
		}
		
	}	
		
		
	
	public static int getRandom()
	{
		//Generate random numbers between 0 and 2
		return (int)(Math.random() * 10);
	}
	
	
	

}
