package lab10_ex;


public class BasePlusCommissionEmployee extends CommissionEmployee{
	private double baseSalary;
	
	public BasePlusCommissionEmployee(String first, String last, String ssn,double sales, double rate, double salary) {
		super(first,last,ssn,sales,rate);
		setBaseSalary(salary);
	}
	
	public void setBaseSalary(double salary) {
		baseSalary = (salary < 0.0) ? 0.0 : salary;
	}
	
	public double getBaseSalary() {
		return baseSalary;
	}
	
	public double earning() {
		return super.earning() + getBaseSalary();
	}
	
	public String toString() {
		return String.format("%s: %s; %s: $%.2f","base-salaried commission employee",
				super.toString(), "base salary", getBaseSalary());
	}
}
