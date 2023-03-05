package ensiie.ast;

public class Echo extends Operation {

  public Echo(Node node) {
    super(node);
  }

  public int execute() {
    int res = this.op(0).execute();
    System.out.println(res);
    return res;
  }

  public String opString() {
    return "echo";
  }
}
