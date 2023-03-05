package ensiie.ast;

public class Neg extends Operation {
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

  public String opString() {
    return "-";
  }
}
