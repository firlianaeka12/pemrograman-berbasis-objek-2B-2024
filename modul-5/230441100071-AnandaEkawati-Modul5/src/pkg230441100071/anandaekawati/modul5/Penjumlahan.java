package pkg230441100071.anandaekawati.modul5;
class Penjumlahan extends OperasiMTK {

    public Penjumlahan(double a, double b, double c) {
        super(a, b, c);
    }

    @Override
    public double hasil() {
        return a + b + c;
    }

    @Override
    public String operasi() {
        return "Penjumlahan";
    }
}