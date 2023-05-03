
abstract class Abstract{
    abstract void m1();
    abstract void m2();
    abstract void m3();
    public static void m4(){
        System.out.println(" my method");
    }
     static class Abstract1 extends Abstract{
        @Override
        void m1() {
            System.out.println(" m1 method");
        }

        @Override
        void m2() {
            System.out.println("m2 method");
        }

        @Override
        void m3() {
            System.out.println("m3 method");
        }
    }

    public static void main(String[] args) {
        Abstract1 abs = new Abstract1();
        abs.m1(); abs.m2(); abs.m3();
        abs.m4();


    }
}