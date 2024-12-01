package lab10;

public class SalaryEx1 {

	public static void main(String[] args) {
		SalariedEmployee employee1 = new SalariedEmployee("June","Bug","123-45-6789",1000.00);
		CommissionEmployee employee2 = new CommissionEmployee("Archie","Tic","987-65-4321",15000.00,0.10);
		
		System.out.printf("Employee 1:\n%s\n\n", employee1);
		System.out.printf("Employee 2:\n%s\n\n", employee2);
	}

}
