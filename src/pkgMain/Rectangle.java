package pkgMain;

public class Rectangle {

	//attributes 
	private double Length;
	private double Width;
	
	//constructor 
	public Rectangle(double length, double width) {
		Length = length;
		Width = width;
	}
	
	//method to return length 
	public double getLength() {
		return Length;
	}
	
	//method to return width 
	public double getWidth() {
		return Width;
	}
	
	//method to calc the area 
	public double Area()
	{
		// TODO Implement Area() function with the correct formula
		return Length * Width;
	}
	//method to calc the perimeter 
		public double Perimeter()
		{
			// TODO Implement Area() function with the correct formula
			return 2 * Length + 2 * Width;
		}		
}

