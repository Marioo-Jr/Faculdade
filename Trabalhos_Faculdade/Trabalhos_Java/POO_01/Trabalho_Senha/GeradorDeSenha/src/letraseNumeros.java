import java.security.SecureRandom;

public class letraseNumeros implements Senha {
    private static final String tudo = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789$&#@_";
    private SecureRandom random = new SecureRandom();

    @Override
    public String getsenha(int tamanho) {
        StringBuilder senha = new StringBuilder();
        for (int i = 0; i < tamanho; i++) {
            int letraNumero = random.nextInt(tudo.length());
            senha.append(tudo.charAt(letraNumero));
        }
        return senha.toString();
    }
}
