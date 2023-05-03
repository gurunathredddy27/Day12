public class Meth4 {

    static int m1(int x){
        return x;
    }
    static String m1(String y){
        return y;
    }
    float m1(float x, float y){
        return x + y ;
    }

    public static void main(String[] args) {
        Meth4 m = new Meth4();
        float mm = m.m1(10.3f,10.2f);

        System.out.println(Meth4.m1(27));
        System.out.println(Meth4.m1("hello"));
        System.out.println(mm);

    }

    public static class Polymorphism {


    }
}
