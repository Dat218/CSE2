//Daniel Truong
//December 12, 2014
//CSE 002
//
//  In this program, the user will input the suit and value of 
//  five different cards and out put user's hand. 
//  The code will automatically determine the strength user's hand and output it.
//  This program covers a lot of array usage but also requires us 
//  to be able to use the skills we learned previously, such as switch 
//  statements and swapping. 
//
//  first compile the program javac PokerHands.java
//  then run the program java PokerHands
//
//define a class
import java.util.Scanner;
public class PokerHands {
//main method required for every class
    public static void main(String[] args) {
        String userInput = "initializing";
        do {
            Scanner scan = new Scanner(System.in);
            String userSuitInput = "initializing";
            String userCardInput = "initializing";
            int userSuit = 100;
            int userCard = 100;    
            int[][] deck = new int[4][13];
            int[] hand = new int[5];
            int[] handSuit = new int[5];
            String clubs = "Clubs:  ";
            String diamonds = "Diamonds:  ";
            String hearts = "Hearts:  ";
            String spades = "Spades:  ";
                for (int i=0; i<4; i++) {
                    for (int m=0; m<13; m++) {
                        deck[i][m] = m;
                    }
                } //Initialize deck
                for (int i=0; i<5; i++) {
                    System.out.print("Enter the suit: 'c', 'd', 'h', or 's': ");
                        do {
                            userSuitInput = scan.next();
                            switch (userSuitInput) {
                                case "c": userSuit = 0; handSuit[i] = 0; break;
                                case "d": userSuit = 1; handSuit[i] = 1; break;
                                case "h": userSuit = 2; handSuit[i] = 2; break;
                                case "s": userSuit = 3; handSuit[i] = 3; break;
                                default: System.out.print("You did not enter a valid response; Try again: "); 
                            } //Prompt user to select a suit
                        }while(userSuit != 0 && userSuit != 1 && userSuit !=2 && userSuit !=3);
                        //Do while loop ensures that what user inputs is either c, d, h, or s.
                    System.out.print("Enter one of 'a', 'k', 'q', 'j', '10', ...'2'-");
                        do{
                            userCardInput = scan.next(); 
                            switch (userCardInput) {
                                case "a": userCard = 0; break;
                                case "k": userCard = 1; break;
                                case "q": userCard = 2; break;
                                case "j": userCard = 3; break;
                                case "10": userCard = 4; break;
                                case "9": userCard = 5; break;
                                case "8": userCard = 6; break;
                                case "7": userCard = 7; break;
                                case "6": userCard = 8; break;
                                case "5": userCard = 9; break;
                                case "4": userCard = 10; break;
                                case "3": userCard = 11; break;
                                case "2": userCard = 12; break;
                                default: System.out.print("You did not enter a valid response; Try again: "); 
                            } //Prompts user to select a card number and transfer it over to hand
                            hand[i] = deck[userSuit][userCard];
                        }while(userCard != 0 && userCard != 1 && userCard != 2 && userCard != 3 && userCard != 4 && userCard != 5 && userCard != 6 && userCard != 7 && userCard != 8 && userCard != 9 && userCard != 10 && userCard != 11 && userCard != 12);
                        //Ensures that user input is a legitimate card
                    hand[i] = deck[userSuit][userCard];
                    if (hand[i]==-1) {
                        do {
                            System.out.println("You already entered that card");
                            System.out.print("Enter one of 'a', 'k', 'q', 'j', '10', ...'2'-");
                            userCardInput = scan.next();
                                switch (userCardInput) {
                                case "a": userCard = 0; break;
                                case "k": userCard = 1; break;
                                case "q": userCard = 2; break;
                                case "j": userCard = 3; break;
                                case "10": userCard = 4; break;
                                case "9": userCard = 5; break;
                                case "8": userCard = 6; break;
                                case "7": userCard = 7; break;
                                case "6": userCard = 8; break;
                                case "5": userCard = 9; break;
                                case "4": userCard = 10; break;
                                case "3": userCard = 11; break;
                                case "2": userCard = 12; break;
                                }
                            hand[i] = deck[userSuit][userCard];
                        } while(hand[i] == -1);
                    } //Ensures that user does noselect same card twice.
                    deck[userSuit][userCard] = -1; 
                        switch(userSuit) {
                            case 0: clubs+=userCardInput+" "; break;
                            case 1: diamonds+=userCardInput+" "; break;
                            case 2: hearts+=userCardInput+" "; break;
                            case 3: spades+=userCardInput+" "; break;
                        }
                } //Loop runs 5 times to allow user to select 5 cards for hand
                for (int i=0; i<4; i++) {
                    for (int m=i+1; m<5; m++) {
                        if (hand[m]<hand[i]) {
                            int temp = hand[i];
                            hand[i] = hand[m];
                            hand[m] = temp;
                        }
                    }
                } //Sorts hand in chronalogical order based on strength of card in decending order
            System.out.println(clubs);
            System.out.println(diamonds);
            System.out.println(hearts);
            System.out.println(spades);
            rankHand(hand,handSuit);
            System.out.print("Enter 'Y' or 'y' to enter another hand: ");
                userInput = scan.next(); 
        }while(userInput.equals("y") || userInput.equals("Y"));
    } //Prompts user whether he/she wants to pick another hand
    //Used to find the strength of the user's hand
    public static void rankHand(int[] hand, int[]handSuit) {
        if (checkRoyalFlush(hand,handSuit) == true) {
            System.out.println("This is a Royal Flush.");
        }
        else if (checkStraighFlush(hand,handSuit) == true) {
            System.out.println("This is a Straight Flush");
        }
        else if (checkFlush(handSuit) == true) {
            System.out.println("This is a Flush");
        }
        else if (checkStraight(hand) == true) {
            System.out.println("This is a Straight");
        }
        else if (checkFourOfAKind(hand) == true) {
            System.out.println("This is a Four of a Kind");
        }
        else if (checkFullHouse(hand) == true) {
            System.out.println("This is a Full House");
        }
        else if (checkThreeOfAKind(hand) == true) {
            System.out.println("This is a Three of a Kind");
        }
        else {
            checkRest(hand);
        }
    }    
    
    public static boolean checkRoyalFlush(int[] hand, int[] handSuit) {
        for (int i=0; i<5; i++) {
            if (hand[i] == i) { 
                //when a is entered, value is 1. when k is entered, value is 2
                //becuase of this and the fact that hand is already ordered in descending order,
                //We can use code above to ensure that the first five cards are A, k, q, j, and 10. 
                continue;
            }
            else {
                return false;
            }
        } //Ensures that first five cards are A, K, Q, J, and 10.
        for (int i=0; i<1; i++) {
            for (int m=1; m<5; m++) {
                if (handSuit[i] == handSuit[m]) {
                    continue;
                }
                else {
                    return false;
                }
            }
        } //Ensures that hand includes cards of same suit
        return true; 
    }
    
    public static boolean checkStraighFlush(int[] hand, int[] handSuit) {
        for (int i=0; i<1; i++) {
            for (int m=1; m<5; m++) {
                if (handSuit[i] == handSuit[m]) { //Testing first suit with next four
                    continue;
                }
                else {
                    return false;
                }
            }
        } //Ensures hand includes 5 of the same suit
        for (int i=0; i<1; i++) {
            for(int m=1; m<5; m++) {
                if (hand[i] == hand[m]-m) { 
                //if first card is 6 and second is 7, first card should equal second card -1.
                //same idea applies with second and third card and the third and fourth and so on
                    continue;
                }
                else {
                    return false;
                }
            }
        } //Ensures cards are a straight
        return true;
    }
    
    public static boolean checkFlush(int[] handSuit) {
        for (int i=0; i<1; i++) {
            for (int m=1; m<5; m++) {
                if (handSuit[i] == handSuit[m]) { //Testing first suit with next four
                    continue;
                }
                else {
                    return false;
                }
            }
        } //Checks to see if suit 
        return true;
    }
    public static boolean checkStraight(int[] hand) {
        for (int i=0; i<1; i++) {
            for(int m=1; m<5; m++) {
                if (hand[i] == hand[m]-m) {
                //if first card is 6 and second is 7, first card should equal second card -1.
                //same idea applies with second and third card and the third and fourth and so on
                    continue;
                }
                else {
                    return false;
                }
            }
        } //Ensures hand is a straight
        return true;
    }
    
    public static boolean checkFourOfAKind(int[] hand) {
        //if hand is four of a kind, it would be sorted like 24444 or 22224.
        int count = 0;
            for (int i=1; i<5; i++) {
                if (hand[0] == hand[i]) {
                    count++;
                }
            }
            if (count == 3) {
                return true;
            } //Tests for 4 of a kind for hand sorted like 22224
        count = 0;
            for (int i=0; i<4; i++) {
                if (hand[4] == hand[i]) {
                    count++;
                }
            }
            if (count == 3) {
                return true;
            } //Tests for 4 of a kind for hand sorted like 244444
        return false;
    }
    
    public static boolean checkFullHouse(int[] hand) {
        //Hand for full house would be sorted like 22333 or 22233
        if (hand[0]==hand[1]) {
            if (hand[2] == hand[3] && hand[2] == hand[4]) {
                return true;
            }
        } //This applies if hand is sorted like 22333 and checks to make sure it is a full house
        if (hand[3] == hand[4]) {
            if(hand[0] == hand[1] && hand[0] == hand[2]) {
                return true;
            }
        } //This applies if hand is sorted like 22233 and checks to make sure it is a full house
        return false;
    }
    
    public static boolean checkThreeOfAKind(int[] hand) {
        //Hand for three of a kind would be like 23334, 22234, or 23444
        if (hand[0] != hand[4]) { //As we can see above, first integar is always different from last.
            if (hand[2] == hand[3] && hand[3] == hand[4]) {
                return true;
            } //Test to see if last three are a three of a kind. 23444
            else if (hand[0] == hand[1] && hand[0] == hand[2]) {
                return true;
            } //Test to see if first three ints are identical. 22234
            else if (hand[1] == hand[2] && hand[1] == hand[3]) {
                return true;
            } //Tests to see if middle three ints are identical. 23334
        }
        return false;
    }

    public static void checkRest(int[] hand) {    
        int pair = 0; //used to keep track of # of pairs
        int pair2 = 0; 
        int pairCard = 0; //Used to keep track of which specific card has a pair
        int pairCard2 = 0;
        for (int i=0; i<4; i++) {
            for (int m=i+1; m<5; m++) { 
            //compares first int with next four int , then second with next three, and so on to see if there is a dup
                if (pair == 0) {
                    if (hand[i] == hand[m]) {
                        pair++;
                        pairCard = hand[i]; //Stores the value paired card
                    }
                } //Follows this code till pair is found. 
                else if (pair == 1 && pair2 == 0) {
                    if (hand[i] == hand[m]) {
                        if (hand[i] == pairCard) { 
                            pair++;
                        } //Used for three of a kind(kinda useless but useful though)
                        else { 
                            pair2++;
                            pairCard2 = hand[i];
                        } //Stores second dup if it is not similar to value of first dup
                    }
                }
            }
        }
        if (pair == 1 && pair2 == 0) {
            System.out.println("This is a pair.");
        }
        if (pair == 1 && pair2 == 1) {
            System.out.println("This is 2 pairs.");
        }
        if (pair == 0 && pair2 == 0) {
            System.out.println("This is a high card");
        } //No pairs were discovered.
    }
}
    
