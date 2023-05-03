public class Meth2 {
   public static int z1(){
        return 12;
    }
    float z2(){
        return 10.5f;
    }

    public static void main(String[] args) {
        Meth2 m1 = new Meth2();
        int x = m1.z1();

        System.out.println(x);
        System.out.println(m1.z2());
    }
}
