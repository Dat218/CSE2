/////////////////////////////////
//Daniel Truong 
//Arithmetic Program
//CSE002 Section 010
//September 9, 2014
//
//In this homework assignment, we
//will be practice sorting data in
//variables, running calculations, and
//printing the numerical output we've
//generated. 
//
//  First compile the program javac Arithmetic.java
//  Then run the program java Arithmetic

//  define a class
import java.text.DecimalFormat;
public class Arithmetic {
    
//main method required for every java program
  public static void main(String[] args) {
       
//The format will automatically round decimals to the nearst hundreth       
       DecimalFormat d = new DecimalFormat("0.##");
       
       //Number of pairs of socks
       int nSocks=3;
       //Cost per pair of socks
       //('$' is part of the variable name)
       double sockCost$=2.58;
       
       //Number of drinking glasses
       int nGlasses=6;
       //Cost per glass
       double glassCost$=2.29;
       
       //Number of boxes of envelopes 
       int nEnvelopes=1;
       //cost per box of envelopes
       double envelopeCost$=3.25;
       double taxPercent=0.06;
       
       System.out.println("The tax for 3 pairs of socks is "
              +d.format(nSocks*sockCost$*taxPercent)+
              " dollars.");
       System.out.println("The tax for 6 drinking glasses is "
              +d.format(nGlasses*glassCost$*taxPercent)+
              " dollars");
       System.out.println("The tax for a box of envelope is "
              +d.format(nEnvelopes*envelopeCost$*taxPercent)+
              " dollars");
       System.out.println("The total spent on tax for these items is "
              +d.format(nSocks*sockCost$*taxPercent+nGlasses*glassCost$*taxPercent+nEnvelopes*envelopeCost$*taxPercent)+ " dollars");
       // Above gives the tax spent for each item and the total money spend on tax. 
       // There is a 6% tax for each item.
       
       double totalSockCost$=(nSocks*sockCost$);  //total cost of socks before tax
       double totalGlassCost$=(nGlasses*glassCost$);  //total cost of glasses before tax
       double totalEnvelopeCost$=(nEnvelopes*envelopeCost$);  //total cost of box of envelope before tax
       System.out.println("The subtotal of the socks is "
              +d.format(totalSockCost$)+ " dollars.");
       System.out.println("the subtotal of the drinking glasses is "
              +d.format(totalGlassCost$)+ " dollars.");
       System.out.println("The subtotal of a box of envelopes is "
              +d.format(totalEnvelopeCost$)+ " dollars.");
       System.out.println("The final subtotal is "
              +(totalEnvelopeCost$+totalSockCost$+totalGlassCost$)+ " dollars.");
       // Above only gives the total of each item minus tax and the subtotal.
       
       double totalSockAndTaxCost$=totalSockCost$+nSocks*sockCost$*taxPercent;  //total cost of socks plus tax
       double totalGlassAndTaxCost$=totalGlassCost$+nGlasses*glassCost$*taxPercent;  //total cost of glasses plus tax
       double totalEnvelopeAndTaxCost$=totalEnvelopeCost$+nEnvelopes*envelopeCost$*taxPercent;  //total cost of a box of envelopes plus tax  
       System.out.println("The total cost for 3 pairs of socks is "
              +d.format(totalSockAndTaxCost$)+
              " dollars.");
       System.out.println("The total cost for 6 drinking glasses is "
              +d.format(totalGlassAndTaxCost$)+
              " dollars.");
       System.out.println("The total cost for a box of envelope is "
              +d.format(totalEnvelopeAndTaxCost$)+
              " dollars.");
       // Above gives the total cost for each item.
       System.out.println("The final cost is "
              +d.format(totalEnvelopeAndTaxCost$+totalGlassAndTaxCost$+totalSockAndTaxCost$)+
              " dollars.");
       // Above gives the total cost of the whole transaction. 
  }
}