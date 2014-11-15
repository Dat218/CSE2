///////////////////////////////////
//Daniel Truong
//CSE002
//October 31, 2014
//
public class MethodCalls{
    public static void main(String []  arg){
        int a=784,b=22,c;
        c=addDigit(a,3);
        System.out.println("Add 3 to "+a+" to get "+c);
        c=addDigit(addDigit(c,4),5);
        System.out.println("Add 3, 4, and 5 to "+a+" to get "+c);
        System.out.println("Add 3 to -98 to get: "+addDigit(-98,3));
        c=join(a,b);
        System.out.println("Join "+a+" to "+b+" to get "+c);
        System.out.println("Join 87, 42, and 83 to get "+join(87, join(42,83)));
        System.out.println("Join -9 and -90 to get "+join(-9,-90));
    }

    public static int addDigit(int x, int y) {
        if (x>0) {
            int multiply = 10;
            String number = "" + x;
            for (int i=1; i<number.length(); i++) {
                multiply = multiply * 10; 
            }
            int totalSum = (y*multiply) + x;
            return totalSum;
        }
        else {
            int multiply = -10;
            String number = "" + x;
            for (int i=1; i<number.length()-1; i++) {
                multiply = multiply * 10; 
            }
            int totalSum = (y*multiply) + x;
            return totalSum;
        }
    }
    
    public static int join(int x, int y) {
        if (y>0) {
            int multiply = 10;
            String number = "" + y;
            for (int i=1; i<number.length(); i++) {
                multiply = multiply * 10; 
            }
            int totalSum = (x*multiply) + y;
            return totalSum;
        }
        else {
            int multiply = 10;
            int positiveY = -1*y;
            int positiveX = -1*x;
            String number = "" + y;
                for (int i=1; i<number.length()-1; i++) {
                    multiply = multiply * 10;
                }
            int totalSum = (positiveX*multiply) + positiveY;
            return totalSum;
        }
    }
    
}