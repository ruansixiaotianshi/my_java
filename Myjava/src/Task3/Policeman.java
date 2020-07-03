package Task3;

import java.util.Calendar;
import java.util.Date;

/**
 *(1) Three private property: police number, name and salary.
 * (2) A private property which is date type, and represents the date of work.
 * (3) The constructor to create the object according to the specified number, name and salary (the time when the object is created is the date of starting work).
 * (4) Accessors for all properties.
 * (5) Modifier of salary property.
 * (6) Modifier for date of work property.
 * (7) Override the inherited toString() method and output "Number + name + years of service + salary".
 */
public class Policeman {
	private int number;
	private String name;
	private double salary;
	private Date startWork;

	/**
	 *
	 * @param number 警号
	 * @param name 姓名
	 * @param salary 工资
	 */
	public Policeman(int number, String name, double salary) {
		this.number = number;
		this.name = name;
		this.salary = salary;
		this.startWork = new Date();
	}

	/**
	 * 
	 * @return
	 */
	public int workLength() {
		Calendar date = Calendar.getInstance();
		int currentyear = date.get(Calendar.YEAR);
		int Length=currentyear - this.startWork.getYear();
		return Length;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Date getDateOfWork() {
		return startWork;
	}

	public void setDateOfWork(Date dateOfWork) {
		this.startWork = dateOfWork;
	}

	@Override
	public String toString() {
		return  number +  name  + (int)salary + startWork ;
	}

}