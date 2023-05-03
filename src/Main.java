
class Car {

    private int carPrice = 300;
    private String carName = "Tesla";

    public int getCarPrice(){
        return carPrice;
    }
    public String getCarName(){
        return carName;
    }


    public class Main {
        public static void main(String[] args) {

            Car obj = new Car();
            System.out.println(obj.getCarName() + ": " + obj.getCarPrice());
        }
    }
}