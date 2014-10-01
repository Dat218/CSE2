//////////////////////////
//Daniel Truong
//CSE 002
//September 30, 2014
//
//  This program will automatically generate a
//  statement consisting of 3 booleans and 2 operators
//  User will be asked to imput t or f for whether the 
//  statement is true or not and the program will automatically
//  output whether the user is correct or not.
//  
//  first compile the program javac BoolaBoola.java
//  then run the program java BoolaBoola
//
//define a class
import java.util.Scanner; //import
import java.util.Random; //import
public class BoolaBoola { 
//main method required for every program
  public static void main(String[] args) {
      
    Scanner myScanner; //declare
    myScanner = new Scanner( System.in ); //construct
    boolean first;
    String operator1;
    boolean second;
    String operator2;
    boolean third;
    // declaring each of these five variables so it can be used later on in the program
    Random generator = new Random(); //declaring and constucing the number generator
    int randomNumber = generator.nextInt(10)+1;
        if (randomNumber >5) {
            first = true;
            System.out.print("Does " +first);
        }
        else {
            first = false;
            System.out.print("Does " +first);
        } 
    //This will automatically generate the first boolean statement 
    randomNumber = generator.nextInt(10)+1;
        if (randomNumber > 5) {
            operator1 = "&&";
            System.out.print(" " +operator1);
        }
        else {
            operator1 = "||";
            System.out.print(" " +operator1); 
        }
    //This will automatically generator the first operator
    randomNumber = generator.nextInt(10)+1;
        if (randomNumber > 5) {
            second = true;
            System.out.print(" " +second);
        }
        else {
            second = false ;
            System.out.print(" " +second);
        }
    //This will automatically generate the second boolean statement
    randomNumber = generator.nextInt(10)+1;
        if (randomNumber > 5) {
            operator2 = "&&";
            System.out.print(" " +operator2);
        }
        else {
            operator2 = "||";
            System.out.print(" " +operator2);
        }
    //This will automatically generate the second operator
    randomNumber = generator.nextInt(10)+1;
        if (randomNumber >5) {
            third = true;
            System.out.print(" " +third);
        }
        else {
            third = false;
            System.out.print(" " +third);
        }
    //This will automatically generate the third operator
    System.out.print(" have the value true(t/T) or false(f/F)? ");
         String input = myScanner.next(); //asking user to input t or f 
         if(input.equalsIgnoreCase("t")) {
           boolean userBool = true; //declaring variable
           boolean compAnswer; //declaring the variable
           
            if(operator1.equals("&&") && operator2.equals("&&")) {
                compAnswer = first && second && third; 
                if (compAnswer = userBool) {
                    System.out.println("Correct.");
                }
                else {
                    System.out.println("Wrong; try again.");
                } 
            } //This is the answer if the compAnswer follows the format of first && second && third and user inputs t
            if(operator1.equals("&&") && operator2.equals("||")) {
                compAnswer = first && second || third;
                if (compAnswer = userBool) {
                    System.out.println("Correct");
                }
                else {
                    System.out.println("Wrong; try again");
                } 
            } //This is the answer if the compAnswer follows the format of first && second || third and user inputs t
            if(operator1.equals("||") && operator2.equals("&&")) {
                compAnswer = first || second && third;
                if (compAnswer = userBool) {
                    System.out.println("Correct");
                }
                else {
                    System.out.println("Wrong; try again");
                }
            } //This is the answer if the compAnswer follows the format of first || second && third and user inputs t
            if(operator1.equals("||") && operator2.equals("||")) {
                compAnswer = first || second || third;
                if (compAnswer = userBool) {
                    System.out.println("Correct");
                }
                else {
                    System.out.println("Wrong; try again");
                }  
            }  //This is the answer if the compAnswer follows the format of first || second || third and user inputs t
         } //end of if statement if the user inputs t
         
        if(input.equalsIgnoreCase("f")) {
           boolean userBool = false;
           boolean compAnswer;
           //declaring variables
            if(operator1.equals("&&") && operator2.equals("&&")) {
                compAnswer = first && second && third; 
                if (compAnswer = userBool) {
                    System.out.println("Correct.");
                } 
                else {
                    System.out.println("Wrong; try again.");
                }
            }//This is the answer if the compAnswer follows the format of first && second && third and user inputs f
            if(operator1.equals("&&") && operator2.equals("||")) {
                compAnswer = first && second || third;
                if (compAnswer = userBool) {
                    System.out.println("Correct");
                }
                else {
                    System.out.println("Wrong; try again");
                }
            }//This is the answer if the compAnswer follows the format of first && second || third and user inputs f
            if(operator1.equals("||") && operator2.equals("&&")) {
                compAnswer = first || second && third;
                if (compAnswer = userBool) {
                    System.out.println("Correct");
                }
                else {
                    System.out.println("Wrong; try again");
                }
            } //This is the answer if the compAnswer follows the format of first || second && third and user inputs f
            if(operator1.equals("||") && operator2.equals("||")) {
                compAnswer = first || second || third;
                if (compAnswer = userBool) {
                    System.out.println("Correct");
                }
                else {
                    System.out.println("Wrong; try again");
                }    
            } //This is the answer if the compAnswer follows the format of first || second || third and user inputs f
         } //end of this scenario if user inputs f
  } //end of main
} //end of class