package ensiie.ast;

public class Variable extends Scalar {
  private String name;

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
