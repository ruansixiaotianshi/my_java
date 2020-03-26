package test_5;
import java.util.Scanner;
public class MinInArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		int n=10;
			double[]number=new double[n];
	System.out.println("please input 10 double number:");
	    
		double min = Min(array);
	 
	        System.out.println("最小数值是"+min);
	        
	    }

	    //求最小值
	    public  static double Min(double [] array){
	    	double min = array[0];
	        int length = array.length;
	        for(int i = 1; i < length;i++){
	            if(min > array[i]){
	            	array[i] = array[i]+min;
	                min = array[i]-min;
	                array[i] = array[i]-min;
	            }
	        }
	        return min;
	    }


}
