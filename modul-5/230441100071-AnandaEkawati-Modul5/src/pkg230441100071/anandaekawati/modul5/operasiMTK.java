package pkg230441100071.anandaekawati.modul5;
abstract class OperasiMTK {

    protected double a;
    protected double b;
    protected double c;

    public OperasiMTK(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public abstract double hasil();

    public abstract String operasi();
}
