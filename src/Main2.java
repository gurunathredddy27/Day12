class ThrowsDemo{
    void demoThrows() throws Exception{
        int a = 100/0;
        System.out.println(a);
    }
}
public class Main2 {
    public static void main(String[] args) {
        ThrowsDemo t = new ThrowsDemo();
        try{
            t.demoThrows();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("handled!");
    }

}
