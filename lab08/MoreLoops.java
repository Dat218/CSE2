////////////////////////////
//Daniel Truong
//
//
//define a class
import java.util.Scanner;
public class MoreLoops {
//main method required for every program
  public static void main(String[] args) {
    Scanner myScanner = new Scanner( System.in );
    int n = 0;
    // System.out.print("Enter an int- ");
    // while(!scan.hasNextInt()) {
    //     scan.next(); //get rid of the junk entered by user
    //     System.out.print("You did not enter an int; try again- ");
    // }
    System.out.print("Enter an int- ");
        myScanner.next();   
    do {
        System.out.print("You did not enter an int; try again- ");
    } while(!myScanner.hasNextInt());
    
    // n = myScanner.nextInt();
    // for (int j=0; j<n && j<40; j++) {
    //     for (int k=0; k<j+1; k++) {
    //         System.out.print("*");
    //     }
    // }
    n = myScanner.nextInt();
    // int j = 0;
    // while (j<n && j<40) {
    //   int k = 0;
    //     while(k<j) {
    //       System.out.print("*");
    //       k++;
    //     }
    //   j++;  
    // }
    // System.out.println("");
    
    // int k = 4;
    // do {
    //   System.out.println("k = " +k);
    //   k++;
    // } while(k<4);
    // int k = 4;
    // while (k<4) {
    //   System.out.println("K = " +k);
    //   k++;
    // }
    
    int count = 0;
    while(true) {
      switch(n) {
        default: System.out.println(n+ " is >5 or <1");
          break;
        case 1: 
        case 2: System.out.println("Case 2 ");
          continue;
        case 3: break;
        case 4: System.out.println("Case 4 ");
        case 5: System.out.println("Case 5 ");
          break;
      }
      count++;
      if (count>10)
        break;
    }
    
  }    
}