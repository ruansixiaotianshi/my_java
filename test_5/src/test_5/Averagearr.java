package test_5;
import java.util.Scanner;
public class Averagearr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input =new Scanner(System.in);
		int n=10;
			double[]number=new double[n];
	System.out.println("please input 10 double number:");
	for(int i=0;i<n;i++) {	
	number[i]=input.nextDouble();

	
	Averagearr.average(number);
	}
	
}


public static double average(double[] array) {
	double sum=0;
	
	for(int i=0;i<array.length;i++) {
   
	  sum+=array[i];	
	 
	  } 
	double average=sum/array.length;	
	 System.out.println("the average of 10 is:"+average);
 	
	System.out.println("sum of 10 is:"+sum);
	
	
	return 0;

}

public static int average(int[] array) {

	return 0;
		
}

}
