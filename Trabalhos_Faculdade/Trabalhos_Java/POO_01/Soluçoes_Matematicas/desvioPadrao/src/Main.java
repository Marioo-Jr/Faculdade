public class Main {
    public static void main(String[] args) {
        double [] numero = {1.55,1.70,1.80};
        DesvioPadrao padrao  = new DesvioPadrao(numero);
        double desviopadrao = padrao.calcular();
        System.out.printf("O desvio padrao é de: %.4f",desviopadrao);
    }
}

