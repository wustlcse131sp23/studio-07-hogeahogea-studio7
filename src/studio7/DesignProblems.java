package studio7;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class DesignProblems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rectangle(3,3);
		die(12);
		addFraction(1,2,3,8);
	}

	public static void rectangle(int length, int width)
	{
		System.out.println("Area = " + length*width);
		System.out.println("Perimeter = " + ((2*length)+(2*width)));
		square(length, width);
		if(length>width) {
			StdDraw.setXscale(-5*length, 5*length);
			StdDraw.setYscale(-5*length, 5*length);
		}
		else {
			StdDraw.setXscale(-5*width, 5*width);
			StdDraw.setYscale(-5*width, 5*width);
		}
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.filledRectangle(length, width, length, width);
	}

	//method for if rectangle is a square
	public static void square(int length, int width)
	{
		if(length==width)
		{
			System.out.println("Square");;
			}
		else {
		System.out.println("Not a Square");
		}
	}
	
	public static void die(int numberOfSides)
	{
		int sides = (int) (Math.random()*numberOfSides +1);
		System.out.println("Side Die Landed On: " + sides);
	}
	
	public static void addFraction(int numerator1, int denominator1, int numerator2, int denominator2)
	{
		if(denominator1==denominator2)
		{
			System.out.println((numerator1+numerator2) + "/" + denominator1);
		}
		else {
		gcd(denominator1, denominator2);
		if(denominator1>denominator2) {
			int newNumerator1 = numerator1*gcd(denominator1, denominator2);
			int newNumerator2 = numerator2;
			int denominator = denominator1;
			System.out.println((newNumerator1+newNumerator2) + "/" + denominator);
		}
		else {
			int newNumerator1 = numerator1;
			int newNumerator2 = numerator2*gcd(denominator1, denominator2);
			int denominator = denominator2;
			System.out.println((newNumerator1+newNumerator2) + "/" + denominator);
		}

		}
	}
	
	public static int gcd(int p, int q) {
		while (q != 0) {
			int temp = q;
			q = p % q;
			p = temp;
		}
		return p;
	}
}
