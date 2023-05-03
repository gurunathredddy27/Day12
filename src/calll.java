public class calll {

    void met(){

        System.out.println("methods and constructor");
    }

    public static void main(String[] args) {

        calll c = new calll();
        calll c1 = new calll(1);
        calll c2 = new calll(2,3);
        c.met();
        c1.met();
        c2.met();

    }

    calll(){

        System.out.println("no arguments ");
    }
    calll(int a){

        System.out.println("1 arguments");
    }
    calll(int a, int b){
        System.out.println("2 arguments");
    }

}

