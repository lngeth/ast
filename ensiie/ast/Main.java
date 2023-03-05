package ensiie.ast;

public class Main {
    /**
     * Print method to check Class characteristics (toString) & evaluation (execute)
     * @param name String name of the Class
     * @param node Node instance to analyse
     */
    public static void testPrintClass(String name, Node node, boolean endline) {
        System.out.println("Test " + name + " :");
        System.out.println(node);
        System.out.println(node.execute());
        if (endline)
            System.out.println("----------------");
    }
    public static void main(String[] args) {
        // All Scalar
        Scalar s_0 = new Scalar(0);
        Scalar s_1 = new Scalar(1);
        Scalar s_2 = new Scalar(2);
        Scalar s_3 = new Scalar(3);
        Scalar s_4 = new Scalar(4);
        Scalar s_7 = new Scalar(7);
        Scalar s_10 = new Scalar(10);
        Scalar s_20 = new Scalar(20);
        Scalar s_22 = new Scalar(22);
        Scalar s_42 = new Scalar(42);
        Scalar s_666 = new Scalar(666);

        // All instance of Class
        Add add;
        Variable x;
        Set set;
        Echo echo;
        If ifcond;
        Begin begin;
        While whilebloc;

        // Test Add
        add = new Add(new Add(s_1, s_2), new Add(s_3, s_4));
        testPrintClass("Add", add, true);

        // Test Neg
        add = new Add(new Add(s_1, s_2), new Neg(new Add(s_3, s_4)));
        testPrintClass("Neg", add, true);

        // Test Variable
        x = new Variable("x");
        System.out.println(x);
        add = new Add(x, s_20);
        testPrintClass("Variable", add, true);

        // Test Set
        testPrintClass("Set", new Set(x, s_22), false);
        add = new Add(x, s_20);
        testPrintClass("Add after Set", add, true);

        // Test Echo
        add = new Add(new Echo(new Add(s_1, s_2)), s_7);
        testPrintClass("Echo", add, true);

        // Test If
        ifcond = new If(s_1, s_42, s_666);
        testPrintClass("If cond != 0", ifcond, false);
        ifcond = new If(s_0, s_42, s_666);
        testPrintClass("If cond == 0", ifcond, true);

        // Test Begin
        echo = new Echo(s_0);
        begin = new Begin(echo, s_42);
        ifcond = new If(s_1, begin, s_666);
        testPrintClass("Begin", ifcond, true);

        // Test While
        x = new Variable("x"); // Reset the x Variable
        set = new Set(x, new Add(x, s_1)); // (set! x (+ x 1))
        begin = new Begin(new Echo(x), set); // (begin (echo x) (set! ...))
        whilebloc = new While(new Lt(x, s_10), begin); // (while (< x 10) (begin ...))
        testPrintClass("While", new Begin(new Set(x, s_0), whilebloc), true);

        // Exercice 5.e. Interpretation and computation of expected value
        int x_true = 0;
        while (x_true < 10) {
            x_true += 1;
        }
        System.out.println("Resultat attendu : " + x_true);
    }
}