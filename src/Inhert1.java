class Animall{
    Animall(){

        System.out.println("Animal 0- arg constructor");
    }
    Animall(int a){
        System.out.println("Animal 1- arg constructor");
    }
}
class Cat extends Animall{
    Cat(){
        this(27);
        System.out.println("cat 0- arg constructor");
    }
    Cat(int a){
        super(2); // we need to change the parameter for the execution of the method in the parent class
        System.out.println("cat 1- arg constructor");
    }
}
public class Inhert1 {
    public static void main(String[] args) {
        new Cat();

    }
}
