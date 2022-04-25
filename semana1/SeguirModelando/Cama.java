package semana1.SeguirModelando;

public class Cama {

    public int colchon, base, sabanas, hedredon, cajones, colchas;
    public String tipoColchon, tipoBase, colorSabanas, tipoHedredon, tipoColchas;

    public int getColchon(){return colchon;}
    public int getBase(){return base;}
    public int getSabanas(){return sabanas;}
    public int getHedredon(){return hedredon;}
    public int getCajones(){return  cajones;}
    public int getColchas(){return  colchas;}
    public String getTipoColchon(){return tipoColchon;}
    public String getTipoBase(){return  tipoBase;}
    public String getColorSabanas(){return  colorSabanas;}
    public String getTipoHedredon(){return  tipoHedredon;}
    public String getTipoColchas(){return  tipoColchas;}

    public boolean setColchon(int colchon){
        if (colchon > 0){
            this.colchon = colchon;
            return true;
        }else
            return false;
    }

    public boolean setBase(int base){
        if (base > 0){
            this.base = base;
            return true;
        }else
            return false;
    }

    public boolean setSabanas(int sabanas){
        if (sabanas > 0){
            this.sabanas = sabanas;
            return true;
        }else
            return false;
    }

    public boolean setHedredon(int hedredon){
        if (hedredon > 0){
            this.hedredon = hedredon;
            return true;
        }else
            return false;
    }

    public boolean setCajones(int cajones){
        if (cajones > 0){
            this.cajones = cajones;
            return true;
        }else
            return false;
    }

    public boolean setColchas(int colchas){
        if (colchas>0){
            this.colchas = colchas;
            return true;
        }else
            return false;
    }

    public  boolean setTipoColchon(String tipoColchon){
        if (!tipoColchon.isEmpty()){
            this.tipoColchon = tipoColchon;
            return true;
        }else
            return false;
    }

    public boolean setTipoBase(String tipoBase){
        if (!tipoBase.isEmpty()){
            this.tipoBase = tipoBase;
            return true;
        }else
            return false;
    }

    public boolean setColorSabanas(String colorSabanas){
        if (!colorSabanas.isEmpty()){
            this.colorSabanas = colorSabanas;
            return true;
        }else
            return false;
    }

    public boolean setTipoHedredon(String tipoHedredon){
        if(!tipoHedredon.isEmpty()){
            this.tipoHedredon = tipoHedredon;
            return true;
        }else
            return false;
    }

    public boolean setTipoColchas(String tipoColchas){
        if (!tipoColchas.isEmpty()){
            this.tipoColchon = tipoColchas;
            return true;
        }else
            return false;
    }

}
