package finalProject;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		String originalPolynomialString;
		double xLower;
		double xUpper;
		double yLower;
		double yUpper;
		int xSteps;
		int ySteps;

		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a polynomial in the proper form: ");
		originalPolynomialString = in.nextLine();
		
		System.out.print("Enter the lower bound for x: ");
		xLower = Integer.parseInt(in.nextLine());
		
		System.out.print("Enter the upper bound for x: ");
		xUpper = Integer.parseInt(in.nextLine());
		
		System.out.print("Enter the number of steps in the x direction: ");
		xSteps = Integer.parseInt(in.nextLine());
		
		System.out.print("Enter the lower bound for y: ");
		yLower = Integer.parseInt(in.nextLine());
		
		System.out.print("Enter the upper bound for y: ");
		yUpper = Integer.parseInt(in.nextLine());
		
		System.out.print("Enter the number of steps in the y direction: ");
		ySteps = Integer.parseInt(in.nextLine());
		
		in.close();
	}

}
