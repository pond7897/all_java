package lab_3;

public class Account {
    private double balance; // instance variable that stores the balance

    public Account(double initialBalance) {
        // TODO Auto-generated constructor stub
        // validate that initialBalance is greater than 0.0

        // if it is not, balance is initialized to the default value 0.0
        if (initialBalance > 0.0)
            balance = initialBalance;

    } // end Account constructor

    // credit (add) an amount to the account
    public void withdrawal(double amount) {
        if (balance < amount)
            System.out.println("Debit amount exceeded account balance.");
        else
            balance = balance - amount; // add amount to balance

    } // end method credit

    // return the account balance
    public double getBalance() {
        return balance; // gives the value of balance to the calling method
    } // end method getBalance
}
// Titipong Keawkhum 64050407
