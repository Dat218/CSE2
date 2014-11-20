/* Insert System.out.println() statements in the code
 * below, displaying the status of n and k, which 
 * should help you identify when n  or k becomes 0 and causes
 * the program to crash
 */

import java.util.Scanner;
public class Enigma3{
  public static void main(String [] arg){
    int n=40,k=60;
    String out="";
    switch(k%14){
      case 12: 
      case 13: out+=13;
         break;
      default: out+=40;
          n/=3;
          k-=7;
    }
    if(n*k%12< 12){
      n-=20;
      out+=n;
    }
    if(n*n>k){
      n=42;
      out+=n+k;
    }
    else {
      n=45;
      out+=n+k;
    }
    switch(n+k){
      case 114: 
        n-=11;
        k-=3; 
        break;
      case 97:
        n-=14;
        k-=2; 
        break;
      case 98:
        n/=5;
        k/=9; System.out.println(k);
      default:
        n-=3;
        k-=5; System.out.println(k); //K BECOMES ZERO HERE
    }
     out+=1/n + 1/k;   
    System.out.println(out);
  }
}

/*
 * Error report:
 * The variable k becomes zero while passing through the second switch statement
 * First, it follows case 98 where k=53 gets divided to become 5.
 * k is equal to five becuase k must be an int, and the result of 53/9 is 5.88 which gets rounded to 5.
 * Then k goes through the default case since there is not a break after case 98.
 * k=5 gets subtracted by 5, therefore k = 0.
 * Then after the switch statement,1 is divided by k
 * This is a runtime error because 1 can not be divided by zero
 */