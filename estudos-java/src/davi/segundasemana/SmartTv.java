package davi.segundasemana;
public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int NovoCanal){
        canal = NovoCanal;
    }

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVolumer(){
        volume++;
    }

    public void diminuirVolumer(){
        volume--;
    }
}
