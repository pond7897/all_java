import javax.swing.JOptionPane;

public class Java10{
	public static void main(String[] args){
		String type;
		String hello , name;
		type = JOptionPane.showInputDialog("Input");
		hello = type.substring(0,5).toUpperCase()+type.substring(5).toLowerCase();
		
		name = hello;
		System.out.println( "Name: " + name);
		System.exit(0);
	}
}
