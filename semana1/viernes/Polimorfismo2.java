package semana1.viernes;

class Animal{
    //Caso1
    String color = "Blanco";

    //Caso dos
    void eat(){
        System.out.println("Comiendo....");
    }

    //Caso 3
    Animal(){
        System.out.println("Se crea un anial");
    }


}


class Gato extends Animal{
    //Caso1
    String color = "Cafe";
    void printColor(){
        System.out.println("Color de la clase Gato "+color);
        System.out.println("Color de la clase Animal"+super.color);
    }

    void eat(){
        System.out.println("Come atun");
    }

    void dormir(){
        System.out.println("Ya se furmio el michi");
    }

    void call(){
        super.eat();
        dormir();
    }

    //Caso 3
    Gato(){
        super();
        System.out.println("Se ha creado un gato");
    }

}
public class Polimorfismo2 {
    public static void main(String[] args) {

        //Caso 1
        //new Gato().printColor();

        //Caso 2
        //new Gato().call();

        //Caso 3
        new Gato();

    }
}
