package org.yuanmy_java;

import java.util.Scanner;

public class Temperature {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
double C;
double F;
System.out.println("Enter a degree in Celsius");
Scanner in=new Scanner(System.in);
C=in.nextDouble();
F=(double)(9/5.0)*C+32;

System.out.println(C+" Celsius is "+F+" Fahrenheit");

	}

}
