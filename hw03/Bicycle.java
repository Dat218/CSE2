///////////////////
//Daniel Truong
//September 15, 2014 
//CSE002
//
//  define a class
import java.util.Scanner;//import
import java.text.DecimalFormat;
public class Bicycle {
    
//main method required for every java program
  public static void main(String[] args) {
       DecimalFormat d = new DecimalFormat("0.##");
       Scanner myScanner;
       myScanner = new Scanner( System.in );
       System.out.print(
         "Enter the number of seconds: ");
       int nSeconds = myScanner.nextInt();
       System.out.print(
         "Enter the number of counts: ");
       double nCounts = myScanner.nextDouble();
       double wheelDiameter=27,
       PI=3.14159,
       feetPerMile=5280,
       inchesPerFoot=12,
       secondsPerMinute=60;
       double minutesPerHour=60*secondsPerMinute;
       double totalTime=nSeconds/secondsPerMinute;
       double distanceOfTrip=nCounts*wheelDiameter*PI;
       double distanceOfTripInMiles=distanceOfTrip/inchesPerFoot/feetPerMile;
       double totalTimeInHours=nSeconds/minutesPerHour;
       
       System.out.println(
         "The total distance was " +d.format(distanceOfTripInMiles)+ " and took " +(nSeconds/secondsPerMinute)+ " minutes.");
       System.out.println(
         "The average mph was " +d.format((distanceOfTripInMiles)/(totalTimeInHours)));
       
   }
}