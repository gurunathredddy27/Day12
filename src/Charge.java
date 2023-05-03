public class Charge {
    static int a = 20;
    static int b= 30;
    int c = a +b;

    public static void main(String[] args) {

        Charge obj = new Charge();
        System.out.println(Charge.a + Charge.b);
        System.out.println(obj.a + obj.b);
        System.out.println(obj.c);
        obj.m1();

    }
    public void m1(){
        System.out.println(Charge.a);
        System.out.println(c);

    }
}