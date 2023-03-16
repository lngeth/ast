package ensiie.ast;

/**
 * While class representing a informatical loop in which an operation will be executed until a condition is negative
 */
public class While extends Operation {
  /**
   * Constructor of an instance of While class
   * @param cond the Node representing the condition, that if its true, it execute an Operation
   * @param n the Node representing an operation to execute if the condition is true
   */
  public While(Node cond, Node n) {
    super(cond, n);
  }

  /**
   * Get the value of the last executed operation when the loop is done
   * @return Int value of the last evaluation
   */
  public int execute() {
    Node n = this.op(0);
    if (n.execute() != 0) {
      int res = 0;
      do {
        res = this.op(1).execute();
      } while (n.execute() != 0);
      return res;
    }
    return 0;
  }
  
  /**
   * Get the representation of a While instance in String
   * @return "while" in String format
   */
  public String opString() {
    return "while";
  }
}
