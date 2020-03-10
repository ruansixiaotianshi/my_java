package org.yuanmy_java;

import java.util.Scanner;

public class Mile_Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double feet;
double meters;
System.out.println("Enter a value for feet:");
Scanner in=new Scanner(System.in);
feet=in.nextDouble();
meters=(double)feet*0.305;

System.out.println(feet+" feet is "+meters+" meters");

	}

}