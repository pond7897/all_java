package lab10;

public class SalaryEx3 {
	public static void main(String[] args) {
		Employee firstEmployee = new SalariedEmployee("June", "Bug", "123-45-6789", 1000.00);
		Employee secondEmployee = new CommissionEmployee("Archie", "Tic", "987-65-4321", 15000.00, 0.10);
		SalariedEmployee salaried = (SalariedEmployee) firstEmployee;
	
		System.out.printf("Employee 1:\n%s\n\n", firstEmployee);
		System.out.printf("Employee 2:\n%s\n\n", secondEmployee);
		System.out.printf("salaried:\n%s\n", salaried);
		
		
	}
}
