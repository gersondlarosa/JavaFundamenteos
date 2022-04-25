package semana2;

abstract class Katar{
    abstract void cambiarArma();
}

class Tiefth extends Katar{

    @Override
    void cambiarArma(){
        System.out.println("Cambia el arma a una Katar Infiltrator");
    }
}

public class AssasinCross extends Katar{

    public static void main(String[] args) {

        Katar katar1 = new AssasinCross();
        Katar daga = new Tiefth();

        katar1.cambiarArma();
        daga.cambiarArma();

    }

    @Override
    void cambiarArma() {
        System.out.println("Haz tomado una daga envenedada");
    }
}
