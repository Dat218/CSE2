/////////////////////////////////////
//Daniel Truong
//CSE002
//September 16,2014
//
//  When user enters a double with multiple decimal
//  places, this program will automatically list 
//  the first four digits to the right of the 
//  decimal place.
//
//  first compile the program javac FourDigits.java
//  then run the program java FourDigits
//
//define a class
import java.util.Scanner; //import
import java.text.DecimalFormat; //import
public class FourDigits {
    
//main method required for every java program
  public static void main(String[] args) {
      
      DecimalFormat d = new DecimalFormat("0000"); //declare and construct
      Scanner myScanner; //declare
      //construct
      myScanner = new Scanner( System.in );
      System.out.println(
        "Enter a double and I display the four digits to the right of the decimal point- ");
      double doubleNumber = myScanner.nextDouble();
      int intNumber;
      intNumber = (int)doubleNumber; //explicit casting
      double decimal=doubleNumber-intNumber; //subtracting the double by int so we will be left with only the decimlas.
      double finalNumber=10000*(doubleNumber-intNumber); //miltiplying final answer by 10000 to move decimals 4 places
      int theRealFinalAnswer;
      theRealFinalAnswer = (int)finalNumber; //explicit casting, setting final answer as integar to get rid of remaing decimals if any.
      System.out.println(
        "The first four digits to the right of the decimal points are " + d.format(theRealFinalAnswer) + ".");
  } //end of main
} //end of class