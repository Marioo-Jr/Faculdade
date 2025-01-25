public class JurosCompostos {

    private double capital;
    private double taxaJuros;
    private double tempo;
    private double lucroJuros;


    public void setLucroJuros(double lucroJuros) {
        this.lucroJuros = lucroJuros;
    }

    public JurosCompostos(double lucroJuros) {
        this.lucroJuros = lucroJuros;
    }





    public double getTempo() {
        return tempo;
    }


    public double getCapital() {
        return capital;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }



    public JurosCompostos (double capital, double taxaJuros, double tempo ) {

        this.taxaJuros = taxaJuros;
        this.tempo = tempo;
        this.capital = capital;
    }

    public void imprimir() {            //why does it need to be void?
        System.out.println("m = C(1+I)T");
    }

    public double calculo(){
        double montante = 0;
        taxaJuros = (taxaJuros /100)+1;
        montante =capital*Math.pow( taxaJuros,tempo );
        return montante;

    }

    public double LucroJuros(){
        double montante = 0;
        taxaJuros = (taxaJuros /100)+1;
        montante =capital*Math.pow( taxaJuros,tempo );

        lucroJuros = montante - capital;
        return lucroJuros;

    }

}

