//Daniel Truong
//CSE 002
//November 18, 2014
//
//  The method showHands() will automatically generate 
//  a hand of five distinct cards and tell you the card 
//  number and suit upon the output.
//  The method simulateOdds() will automatically generate the 
//  number of pairs of each number you have within 100 hands. 
//  In this assignment, we will be practicing writing arrays 
//  within two different methods in different styles. 
//  THIS IS THE HARDEST LAB EVER!
//
//  first compile the program javac PokerOdds.java
//  then run the program java PokerOdds.
//
//import
import java.util.Random;
import java.util.Scanner;
//define a class
public class PokerOdds{
//main method required for every class
    public static void main(String [] arg){
        showHands();
        simulateOdds();
    }
    
    public static void showHands() {
    String userInput = "";
        do {
        Scanner scan = new Scanner( System.in );
        int spadeCount = 0, heartCount = 0, diamondCount = 0, clubCount = 0;
        int[] deck = new int[52]; 
        int[] spades = new int[5];
        int[] hearts = new int[5];
        int[] diamonds = new int[5];
        int[] clubs = new int[5]; 
        int[] card = new int[5]; //This is the card that is drawn from the deck. The card is stored in a number between 1 and 51.
        int[] hand = new int [5];  //Specifies the number and suit of the card
        int drawCard = 0; //Initializing the variable that draws the card
        String spadeHand = "Spades ";
        String heartHand = "Hearts ";
        String diamondHand = "Diamonds ";
        String clubHand = "Clubs ";
        String cardNumber = "";
                for (int i=0; i<52; i++) {
                    deck[i] = i; 
                } //Generates deck
                for (int i=0; i<5; i++) {
                    card[i] = -1;
                }   //Generates cards in hand
                for (int i=0; i<5; i++) {
                    drawCard = (int) Math.floor(Math.random()*(52-i)); 
                    //Generates card drawn. Set to (52-1) to avoid the -1 that is transferred to end of array in the following steps
                drawCard = deck[drawCard];
                deck[drawCard] = deck[51-i];
                deck[51-i] = -1; 
                card[i] = drawCard; 
                //in the deck, the card that is drawn is substituted for the last non -1 digit at the end of the array. 
                //The last non -1 digit is now substituted for -1. 
                //Ensures same two cards are not picked.
                }
                for (int i=0; i<5; i++) {
                    hand[i] = card[i]%13; //modulus card(1-51) by 13 to get specific value of card
                    switch (hand[i]) {
                        case 0: cardNumber = "A"; break;
                        case 1: cardNumber = "K"; break;
                        case 2: cardNumber = "Q"; break;
                        case 3: cardNumber = "J"; break;
                        case 4: cardNumber = "10"; break;
                        case 5: cardNumber = "9"; break;
                        case 6: cardNumber = "8"; break;
                        case 7: cardNumber = "7"; break;
                        case 8: cardNumber = "6"; break;
                        case 9: cardNumber = "5"; break;
                        case 10: cardNumber = "4"; break;
                        case 11: cardNumber = "3"; break;
                        case 12: cardNumber = "2"; break;
                    } 
                    if (card[i]<13 && card[i]>=0) {
                        spades[spadeCount] = hand[i]; //This will generate the drawn spades card
                        spadeHand += cardNumber + " "; //Used for final spade output
                        spadeCount++;
                    }
                    if (card[i]<26 && card[i]>=13) {
                        hearts[heartCount] = hand[i]; //Generates drawn hearts card
                        heartHand += cardNumber + " "; //used for final heart output
                        heartCount++;
                    }
                    if (card[i]<39 && card[i]>=26) {
                        diamonds[diamondCount] = hand[i]; //Generates drawn diamond card
                        diamondHand += cardNumber + " "; //used for final diamond output
                        diamondCount++;
                    }
                    if (card[i]<52 && card[i]>=39) {
                        clubs[clubCount] = hand[i];  //Generates drawn club card
                        clubHand += cardNumber + " "; //used for final club output
                        clubCount++;
                    }
                //The value of card determinds the suit of the card. Once suit has been determined by if statements, it gets stored in array. 
                //suitCount is normally stored as zero.
                //Once number passes through array of specific suit once, suitCount increases by one for next card of same suit if there is one.
                }
            System.out.println(spadeHand);
            System.out.println(heartHand);
            System.out.println(diamondHand);
            System.out.println(clubHand); //FINAL OUTPUT
            System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
            userInput = scan.next();
        }while(userInput.equals("y") || userInput.equals("Y"));  //Runs method again if y or Y is entered
    } 
    
    public static void simulateOdds() {
        int[] deck = new int[52];
        int[] card = new int[5]; //Hand in card, ranges from 1-51
        int[] hand = new int[5]; //Specifies number and suit card in hand
        int[] cardNumber = new int [14]; //Keeps track of number of pairs out of 10000 hands. Set to length of 14 to keep track of hands w/o exactly 1 duplicate
        int drawCard = 0;
            for (int i=0; i<14; i++) {
                cardNumber[i] = 0; 
            } //Generates array that keeps track of number of pair for each hand
            for (int hands=0; hands<10000; hands++) { 
                for (int i=0; i<52; i++) {
                    deck[i] = i; 
                } //Generates deck
                for (int i=0; i<5; i++) {
                    card[i] = -1;
                }   //Generates user hand
                for (int i=0; i<5; i++) {
                    drawCard = (int) Math.floor(Math.random()*(52-i)); 
                drawCard = deck[drawCard];
                deck[drawCard] = deck[51-i];
                deck[51-i] = -1; 
                card[i] = drawCard;
                hand[i] = card[i]%13; //Same scenario as the transfer value in showHand()
                }
                int duplicatePair = exactlyOneDup(hand); //Calls method that finds duplicates
                cardNumber[duplicatePair]++; //Increment specific number when pair of that number is detected in exactlyOneDup()
            } //Run 10000 hands
        System.out.println("A   " + cardNumber[0]);
        System.out.println("K   " + cardNumber[1]);
        System.out.println("Q   " + cardNumber[2]);
        System.out.println("J   " + cardNumber[3]);
        System.out.println("10  " + cardNumber[4]);
        System.out.println("9   " + cardNumber[5]);
        System.out.println("8   " + cardNumber[6]);
        System.out.println("7   " + cardNumber[7]);
        System.out.println("6   " + cardNumber[8]);
        System.out.println("5   " + cardNumber[9]);
        System.out.println("4   " + cardNumber[10]);
        System.out.println("3   " + cardNumber[11]);
        System.out.println("2   " + cardNumber[12]);
        System.out.println("----------------------");
        System.out.println("total not exactly one pair: " + cardNumber[13]);
    } //FINAL OUTPUT
    
    public static int exactlyOneDup(int[] hand) {
    int totalDuplicates = 0;
    int duplicate = 13; 
        for (int i=0; i<5; i++) {
            for (int j=i+1; j<5; j++) { //Used to compare the two cards in hand
                if (hand[i] == hand[j]) {
                    totalDuplicates += 1; //Counts # of duplicates
                    duplicate = hand[i]; //variable duplicate is set equal to the number that has a duplicate.
                }
            }
        }
            if (totalDuplicates > 1 || totalDuplicates < 1) {
                duplicate = 13;
                return duplicate; //Returns 13 when there is not EXACTLY one duplicate. 13 keeps track of number of hands w/o exactly one duplicate.
            }        
    return duplicate; //Returns number that has duplicate
    }
}