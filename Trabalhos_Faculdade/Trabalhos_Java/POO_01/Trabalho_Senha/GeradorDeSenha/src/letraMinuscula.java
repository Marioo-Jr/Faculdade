import java.security.SecureRandom;

public class letraMinuscula implements Senha {
    private static final String Minuscula = "abcdefghijklmnopqrstuvwxyz";
    private SecureRandom random = new SecureRandom();

    @Override
    public String getsenha(int tamanho) {
        StringBuilder senha = new StringBuilder();
        for (int i = 0; i < tamanho; i++) {
            int aleatorioMinuscula = random.nextInt(Minuscula.length());
            senha.append(Minuscula.charAt(aleatorioMinuscula));
        }
        return senha.toString();
    }
}
