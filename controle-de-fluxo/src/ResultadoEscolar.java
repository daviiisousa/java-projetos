public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 6;

        if(nota >= 6){
            System.out.println("APROVADO");
        }else if(nota >= 5 && nota < 7){
            System.out.println("RECUPERAÇAO");
        }else{
            System.out.println("REPROVADO");
        }
        

    }
}
