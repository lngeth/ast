package ensiie.ast;

public class Main {
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

        // Test calculation
        Add add1 = new Add(s_1, s_2);
        Add add2 = new Add(s_3, s_4);
        Neg neg2 = new Neg(add2);
        Add add3 = new Add(add1, neg2);
        System.out.println(add3);
        System.out.println(add3.execute());

        // Test Variable
        System.out.println("----------------");
        Variable x = new Variable("x");
        Add add4 = new Add(x, s_20);
        System.out.println(x);
        System.out.println(add4);
        System.out.println(add4.execute());

        // Test Set
        System.out.println("----------------");
        Set set1 = new Set(x, s_22);
        System.out.println(set1);
        System.out.println(set1.execute());
        Add add5 = new Add(x, s_20);
        System.out.println(add5);
        System.out.println(add5.execute());

        // Test Echo
        System.out.println("----------------");
        Echo echo1 = new Echo(add1);
        Add add6 = new Add(echo1, s_7);
        System.out.println(add6);
        System.out.println(add6.execute());

        // Test If
        System.out.println("----------------");
        If if1 = new If(s_1, s_42, s_666);
        System.out.println(if1);
        System.out.println(if1.execute());
        If if2 = new If(s_0, s_42, s_666);
        System.out.println(if2);
        System.out.println(if2.execute());

        // Test Begin
        System.out.println("----------------");
        Echo echo0 = new Echo(s_0);
        Begin begin1 = new Begin(echo0, s_42);
        If if3 = new If(s_1, begin1, s_666);
        System.out.println(if3);
        System.out.println(if3.execute());

        // Test While
        System.out.println("----------------");
        Variable x2 = new Variable("x");
        Echo echo2 = new Echo(x2);
        Set set2 = new Set(x2, new Add(x2, s_1));
        Begin begin2 = new Begin(echo2, set2);
        Lt lt1 = new Lt(x2, s_10);
        While while1 = new While(lt1, begin2);
        Set set3 = new Set(x2, s_0);
        Begin begin3 = new Begin(set3, while1);
        System.out.println(begin3);
        System.out.println("Resultat final : " + begin3.execute());

        
        int x_true = 0;
        while (x_true < 10) {
            x_true += 1;
        }
        System.out.println("Resultat attendu : " + x_true);
    }
}