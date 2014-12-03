import java.util.Scanner;
public class Practice5 {
	public static void main(String[] args) {
		int[] myList1 = {1,10,3,7};
		int[] myList2 = {2,3,4,5,10,6};
		int[] myList3 = new int[6];
		int counter = 0;
		for (int i=0; i<myList1.length; i++) {
			for (int j=0; j<myList2.length; j++) {
				if (myList1[i]==myList2[j]) {
					counter++;
					myList3[counter] = myList1[i];
				}
			}
		}
		myList3[0] = counter;
		for (int i = 0; i<myList3.length; i++) {
			System.out.println("myList["+i+"] is: " + myList3[i]);
		}
	}
}