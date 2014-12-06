/////////////////////////////////////
//Daniel Truong
//CSE 002
//December 5, 2014
//
//  We will be using a 3d array for our first time ever in this
//  homework assignment. The objective of this assignment is to 
//  First output a general 3d array with vaious row and column lengths.
//  Then we will find the min and then sort the row and column of the third set of
//  rows and columns (aka slab 3).
//  Afterwards, we will output the 3d array once again with the sorted 3rd slab. 
//
//  first compile the program javac MatrixSorter.java
//  then run the program java MatrixSorter
//define a class
import java.util.Random;
public class MatrixSorter{
//main method required for every class
    public static void main(String arg[]){
        int mat3d[][][];
        mat3d=buildMat3d();
        show(mat3d);
        System.out.println("The smallest entry in the 3D matrix is "+
  		    	findMin(mat3d));
        System.out.println("After sorting the 3rd matrix we get");
        sort(mat3d[2]);
        show(mat3d);
    }
    
    public static int[][][] buildMat3d() { //Return the 3d we domly created
        Random generator = new Random(); //declaring and constructing random number generator 
        int[][][] myList = new int [3][][]; //Allocating array slab dimension/limit
        for (int i=0; i<3; i++) {
            int j = 2*i+3;
            myList[i] = new int[j][]; //Allocating array column dimension/limit
            for (int m=0; m<j; m++) {
                int k = 1+m+i;
                myList[i][m] = new int[k]; //allocating array row dimension/limit
                for (int n=0; n<k; n++) {
                    myList[i][m][n] = generator.nextInt(99) + 1; 
                }
            }
        }
        return myList;
    }
    
    public static void show(int[][][] mat3d) { //Prints out the 3d array
        String sorted = "sorted";
        int count = 0; 
            //This is for loop below used to determine if the first column is in order
            //This is because when printing out the first three slabs, there was not a "sort" or "unsorted" at the end of the dashes
            //While it was present when outputing the 3d array the second time!
            for (int i=0; i<6; i++) {
                if (mat3d[2][i][0]<mat3d[2][i+1][0]) {
                    count++;
                }
            } 
            if (count!=6) {
                for (int i=0; i<3; i++) {
                        System.out.println("--------------------Slab "+(i+1));
                    for (int m=0; m<2*i+3; m++) {
                        for (int n=0; n<mat3d[i][m].length; n++) {
                            System.out.print(mat3d[i][m][n]+" ");
                        }
                        System.out.println("");
                    }
                }
            } //Used for 1st output of 3d array
            else {
                for (int i=0; i<3; i++) {
                    if (i==0 || i==1) {
                        System.out.println("--------------------Slab "+(i+1)+" unsorted");
                    } //first two slabs are unsorted
                    else {
                        System.out.println("--------------------Slab "+(i+1)+" "+sorted);
                    } //third slab is sorted
                    for (int m=0; m<2*i+3; m++) {
                        for (int n=0; n<mat3d[i][m].length; n++) {
                            System.out.print(mat3d[i][m][n]+" ");
                        }
                        System.out.println("");
                    }
                }
            } //Used for second output of 3d array
    }
    
    public static int findMin(int[][][] mat3d) { //Returns the smallest integar in the 3d array
        int minIndex1 = 0;
        int minIndex2 = 0;
        int minIndex3 = 0;
        for (int i=0; i<3; i++) {
            for (int m=0; m<2*i+3; m++) {
                for (int n=0; n<1+m+i; n++) {
                    if (mat3d[i][m][n] < mat3d[minIndex1][minIndex2][minIndex3]) {
                        //Tests every integar with current minimum int
                        minIndex1 = i;
                        minIndex2 = m;
                        minIndex3 = n; //Re-initializing values if new min is discovered
                    }
                }
            }
        }
        return mat3d[minIndex1][minIndex2][minIndex3];
    }
    
    public static void sort(int[][] mat3d) { //Sorts the third slab of the 3d array. Sorts row first than first column
        int[][] compare = new int[7][]; //compare is used later to store row of array in order to swap
            for (int m=0; m<2*2+3; m++) {
                for (int n=0; n<m+2; n++) {
                    for (int b=1+n; b<m+2+1; b++) { 
                        //Compares the first number of row with every other number in its row to determine the minimun.
                        //Then compares second number with the following numbers in the list to determine the min and repeats
                        if (mat3d[m][b] < mat3d[m][n]) {
                            int temp = mat3d[m][n];
                            mat3d[m][n] = mat3d[m][b];
                            mat3d[m][b] = temp;
                        } //Swaps min with current number being tested with every other number to ensure this min is not used twice
                    }
                }
            } //this sorts every row in the third slab
            int maxIndex = 0; 
            for (int m=0; m<1; m++) {
                for (int b=m+1; b<7; b++) {
                    if (mat3d[b][0]>mat3d[maxIndex][0]) {
                        maxIndex = b;
                    }
                }
                compare[6] = mat3d[maxIndex];
            } //I used this to store the largest number of the first column since the code in the 
              //bottom only organizes the first six rows based on the first number of the row and stores them in the new array compare
              //the 7th row is not stored so we store it up here.
            
            for (int m=0; m<6; m++) {
                int minIndex = m;
                for (int b=m+1; b<7; b++) {
              
                    if (mat3d[b][0]<mat3d[minIndex][0]) {
                        minIndex = b;
                    }
                }
                compare[m] = mat3d[minIndex]; //the mth row of compare is stored with the current min
                int[] temp = mat3d[minIndex];
                mat3d[minIndex] = mat3d[m];
                mat3d[m] = temp; //Swaps min with first row to ensure it will not be compared on 
            }
            
            for (int m=0; m<7; m++) {
                mat3d[m] = new int[compare[m].length];
                for (int b=0; b<mat3d[m].length; b++) {
                    mat3d[m][b] = compare[m][b];
                }
            } //Used to reallocated and initialize mat3d so it will be in the correct order. 
    }
}