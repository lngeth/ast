package ensiie.ast;

/**
 * Scalar class represent a real Number
 */
public class Scalar implements Node {
    private int value;

    /**
     * Constructor of an instance of a Scalar
     * @param value the Int value of the number wanted
     */
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

    /**
     * Set the value of the scalar
     * @param value Int value of the Scalar to set
     */
    public void set(int value) {
        this.value = value;
    }

    /**
     * Get the value of the Scalar
     * @return Int value of the Scalar
     */
    public int execute() {
        return this.value;
    }

    /**
     * Get in String format the characteristic of an instance of Scalar
     * @return Value of the Scalar in String format
     */
    public String toString() {
        return Integer.toString(this.value);
    }
}
