/**
 * Author: Emily Moss
 * Date: Sep 22,2020
 * Description:Email Address unit 1 project
/*
 * 
 */
import java.util.Scanner;
public class EmailAddressJava {
public static void main(String[] args) {
Scanner keyboard = new Scanner(System.in);
System.out.println("What is your name? ");
String name = keyboard.nextLine();
System.out.println("What is your middle name?");
String middle = keyboard.nextLine();
System.out.println("What is your last name?");
String last= keyboard.nextLine();
System.out.println("Hello " + name + " " + middle + " " + last + "!");
System.out.println("Please write your birthdate in mm-dd-yyyy format.");
String bday = keyboard.nextLine();
System.out.println("Email: " + last.toLowerCase() + name.substring(0,1).toUpperCase() + middle.substring(0,1).toUpperCase() + "@sharkmail.com");
System.out.println("Temp Password: " + bday.substring(0,2) + bday.substring(3,5) + bday.substring(6,10));
System.out.println("*** This temporary password is very insecure. Please change it immediately! ***");
keyboard.close();
}

}