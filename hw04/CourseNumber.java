/////////////////////////////
//Daniel Truong
//CSE002
//September 23,2014
//
//  This program will tell the user
//  which year and semeter the certain
//  course took place if user enters a 6 digit
//  number that is between 186510 & 201440 and ends
//  with 10, 20, 30 or 40.
//
//  first compile the program javac CourseNumber.java
//  then run program java CourseNumber
//
//define a class
import java.util.Scanner; //import
public class CourseNumber {

//main method required for every program
  public static void main(String[] args) {
      
  Scanner myScanner; //declare 
  myScanner = new Scanner( System.in ); //construct
  
  System.out.print("Enter a six digit number giving the course semester- ");
  if (myScanner.hasNextInt()) { //ensures that integar is inputted
  int nCourseNumber = myScanner.nextInt();
  int semester = nCourseNumber%100; //this will isolate the last two digits, giving us the semester
  int nYear = nCourseNumber/100; //this will isolate the first four digits, giving us the year
    
    if (nCourseNumber >= 186510 && nCourseNumber  <=201440) {
      if (semester == 40) {
        System.out.println("The course was offered in the Fall semester of " +nYear); //determining fall semester and year
      } //determining fall semester and year
      if (semester == 10) {
        System.out.println("The course was offered in the Spring semeser of " +nYear); 
      } //determining spring semester and year
      if (semester == 20) {
        System.out.println("The course was offered in the Summer 1 semester of " + nYear); 
      } //determining summer 1 semester and year
      if (semester == 30) {
        System.out.println("The course was offered in the Summer 2 semester of " + nYear);
      } //determing summer 2 semester and year
      else {
        System.out.println(semester+ " is not a legitmate semester.");
      } //making sure user inputs a course number ending in eith 10, 20, 30, or 40
    }    
      else {
           System.out.println("This course was outside the range [186510,201440]");
      } //ensuring that a course number within this range is inputted
  }
    else {
     System.out.println("You did not enter an int");
    } //course number MUST be an int!
    
  } //end of main
} //end of class