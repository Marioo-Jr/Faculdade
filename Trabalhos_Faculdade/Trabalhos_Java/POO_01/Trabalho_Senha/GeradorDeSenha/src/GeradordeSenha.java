public class GeradordeSenha {
    public static Senha getgerarsenha(int escolha) {
        return switch (escolha) {
            case 1 -> new Numero();
            case 2 -> new letraseNumeros();
            case 3 -> new letraMinuscula();
            default -> throw new IllegalArgumentException("Escolha inválida");
        };
    }
}
