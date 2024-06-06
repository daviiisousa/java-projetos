public class MinhaClasse {
    public static void main(String[] args) {
        String nome = "Davi";
        String sobrenome = "sousa";
        String todoNome = todoNome(nome, sobrenome);
        System.out.println(todoNome);
    }

    public static String todoNome (String nome, String sobrenome) {
        return nome.concat(" ").concat(sobrenome);
    }
}
