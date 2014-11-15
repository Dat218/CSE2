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
      if (input.length() > 1) {
        System.out.println("Error: a single characer expected. "); //User can only input one letter
        return;
      } //In case user accidentally enters two letters
        int roulette=(int)(Math.random()*36)+1;
        int craps1=(int)(Math.random()*6)+1;
        int craps2=(int)(Math.random()*6)+1;
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
              System.out.println("Craps: " +craps1+ " + " +craps2+ " = " +(craps1+craps2));
        }
      String suitColor = "0";
      String cardNumber = "0";
        switch (input) {
          case "P": 
          case "p":
            switch(card) {
              case 1 : cardNumber = "1";
                break;
              case 2 : cardNumber = "2";
                break;
              case 3 : cardNumber = "3";
                break;
              case 4 : cardNumber = "4";
                break;
              case 5 : cardNumber = "5";
                break;
              case 6 : cardNumber = "6";
                break;
              case 7 : cardNumber = "7";
                break;
              case 8 : cardNumber = "8";
                break;
              case 9 : cardNumber = "9";
                break;
              case 10 : cardNumber = "10";
                break;
              case 11 : cardNumber = "Jack";
                break;
              case 12 : cardNumber = "Queen";
                break;
              case 13 : cardNumber = "King";
                break;
            }
            switch(suit){
              case 1: suitColor = "Spades"; 
              break;
              case 2: suitColor = "Hearts"; 
              break;
              case 3: suitColor = "Diamonds";
              break;
              case 4: suitColor = "Clubs";
              break;
            }
          System.out.println(cardNumber+ " of " +suitColor);
        }
  }
}

