import java.util.Scanner;
public class Enigma2{
  public static void main(String [] arg){
    int n=40,k=60;
    String out="";
    switch(n){
      case 12: 
      case 13: out+=13;
      case 40: out+=40/0; //ERROR! 
    }
    System.out.println(out);
  }
}
/*
 * Error Report: Explain how you can use the java.lang exception to
 *     identify the runtime error in the above code
 * In this program, becuase n = 40, it will follow case 40 in the switch statement. 
 * As a result, there will be a runtime error beecause 40, or any number in general,
 * can not be divided by 0. 
 * Division by zero in java is a runtime error
 */
