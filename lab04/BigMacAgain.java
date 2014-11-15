/////////////////////////
//Daniel Truong
//September 19, 2014
//CSE 002 Lab 04
//
//define a class
import java.util.Scanner;
import java.text.DecimalFormat;
public class BigMacAgain {
    
//main method required for every java program
  public static void main(String[] args) {
    
  Scanner myScanner; //declare
  myScanner = new Scanner( System.in ); //construct
  DecimalFormat d = new DecimalFormat("##.##"); //declaration and construction
  
  System.out.print("Enter the number of Big Macs: ");
  if(myScanner.hasNextInt()) {  //ensures that user inputs digit
    int nBigMacs = myScanner.nextInt();
      if (nBigMacs >= 0) {
        System.out.println("You ordered " +nBigMacs+
        " for a cost of " +nBigMacs+ "x2.22 = " 
        +d.format(nBigMacs*2.22));
      }  //Calculates cost of big mac
      else { 
        System.out.println("It is impossible to order a negative number of Big Macs.");
      return;
      } //Can not enter a negative number
    System.out.print("Do you want an order of fries (Y/y/N/n)? ");  //Asks user wheter or not they want fries, use must enter one of the following variables
      String answer=myScanner.next(); 
      if (answer.equals("Y") || answer.equals("y")) {
        System.out.println("You ordered fries at a cost of $2.15");
        System.out.println("The total cost of the meal is $" +d.format((nBigMacs*2.22)+2.13));
      }  //Calculates total cost if user wants fries
      else if (answer.equals("N") || answer.equals("n")) {
      System.out.println("The total cost of the meal is $" +d.format(nBigMacs*2.22));
      }  //calculates total cost if user does not want fries
        else {
          System.out.println("You did not enter one of 'y', 'Y', 'N', 'n'");
        } //result of user does not enter one of the following variables
  }
          else{
           System.out.println("You did not enter an int!");
          return;
          }
  } //end of main method
} //end of class
