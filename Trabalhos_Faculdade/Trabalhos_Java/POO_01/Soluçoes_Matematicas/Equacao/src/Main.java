public class Main {
    public static void main(String[] args) {
        Equacao numero = new Equacao (4,2,0);
        boolean sucesso = numero.calcular();
        if (sucesso) {
            System.out.println("x1 = " + numero.getX1());
            System.out.println("x2 = " + numero.getX2());
        }

    }
}


