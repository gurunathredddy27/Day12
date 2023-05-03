
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
class Mobile{
    int price;
    String model;
    String brand;
    public Mobile(int price,String model, String brand){
        this.price = price;
        this.model = model;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "price=" + price +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
public class PhoneLamda {
    public static void main(String[] args) {
        List<Mobile> mobileList = new ArrayList<Mobile>();
        mobileList.add(new Mobile(5000,"s4" ,"Samsung" ));
        mobileList.add(new Mobile(10000,"s5" ,"Redmi" ));
        mobileList.add(new Mobile(15000,"s7" ,"MI" ));
        mobileList.add(new Mobile(20000,"4" ,"Oneplus" ));
        mobileList.add(new Mobile(50000,"14" ,"Apple" ));
        mobileList.stream().filter(i -> i.price >= 10000).forEach(i-> System.out.println(i.price + "  "+i.brand));
    }
}
