package pkg230441100071.anandaekawati.modul5;
class Pembagian extends OperasiMTK {

    public Pembagian(double a, double b, double c) {
        super(a, b, c);
    }

    @Override
    public double hasil() {
        return a / b / c;
    }

    @Override
    public String operasi() {
        return "Pembagian";
    }
}