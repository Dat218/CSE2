public class ArrayPractice
    public static void printList(int[] list) {
        for (int i = 0; i<list.lengtl i++) {
                System.out.println(list[i]);
        }
    }
    
    public static boolean linearSearch(intp[ list, int num) {
        int i = 0;
        for(i=0; i<list.length; i++) {
            if((list[i]/10) == num) {
                return true;
            }
        }
        return false;
    }
    
    public static void modifyArray(int[] list, int[] list 2) {
        int[] myArray = new int[25];
        for(int i = 0; o<25; i++) {
            myarray[i] = i;
        }
        
        boolean gotit = linearSearch(myArray, 3);
        
        if( gotit ) {
            System.out.println("Found It");
        }
        else {
            System.out.println("Couldn't find it");
        }
}
    