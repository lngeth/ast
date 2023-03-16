package ensiie.ast;

/**
 * Neg class represent the negation of a Node
 */
public class Neg extends Operation {
  /**
   * Constructor of an instance of Neg class
   * @param operand the list of Node representing each operand that we want to set to negative
   */
  public Neg(Node... operand) {
    super(operand);
  }

  /**
   * Get the negative value of the only operand
   * @return negative int of the operand
   */
  public int execute() {
    return - this.op(0).execute();
  }

  /**
   * Get the String representing the Neg class
   * @return "-" in String format
   */
  public String opString() {
    return "-";
  }
}
