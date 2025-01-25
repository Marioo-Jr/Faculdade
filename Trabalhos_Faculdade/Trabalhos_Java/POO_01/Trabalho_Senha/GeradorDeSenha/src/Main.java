import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o tipo de senha:");
        System.out.println("1 - Apenas números");
        System.out.println("2 - Letras, números e símbolos");
        System.out.println("3 - Apenas letras minúsculas");

        int escolha = scanner.nextInt();

        System.out.print("Informe o tamanho da senha: ");
        int tamanho = scanner.nextInt();

        Senha geradorSenha = GeradordeSenha.getgerarsenha(escolha);
        String senha = geradorSenha.getsenha(tamanho);

        System.out.println("Senha gerada: " + senha);
    }
}
