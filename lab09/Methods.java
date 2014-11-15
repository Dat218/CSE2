/////////////////////////////////////
//Daniel Truong
//
//define a class
import java.util.Scanner;
public class Methods {
//main method required for every class
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
     int a=getInt(scan);
     int b=getInt(scan);
     int c=getInt(scan);
     System.out.println("The larger of "+a+" and "+b+" is "+larger(a,b));
     System.out.println("The larger of "+a+", "+b+", and "+c+
                                    " is "+larger(a,larger(b,c)));
     System.out.println("It is "+ascending(a,b,c)+" that "+a+", "+b+
                                   ", and "+c+" are in ascending order");
  }
    public static int getInt(Scanner scan) {    
        System.out.print("Enter an int: ");
            while (true) {
                if (scan.hasNextInt()) {
                    return scan.nextInt();
                }
                else {
                    System.out.print("You did not enter an int; try again- ");
                    scan.next();
                }
            }

    }  
    
    public static int larger(int a, int b) {
        if (a>b) {
            return a;
        }
        else {
            return b;      
        }
    }        
    
    public static boolean ascending(int a, int b, int c) { 
        if (c>b && b>a) {
            return true;
        }
        else {
            return false;
        }
    }
  
}