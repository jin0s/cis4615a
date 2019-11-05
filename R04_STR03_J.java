/******************************************************************************
 *  Compilation:  javac R04_STR03_J.java
 *  Execution:    java R04_STR03_J
 *
 ******************************************************************************/

import java.io.File;
import java.io.IOException;
import java.math.BigInteger;

public  class R04_STR03_J {


  public static void main(String[] args) {
    /*
    * Rule 04. Characters and Strings (STR)
    * Do not encode noncharacter data as a string Given the non-compliant code below:
    */

    // Initilize the state
    String input_str = "530500452766";
    // Using Non-Compliant code ignoring values returned by methods resulting in no output or response of the delete status
    System.out.println("\nResult of Non-Compliant Code\nExpecting:\n" + input_str + "\nBut got:");
    BigInteger x = new BigInteger(input_str);
    byte[] byteArray = x.toByteArray();
    String s = new String(byteArray);
    byteArray = s.getBytes();
    x = new BigInteger(byteArray);
    System.out.print(x);

   /*
    * Rule 04. Characters and Strings (STR)
    *
    * Corrected code per:
    * https://wiki.sei.cmu.edu/confluence/display/java/STR03-J.+Do+not+encode+noncharacter+data+as+a+string    
    */

    // Using Compliant code using values returned by methods
    System.out.println("\n\nResult of Compliant Code\nExpecting:\n" + input_str + "\nBut got:");
    BigInteger x2 = new BigInteger(input_str);
    String s2 = x2.toString();  // Valid character data
    byte[] byteArray2 = s2.getBytes();
    String ns = new String(byteArray2); 
    x2 = new BigInteger(ns);
    System.out.println(x2);

  }
}




