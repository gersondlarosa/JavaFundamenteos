package semana1.viernes;

public class Empleado {
    double salario = 40000;

}

class Programadora extends Empleado {
    int bono = 1000;

    public void main(){
        Programadora ger = new Programadora();
        System.out.println("El salario de el programador es: "+ ger.salario);
        System.out.println("El bono de el programador es: "+ ger.bono);
    }

    void mensaje(){
        System.out.println("Soy programador");
        main();
    }

}

class Web extends Programadora{
    public static void main(String[] args) {
        Web w = new Web();
        w.mensaje();
    }
}
