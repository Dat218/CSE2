////////////////////////////
//Daniel Truong
//
//
//define a class
import java.util.Scanner;
public class MoreLoops {
//main method required for every program
  public static void main(String[] args) {
    Scanner scan = new Scanner( System.in );
    int n = 0;
    
    // System.out.print("Enter an int- ");
    // while(!scan.hasNextInt()) {
    // 	scan.next(); //get rid of the junk entered by user
    // 	System.out.print("You did not enter an int; try again- ");
    // }
    
    System.out.print("Enter an int- ");
    if (!scan.hasNextInt()) {
      do {
        System.out.print("You did not enter an int; try again- ");
        scan.next();
      } while(!scan.hasNextInt());
    }  
/////////////////////////////////////////////////////////////
    // n = scan.nextInt();
    // for (int j=0; j<n && j<40; j++) {
    //     for (int k=0; k<j+1; k++) {
    //         System.out.print("*");
    //     }
    // }

    n = scan.nextInt();
    int j = 0;
    while (j<n && j<40) {
      int k = 0;
        while(k<j+1) {
          System.out.print("*");
          k++;
        }
      j++;  
    }
////////////////////////////////////////////////////////////////////
    // int k = 4;
    // do {
    //   System.out.println("k = " +k);
    //   k++;
    // } while(k<4);
    
    int k = 4;
    while (k<5) {
      System.out.println("K = " +k);
      k++;
    }
/////////////////////////////////////////////////////////////////
    // 	int count=0;
    // 	while(true){
    // 	switch(n){
    // 	default: System.out.println(n + " is > 5 or <1");
   	//     break;
    // 	case 1:
    // 	case 2: System.out.print("Case 2 ");
   	//     continue;
    // 	case 3: break;
    // 	case 4: System.out.println("Case 4");
    // 	case 5: System.out.println("Case 5");
   	//     break;
    // 	}
    // 	count++;
    // 	if(count>10)
   	// break;
    // }
    
    if (n>0 && n<6) {  
      for (int count=0; count<11; count++) {
          if (n==1 || n==2) {
            for (int i=0; i<1; i--) {
              System.out.print("Case 2 ");
            }
          }
          if (n==3) {
            System.exit(0);
          }
          if (n==4) {
              System.out.println("Case 4");
              System.out.println("Case 5");
          }
          if (n==5) {
              System.out.println("Case 5");
          }
      }
    }
    else {
      for (int count=0; count<11; count++) {
        System.out.println(n + " is > 5 or <1");
      }
    }
    
  }    
}