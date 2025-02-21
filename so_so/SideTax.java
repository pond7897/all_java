import java.util.Scanner;

public class SideTax {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int salary = getInput("Enter Salary: ");
        int yearCost = getInput("Enter Year cost: ");
        int taxDeduction = getInput("Enter Tax deduction: ");
        System.out.println();

        int taxableIncome = calculateTaxableIncome(salary, yearCost, taxDeduction);
        taxableIncome = addOtherIncome(taxableIncome);
        System.out.printf("Income: %,d%n", taxableIncome);

        double taxRate = determineTaxRate(taxableIncome);
        System.out.printf("Tax is %.0f%%%n", taxRate * 100);

        double taxAmount = calculateTax(taxableIncome, taxRate);
        if (taxAmount > 0) {
            System.out.printf("Your Tax: %,.0f%n", taxAmount);
        } else {
            System.out.println("Your Tax = Free Tax");
        }

        scanner.close();
    }

    private static int getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    private static int calculateTaxableIncome(int salary, int yearCost, int taxDeduction) {
        return (salary * 12) - yearCost - taxDeduction;
    }

    private static int addOtherIncome(int amount) {
        System.out.print("Do you have other income? (Yes/No): ");
        scanner.nextLine(); // Clear buffer
        String choice = scanner.nextLine();
        if (choice.equalsIgnoreCase("Yes") || choice.equalsIgnoreCase("Y")) {
            System.out.print("Input other income: ");
            return amount + scanner.nextInt();
        }
        return amount;
    }

    private static double determineTaxRate(int amount) {
        if (amount <= 150000) return 0.0;
        if (amount <= 300000) return 0.05;
        if (amount <= 500000) return 0.10;
        if (amount <= 750000) return 0.15;
        if (amount <= 1000000) return 0.20;
        if (amount <= 2000000) return 0.25;
        if (amount <= 5000000) return 0.30;
        return 0.35;
    }

    private static double calculateTax(int amount, double taxRate) {
        double[] brackets = {150000, 300000, 500000, 750000, 1000000, 2000000, 5000000};
        double[] rates = {0.05, 0.10, 0.15, 0.20, 0.25, 0.30, 0.35};
        double tax = 0;

        if (amount <= 150000) return 0;

        for (int i = 0; i < brackets.length; i++) {
            if (amount <= brackets[i]) {
                tax += (amount - (i == 0 ? 0 : brackets[i - 1])) * rates[i];
                break;
            } else {
                tax += (brackets[i] - (i == 0 ? 0 : brackets[i - 1])) * rates[i];
            }
        }

        if (amount > brackets[brackets.length - 1]) {
            tax += (amount - brackets[brackets.length - 1]) * rates[rates.length - 1];
        }

        return tax;
    }
}