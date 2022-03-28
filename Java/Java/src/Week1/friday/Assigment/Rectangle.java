package Week1.friday.Assigment;

public class Rectangle {
	
	
	private String name;
	private int length;
	private int width;
	
	public Rectangle()
	{
		
	}
	
	public Rectangle(String name, int length, int width) {
		super();
		this.name = name;
		this.length = length;
		this.width = width;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
		
	@Override
	public String toString() {
		return "Rectangle [name=" + name + ", length=" + length + ", width=" + width + "]";
	}
	
	
	public boolean comparingRectangleByArea(int rect1, int rect2)
	{
		boolean isLessThan = (rect1 == rect2);
		
		if(isLessThan == true)
		{
			return true;
		}
		
		else
		{	
			return false;
		}
	}
	
	public boolean comparingRectanglesByPerimeter(int rectPer1, int rectPer2)
	{
		boolean isLessThan = (rectPer1 == rectPer2);
		
		if(isLessThan == true)
		{
			return true;
		}
		
		else
		{	
			return false;
		}
	}

}
