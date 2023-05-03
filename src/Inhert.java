class Animal{
    void eat(){
        System.out.println("Animal eating");
    }
    void sleep(){
        System.out.println("Animal sleeping");
    }{
        System.out.println(" ");
    }
}
class Dog extends Animal{
    void pet(){
        System.out.println("Doggg is a pet animal");
    }
    void dogBreed(){
        System.out.println("siberiaaaa husky is a dog");
    }
}
class babyDog extends Dog{
    void pet(){
        System.out.println(" it is very cute pet ");}
    void dogBree(){
        pet();
        super.dogBreed();
        System.out.println("cute baby siberian husky");
    }
}
class Tiger extends Animal{
    void notAPet(){
        System.out.println("Tiger is not a pet animal");
    }
    void tigerBreed(){
        System.out.println("there are white tigers also");
    }
}

public class Inhert {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.eat(); d.sleep(); d.dogBreed(); d.pet();
        babyDog b = new babyDog();
        b.dogBree();b.pet();


        Tiger t = new Tiger();
        t.eat();
        t.sleep();
        t.notAPet();
        t.tigerBreed();
    }


}
