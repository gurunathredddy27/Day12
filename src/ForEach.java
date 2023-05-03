import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ForEach {
    //for(dataype of set/collection object : Collection)


    public static void main(String[] args) {
        Map<String,String> arr = new HashMap<String,String>();
        arr.put("Iqbal","Asif");
        arr.put("Roy","Pinaki");
        arr.put("Raghu","Raghu");
        arr.put("Shirke","Shubham");
        arr.put("Balla","Vidya");
        arr.put("reddy","GurunAth");
        arr.put("chavhan","Akash");
        arr.put("Pawar","Omkar");
        arr.put("Wanare","Kapil");
        arr.put("Kumar","Atul");
        System.out.println("For each loop");
        for(String i : arr.keySet()){
            System.out.println(i);
        }
        arr.forEach((k,v)-> System.out.println("LastName  " + k + "    " + "FirstName  "+ v ));
        //shortcut lamda function way of printing hashmap

        int a[] = {1,2,3,4,5};
        for (int i : a) {
            System.out.println(i);
        }
    }
}

