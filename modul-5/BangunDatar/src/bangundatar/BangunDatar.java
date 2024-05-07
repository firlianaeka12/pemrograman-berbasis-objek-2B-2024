package bangundatar;
package projectmodul5;

public abstract class BangunDatar {

    protected double luas;

    public abstract void hitungLuas();

    public double getLuas() {
        return luas;
    }
}


package projectmodul5;

public class Persegi extends BangunDatar{
    private double sisi;

    public void setSisi(double sisi) {
        this.sisi = sisi;
  }
    
    public double getSisi() {
        return sisi;
    }

    public void hitungLuas() {
         luas = sisi * sisi;
    }
    
    public void info() {
        System.out.println("Persegi");
        System.out.println("Sisi: " + getSisi());
        System.out.println("Luas: " + getLuas());
    }
}


package projectmodul5;

public class PersegiPanjang extends BangunDatar {
    private double panjang;
    private double lebar;

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }
    
    public double getPanjang() {
        return panjang;
    }
     
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double getLebar() {
        return lebar;
    }
    
    public void hitungLuas() {
        luas = panjang * lebar;
    }
    
    public void info() {
        System.out.println("Persegi Panjang");
        System.out.println("Panjang: " + getPanjang());
        System.out.println("Lebar: " + getLebar());
        System.out.println("Luas: " + getLuas());
    }
}


package projectmodul5;

public class Lingkaran extends BangunDatar {
    private double jariJari;

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    public double getJariJari() {
        return jariJari;
    }
    
    public void hitungLuas() {
        luas = Math.PI * jariJari * jariJari;
    }
    
    public void info() {
        System.out.println("Lingkaran");
        System.out.println("Jari-jari: " + getJariJari());
        System.out.println("Luas: " + getLuas());
    }
}


package projectmodul5;

public class Segitiga extends BangunDatar {
    private double alas;
    private double tinggi;

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public double getAlas() {
        return alas;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }
    
    public void hitungLuas() {
        luas = 0.5 * alas * tinggi;
    }
    
    public void info() {
        System.out.println("Segitiga");
        System.out.println("Alas: " + getAlas());
        System.out.println("Tinggi: " + getTinggi());
        System.out.println("Luas: " + getLuas());
    }
}


package projectmodul5;
import java.util.Scanner;

public class Hasil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BangunDatar bangunDatar;
        
        System.out.println("=======================");
        System.out.println("Pilih bangun datar:");
        System.out.println("=======================");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Lingkaran");
        System.out.println("4. Segitiga");
        System.out.println("=======================");
        System.out.println();
        System.out.print("Masukkan pilihan (1-4): ");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                bangunDatar = new Persegi();
                System.out.print("Masukkan sisi: ");
                double sisi = scanner.nextDouble();
                ((Persegi) bangunDatar).setSisi(sisi);
                bangunDatar.hitungLuas();
                ((Persegi) bangunDatar).info();
                break;
            case 2:
                bangunDatar = new PersegiPanjang();
                System.out.print("Masukkan panjang: ");
                double panjang = scanner.nextDouble();
                ((PersegiPanjang) bangunDatar).setPanjang(panjang);
                System.out.print("Masukkan lebar: ");
                double lebar = scanner.nextDouble();
                ((PersegiPanjang) bangunDatar).setLebar(lebar);
                bangunDatar.hitungLuas();
                ((PersegiPanjang) bangunDatar).info();
                break;
            case 3:
                bangunDatar = new Lingkaran();
                System.out.print("Masukkan jari-jari: ");
                double jariJari = scanner.nextDouble();
                ((Lingkaran) bangunDatar).setJariJari(jariJari);
                bangunDatar.hitungLuas();
                ((Lingkaran) bangunDatar).info();
                break;
            case 4:
                bangunDatar = new Segitiga();
                System.out.print("Masukkan alas: ");
                double alas = scanner.nextDouble();
                ((Segitiga) bangunDatar).setAlas(alas);
                System.out.print("Masukkan tinggi: ");
                double tinggi = scanner.nextDouble();
                ((Segitiga) bangunDatar).setTinggi(tinggi);
                bangunDatar.hitungLuas();
                ((Segitiga) bangunDatar).info();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }
    }
}
