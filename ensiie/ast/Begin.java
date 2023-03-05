package ensiie.ast;

public class Begin extends Operation {
  public Begin(Node... nodes) {
    super(nodes);
  }

  public int execute() {
    int res = 0;
    for (int i = 0; i < this.nbOps(); i++) {
      res = this.op(i).execute();
    }
    return res;
  }

  public String opString() {
    return "begin";
  }
}
