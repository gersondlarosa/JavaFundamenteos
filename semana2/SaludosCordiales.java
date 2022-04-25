package semana2;

abstract class Hola{
    //Como lo hace
   void saludar(){
        System.out.println("¿Cómo es´tas?, te ves bien eh");
    }
    abstract void saludo();
}

interface Mostrar {
    //Que hace
    void show();
    abstract void despide();
}

public class SaludosCordiales implements Mostrar {

    public void show(){
        System.out.println("Hola, ¿Cómo esstás, espero no del todo mal?");
    }

    public static void main(String[] args) {
        SaludosCordiales saludo1 = new SaludosCordiales();

        saludo1.show();
        saludo1.despide();
    }

    public void despide(){
        System.out.println("Gracias, no");

    }


}
