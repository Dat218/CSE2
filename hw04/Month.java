/////////////////////////////////
//Daniel Truong
//CSE002
//September 23,2014
//
//  When a user enters a number of a 
//  month in this program, the number
//  of days in this month will be 
//  automatically outputted
//
//  first compule the program javac Month.java
//  then run the program java Month
//define public class
import java.util.Scanner; //import
public class Month {
    
//main method required for every program
  public static void main(String[] args) {
      
  Scanner myScanner; //declare
  myScanner = new Scanner( System.in ); //construct
  
  System.out.print(
    "Enter an int giving the number of the month (1-12)- "); //Where user will input a number between 1-12 which represents each 12 months
  if (myScanner.hasNextInt()) {
  int nMonth = myScanner.nextInt();
  
    if (nMonth == 1) {
    System.out.println("The month has 31 days.");   
    } // January has 31 days
  
    if (nMonth == 3) {
      System.out.println("The month has 31 days."); 
    } //March has 31 days
  
    if (nMonth == 4) {    
      System.out.println("The month has 30 days.");
    } //April has 30 days
  
    if (nMonth == 5) {
      System.out.println("The month has 31 days.");
    } //May has 31 days
  
    if (nMonth == 6) {
      System.out.println("The month has 30 days.");
    } //June has 30 days
  
    if (nMonth == 7) {
      System.out.println("The month has 31 days.");
    } //July has 31 days
  
    if (nMonth == 8) {
      System.out.println("The month has 31 days.");
    } //August has 31 days
  
    if (nMonth == 9) {
      System.out.println("The month has 30 days.");
    } //September has 30 days
  
    if (nMonth == 10) {
      System.out.println("The month has 31 days.");
    } //October has 31 days
  
    if (nMonth == 11) {
      System.out.println("The month has 30 days.");
    } //November has 30 days
  
    if (nMonth == 12) {
      System.out.println("The month has 31 days.");
    } //December has 31 days
  
    if (nMonth == 2) {
      System.out.print("Enter an int giving the year ");
      int nYear = myScanner.nextInt();
        if (nYear >= 0 && nYear%100==0 && nYear%400==0) {
              System.out.println("This is a leap year. February has 29 days.");
        } //if a leap year is inputted
       else {
           System.out.println("This is not a leap year. February now has 28 days.");
       } //If a leap year is not inputted
    }    
  }
    else {
      System.out.println("You did not enter an int");
    } //Making sure only an int is inputted
  } //end of main
} //end of class