package ensiie.ast;

/**
 * Operation abstract class represent a list of Node
 */
public abstract class Operation implements Node {
  private Node[] ops;

  /**
   * Constructor of an instance of Operation
   * @param ops list of Node
   */
  public Operation(Node... ops) {
    this.ops = ops;
  }

  /**
   * Get a specified Node by index
   * @param i the int index of wanted Node
   * @return the wanted Node instance
   */
  public Node op(int i) {
    return this.ops[i];
  }

  /**
   * Get the number of operand in this Operation
   * @return Int number of Operations
   */
  public int nbOps() {
    return this.ops.length;
  }

  /**
   * Get the operator sign
   * @return String format of the operator
   */
  public abstract String opString();

  /**
   * Get the string format of the addition's operation
   * @return String format of Operation sign followed by the operand(s) in parenthesis
   */
  public String toString() {
    String res = "(" + this.opString() + " ";
    for (int i = 0; i < this.nbOps(); i++) {
      res += this.op(i);
      if (i != this.nbOps()-1)
        res += " ";
    }
    return res + ")";
  }
}
