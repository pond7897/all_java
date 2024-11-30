package midterm;

public class Ticket {
	private char level;
	private int number;
	public Ticket() {
		// TODO Auto-generated constructor stub
		this.level = '\u0000';
		this.number = 0;
		
	}
	public void setLevel(char level) {
		this.level = level;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public char getLevel() {
		return level;
	}
	public int getNumber() {
		return number;
	}
	public double getNetPay(double hours) {
		double price = 0.0;
		switch(level) {
		case 'A': case 'B': case 'C':
			price = 100*hours;
			break;
		case 'D': case 'E': case 'F':
			price = 150 *hours;
			break;
		case 'G': case 'H': case 'I':
			price = 200*hours;
			break;
		default:
			price = 0.0;
		}
		return price;
	}

}
