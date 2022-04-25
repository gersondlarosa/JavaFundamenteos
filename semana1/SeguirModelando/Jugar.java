package semana1.SeguirModelando;

public class Jugar {

    public static void main(String[] args) {
        prenderControl();
    }

    public static void prenderControl(){

        Control control = new Control();

        control.setBotones(19);
        control.setPalanca(2);
        control.setPilas(2);
        control.setTipoControl("Control de Xbox");

        String msg = "Puedes jugar ya estoy prendido";
        msg += "\nBotones: "+ control.getBotones();
        msg += "\nPalancas: "+ control.getPalancas();
        msg += "\nCuantas pilas ocupa: " + control.getPilas();
        msg += "\nQue control es ?"+ control.getTipoControl();
        System.out.println(msg);

    }
}
