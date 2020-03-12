package exercise2.myjava;
import java.util.Scanner;
public class AdditionQuiz {
	public static void main(String[] args){ 
		// 1.Generate two random single-digit integers,and number1 and number2 <100
	
		int numberl = (int)(Math.random() *100);
		int number2 = (int)(Math.random() *100); 
		
		
		// 2. Prompt the student to answer "What is number l+number2?¡±
		System.out.print("What is " + numberl + " + " + number2 + "? ");
		Scanner input = new Scanner(System.in);
		int answer = input.nextInt(); 
		
		// 3 . Grade the answer and display the result
		if (numberl+number2 == answer)
		System.out.println("You are correct!");
		else {
		System.out.println("Your answer is wrong.");
		System.out.println(numberl + " + " + number2 + 
			" should be " + (numberl+number2));
		}
		
		
		
}
}
