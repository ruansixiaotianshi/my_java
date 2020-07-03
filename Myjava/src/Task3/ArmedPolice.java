package Task3;

public class ArmedPolice extends Policeman implements Employee {
	/**
	 * (1) A String type property, representing the name of the army to which it belongs.
	 * (2) A String type property , representing the rank.
	 * (3) The constructor to create the object according to the specified number, name, salary, army and rank (the time to create the object is the date to start work).
	 * (4) Realize the abstract method raise to increase the salary attribute by 30%.
	 * (5) Override the inherited toString() method and output "Number + name + years of service + salary + army + rank".
	 * @param number
	 * @param name
	 * @param salary
	 * @param armyName
	 * @param rank
	 */
	public ArmedPolice(int number, String name, double salary, String armyName, String rank) {
		super(number, name, salary);
		this.armyName = armyName;
		this.rank = rank;
	}

	private String armyName;
	private String rank;

	/**
	 *
	 */
	@Override
	//工资提高30%
	public void Raise() {
		setSalary(getSalary() + getSalary() * 0.3);
	}

	@Override
	public String toString() {
		return  "Number:" + getNumber() + ",Name:" + getName() + "year of service:"+getDateOfWork().getYear()+", Salary:" + (int)getSalary()
				+"army=" + armyName+ ", rank=" + rank ;
	}



}