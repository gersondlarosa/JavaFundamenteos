package semana1.viernes;
class Animal2{
    void eat(){
        System.out.println("Comiento...");
    }
}

class Dog extends Animal{
    void eat(){
        System.out.println("Comiendo croquetas");
    }
}

class Cachorro extends Animal{
    void eat(){
        System.out.println("Tomando agua");
    }
}

public class SuperTest {

    public static void main(String[] args) {
        Animal sam;
        sam = new Animal();
        sam.eat();
        sam = new Dog();
        sam.eat();
        sam = new Cachorro();
        sam.eat();

    }

}
