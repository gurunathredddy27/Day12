import java.util.Scanner;
import java.util.Random;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("employee wage computation");

        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        int ifPresent = ran.nextInt(2);
        if (ifPresent == 0) {
            System.out.println("Employee is present");
        } else {
            System.out.println("Employee is absent");
        }
        System.out.println("enter your designation with number");
        System.out.println("1: Technical Assistant");
        System.out.println("2: Service Engineer");
        System.out.println("3: Supervisors");

        int designation = sc.nextInt();

        System.out.println("number of week off present");
        int weekoff = sc.nextInt();
        System.out.println("number of OT's");
        int overTime = sc.nextInt();

        if (designation == 1) {
            if (weekoff > 4) {
                System.out.println("enter valid present number");
            } else {
                float TechAssSalary = 16000;
                float perDaySalary = TechAssSalary / 26;
                float weekOffSalary = weekoff * perDaySalary; //3*653
                float otSalary = overTime * perDaySalary;
                float totalSalary = perDaySalary * 26 + weekOffSalary + otSalary;
                System.out.println("your monthly salary is " + totalSalary);
            }

        } else if (designation == 2) {
            if (weekoff > 4) {
                System.out.println("Please enter valid week off ");
            } else {
                float serviceEng = 25000;
                float perDaySalary = serviceEng / 26;   //961
                float weekOffSalary = weekoff * perDaySalary; //3*961
                float otSalary = overTime * perDaySalary;
                float totalSalary = perDaySalary * 26 + weekOffSalary + otSalary;
                System.out.println("your monthly salary is " + totalSalary);
            }
        } else {
            if (weekoff > 4) {
                System.out.println("dont tell lies, tell correct ");
            } else {
                float superVisor = 20000;
                float perDaySalary = superVisor / 26;   //961
                float weekOffSalary = weekoff * perDaySalary; //3*961
                float otSalary = overTime * perDaySalary;
                float totalSalary = perDaySalary * 26 + weekOffSalary + otSalary;
                System.out.println("your monthly salary is " + totalSalary);

            }
        }
    }
}