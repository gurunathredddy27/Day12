package LamdaExpressions;

import java.util.ArrayList;
import java.util.List;

public class LamdaDemo2 {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<String>();
        arr.add("Asif");
        arr.add("Pinaki");
        arr.add("Raghu");
        arr.add("Shubham");
        arr.add("Vidya");
        arr.add("Gurunath");
        arr.add("Akash");
        arr.add("Omkar");
        arr.add("Kapil");
        arr.add("Atul");
        System.out.println("For each loop");
//        for(String i : arr){
//            System.out.println(i);;
//        }
        arr.forEach((i)-> System.out.println(i));
    }
}
//"Lamda expressions is used to provide the implimentation/ body of the method to an interface". It can only provide to functional interfaces
