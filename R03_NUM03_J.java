/******************************************************************************
 *  Compilation:  javac R03_NUM03_J.java
 *  Execution:    java R03_NUM03_J
 *  Example of using the right data type for
 ******************************************************************************/

import java.io.IOException;
import java.util.Scanner;

public  class R03_NUM03_J {


  public static int getInteger(Scanner is) throws IOException{
    return is.nextInt();
  }

 /*
  * Rule 03. Numeric Types and Operations (NUM)
  * Use integer types that can fully represent the possible range of unsigned data
  * Per: https://wiki.sei.cmu.edu/confluence/display/java/NUM03-J.+Use+integer+types+that+can+fully+represent+the+possible+range+of++unsigned+data
  */
  public static long getIntegerCompliant(Scanner is) throws IOException{
    return is.nextInt() & 0xFFFFFFFFL; // Mask with 32 one-bits
  }

  public static void main (String[] args) throws IOException{
    Scanner scan = new Scanner(System.in);
    // This Non-compliant code example uses a generic method for reading integer data without considering the signedness of the source.    
    System.out.println("\nResult of Non Compliant Code");
    System.out.printf("Enter a number: ");
    int result = getInteger(scan);
    System.out.println("returned value: " + Integer.toString(result));

    // Compliant Code
    System.out.println("\nResult of Compliant Code");
    System.out.printf("Enter a number: ");
    long long_result = getIntegerCompliant(scan);
    System.out.println("returned value: " + Long.toString(long_result));

  }
}




