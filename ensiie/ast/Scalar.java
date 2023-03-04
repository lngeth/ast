package ensiie.ast;

public class Scalar implements Node {
    private int value;

    public Scalar(int value) {
        this.value = value;
    }

    /**
     * Get the value of the scalar
     * @return int value
     */
    public int get() {
        return this.value;
    }

    public int execute() {
        return this.value;
    }

    /**
     * Get in String format the characteristic of an instance of Scalar
     */
    public String toString() {
        return Integer.toString(this.value);
    }
}
