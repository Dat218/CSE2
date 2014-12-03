////////////////////////////
//Daniel Truong
//CSE 002
//November 28, 2014
//
//Define a class
import java.util.Random;
public class Sort {
//main method required for every class
    public static void main(String[] args) {
        Random generator = new Random();
        System.out.println("**********Unsorted Array**********");
        int[][] myList = new int[5][];
        int[][] orderedList = new int[5][];
            for (int i=0; i<5; i++) {
                int j = i*3+5; 
                myList[i] = new int[j];
                for (int m=0; m<j; m++) {
                    myList[i][m] = generator.nextInt(39)+1;
                    System.out.print(myList[i][m]);
                    if (m!=j-1) {
                        System.out.print(" ");
                    }
                        
                }
                System.out.println("");
            }
         sortArray(myList);
    }
    
    public static void sortArray(int[][] myList) {
        for (int i=0; i<5; i++) {
            int j = i*3+5;
            for (int m=0; m<j-1; m++) {
                for (int n=m+1; n<j; n++) {
                    if (myList[i][n]<myList[i][m]) {
                        int temp = myList[i][m];
                        myList[i][m] = myList[i][n];
                        myList[i][n] = temp;
                    }
                }
            }
        }
        System.out.println("**********Sorted List**********");
        for (int i=0; i<5; i++) {
            int j = i*3+5; 
            for (int m=0; m<j; m++) {
                System.out.print(myList[i][m]);
                if (m!=j-1) {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }      
    }
}