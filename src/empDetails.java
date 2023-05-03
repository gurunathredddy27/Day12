import java.util.Random;
public class empDetails {
    public static void main(String[] args) {
        Random obj = new Random();

        int attendance = obj.nextInt(2);
        if(attendance == 0){
            System.out.println("employee is present");
        }else {
            System.out.println("employee is absent");
        }

    }

}
