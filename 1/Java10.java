//ถ้า input HelloWorld แล้ว output HELLOworld
import javax.swing.JOptionPane;

public class Java10{
	public static void main(String[] args){
		String type;
		String hello , name;
		type = JOptionPane.showInputDialog("Input");
		first = type.substring(0,5).toUpperCase()
		last = type.substring(5).toLowerCase();
		name = fist+last;
		System.out.println( "Name: " + name);
		System.exit(0);
	}
}
