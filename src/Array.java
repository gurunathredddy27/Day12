import java.util.Scanner;

public class Array {

    public static void main(String[] args) {


        int b[] = new int[5];  //default value of integer array
        b[0] = 10;
        b[1] = 10;
        b[2] = 10;
        for(int b1 : b){
            System.out.println(b1);
        }
        boolean c[] = new boolean[5];  //default value of boolean
        c[0] = false;
        c[1] = true;
        for(boolean c1 : c){
            System.out.println(c1);
        }




        int a[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter how many number you want");
        int n = sc.nextInt();
        if(n == 1){
        System.out.println("type  "+ n+" number");
        }else{
            System.out.println("type " + n + " numbers");
        }

        for(int i = 0; i<n; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i<n; i++){
            System.out.println(a[i]);
        }

//        for( int aa : a){
//            System.out.println(aa);
//        }
    }
}
