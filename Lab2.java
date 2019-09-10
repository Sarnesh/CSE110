/*-------------------------------------------------------------
// AUTHOR: Sarnesh Arulnathan
// FILENAME: LAB2.java
// SPECIFICATION: Takes name of client, returns name in capital letters and length of name, and a string comparision
// FOR: CSE 110 - Lab #2
// TIME SPENT: 20 minutes
//-----------------------------------------------------------*/
import java.util.Scanner;
public class Lab2 {
    public static void main(String[] args) {
        String firstName = "";
        String lastName = "";
        String fullName = "";
        int nameLength = 0;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("What is your first name:");
        firstName = scan.nextLine();
        System.out.println("What is your last name:");
        lastName = scan.nextLine();
        
        fullName = firstName + " " + lastName;
        fullName = fullName.toUpperCase();
        System.out.println(fullName);
        
        nameLength = fullName.length();
        System.out.println("Length of full name:" + " " + nameLength);
        
        String title1 = new String("cse110");
        String title2 = "cse110";
        if ( title1 == title2 ) {
            System.out.println("String comparison using '==' works");
        } else {
            System.out.println("String comparison using '==' does not work");
        }
        if ( title1.equals(title2) ) {
            System.out.println("String comparison using '==' works");
        } else {
            System.out.println("String comparison using '==' does not work");
        }
    }
}
