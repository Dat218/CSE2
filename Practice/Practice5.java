import java.util.Scanner;
public class Practice5 {
	public static void main(String[] args) {
		System.out.print("ENTER AN INT: ");
		Scanner scan = new Scanner( System.in );
		int firstInput = scan.nextInt();
		System.out.print("ENTER AN INT > "+firstInput+": ");
		int secondInput = scan.nextInt();
			while (secondInput<=firstInput) {
				System.out.print("YOU ENTERED AN INT <="+firstInput+"; TRY AGAIN: ");
				scan.next();
			}
		sum(firstInput,secondInput);
	}
	public static void sum(int firstInput, int secondInput) {
		int m = firstInput;
		int lastValue = 0;
		for (int i = firstInput; i<secondInput+1; i++) {
			if (i == firstInput) {
				System.out.print(i);
			}
			else {
				System.out.print("+"+i);
			}
			lastValue = lastValue + i;
		}
		System.out.print(" = " +lastValue);
	}
}