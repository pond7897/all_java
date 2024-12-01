//ถ้า input HelloWorld แล้ว output HELLOworld
import javax.swing.JOptionPane;

public class Java10{
	public static void main(String[] args){
		String type;
		String first , last, name;
		type = JOptionPane.showInputDialog("Input");
		first = type.substring(0,5).toUpperCase();
		last = type.substring(5).toLowerCase();
		name = first+last;
		System.out.println( "Name: " + name);
		System.exit(0);
	}
}
