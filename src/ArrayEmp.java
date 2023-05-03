public class ArrayEmp {

    public static void main(String[] args) {
        Arrayempl e1 = new Arrayempl(111, "ram");
        Arrayempl e2 = new Arrayempl(222, "krishna");
        Arrayempl e3 = new Arrayempl(333, "radha");

        Arrayempl[] emp = new Arrayempl[3];
        emp[0] = e1;
        emp[1] = e2;
        emp[2] = e3;

        for(Arrayempl ee : emp){
            System.out.println(ee.eid + ee.ename);
        }

    }

}
