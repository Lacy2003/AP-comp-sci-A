import java.util.Scanner;
public class EmailAddress {

	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	System.out.println("What is your first name?"); 
	String firstName = keyboard.nextLine();
	System.out.println("What is your middle name?");
	String middleName = keyboard.nextLine();
	System.out.println("What is your last name?");
	String lastName = keyboard.nextLine();
	System.out.println("What is your birthday (mm-dd-yyyy) (please do not add slashes, type it raw)?");
	String birthday = keyboard.nextLine();
	String a = lastName.toLowerCase() + firstName.substring(0,1).toUpperCase();
	String b = middleName.substring(0,1).toUpperCase(); 
	String c = (a + b);
	String w = birthday;
	System.out.println("Your email is: " + c + "@sharkmail.com" );
	System.out.println("Your temporary password is " + w);
	System.out.println("your temporary password is very insecure. Change ASAP please!");
	keyboard.close();

	}

}
