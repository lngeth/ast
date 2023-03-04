package ensiie.ast;

public class Add implements Node {
    Scalar left;
    Scalar right;

    public Add(Scalar left, Scalar right) {
        this.left = left;
        this.right = right;
    }

    /**
     * Get the addition of left & right operand
     * @return int result of the addition
     */
    public int execute() {
        return this.left.get() + this.right.get();
    }

    /**
     * Get the string format of the addition's operation
     */
    public String toString() {
        return "(+" + this.left.get() + " " + this.right.get() + ")";
    }
}
