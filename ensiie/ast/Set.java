package ensiie.ast;

/**
 * Set class is used to set a value a Variable instance
 */
public class Set extends Operation {
  /**
   * Constructor of an instance of Variable class
   * @param var the Variable instance we want to modify its value
   * @param node the Node representing the value we want to set for the Variable
   */
  public Set(Variable var, Node node) {
    super(var, node);
  }

  /**
   * Get the evaluation's value of a Set
   * @return Int value representing the value of the Scalar set for the Variable instance
   */
  public int execute() {
    int res = this.op(1).execute();
    ((Variable) this.op(0)).set(res);
    return res;
  }

  /**
   * Get the operator of the Set operation
   * @return "set!" in String format
   */
  public String opString() {
    return "set!";
  }
}
