/******************************************************************************
 *  Compilation:  javac R06_Met01_J.java
 *  Execution:    java R06_Met01_J
 *
 *  Calls function getAbsAdd(x,y) with legal and illegal values
 * 
 ******************************************************************************/

public class R06_Met01_J {

    public static void main(String[] args) {
      // Using Non-Compliant code ignoring values possible integer overflow 
      System.out.println("\nResult of Non-Compliant Code");
      int a = 17;
      System.out.println("a = " + a);
      int b = 42;
      System.out.println("b = " + b);
      int c = getAbsAdd(a, b);
      System.out.println("c = " + c);
      System.out.println("\nResult in an integer over flow");
      a = Integer.MIN_VALUE; //used for testing secure version
      System.out.println("a = " + a);
      b = Integer.MAX_VALUE;
      System.out.println("b = " + b);
      c = getAbsAdd(a, b);
      System.out.println("c = " + c);

    }

    public static int getAbsAdd(int x, int y) {
        return Math.abs(x) + Math.abs(y);
    }
}