/////////////////////////////////////
//Daniel Truong
//
//define a class
import java.text.DecimalFormat;
import java.util.Scanner;
public class FourDigits {
    
//main method required for every java program
  public static void main(String[] args) {
      DecimalFormat d = new DecimalFormat("0000");
      Scanner myScanner;
      myScanner = new Scanner( System.in );
      System.out.println(
        "Enter a double and I display the four digits to the right of the decimal point- ");
      double number = myScanner.nextDouble();
      int y;
      y = (int)number;
      double decimal=number-y;
      double finalNumber=10000*(number-y);
      int theRealFinalAnswer;
      theRealFinalAnswer = (int)finalNumber;
      System.out.println(
        "The last four digits are " + theRealFinalAnswer);
      System.out.println(
        "The last four digits are " +d.format(finalNumber)+
        " and was found using decimal format.");
  }
}