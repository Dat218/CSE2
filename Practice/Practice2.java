import java.util.Scanner;
public class Practice2 {
  public static void main(String[] args) {
  	System.out.print("ENTER AN INT: ");
  	Scanner scan = new Scanner( System.in );
    int number = sumsq();
  	System.out.println(number);
  }
    public static int sumsq() {
      Scanner scan = new Scanner( System.in );
  	  int userInput = scan.nextInt();
  	    int lastValue = 0;
  	    for (int i=1; i<=userInput; i++) {
          int value = i*i;
          lastValue = lastValue + value;
  		      if (i == 1) {
  		        System.out.print(i+"*"+i);
  		      }
  		      else {
  		        System.out.print("+"+i+"*"+i);
  		      }
  	    }
  	    
  System.out.print(" for n = "+userInput+" is ");
  return lastValue;
  }
}