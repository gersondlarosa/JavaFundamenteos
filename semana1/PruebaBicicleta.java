package semana1;

public class PruebaBicicleta {

    public static void main(String[] args) {
        def();
    }

    public static void def(){
        //Intacia de clases
        Bicicleta biciMountain = new Bicicleta();
        biciMountain.setColor("Negra");
        biciMountain.setPins(6);
        biciMountain.setRodada(26);
        biciMountain.setVelocidad(13.2);
        String msg = " Soy una bici de montaña con estras caracteisticas: ";
        msg += "\nColor: "+biciMountain.getColor();
        msg += "\nVelocidad: "+biciMountain.getVelocidad();
        msg += "\nPins: "+biciMountain.getPins();
        msg += "\nRodada:"+biciMountain.getRodada();

        System.out.print(msg);

    }




}
