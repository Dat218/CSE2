////////////////////////////////////////////////////
//Daniel Truong
//CSE 002
//October 28,2014
//
//  We will be practicing methods in this homework assignment
//
//  first compile the program javac HW8.java
//  then run the program java HW8
//
import java.util.Scanner;
public class HW8{
  public static void main(String []arg){
	char input;
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
	input=getInput(scan,"Cc");
	System.out.println("You entered '"+input+"'");
	System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
	input=getInput(scan,"yYnN",5); //give up after 5 attempts
	if(input!=' '){
  	System.out.println("You entered '"+input+"'");
	}
	input=getInput(scan,"Choose a digit.","0123456789");
	System.out.println("You entered '"+input+"'");
  }  
  
    public static char getInput(Scanner scan, String compareCc) { //Method for the first getInput
        String userInput;
        while (true) {
            userInput = scan.next(); //represents what user will input
            if (userInput.length()==1) { //input must be only one character
                for (int i=0; i<compareCc.length(); i++) { //Loop allows program to compare user input to C and c
                    if (userInput.equals(""+compareCc.charAt(i))) { //Converting char to String to compare the two character. 
                        return compareCc.charAt(i); //Value gets substituted for getInput
                    } 
                } 
                System.out.print("You did not enter a character from the list 'Cc'; try again- "); //user did not enter C or c. Cannot move on
            }
            else {
                System.out.print("You should enter exactly one character- "); //user entered more than one character
            }
        }
    }
    
    public static char getInput(Scanner scan, String compareyYnN, int maxAttempts) { //Method for second getInput
        String userInput;
        for (int j=0; j<maxAttempts; j++) { //This only gives user 5 tries
            userInput = scan.next(); //user input
            if (userInput.length()==1) { //ensures that user input is only one character long
                for (int i=0; i<compareyYnN.length(); i++) { //This will make sure that user input will be compared to n, N, y, and Y.
                    if (userInput.equals(""+compareyYnN.charAt(i))) { //convert char to string so two characters can be compared
                        return compareyYnN.charAt(i); //return character if n, N, y, or Y was entered
                    }
                } 
                System.out.print("You did not enter a character from the list 'yYnN'; try again- "); //user did not enter any of these characters
            }
            else {
                System.out.println("Enter only one character, try again.- "); //user entered more than one digit
            }
        } 
        System.out.println("");
        System.out.println("You failed after 5 tries.");
        return ' ';
    }
    
    public static char getInput(Scanner scan, String chooseADigit, String compareNumbers) { //Method for third getInput
        System.out.print(chooseADigit+"- "); 
        String userInput;
        while (true) {
            userInput = scan.next(); //user input
            if (userInput.length()==1) { //ensures that only one digit is entered
                for (int i=0; i<compareNumbers.length(); i++) { //compares user digit to all 10 digits separately
                    if (userInput.equals(""+compareNumbers.charAt(i))) { //convertion from char to string in order to compare two values 
                        return compareNumbers.charAt(i); //Substitutes the user input for getInput
                    }
                }
                System.out.print("Please enter a digit. Try again- "); //User did not enter a digit
            }
            else {
                System.out.print("Please enter only one character. Try again- "); //user entered more than one character
            }
        }
    }
}