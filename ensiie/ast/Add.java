package ensiie.ast;

/**
 * Add class representing a mathematical addition operation between two operands
 */
public class Add extends Operation {

    /**
     * Constructor of an instance of Add
     * @param left the left Node of an Addition operation
     * @param right the right Node of an Addition operation
     */
    public Add(Node left, Node right) {
        super(left, right);
    }

    /**
     * Get the evaluation's result of an addition between two operands (left & right)
     * @return int result of the addition
     */
    public int execute() {
        return this.op(0).execute() + this.op(1).execute();
    }

    /**
     * Get the addition operator in String format
     * @return "+" in String format
     */
    public String opString() {
        return "+";
    }
}
