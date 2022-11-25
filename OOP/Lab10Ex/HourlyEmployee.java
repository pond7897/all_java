package Lab10Ex;

public class HourlyEmployee extends Employee{
	private double HoursWorked;
	private double Wage;
	public HourlyEmployee(String first, String last, String ssn, double wage, double hours) {
		// TODO Auto-generated constructor stub
		super(first, last, ssn);
		setWage(wage);
		setHourly(hours);
	}
	public void setWage(double wage) {
		this.Wage = (wage < 0.0) ? 0.0 : wage;
	}
	public double getWage() {
		return Wage;
	}
	public void setHourly(double hours) {
		this.HoursWorked = (hours < 0.0) ? 0.0 : hours;
	}
	public double getHourly() {
		return HoursWorked;
	}
	public double earning() {
		return getWage()*getHourly();
	}
	public String toString() {
		return String.format("hourly employee: %s\n%s: $%,.2f; %s: %.2f", 
				super.toString(),"wage",getWage(),"hours worked",getHourly());
	}

}
