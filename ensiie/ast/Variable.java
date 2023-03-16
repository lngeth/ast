package ensiie.ast;

/**
 * Variable class represent a informatical variable with a name and a value associated
 */
public class Variable extends Scalar {
  private String name;

  /**
   * Constructor of an instance of Variable class
   * @param name the String name of the Variable
   */
  public Variable(String name) {
    super(0);
    this.name = name;
  }

  /**
   * Get the name of the variable
   * @return String format of Variable's name
   */
  public String toString() {
    return this.name;
  }
}
