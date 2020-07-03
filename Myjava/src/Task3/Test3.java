package Task3;

import java.util.Date;

public class Test3 {

	public static void main(String[] args) {
/**
 *  Compile the test program and create a police officer with the police number 10034,
 *  the name is "Jackie chan",
 *  the salary is 3000
 *  the army is the 7th Brigade of the Armed Police,
 *  the rank is the third Police supervisor.
 *  Set the working time as April 1, 2004.
 *  Assume a raise every two years, modify his current salary according to the current system time,
 *  and output his personal information.
 */
		ArmedPolice armepolice = new ArmedPolice(10034, "jackie chan", 3000, "the 7th Brigade of the Armed Police", "the third Police supervisor");
		Date date = new Date(2004, 4, 1);
		armepolice.setDateOfWork(date);
		for (int i = 0; i < armepolice.workLength()/2; i++) {
			armepolice.Raise();
		}
		System.out.println(armepolice.toString());
	}
}






