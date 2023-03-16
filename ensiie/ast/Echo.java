package ensiie.ast;

/**
 * Echo class represent an intermediary step which helps to print value of a certain operation
 * Useful for debug
 */
public class Echo extends Operation {

  /**
   * Constructor of instance of Echo
   * @param node A Node instance to be printed, and considered as an intermediary step
   */
  public Echo(Node node) {
    super(node);
  }

  /**
   * Get & print in the console the evaluation's result of a Node
   * @return Int value of the evaluation
   */
  public int execute() {
    int res = this.op(0).execute();
    System.out.println(res);
    return res;
  }

  /**
   * Get the Echo operator in String format
   * @return "Echo" in String format
   */
  public String opString() {
    return "echo";
  }
}
