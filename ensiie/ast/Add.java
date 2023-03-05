package ensiie.ast;

public class Add extends Operation {

    public Add(Node left, Node right) {
        super(left, right);
    }

    /**
     * Get the addition of left & right operand
     * @return int result of the addition
     */
    public int execute() {
        return this.op(0).execute() + this.op(1).execute();
    }

    /**
     * Get the addition operator in String format
     * @return String format of '+' operator
     */
    public String opString() {
        return "+";
    }
}
