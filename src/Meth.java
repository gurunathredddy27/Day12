public class Meth {

    void m1(int a, char b){
        System.out.println("hi");
        System.out.println(a);
        System.out.println(b);
        m2("hello", 10.3);

    }
    static void m2(String c, double d){
        System.out.println(c);
        System.out.println(d);
    }

    public static void main(String[] args) {
        Meth m = new Meth();
        m.m1(6, 'f');
        m.m2("hello", 10.3);
    }
}
