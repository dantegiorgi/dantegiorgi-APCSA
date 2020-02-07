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

public class DistanceRunner
{
	public static void main( String[] args )
	{
		//add test cases	
		Scanner keyboard = new Scanner(System.in);
		Distance test = new Distance();
		out.println("Enter X1 :: ");
		int xOne = keyboard.nextInt();
		out.println("Enter Y1 :: ");
		int yOne = keyboard.nextInt();
		out.println("Enter X2 :: ");
		int xTwo = keyboard.nextInt();
		out.println("Enter Y2 :: ");
		int yTwo = keyboard.nextInt(); // enter coordinates
		
		test.calcDistance(xOne, yOne, xTwo, yTwo);
		System.out.println( test );
	}
}