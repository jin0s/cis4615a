/******************************************************************************
 *  Compilation:  javac `R03_NUM02_J.java
 *  Execution:    java R03_NUM02_J
 *  
 ******************************************************************************/


public  class R03_NUM02_J {


  public static void main(String[] args) {
    long result;
    long num1 = 10;
    long num2 = 2;
    long num3 = 0;

    // Using Non-Compliant code ignoring values possible divide by zero
    System.out.println("\nResult of Non-Compliant Code");
    result = divide(num1,num2);
    System.out.printf("%d / %d = %d\n", num1, num2, result);

    try {
      result = divide(num1,num3);
      
    } catch (ArithmeticException e) {
      System.out.println(e);
      result = Integer.MAX_VALUE;
    }
    System.out.printf("%d / %d = %d\n", num1, num3, result);


    // Using Compliant code to defensively catch divide by zero
    System.out.println("\nResult of Compliant Code");
    result = divideCompliant(num1,num2);
    System.out.printf("%d / %d = %d\n", num1, num2, result);

    try {
      result = divideCompliant(num1,num3);
      
    } catch (ArithmeticException e) {
      System.out.println(e);
      result = Integer.MAX_VALUE;
    }
    System.out.printf("%d / %d = %d\n", num1, num3, result);

  }

  public static long divide(long num1, long num2) throws ArithmeticException{
    return num1 / num2;
  }

     /*
      * Rule 03. Numeric Type and Operations(NUM)
      * Ensure that division and remainder operations do not result in divide-by-zero errors
      */

  public static long divideCompliant(long num1, long num2) {
    if(num2 == 0) {
      System.out.println("ERROR: Divide by zero");
      // Setting to zero for the stablilty of the program but catch this error and do something with it
      return 0;
    }
    return num1 / num2;
  }
}






