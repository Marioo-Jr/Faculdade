public class Equacao {
    private double a;
    private double b;
    private double c;

    public double getX2() {
        return x2;
    }

    public double getX1() {
        return x1;
    }

    private double x1;
    private double x2;

    public double getA (){
            return a;}

    public double getB (){
        return b;
    }

    public double getC (){
        return c;
    }

    public Equacao(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;


    }
    public void imprimirFormula(){
        System.out.println(a+"+"+"xˆ2"+"+"+ b + "x"+"+"+c);
    }


    public boolean calcular(){
        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            return false;
        }else if (delta == 0) {
            x1 = -b / (2 * a);
            x1=x2;
        }else {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
        }return true;

    }

}
