package semana1.SeguirModelando;

public class TocaGuitarra {

    public static void main(String[] args) {
        tocar();

    }

    public static void tocar(){
        Guitarrra guitarra = new Guitarrra();

        guitarra.setBrazo(1);
        guitarra.setCuerda(6);
        guitarra.setMaquinaria(2);
        guitarra.setTrastes(20);
        guitarra.setTipoMadera("Pino");

        String msg = "Haz tocado la guitarra y tiene las siguientes caracteristicas";
        msg += "\nBrazo: "+guitarra.getBrazo();
        msg += "\nCuerdas: "+guitarra.getCuerdas();
        msg += "\nMaquinaria: "+guitarra.getMaquinaria();
        msg += "\nTrastes: "+guitarra.getTrastes();
        msg += "\nTipo de madera: "+guitarra.getTipoMadera();
        System.out.println(msg);
    }
}
