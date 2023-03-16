package ensiie.ast;

/**
 * If class represent an operation in which if the condition is true, the evaluation of the first 
 * operation is returned else, it is the result of the second operation that is returned
 */
public class If extends Operation {
  /**
   * Constructor of an instance of If class 
   * @param condition A Node representing the condition to validate or not
   * @param node1 Node instance that is executed if the condition is true
   * @param node2 Node instance that is executed if the condition is false
   */
  public If(Node condition, Node node1, Node node2) {
    super(condition, node1, node2);
  }

  /**
   * Get the evaluation's result of an If Evaluation
   * @return Int value of evalution of the first Node if the condition is true, else it returns the evaluation of the second Node
   */
  public int execute() {
    if (this.op(0).execute() != 0)
      return this.op(1).execute();
    return this.op(2).execute();
  }

  /**
   * Get the If operator in String format
   * @return "if" in String format
   */
  public String opString() {
    return "if";
  }
}
