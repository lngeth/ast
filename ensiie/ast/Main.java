package ensiie.ast;

public class Main {
    public static void main(String[] args) {
        Scalar s1 = new Scalar(1);
        Scalar s2 = new Scalar(2);

        System.out.println(s1);

        Add add = new Add(s1, s2);
        System.out.println(add.execute());
        System.out.println(add);
    }
}