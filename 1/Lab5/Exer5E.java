import java.util.Scanner;
//Scanner
public class Exer5E {
  public static String email(String msg){
    Scanner kbd = new Scanner(System.in);
    System.out.print(msg); String type = kbd.nextLine();
    return text;
  }
  public static String homepage(String msg){
    Scanner kbd = new Scanner(System.in);
    System.out.print(msg); String type = kbd.nextLine();
    return type;
    
  }
  public static String userID(String name,String surname){
    String tmp = surname+"1234567";
    return name.substring(0,1)+tmp.substring(0,7);
  }
  public static void main(String[] args){
    String name = email("Enter Firstname : ");
    String lastname = email("Enter Lastname : ");
    String Domain = email("Enter Domain : ");
    String webDomain = homepage("Enter webDomain : ");
    String userid = userID(name,lastname);
    
    System.out.println("address = "+name+"."+lastname+"@"+Domain);
    System.out.println("webpage = "+"https://"+webDomain+"/~"+lastname);
    System.out.println("userid = "+userid);    
  }
}

//JOptionPane
import javax.swing.JOptionPane;
class Exer5E
{
	public static String email(String name,String surname,String Domain){
		return name+","+surname+"@"+Domain;
	}
	public static String homepage(String surname,String WebDomain){
		return "https://"+WebDomain+"/~"+surname;
	}
	public static String userID(String name,String surname){
		String tmp = surname+"1234567";
		return name.substring(0,1)+tmp.substring(0,7);
	}
	public static void main(String[] args){
		String name,lastname,domain,webDomain;
		String address,webpage,account;

		name = JOptionPane.showInputDialog("Insert a Name : ");
		lastname = JOptionPane.showInputDialog("Insert a LastName : ");
		domain = JOptionPane.showInputDialog("Insert a domain : ");
		webDomain = JOptionPane.showInputDialog("Insert a webDomain : ");
		address = email(name,lastname,domain);
		webpage = homepage(lastname,webDomain);
		account = userID(name,lastname);

		System.out.println("email : "+address);
		System.out.println("homepage : "+webpage);
		System.out.println("userid : "+account);
		System.exit(0);
	}
}
