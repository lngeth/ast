package ensiie.ast;

public class If extends Operation {
  public If(Node condition, Node node1, Node node2) {
    super(condition, node1, node2);
  }

  public int execute() {
    if (this.op(0).execute() != 0)
      return this.op(1).execute();
    return this.op(2).execute();
  }

  public String opString() {
    return "if";
  }
}
