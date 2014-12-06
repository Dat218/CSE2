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
            //seletion sort to sort row
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
            
            //insertion sort to sort column
            for (int i=1; i<7; i++) { 
                int index = i;
                for (int m=7-(8-i); m>=0; m--) { //nested for loop in order to conduct insertion sort
                    if (mat3d[index][0] < mat3d[m][0]) {
                        compare[0] = mat3d[index];
                        compare[1] = mat3d[m]; //temporary array rows for swapping 
                        mat3d[index] = compare[1];
                        mat3d[m] = compare[0]; //swapping process for sorting
                        index = m; 
                        //set "index" equal to the index of the row it just swapped with to continue the swap
                        //becuase after swap, mat3d[index][0] would still refer to the row's previous position before the swap. 
                    }
                }
            }
    }
}