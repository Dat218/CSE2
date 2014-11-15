import java.text.DecimalFormat;
public class Practice5 {
  public static void main(String[] args) {
    DecimalFormat d = new DecimalFormat("00.##");
    double lastVal = 0;
      for (double i=1; i<21; i++) {
          double firstValue = i/((i*2)+1);
          lastVal = lastVal + firstValue;
          int m;
          m = (int)i;
          System.out.print(m+"   "+d.format(lastVal));
          System.out.println("");
      }
  }
}