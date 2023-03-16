package ensiie.ast;

/**
 * Lt class represent a comparison operation in which it checks if the first Node is lower than the second Node
 */
public class Lt extends Operation {
  /**
   * Constructor of an instance of Lt class
   * @param node1 the first Node instance to compare
   * @param node2 the second Node instance to compare
   */
  public Lt(Node node1, Node node2) {
    super(node1, node2);
  }

  /**
   * Get the evaluation of an Lt Operation
   * @return Int value, 1 if the evaluation of first Node is lower than the second one, else 0
   */
  public int execute() {
    if (this.op(0).execute() < this.op(1).execute())
      return 1;
    return 0;
  }

  /**
   * Get the Lt operation in String format
   * @return "<" in String format
   */
  public String opString() {
    return "<";
  }
}
