import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/******************************************************************************
 *  Compilation:  javac R07_ERR00_J.java
 *  Execution:    java R07_ERR00_J
 *  Dependencies: a file named text.txt
 ******************************************************************************/

public  class R07_ERR00_J {


  public static void main(String[] args) throws IOException {
    // Initialize the state
    String filename = "filethatdonotexist.txt";
    boolean validFlag = false;
    Scanner scan = new Scanner(System.in);

    // This noncompliant code example simply prints the exception's stack trace:
    System.out.println("\nResult of Non-Compliant Code");
    System.out.println("Trying to read the filethatdonotexist.txt");
    try {
      BufferedReader reader = new BufferedReader(new FileReader(filename));
      String line;
      while ((line = reader.readLine()) != null) {
        System.out.println(line);
      }
      reader.close();
    } catch (IOException ioe) {
      ioe.printStackTrace();
    }

    /*
      * Rule 07. Exceptional Behavior (ERR)
      * Do not suppress or ignore checked exceptions
      * Per: https://wiki.sei.cmu.edu/confluence/display/java/ERR00-J.+Do+not+suppress+or+ignore+checked+exceptions
      */
    System.out.println("\nResult of Compliant Code");
    System.out.println("Trying to read the filethatdonotexist.txt");
      do {
        try {
          BufferedReader reader = new BufferedReader(new FileReader(filename));
          String line;
          while ((line = reader.readLine()) != null) {
            System.out.println(line);
          }
          reader.close();
          validFlag = true;
        } catch (FileNotFoundException e) {
          System.out.printf("ERROR: File not found\nPlease enter the filepath of another file (hint type in \'test.txt\'): ");
          filename = scan.nextLine();
        }
      } while (validFlag != true);
      System.out.println("found the file " + filename);

      scan.close();
  }
}




