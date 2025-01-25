import  java.util.Currency;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a quantidade que deseja converter: ");
        double quantidadeReal = scanner.nextDouble();

        Dinheiro varDinheiro = new Dinheiro(quantidadeReal); // Dinheiro é a classe.

        System.out.println("Escolha qual para qual moeda deseja converter seu dinheiro:  ");
        System.out.println("+-----------MENU-----------+");
        System.out.println("| 1 -DOLAR                 |");
        System.out.println("| 2 -LIBRA                 |");
        System.out.println("| 3 -EURO                  |");
        System.out.println("+-----------****-----------+");
        scanner.nextLine();
        TipoMoeda tipo = null;
        //aa
        while (true){
            String choice = scanner.nextLine();

            switch (choice){

                case "1":// dolar
                    tipo = TipoMoeda.DOLAR;

                    break;

                case "2"://libra

                    tipo = TipoMoeda.LIBRA;

                    break;

                case "3":// euro

                    tipo = TipoMoeda.EURO;

                    break;


                default:
                    System.out.println("escolha um opcao da lista");
                    break;


            }

            double valorFinal = varDinheiro.converter(tipo);
            System.out.printf("O valor convertido é: %.2f\n", valorFinal, tipo);
        }
    }
}