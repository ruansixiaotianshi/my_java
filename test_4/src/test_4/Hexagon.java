package test_4;
import java.lang.Math;
import java.util.Scanner;
public class Hexagon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.print("Enter the side:");
Scanner input =new Scanner(System.in);
double side =input.nextDouble();

double area =(6*side*side)/(4*(Math.tan(Math.PI/6)));
System.out.print("The area of the hexagon is "+area);
	}

}
