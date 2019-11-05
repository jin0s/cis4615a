/******************************************************************************
 *  Compilation:  javac R02_XP00_J.java
 *  Execution:    java R02_XP00_J
 *
 ******************************************************************************/

import java.io.File;
import java.io.IOException;

public  class R02_XP00_J {

 /*
  * Rule 02. Expressions (EXP)
  * Do not ignore values returned by methods Given the non-compliant code below
  */
  public static void deleteFile(){
    File someFile = new File("someFleName.txt");
    // Do something with someFile

    someFile.delete();
    System.out.println("Output from deleteFile(): ");
  }

  public static void main(String[] args) {
    // Using Noncompliant code ignoring values returned by methods resulting in no output or response of the delete status
    deleteFile();
  
  }
}




