package ensiie.ast;

public class While extends Operation {
  public While(Node cond, Node n) {
    super(cond, n);
  }

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
  
  public String opString() {
    return "while";
  }
}
