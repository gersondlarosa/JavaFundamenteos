package semana1.viernes;

class Bike2{
    void run(){
        System.out.println("running...");
    }
}

public class Polimorfismo extends  Bike2{

    @Override
    void run() {
        System.out.println("running safely with 60miles per hour");
    }

    public static void main(String[] args) {
        //ligadura dinamica
        Bike2 bike2 = new Polimorfismo();
        bike2.run();
    }
}
