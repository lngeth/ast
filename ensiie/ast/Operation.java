package ensiie.ast;

public abstract class Operation implements Node {
  private Node[] ops;

  public Operation(Node... ops) {
    this.ops = ops;
  }

  public Node op(int i) {
    return this.ops[i];
  }

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
