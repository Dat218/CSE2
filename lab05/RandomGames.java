/////////////////////////////////////
//Daniel Truong

//define a class 
import java.util.Scanner;
public class RandomGames {

//main method required for every program
  public static void main(String[] args) {
  
  Scanner myScanner;
  myScanner = new Scanner ( System.in );
  
  System.out.print("Enter R or r for Roulette, C or c for craps, P or p for pick a card- ");
    String input=myScanner.next();
    
    int roulette=(int)(Math.random()*36)+1;
    int craps=(int)(Math.random()*6)+1;
    int suit=(int)(Math.random()*4)+1;
    int card=(int)(Math.random()*12)+1;

    switch (input) {
        case "R":
        case "r":
            System.out.println("Roulette: " +roulette);
    }
   
    switch (input) {
        case "C":
        case "c":
            System.out.println("Craps: ");
    }
    String suitColor;
    switch (input) {
      case "P": 
      case "p":
          switch(suit){
              case 1: suitColor = "Spades";
              case 2: suitColor = "Hearts";
              case 3: suitColor = "Diamonds";
              case 4: suitColor = "Clubs";
         }
          System.out.println(card+ " of " +suitColor);
         //code here
          break;
    }
          
    }
  }
