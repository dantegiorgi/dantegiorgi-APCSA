package Unit3;

//(c) A+ Computer Science 
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int x1,x2,y1,y2;
	private double dist;

	public Distance()
	{
		setCoordinates(0,0,0,0);
		dist = 0.0;
	}

	public Distance(int xOne, int yOne, int xTwo, int yTwo)
	{
		setCoordinates(xOne, yOne, xTwo, yTwo);
	}

	public void setCoordinates(int xOne, int yOne, int xTwo, int yTwo)
	{
		x1= xOne;
		x2= xTwo;
		y1= yOne;
		y2= yTwo;
	}

	public void calcDistance(int xOne,int yOne,int xTwo,int yTwo)
	{
		dist = sqrt(pow(xTwo-xOne,2) + pow(yTwo-yOne,2));
	}
	
	public double getDistance()
	{
		return dist;
	}
	
	public void print()
	{
	}
	
	//complete print or the toString

	public String toString()
	{
		return "distance == " + String.format("%.3f\n", dist	);
	}
}