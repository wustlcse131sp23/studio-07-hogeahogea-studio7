package studio7;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class DesignProblems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rectangle(4,3);
	}

	public static void rectangle(double length, double width)
	{
		System.out.println("Area = " + length*width);
		System.out.println("Perimeter = " + ((2*length)+(2*width)));
		square(length, width);
		setCanvasSize(2*length, 2*width);
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.filledRectangle(length, width, length, width);
	}
	
	
	
	private static void setCanvasSize(double d, double e) {
		// TODO Auto-generated method stub
		
	}

	//method for if rectangle is a square
	public static void square(double length, double width)
	{
		if(length==width)
		{
			System.out.print("Square");;
			}
		System.out.print("Not a Square");
	}
}
