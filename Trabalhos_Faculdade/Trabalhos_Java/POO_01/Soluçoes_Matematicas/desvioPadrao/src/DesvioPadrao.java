public class DesvioPadrao {
    double[] numero ;
    double valor;
    double v = 0;

    public DesvioPadrao ( double [] numero ) {
        this.numero = numero;
    }



    public double calcular (){
        double media = 0;      // aqui
        for (double valor : numero) {
            media += valor;
        }
        media = media / numero.length;
        for (double valor : numero) {
            v += Math.pow(valor - media, 2);
        }
        v = v / numero.length;
        return Math.sqrt(v);
    }


}
