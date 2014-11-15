import java.util.Scanner;
public class Practice4 {
  public static void main(String[] args) {
     
        int i; 
        int temp = 1;
        for(i = 0; i<4; i++) {
            if (i!=0) {
                temp = temp*2;
            }
            for(int j=0; j<i+1; j++) {
                for (int k=0; k<j+1; k++) {
                    System.out.print(temp);
                }
                System.out.println("");
            }
        }
  }
}