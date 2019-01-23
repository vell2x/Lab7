import java.util.Scanner;

public class JavaValidator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		
		String name;
		String email;
		String phone;
		String date;
		String html;
		
		//name = validateName(scnr);
		//email = validateEmail(scnr);
		//phone = validatePhoneNumber(scnr);
		//date = validateDate(scnr);
		html = validateHTML(scnr);
		
		
		scnr.close();
	}
	
	public static String validateName(Scanner scnr) {
		String name;
		boolean cont = true;
		do {
			System.out.print("Please enter valid Name: ");
			name = scnr.nextLine();
			if(name.matches("([A-Z][a-z]{1,30})\\s([A-Z][a-z]+)")) {
				System.out.println("Name is valid");
				break;
			}
			else if(name.matches("([A-Z][a-z]{1,30})")) {
				System.out.println("Name is valid");
				break;
			}
			else {
				System.out.println("Sorry, name is not valid");
				continue;
			}
		} while(cont);
		return name;
	}
	
	public static String validateEmail(Scanner scnr) {
		String email;
		boolean cont = true;
		do {
			System.out.print("Please enter valid Email: ");
			email = scnr.nextLine();
			if(email.matches("([a-z]*[0-9]*{5,30})@([a-z]*[0-9]*{5,10})\\.([a-z]*[0-9]*{2,3})")) {
				System.out.println("Email is valid");
				break;
			}
			else {
				System.out.println("Sorry, email is not valid");
				continue;
			}
		} while(cont);
		return email;
	}
	
	public static String validatePhoneNumber(Scanner scnr) {
		String phone;
		boolean cont = true;
		do {
			System.out.print("Please enter valid Phone Number: ");
			phone = scnr.nextLine();
			if(phone.matches("([0-9]*{3})-([0-9]*{3})-([0-9]*{4})")) {
				System.out.println("Phone Number is valid");
				break;
			}
			else {
				System.out.println("Sorry, phone is not valid");
				continue;
			}
		} while(cont);
		return phone;
	}
	
	public static String validateDate(Scanner scnr) {
		String date;
		boolean cont = true;
		do {
			System.out.print("Please enter valid Date: ");
			date = scnr.nextLine();
			if(date.matches("([0-9]{2})/([0-9]{2})/([0-9]{4})")) {
				System.out.println("Date is valid");
				break;
			}
			else {
				System.out.println("Sorry, date is not valid");
				continue;
			}
		} while(cont);
		return date;
	}
	
	public static String validateHTML(Scanner scnr) {
		String html;
		boolean cont = true;
		do {
			System.out.print("Please enter valid HTML: ");
			html = scnr.nextLine();
			if(html.matches("(<[a-z]>)([A-z]*[0-9]*)(</[a-z]>)")) {
				System.out.println("HTML is valid");
				break;
			}
			else {
				System.out.println("Sorry, HTML is not valid");
				continue;
			}
		} while(cont);
		return html;
	}

}
