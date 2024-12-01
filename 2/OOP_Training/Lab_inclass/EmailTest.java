package lab_inclass;

import java.util.Scanner;

public class EmailTest {

	public static void main(String[] args) {
		Email email = new Email();
		
		Scanner kbd = new Scanner(System.in);
		System.out.print("Enter subject to you send : ");
		
		String txt = kbd.next();
		System.out.print("Enter who to you send : ");
		String user = kbd.next();

		email.setSubject(txt);
		email.setTo(user);

		System.out.println("========= Succes =========\n");
		System.out.printf("Subject : %s%nSend to : %s%n%n", email.getSubject(), email.getTo());
		System.out.println("==========================\n");

		kbd.close();
	}

}
