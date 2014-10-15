/////////////////////////
//Daniel Truong
//CSE 002
//October 14, 2014
//
//  Root.java will automatically calculate the square 
//  root of the value the user inputs. 
//
//  first compile the program javac Root.java
//  then run the program java Root
//
//define a class
import java.util.Scanner; //import
public class Root {
//main method required for every class
  public static void main(String[] args) {
  
    Scanner myScanner; //declare
    myScanner = new Scanner( System.in ); //construct
  
    System.out.print("Enter a double that is greater than 0- ");
    double x = myScanner.nextInt(); //value user inputs
    double low = 0; //left interval
    double high = 1+x; //right interval
    double middle = 0.0;
    double tolerance = .0000001;
    // variable declaration
        while ((tolerance*(1+x)) < (high-low)) { 
        //This loops the code until an accurate square gets calculated. The tolerance*(1+x) prevents the square root form becoming infinite
            middle = ((high+low)/2); //The value inbetween the low and high interval
            if ((middle*middle)>x) {
                high = middle;
            } //If middle is greater than input, then the right interval value (high) will be substituted with the middle value
            else {
                low = middle;
            } //If middle value is less than the user input, then the left interval value (low) will be substituted with the middle value
        }
    System.out.println(middle); //Prints the square root of input
  } //end of main
} //end of clss