package pkg230441100071.anandaekawati.modul5;
public class main {

    public static void main(String[] args) {
        double a = 10.5;
        double b = 0.5;
        double c = 1.25;

        OperasiMTK[] operasi = {
            new Penjumlahan(a, b, c),
            new Pengurangan(a,b, c),
            new Perkalian(a, b, c),
            new Pembagian(a,b, c)
        };

        for (OperasiMTK op : operasi) {
            System.out.println(op.operasi() + ": " + op.hasil());
        }
    }
}

