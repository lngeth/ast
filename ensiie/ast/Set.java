package ensiie.ast;

public class Set extends Operation {
  public Set(Variable var, Node node) {
    super(var, node);
  }

  public int execute() {
    int res = this.op(1).execute();
    ((Variable) this.op(0)).set(res);
    return res;
  }

  public String opString() {
    return "set!";
  }
}
