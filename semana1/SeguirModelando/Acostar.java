package semana1.SeguirModelando;

public class Acostar {

    public static void main(String[] args) {
        Dormir();
    }

    public static void Dormir(){
        Cama cama = new Cama();

        cama.setColchon(1);
        cama.setBase(1);
        cama.setSabanas(2);
        cama.setHedredon(1);
        cama.setCajones(2);
        cama.setColchas(1);
        cama.setTipoBase("Matrimonial ");
        cama.setTipoColchas("Colca de tigre de feria ");
        cama.setTipoBase("Matrimonial ");
        cama.setTipoColchon("Matrimonial hortopedico ");
        cama.setColorSabanas("Rojas ");
        cama.setTipoHedredon("Calientito ");
        String msg ="Yo soy tu cama ";
        msg += "\nColchon: "+cama.getColchon();
        msg += "\nBase: "+cama.getBase();
        msg += "\nsabanas: "+cama.getSabanas();
        msg += "\nHedredon: "+cama.getHedredon();
        msg += "\nCajones: "+cama.getCajones();
        msg += "\nColchas: "+cama.getColchas();
        msg += "\nTipo de base: "+cama.getTipoBase();
        msg += "\nTipo de colchas: "+cama.getTipoColchas();
        msg += "\nTipo de colchon:"+cama.getTipoColchon();
        msg += "\nColor de sabanas: "+cama.getColorSabanas();
        msg += "\nTipo de hedredon: "+cama.getTipoHedredon();
        System.out.println(msg);
    }
}
