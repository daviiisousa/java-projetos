import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class SobreMim {
    public static void main(String[] args) {
        try{
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("Oii meu nome e " + nome + " " + sobrenome +  " e tenho" + idade + " anos");
        }
        catch(InputMismatchException invalido){
            System.out.println("voce prencheeu um campo errado, por favor refaça");
        }
    }
}
