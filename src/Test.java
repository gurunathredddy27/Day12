public class Test {
    String name;
    String phonenum;
    String gender;

    public static void main(String[] args) {
        Test p = new Test();
        Test p1 = new Test();
        Test p2 = new Test();
        p.name = "gurunath";
        p.phonenum = "123";
        p.gender = "Male";

        p1.name = "keerthi";
        p1.phonenum = "321";
        p1.gender = "Female";

        p2.name = "gurkee";
        p2.phonenum = " ";
        p2.gender = "143";

        p.test1();
        p1.test1();
        p2.test1();


    }
    public void test1(){

        System.out.println("My name is "+name + ", number is "+ phonenum + ", and iam " + gender);
    }
}
