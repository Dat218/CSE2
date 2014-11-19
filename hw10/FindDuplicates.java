//Daniel Truong
//CSE 002
//November 18, 2014
//
//  In this homework assignment, we will be writing a code 
//  that asks the user to enter 10 random integers.
//  The program will automatically determine whether or not the 
//  ten integers entered by the user has any duplicates or not.
//  Then it will determine if there is EXACTLY one duplicate
//  We will be practicing arrays and calling arrays in different  methods
//
//  first compile the program javac FindDuplicates.java.
//  then run the program java FindDuplicates.
//import
import java.util.Scanner;
//define a class
public class FindDuplicates{
//main method required for every program
  public static void main(String [] arg){
    Scanner scan=new Scanner(System.in);
    int num[]=new int[10];
    String answer="";
    do{
      System.out.print("Enter 10 ints- ");
      for(int j=0;j<10;j++){
        num[j]=scan.nextInt();
      }
      String out="The array "; //Used for final output
      out+=listArray(num); //return a string of the form "{2, 3, -9}"   
      if(hasDups(num)){ //Determines if there are duplicates in the 10 digits entered by user. 
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="duplicates.";
      System.out.println(out);
      out="The array ";
      out+=listArray(num);    
      if(exactlyOneDup(num)){ //Determines whether or not there will be EXACTLy one duplicate
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="exactly one duplicate.";
      System.out.println(out);
System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
      answer=scan.next();
    }while(answer.equals("Y") || answer.equals("y"));  //If user enters y or Y, program will run again.
  }

    public static String listArray(int num[]){ //Method that allows for an array to be outputed with curly braces that includes the user's 10 integars separated by commas.
        String out="{";
        for(int j=0;j<num.length;j++){
        if(j>0){
          out+=", ";
        }
        out+=num[j];
      }
      out+="} ";
      return out;
    }
  
    public static boolean hasDups(int[] num) {
        for (int i=0; i<num.length; i++) { //Used to compare first number to second
            for (int j=1+i; j<num.length; j++) { //Used to compare second number to first
                if (num[i] == num[j]) { 
                    return true; //Returns if there are any duplicates
                }
                else {
                    continue;
                }
            }
        }
    return false; //Returns if there are no duplicates
    }
    
    public static boolean exactlyOneDup(int[] num) {
        int totalDuplicates = 0; //Ensures that there is only exactly one duplicate
        for (int i=0; i<num.length; i++) { //Comparing first number
            for (int j=1+i; j<num.length; j++) { //Comparing second number
                if (num[i] == num[j]) {
                    totalDuplicates += 1; //Tallies number of duplicates
                }
                else {
                  continue; 
                }
            }
        }
        if (totalDuplicates > 1 || totalDuplicates <1) {
          return false; //More or less than one dupe
        }
        else {
          return true; //Only exactly one dupe
        }
    } 
}
