
public class Factorial { //factorial of 1st n number
    int facto(int n){
        if (n > 0){
            return n + facto(n -1);
        }else{
            return 0;
        }
    }
        public static void main (String[] args){
            Factorial f = new Factorial();
            System.out.println(f.facto(1000));
        }

}