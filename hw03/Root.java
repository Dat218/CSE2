///////////////////////////////////
//Daniel Truong
//
//define a class
import java.util.Scanner;
public class Root {
    
//main method required for every java program 
  public static void main(String[] args) {
      Scanner myScanner;
      myScanner = new Scanner( System.in );
      System.out.print(
        "Enter a double and I print its cube root- ");
      double X = myScanner.nextDouble();
      double guess=X/3;
      double guess1=((2*guess*guess*guess+X)/(3*guess*guess));
      double guess2=((2*guess1*guess1*guess1+X)/(3*guess1*guess1));
      double guess3=((2*guess2*guess2*guess2+X)/(3*guess2*guess2));
      double guess4=((2*guess3*guess3*guess3+X)/(3*guess3*guess3));
      double guess5=((2*guess4*guess4*guess4+X)/(3*guess4*guess4));
      System.out.println(
        "The cube root is " +guess5);
      System.out.println(
        (guess5)+"*"+(guess5)+"*"+(guess5)+"=");
      System.out.println(
        guess5*guess5*guess5);
  }
}