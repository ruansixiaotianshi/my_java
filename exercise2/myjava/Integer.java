package exercise2.myjava;
import java.util.Scanner;
public class Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a three-digit integer:");
		Scanner input = new Scanner(System.in);
		int answer = input.nextInt();
		if(answer>100 && answer<999)	
		{
		
		//units digit
		int number1 = answer % 10;
		//hundreds digit
		int number2=answer / 100;
		if(number1==number2)
			System.out.print(answer+" is a palindrome ");
		else
			System.out.print(answer+" is not a palindrome ");	
	  }
	
	else
		System.out.print("input error");

}
}