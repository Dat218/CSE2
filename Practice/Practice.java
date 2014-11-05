/////////
//Daniel Truong

//define a class
import java.util.Scanner;
public class Practice {
  public static void main(String[] args) {
    for (int i=0; i<10; i++) {
        if (i<5) {
            for (int j=0; j<i+1; j++) {
                 System.out.print(i);
            }
            System.out.println("");
        }
        else {
            for (int j=10-i; j>0; j--) {
              System.out.print(i);
            }
            System.out.println("");
        }
    }
  }
}
