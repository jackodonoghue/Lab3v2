public class Fraction {
    private double num;
    private double den;

    public double getNum() {
        return num;
    }

    public double getDen() {
        return den;
    }

    public void setNum(double num) {
        this.num = num;
    }

    public void setDen(double den) {
        this.den = den;
    }


    public String toString() {
        return num + "/" + den;
    }

    public Fraction(){
        this(0, 1);
    }

    public Fraction(double n, double d) {
        this.num = n;
        this.den = d;
    }

    public String addFraction(double n,double n1, double d, double d1) {
        double ansNum = (n * d1) + (n1 * d);
        double ansDen = d * d1;

        return "Value of " + n + "/" + d + " + " + n1 + "/" + d1 + " is " + ansNum + "/" + ansDen;
    }

    public String subFraction(double n,double n1, double d, double d1) {
        double ansNum = (n * d1) - (n1 * d);
        double ansDen = d * d1;

        return "Value of " + n + "/" + d + " - " + n1 + "/" + d1 + " is " + ansNum + "/" + ansDen;
    }

    public  String mulFraction(double n,double n1, double d, double d1) {
        double ansNum = n * n1;
        double ansDen = d * d1;

        return "Value of " + n + "/" + d + " * " + n1 + "/" + d1 + " is " + ansNum + "/" + ansDen;
    }

    public  String divFraction(double n,double n1, double d, double d1) {
        double ansNum = n * d1;
        double ansDen = d * n1;

        return "Value of " + n + "/" + d + " / " + n1 + "/" + d1 + " is " + ansNum + "/" + ansDen;
    }
}