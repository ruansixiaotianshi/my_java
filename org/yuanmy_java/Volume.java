package org.yuanmy_java;

import java.util.Scanner;

public class Volume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double radius;
double length;
double area;
double volume;
System.out.println("Enter the radius and length of a cylinder:");
Scanner in=new Scanner(System.in);
radius=in.nextDouble();
length=in.nextDouble();
area=(double)(radius*radius)*3.14;
volume=(double)area*length;
System.out.println("The area is "+area);
System.out.println("The volume is "+volume);
	}

}