package ensiie.ast;

public class Lt extends Operation {
  public Lt(Node node1, Node node2) {
    super(node1, node2);
  }

  public int execute() {
    if (this.op(0).execute() < this.op(1).execute())
      return 1;
    return 0;
  }

  public String opString() {
    return "<";
  }
}
