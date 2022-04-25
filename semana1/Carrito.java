package semana1;

public class Carrito {

    public int piesas, aleron, llantas, toldo, chasis;
    public String colorAleron, colorChasis, colorToldo;

    public int getPiesas(){ return piesas; }
    public int getAleron(){ return aleron; }
    public int getLlantas(){ return llantas; }
    public int getToldo(){ return toldo; }
    public int getChasis(){return chasis; }
    public String getColorToldo(){return colorToldo;}
    public String getColorAleron(){return colorAleron;}
    public String getColorChasis(){return colorChasis;}

    public boolean setPiesas(int piesas){
        if (piesas > 0){
            this.piesas = piesas;
            return true;
        }else
            return false;
    }

    public boolean setAleron(int aleron){
        if (aleron > 0){
            this.aleron = aleron;
            return true;
        }  else
            return false;
    }

    public boolean setLlantas(int llantas){
        if (llantas >0){
            this.llantas = llantas;
            return true;
        }else
            return false;
    }

    public boolean setToldo(int toldo){
        if (toldo >0){
            this.toldo = toldo;
            return true;
        }else
            return false;
    }

    public boolean setChasis( int chasis){
        if(chasis >0){
            this.chasis = chasis;
            return true;
        }else
            return false;
    }

    public boolean setColorAleron(String colorAleron){
        if(!colorAleron.isEmpty()){
            this.colorAleron = colorAleron;
            return true;
        }else
            return false;
    }

    public  boolean setcolorChasis( String colorChasis){
        if (!colorChasis.isEmpty()){
            this.colorChasis = colorChasis;
            return true;
        }else
            return false;
    }

    public boolean setColorToldo(String colorToldo){
        if (!colorToldo.isEmpty()){
            this.colorToldo = colorToldo;
            return true;
        }else
            return false;
    }

    public String printState(){
        return "piesas: "+piesas+"\n"+
                "aleron: "+aleron+"\n"+
                "llantas: "+llantas+"\n"+
                "toldo: "+toldo+"\n"+
                "chasis: "+chasis+"\n"+
                "colorAleron: "+colorAleron+"\n"+
                "colorChasis: "+colorChasis+"\n"+
                "colorToldo: "+colorToldo+"\n";


    }




}
