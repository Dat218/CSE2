///////////////////////////////
//Daniel Truong
//CSE 002
//November 4, 2014
//
//  We will be implementing a nested seqence of methods in this program
//  This code will ask the user to inper an INT that is within the range of 1 and 9
//  and then it will output a number stack based on the input the user entered. 
//
//  first compile the program javac BlockedAgain.java
//  then run the program java BlockedAgain
//define a class
import java.util.Scanner;
public class BlockedAgain{
//main method required for every class
  public static void main(String []s){
    int m;
    //force user to enter int in range 1-9, inclusive.
    m = getInt(); 
    allBlocks(m);
  }
  
  public static int getInt() {
    System.out.print("Enter an in int between 1 and 9, inclusive: ");
    int number = checkInt(); //This will automatically check to see if the value user entered is an int
    while (checkRange(number)==false) {
      System.out.print("YOU DID NOT ENTER AN INT BETWEEN [1,9], TRY AGAIN: ");
      number = checkInt(); //If int is not between 1 and 9, this will ask user to try again
    }
    return number; //stores user input as m
  }
      public static int checkInt() { //first nested method for getInt()
        Scanner scan = new Scanner(System.in); //declaration and construction
        int userInput;
          while (!scan.hasNextInt()) {
            System.out.print("YOU DID ENTER AN INT, TRY AGAIN ");
            scan.next();
          } //This while will make sure that the user enters an int
      userInput = scan.nextInt(); //stores user input as this variable so we can return the value at the next line
      return userInput; 
      }
      public static boolean checkRange(int number) {//Second nested method for getInt()
          if (number>0 && number<10) {
            return true;
          }
          else {
            return false;
          }
      } //Checks to see if user input is within range or not
    
  public static void allBlocks(int m) { 
    block(m); //calling method
  }
      public static void block(int m) { 
          int i;
          for (i=1; i<=m; i++) { //This provides the amount of blocks code will output and column number
            line(i,m); //calling method
          }
      }
      public static void line(int i,int m)  {
          for (int h=0; h<i; h++) {
              for (int l=m; l>i; l--) {
                    System.out.print(" "); //ensures correct spacing for numberstack
              } 
              for (int j=0; j<i+(i-1); j++) {
                    System.out.print((i)); //prints the digit on the line
              } 
                    System.out.println(""); 
          }    
              for (int l=m; l>i; l--) {
                    System.out.print(" "); //ensures correct spacing for numberstack
              }
              for (int j=0; j<i+(i-1); j++) {
                    System.out.print("-"); //outputs correct number of hyphons per line
              } 
                    System.out.println("");
      }
 }

    