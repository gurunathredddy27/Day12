import java.sql.SQLOutput;

public class Constructor {

    int age;
    String name;
    float salary;
    public Constructor(int epAge, String epName, float epSalary){
        age = epAge;
        name = epName;
        salary = epSalary;
    }{
        System.out.println("hello ");
    }

    public static void main(String[] args) {
        Constructor EpDetails = new Constructor(24, "ram", 25000);
        System.out.println(EpDetails.age);
        System.out.println(EpDetails.name);
        System.out.println(EpDetails.salary);
    }

}