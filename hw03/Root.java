///////////////////////////////////
//Daniel Truong
//CSE002
//September 16,2014
//
//  We are writing a prorgram that will print
//  out a crude cube root value of the 
//  value inputed by user. 
//
//  first compile the program javac Root.java
//  then run the program java Root.
//
//  define a class
import java.util.Scanner; //import
public class Root {
    
//main method required for every java program 
  public static void main(String[] args) {
     
      Scanner myScanner; //decalre
      //construct
      myScanner = new Scanner( System.in );
      System.out.print(
        "Enter a double and I print its cube root- ");
      double X = myScanner.nextDouble();
      double guess=X/3; //first guess
      double guess1=((2*guess*guess*guess+X)/(3*guess*guess)); // substituting our intitial guess into the eqution
      double guess2=((2*guess1*guess1*guess1+X)/(3*guess1*guess1)); //substituting previous guess into formula (1)
      double guess3=((2*guess2*guess2*guess2+X)/(3*guess2*guess2)); //substituting previous guess into formula (2)
      double guess4=((2*guess3*guess3*guess3+X)/(3*guess3*guess3)); //substituting previous guess into formula (3)
      double guess5=((2*guess4*guess4*guess4+X)/(3*guess4*guess4)); //substituting previous guess into formula (4)
      System.out.println(
        "The cube root is " +guess5); // crude cube root estimate of double inputed by user. 
      System.out.println(
        (guess5)+"*"+(guess5)+"*"+(guess5)+"="); //I typed this because I was trying to mirror the example.
      System.out.println(
        guess5*guess5*guess5);
  } //end of main
} //end of class