/////////
//Daniel Truong

//define a class
import java.util.Scanner;
public class Practice {
//main method required for every class
  public static void main(String[] args) {
    
    Scanner input = new input( System.in ); 
    System.out.print("Enter a positive integer less than 10- ");
        int inputNumber = input.nextInt();
        int number = 0;
        int pyramidNumber;
    
    if (inputNumber>0 && inputNumber<10)
        for (int i=0; i<inputNumber; i++) {
            System.out.println("");
        }
            for (int j=0; j<i; j++) {
                number++;
                pyramidNumber=(number - j);
                System.out.println(pyramidNumber);
            }
  }
}