//////////////////////////////////////////////
//Daniel Truong
//
//define a class
import java.util.Scanner;
public class Arrays {
//main method required for every program
    public static void main(String [] args) {
        Scanner scan = new Scanner ( System. in );
        System.out.print("Enter 10 ints with a space between each integer: ");
        int[] list = new int [10];
            for (int i=0; i<10; i++) {
                list[i] = scan.nextInt();
            }
        int highestEntry = 0;
        int lowestEntry = list[1];
            for (int i=0; i<10; i++) {
                if (list[i] > highestEntry) {
                    highestEntry = list[i];
                }
                if (list[i] < lowestEntry) {
                    
                    lowestEntry = list[i];
                }
            }
        int totalSum = 0;
            for (int i=0; i<10; i++) {
                totalSum = totalSum + list[i];
            }
        for (int i=0; i<10; i++) {
            System.out.print("\t" + list[i]);
            System.out.println("\t" + list[10-i-1]);
        }
            System.out.println("The highest entry is " + highestEntry);
            System.out.println("The lowest entry is " + lowestEntry);
            System.out.println("The sum is " + totalSum);
    }
}