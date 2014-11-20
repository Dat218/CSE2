/* The user is supposed to enter a number between 0 and 99.
 * The program interprets that as a percentage, converts it to
 * a prorportion and then displays the proportion (out of 1) 
 * remaining. It does not always work. Find out when it doesn't
 */
import java.text.DecimalFormat;
import java.util.Scanner;
public class Enigma1{
  public static void main(String []arg){
    DecimalFormat d = new DecimalFormat("0.##");
    double percent;
    System.out.print("Enter a value for the percent (0, 1,...99)- ");
    double x=((new Scanner(System.in)).nextDouble());
   System.out.println("You entered "+x+"%");
   //print out the proportion remaining for select percentages
   if(100-x==93)  //when the user enters 7 
      System.out.println("The proportion remaining is "+0.93);
    else if(100-x==59)//when the user enters 41
      System.out.println("The proportion remaining is "+0.59);
    else if(100-x==86)//when the user enters 14
      System.out.println("The proportion remaining is "+0.86);
    else if(100-x==67)//when the user enters 33
      System.out.println("The proportion remaining is "+0.67);
    else if(100-x==40)//when the user enters 60
      System.out.println("The proportion remaining is "+0.40);
    else {
      System.out.println("The proportion remaining is "+d.format(1-x/100));
    }
  }
}

/* Error report: 
 *    (Exlain the error(s) that occur here, in this comment,
 *    and fix the errors)
 *    Hint: What kinds of input are unacceptable? What kinds of
 *        acceptable input don't produce the correct answer?
 * 
 *    Any integar can be inputed, even integars beyond the range
 *    Each integar gets automatically converted to a percentage and is then printed
 *    Currently, one 7, 41, 14, 33, and 60 are being converted to a proportion
 *    But only the proportion for 14 and 60 are being outputted
 *    This is because when you plug in the other numbers into the equation(1-x/100), it is not a decimal rounded to two places
 *    For example, 7 becomes .9222222229 when plugged in, which does not equal .93
 *    To fix this, I simplified the formula to 100-x==number.
 *    I also added an else statement to output a proportion for every other number
 *    DecimalFormat was imported to round number to the hundredth digit for the excluded numbers
 */

