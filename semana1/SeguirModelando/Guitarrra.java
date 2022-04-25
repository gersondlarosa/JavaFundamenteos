package semana1.SeguirModelando;

public class Guitarrra {

    public int brazo,cuerdas,maquinaria,trastes;
    public String tipoMadera;

    public int getBrazo(){return brazo;}
    public int getCuerdas(){return cuerdas;}
    public int getMaquinaria(){return maquinaria;}
    public int getTrastes(){return trastes;}
    public String getTipoMadera(){return tipoMadera;}

    public boolean setBrazo(int brazo){
        if(brazo > 0){
            this.brazo = brazo;
            return true;
        } else
            return false;
    }

    public boolean setCuerda(int cuerdas){
        if(cuerdas > 0 ){
            this.cuerdas = cuerdas;
            return true;
        } else
            return false;
    }

    public boolean setMaquinaria(int maquinaria){
        if (maquinaria > 0){
            this.maquinaria = maquinaria;
            return true;
        }else
            return false;

    }
    public boolean setTrastes(int trastes){
        if (trastes > 0){
            return true;
        }else
            return false;
    }

    public boolean setTipoMadera(String tipoMadera){
        if (!tipoMadera.isEmpty()){
            this.tipoMadera = tipoMadera;
            return true;
        }else
            return false;
    }

}
