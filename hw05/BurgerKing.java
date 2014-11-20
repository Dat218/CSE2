///////////////////////////
//Daniel Truong
//CSE 002
//September 30, 2014
//
//  This program incorporates switch statements which makes 
//  gives the user three choices of food to choose from. Once 
//  user chooses one of the three options, he/she will be prompted with
//  more options that user can choose from and the program will automatically
//  execute what the user wants. 
//
//  first compile the program javac BurgerKing.java
//  then run the program java BurgerKing
//
//define a class
import java.util.Scanner; //import
public class BurgerKing {
    
//main class required for every 
  public static void main(String[] args) {
      
      Scanner myScanner; //declare
      myScanner = new Scanner( System.in ); //construct
      
      System.out.print("Enter a letter to indicate a choice of burger(b/B), soda(s/S), or fries(f/F) "); 
        String input = myScanner.next(); //asks the user to input the letter of what he or she deisres. 
        if (input.length() > 1) {
            System.out.println("Error: a single characer expected."); //User can only input one letter
            return;
        } //In case user accidentally enters two letters
            switch (input) { //switch statement!!!
                case "B":
                case "b": //situation if one chooses b/B for burger
                    System.out.println("Enter A or a for all the fixins");
                    System.out.println("C or c for cheese");
                    System.out.print("N or n for none of the above: ");
                        String burgerInput = myScanner.next(); //This is what the user can get with his/her burger once they input b or B
                        switch (burgerInput) {
                            case "A": System.out.println("You ordered a burger with all the fixins.");
                                break;
                            case "a": System.out.println("You ordered a burger with all the fixins.");
                                break;
                            case "C": System.out.println("You ordered a cheeseburger.");
                                break;
                            case "c": System.out.println("You ordered a cheeseburger.");
                                break;
                            case "N": System.out.println("You ordered a plain hamburger.");
                                break;
                            case "n": System.out.println("You ordered a plain hamburger.");
                                break;
                            default: System.out.println("Enter one of the correct letters!!!");
                                return;
                        } //this is what happens when the user selects the letter to what he or she wants in his/her hamburger
                    break; 
                case "S":
                case "s": //situation if user chooses s or S for soda
                    System.out.print("Pepsi (p or P), Coke (c or C), Sprite (s or S) or Mountain Dew (M or m): ");
                        String sodaInput = myScanner.next(); //If user inputs s for soda, these are the drink options they can choose from 
                        switch (sodaInput) {    
                            case "P": System.out.println("You ordered Pepsi.");
                                break;
                            case "p": System.out.println("You ordered Pepsi.");
                                break;
                            case "C": System.out.println("You ordered Coke.");
                                break;
                            case "c": System.out.println("You ordered Coke.");
                                break;
                            case "S": System.out.println("You ordered Sprite.");
                                break;
                            case "s": System.out.println("You ordered Sprite.");
                                break;
                            case "M": System.out.println("You ordered Mountain Dew.");
                                break;
                            case "m": System.out.println("You ordered Mountain Dew.");
                                break;
                            default: System.out.println("Enter one of the letters asked in the question!!");
                                return;
                        } //These are all the statements that will be outputted as a response to the users input
                    break;
                case "F":
                case "f": //scenario if user inputs f or F for fries
                    System.out.print("Do you want a large or small order of fries (l,L,s, or S)- "); //User can choose whether they want a large or small order of fries
                        String friesInput = myScanner.next();
                        switch (friesInput) {
                            case "L": System.out.println("You ordered large fries.");
                                break;
                            case "l": System.out.println("You ordered large fries.");
                                break;
                            case "S": System.out.println("You ordered small fries.");
                                break;
                            case "s": System.out.println("You ordered small fries.");
                                break;
                            default: System.out.println("We do not offer any other sizes.");
                                return;
                        } //Statements that will be outputted depending on the variable the user inputs
                    break;
            default: System.out.println("You did not order a burger, soda or fries."); //this is what happens if user inputs the incorrect variable in the beginning
                return;
            } //End of switch 
           
           
  } //end of main
} //end of class