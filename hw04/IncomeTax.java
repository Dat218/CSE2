///////////////////////////////
//Daniel Truong
//CSE002
//September 23, 2014
//
//  We are writing a java program
//  that will automatically 
//  calculate the tax one has to pay
//  with a certain income. 
//
//  first compile the program javac IncomeTax.java
//  then run the program java IncomeTax
//
//define a class
import java.util.Scanner; 
public class IncomeTax {

//main method required for every java program 
  public static void main(String []args) {
      
  Scanner myScanner; //construct
  myScanner = new Scanner( System.in ); //declare
  System.out.print(
    "Enter an int giving the number of thousands- "); //question that requires user to input number
  if (myScanner.hasNextInt()) {  //ensures that number input is and int
  int nIncome = myScanner.nextInt();
    if (nIncome>0 && nIncome < 20) { //calculates tax for individuals who make less than $20,000
    System.out.println( 
      "The tax rate on $" +(nIncome*1000)+ 
      " is 5%, and the tax is $" +(nIncome*.05*1000));
    } //End of the first if statement
    
    if (nIncome>=20 && nIncome<40) { //calculates tax for individuals with $20,000 or more and less than $40,000
    System.out.println(
      "The tax rate on $" +(nIncome*1000)+
      " is 7%, and the tax is " +(nIncome*.07*1000));
    } //End of second if statement
  
    if (nIncome>=40 && nIncome<78) { //calculates tax for individuals who make >= $40,000 and less than $78,000
    System.out.println(
      "The tax rate on $" +(nIncome*1000)+
      " is 12%, and the tax is " +(nIncome*.12*1000));
    } //End of third if statement
  
    if (nIncome>=78) { //calculates tax for individuals who make at least $78,000
    System.out.println(
      "The tax rate on $" +(nIncome*1000)+
      " is 14%, and the tax is " +(nIncome*.14*1000));  
    } //End of fourth if statement
  
    if (nIncome<0) { //Result of what will happen if user inputs negative int
    System.out.println(
      "You luckilydo not get taxed if you lost money");
    }

   } //End of income tax calculations
   
     else { //if number is not an int
     System.out.println(
       "You did not enter an int");
     }
  } //end of main
} //end of class
