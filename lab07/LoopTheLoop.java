//////////////////////////////
//Daniel Truong
//
//define a class
import java.util.Scanner;
public class LoopTheLoop {
//main method required for every class
  public static void main(String[] args) {

    // int nStars = 10;
    // for (int n=0; n<nStars; n++) {
    //   System.out.print("*");
    // }
    // System.out.println("");
    
    // for (int m=0; m<nStars; m++) {
    //   if (m>0) {
    //     System.out.println("");
    //   }
    //     for (int b=0; b<=m; b++) {
    //       System.out.print("*");
    //     }
    // }
    // System.out.println("");
    
    
    Scanner myScanner = new Scanner ( System.in );
    System.out.print("Enter an int between 1 and 15- ");
        if (myScanner.hasNextInt()) {
          int input = myScanner.nextInt();
          if(input<=15 && input>0) {
            for (int i=0; i<input; i++) {
              System.out.print("*");
          }
                System.out.println("");

            for(int i=0; i<input; i++) {
              if (i>0) {
                System.out.println("");
              }
              for(int j=0; j<=i; j++) {
                System.out.print("*");
              }
            }
                System.out.println("");
          }
          else {
            System.out.println("Enter a damn integer within the range.");
          }
        }
        else {
          System.out.println("You did not enter an int");
        } //course number MUST be an int!

  }
}