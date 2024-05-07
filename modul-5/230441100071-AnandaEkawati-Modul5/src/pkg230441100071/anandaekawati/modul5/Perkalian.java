package pkg230441100071.anandaekawati.modul5;
class Perkalian extends OperasiMTK {

    public Perkalian(double a, double b, double c) {
        super(a, b, c);
    }

    @Override
    public double hasil() {
        return a * b * c;
    }

    @Override
    public String operasi() {
        return "Perkalian";
    }
}