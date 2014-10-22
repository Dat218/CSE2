////////////////////////////////////////
//Daniel Truong
//CSE02
//October 21, 2014
//
//  We will be creating a code that will
//  output a number pyramid withing the range
//  of 1 and 9 using the for, while, and do while loop
//
//  first compile the program javac NumberStack.java
//  then run the program NumberStack.java
//
//define a class
import java.util.Scanner; //import
public class NumberStack { 
  //main method required for every class
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in); //declaring and constructing
    System.out.print("Enter a number between 1 and 9: ");
    int inputNumber = input.nextInt(); //input declaration
    String hyphen = "-"; 

    //////////////////////////////////
    ////////////For Loop//////////////
    //////////////////////////////////

System.out.println("FOR Loop");
          if (inputNumber>0 && inputNumber<10) {
              for (int i=1; i<=inputNumber; i++) {
                for (int h=0; h<i; h++) {
                  for (int l=inputNumber; l>i; l--) {
                    System.out.print(" ");
                  } //Proper spacing for number pyramid
                  for (int j=0; j<i+(i-1); j++) {
                    System.out.print((i));
                  } //Prints the correct digit for each row
                  System.out.println(""); //Starts new row to ensure correct number of columns
                } //Makes sure output has correct number of rows and columns
                    for (int p=inputNumber; p>i; p--) {
                    System.out.print(" "); 
                    }  //Includes spaces for hyphons
                    for (int k=0; k<i+(i-1); k++) {
                      System.out.print(hyphen);
                    } //outputs the hyphons to separate numbers
                        System.out.println(""); //Starts new line after hyphons
              } //This for for loop runs the whole loop with every digit from 1-9
          } //User must input a digit between 1 and 9
          
    //////////////////////////////////
    ///////////While Loop/////////////
    //////////////////////////////////

System.out.println("WHILE Loop");
        if (inputNumber>0 && inputNumber<10) {
          int i = 1; //initializing
            while (i<=inputNumber) {
              int h = 0;
                while (h<i) {
                  int l = inputNumber;
                    while (l>i) {
                      System.out.print(" ");
                    l--;
                    } //Outputs the necessary for pyramid based on current number
                  int j = 0;
                    while (j<i+(i-1)) {
                      System.out.print(i);
                    j++;  
                    } //Outputs the correct number of digits for each row and column
                        System.out.println("");
                h++;    
                } //Ensures that a new row will be created whenever necessary
              int p = inputNumber;
                while (p>i) {
                  System.out.print(" ");
                p--;
                } //creates proper spacing to center hyphones in pyramid
              int k = 0;
                while (k<i+(i-1)) {
                  System.out.print(hyphen);
                k++;
                } //outputs proper number of hyphon for each pyramid section
                        System.out.println(""); //Ensures that a new line will be started after hyphons
            i++;    
            } //prevents infinite loop
        } //Input must be between 1 and 9

    //////////////////////////////////
    /////////Do While Loop////////////
    //////////////////////////////////

System.out.println("DO WHILE Loop");
    int i, h, j, l, p, k; //declaring
    if (inputNumber > 0 && inputNumber < 10) {
      i = 1; //initializing
      do {
        h = 0;
        do {
          l = inputNumber; 
          do {
            System.out.print(" ");
            l--;
          } while (l>i); //Proper spacing to center number on pyramid
          j = 0;
          do {
            System.out.print(i);
            j++;
          } while (j<i + (i - 1)); //Outputs the proper digits on the row
                System.out.println(""); //Separate each row with space to create new pyramid
          h++;
        } while (h<i); //Ensures correct number of column and rows for pyramid digits
        p = inputNumber;
        do {
          System.out.print(" ");
          p--;
        } while (p>i); //Proper spacing to center hyphons
        k = 0;
        do {
          System.out.print(hyphen);
          k++;
        } while (k<i + (i - 1)); //This will print out the hyphons to separate the numbers
                System.out.println(""); //Ensures that next loop will begin at a new line
        i++;
      } while (i <= inputNumber); //Cycle through loop again with different value
    } //input must be between 1 and 9
  } //end of main
} //end of class