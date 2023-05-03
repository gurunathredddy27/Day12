public class Meth1 {
    int m1(){
        System.out.println("hello");
        return 10;

    }
    String m2(){
        return "hello2";
    }

    public static void main(String[] args) {
        Meth1 met = new Meth1();
        int x = met.m1();
        System.out.println(x);
        String y = met.m2();
        System.out.println(y);
    }

}