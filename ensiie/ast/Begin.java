package ensiie.ast;

/**
 * Begin class represent a mathematical operation in which a list of operations is
 * executed one by one
 */
public class Begin extends Operation {
  /**
   * Constructor of an instance of Begin
   * @param nodes a list of Node instance
   */
  public Begin(Node... nodes) {
    super(nodes);
  }

  /**
   * Get the evaluation's result of an Begin Evaluation, corresponding to the last Operation Node
   * @return Int value of the last Operation executed
   */
  public int execute() {
    int res = 0;
    for (int i = 0; i < this.nbOps(); i++) {
      res = this.op(i).execute();
    }
    return res;
  }

  /**
   * Get the Begin operator in String format
   * @return "Begin" in String format
   */
  public String opString() {
    return "begin";
  }
}
