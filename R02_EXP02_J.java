
/******************************************************************************
 *  Compilation:  javac R02_EXP02_J.java
 *  Execution:    java R02_EXP02_J
 *
 ******************************************************************************/
import java.util.Arrays;

public  class R02_EXP02_J {


  public static void main(String[] args) {
    
    // Initialize the state
    int[] arr1 = new int[20]; // Initialized to 0
    int[] arr2 = new int[20]; // Initialized to 0

    // Using Non-Compliant uses the Object.equals() method to compare two arrays:
    System.out.println("\nResult of Non-Compliant Code");
    System.out.printf("The arrays are the same using arr1.equals(arr2)? ");
    System.out.println(arr1.equals(arr2)); // Prints false


   /*
    * Rule 02. Characters and Strings (STR)
    * Do not use the Object.equals() method to compare two arrays
    */

    // Using Compliant code using values returned by methods
    System.out.println("\nResult of Compliant Code");
    System.out.printf("The arrays are the same using Arrays.equals(arr1, arr2)? ");
    System.out.println(Arrays.equals(arr1, arr2)); // Prints true
  }



}




