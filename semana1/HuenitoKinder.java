package semana1;

public class HuenitoKinder {

    public static  void main(String[] args){
        definicion();
    }

    public static void definicion(){
        Carrito carrito = new Carrito();
        carrito.setAleron(1);
        carrito.setLlantas(4);
        carrito.setPiesas(7);
        carrito.setToldo(1);
        carrito.setChasis(1);
        carrito.setcolorChasis("cafe");
        carrito.setColorAleron("Amarillo");
        carrito.setColorToldo("Verde");
        String msg = "Soy el carrito que salio en tu huevito Kinder ";
        msg += "\nPiesas "+carrito.getPiesas();
        msg += "\nAleron: "+carrito.getAleron();
        msg += "\nToldo: "+carrito.getToldo();
        msg += "\nChasis: "+carrito.getChasis();
        msg += "\nLlantas: "+carrito.getLlantas();
        msg += "\nColor de chasis: "+carrito.getColorChasis();
        msg += "\nColor de aleron: "+carrito.getColorAleron();
        msg += "\nColor de toldo: "+carrito.getColorToldo();
        System.out.println(msg);

    }
}
