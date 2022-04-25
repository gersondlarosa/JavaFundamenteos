package semana1.SeguirModelando;

public class Control {

    public int botones, palancas, pilas;
    public String tipoControl;

    public int getBotones() {return botones;}
    public int getPalancas() {return palancas;}
    public int getPilas() {return pilas;}
    public String getTipoControl(){return tipoControl;}

    public boolean setBotones(int botones){
        if (botones >0 ){
            this.botones = botones;
            return true;
        }else
            return false;
    }

    public boolean setPalanca(int palanca){
        if (palanca > 0){
            this.palancas = palanca;
            return true;
        }else
            return false;
    }

    public boolean setPilas(int pilas){
        if (pilas > 0) {
            this.pilas = pilas;
            return true;
        }else
            return false;
    }

    public boolean setTipoControl(String tipoControl){
        if (!tipoControl.isEmpty()){
            this.tipoControl = tipoControl;
            return true;
        }else
            return false;
    }
}
