package semana2;

abstract class Montaña{
    Montaña(){
        System.out.println("Se ha creado una bicicleta de montaña");
    }

    abstract void cambiarVelocidad();
    void cambiarColor(){
        System.out.println("Cambiando color a rojo");
    }
}

class Migistronic extends Montaña{

    void cambiarVelocidad(){
        System.out.println("Se debo desbloear modificar las perillas del maubrio primero");
    }
}

public class Bicibleta {
    void cambiarVelocidad(){
        System.out.println("Gira las perillas");
    }

    public static void main(String[] args) {
        Montaña bici1 = new Migistronic();


        bici1.cambiarVelocidad();
        bici1.cambiarColor();
    }

}


