import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("informe o capital: ");
//        double capital = sc.nextDouble();
//        System.out.println("informe a taxa de juros: ");
//        double taxaJuros = sc.nextDouble();
//        System.out.println("informe o tempo do investimento: ");
//        double tempo = sc.nextDouble();

        DecimalFormat df = new DecimalFormat("0.00");
        DecimalFormat df1 = new DecimalFormat("0");
        // coloque os valores na ordem: Capital / Taxa de Juros / Tempo
        JurosCompostos juros = new JurosCompostos(1000,10,3);
        double juroscompostos = juros.calculo();
        double lucro = juros.LucroJuros();
        System.out.println("Você terá um total de: " + df.format(juroscompostos) +" R$ \n" +
                "e voce terá um lucro de: "+ df.format(lucro) + " em " + df1.format(juros.getTempo())+ " anos.");
    }
}