import java.sql.Date;

/******************************************************************************
 * Compilation: javac R05_OBJ05_J.java 
 * Execution: java R05_OBJ05_J
 * Example of returning a private object, can compromise integrity of the program
 ******************************************************************************/

class MutableClass {
  private Date d;
 
  public MutableClass() {
    this.d = new Date(0);
  }

  // Helper function to compare the reference of Date Object
  public boolean IsSameObject(Date one) {
    if(one == d) {
      return true;
    }
    return false;
  }
 
  public Date getDate() {
    return d;
  }

  /*
  * Rule 05. Object Orientation (OBJ)
  * Do not return references to private mutable class members
  * Per: https://wiki.sei.cmu.edu/confluence/display/java/OBJ05-J.+Do+not+return+references+to+private+mutable+class+members
  */
  public Date getDateCompliant() {
    return (Date)d.clone();
  }
}

public class R05_OBJ05_J {
  public static void main(String[] args) {
    // Initialize the state
    MutableClass mu = new MutableClass();
    Date d;

    // This noncompliant code example shows a getDate() accessor method that returns the sole instance of the private Date object:
    System.out.println("\nResult of Non-Compliant Code");
    d = mu.getDate();
    System.out.println("is this the exposed private object? " + mu.IsSameObject(d));


    // This compliant code example shows unexposed private object
    System.out.println("\nResult of Compliant Code");
    d = mu.getDateCompliant();
    System.out.println("is this the exposed private object? " + mu.IsSameObject(d));
  }
}




