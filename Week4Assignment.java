//Saule Buhler
import java.util.Scanner; //imported
public class Week4Assignment 
{
	public static void main(String[] args)
	{
		//initialize and declare variables 
		double l = 0;
		double h = 0;
		double w = 0;
		double surfArea;
		double volume;
		
		//instantiate scanner
		Scanner input = new Scanner(System.in);
		
		//explanation of the program
		System.out.print("This program will accept a length, width and height of a box,\n" + 
				"and then it will report the surface area and volume of it\n");
		
		//prompt the user 
		System.out.println("Enter the box length: ");
		l = input.nextDouble();
		System.out.println("Enter the box height: ");
		h = input.nextDouble();
		System.out.println("Enter the box width: ");
		w = input.nextDouble();
		
		//calling one method here
		volume = calculateVolume(l, h, w);
		
		//display on the screen, and one method is nested inside the output
		System.out.printf("The surface area of your rectangle is: %.2f\n", surfArea = calculateArea(l, h, w));
		System.out.printf("The volume of your rectangle is: %.2f\n", volume);
		
	}
	//the methods 
	private static double calculateVolume(double l, double h, double w) 
	{
		return l * h * w;
	}

	private static double calculateArea(double l, double h, double w) 
	{
		return 2*(l*w + l*h + h*w);
	}
	

}
