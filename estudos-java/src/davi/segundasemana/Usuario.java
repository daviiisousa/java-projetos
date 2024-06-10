package davi.segundasemana;

public class Usuario {
    public static void main(String[] args) throws Exception {
    SmartTv smartTv = new SmartTv();

    System.out.println("A Tv esta ligada ?" + smartTv.ligada);
    System.out.println("Volume :" + smartTv.volume);
    System.out.println("Canal :" + smartTv.canal);

    smartTv.ligar();{
        System.out.println("A Tv esta ligada ? " + smartTv.ligada);
    }

    smartTv.diminuirVolumer();{
        System.out.println("Volume :" + smartTv.volume);
    }

    smartTv.mudarCanal(55);{
        System.out.println("Canal :" + smartTv.canal);

    }
}
}
