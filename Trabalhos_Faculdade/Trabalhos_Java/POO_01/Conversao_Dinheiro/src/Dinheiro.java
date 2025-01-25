public class Dinheiro {
    public static double valoremReais;//pq tem que ser static ??

    public double getValoremReais() {
        return valoremReais;
    }


    public Dinheiro(double valoremReais) {
        this.valoremReais = valoremReais;
    }






    public double converter(TipoMoeda moeda){
        double conversao = 0;
        switch (moeda){
            case TipoMoeda.DOLAR:
                conversao = 0.18;
                break;

            case TipoMoeda.EURO:
                conversao = 0.17;
                break;

            case TipoMoeda.LIBRA:
                conversao = 0.14;
                break;

            default:
                System.out.println("digite um tipo de moeda valido!!");

        }
        return valoremReais*conversao;
    }




}





