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
     System.out.println("It is "+ascending(a,b,c)+" that "+a+", "+b+
                                   ", and "+c+" are in ascending order");
  }
    public static int getInt(Scanner scan) {    
            return scan.nextInt();
    }  
    
    public static int larger(int a, int b) {
        if (a>b) {
            return a;
        }
        else {
            return b;      
        }
    }        
    
        // System.out.println("The larger of "+a+", "+b+", and "+c+
        //               " is "+larger(a,larger(b,c)));
    
    public static boolean ascending(int a, int b, int c) { 
        if (c>b && b>a) {
            return true;
        }
        else {
            return false;
        }
    }
  
}