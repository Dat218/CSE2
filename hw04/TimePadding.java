/////////////////////////
//Daniel Truong
//CSE002
//September 23,2014
//
//  This program will automatically 
//  convert seconds into hours, minutes, and seconds.
//  
//  first compile the program javac TimePadding.java
//  then run the program java TimePadding
//
//define a class
import java.util.Scanner; //import
import java.text.DecimalFormat; //import
public class TimePadding {
    
//main method required for every program
  public static void main(String[] args) {
    
  Scanner myScanner; //declare
  myScanner = new Scanner( System.in ); //construct
  DecimalFormat d = new DecimalFormat("00"); //declare & construct
  
  System.out.print("Enter the time in seconds "); //where user has to input random amount of seconds. 
  if (myScanner.hasNextInt()) { 
  int nSeconds = myScanner.nextInt(); 
  
      if (nSeconds <0) {
        System.out.println(
          "Seconds are not negative unless you can travel back in time."); 
      } //negative numbers will not work in this program
      
      if (nSeconds >=0 && nSeconds < 60) {
        System.out.println("The time is 0:00:" +nSeconds);
      } //This will show up when the number entered by user is <60 becuase it isn't a whole minute
    
      int nMinutes = nSeconds/60;
      int nRemainingSeconds = nSeconds%60;
      if (nSeconds >=60 && nSeconds <3600) {
        System.out.println("The time is 0:" +nMinutes+ ":" +d.format(nRemainingSeconds));
      } //This will be outputted when number entered is larger than 60 and less than 3600 the seconds inputted has not reached an hour, as a result only needing the minute and second unit.
      
      int nHours = nSeconds/3600;
      if (nSeconds >= 3600) {
        System.out.println("The time is " +nHours+ ":" +d.format(nMinutes-(nHours*60))+ ":" +d.format(nRemainingSeconds));
      } //outputted when hours, minutes and seconds unit are needed when numbe entered is greater than 3600 (which equals one hour).
  }
    else {
      System.out.println(
     "You did not enter an int"); 
    } //number must be an int!
    
  } //end of main
} //end of class