import java.security.SecureRandom;

public class Numero implements Senha {
    private static final String numeros = "0123456789";
    private SecureRandom random = new SecureRandom();

    @Override
    public String getsenha(int tamanho) {
        StringBuilder senha = new StringBuilder();
        for (int i = 0; i < tamanho; i++) {
            int numeroAleatorio = random.nextInt(numeros.length());
            senha.append(numeros.charAt(numeroAleatorio));
        }
        return senha.toString();
    }
}
