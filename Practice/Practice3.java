public class Practice3 {
  public static void main(String[] args) {
	for (int i=6; i>0; i--) {
		if (i>3) {
		for (int l=0; l<(i-2); i++) {	
			for(int k=0; k<(i-2); k++) {
				System.out.print(i);
			}
			System.out.println("");
		}
		else {
			System.out.println(i);
		}
		}
	}
  }
}
