/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul.pkg4;
import java.util.Scanner;

public class ProgramUtama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OperasiBilanganAbs operasi;

        System.out.print("Masukkan nilai A: ");
        double a = scanner.nextDouble();
        System.out.print("Masukkan nilai B: ");
        double b = scanner.nextDouble();

        System.out.println("Pilih operasi:");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.print("Masukkan pilihan (1-4): ");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                operasi = new OperasiPenjumlahan();
                break;
            case 2:
                operasi = new OperasiPengurangan();
                break;
            case 3:
                operasi = new OperasiPerkalian();
                break;
            case 4:
                operasi = new OperasiPembagian();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                return;
        }

        operasi.setA(a);
        operasi.setB(b);
        operasi.setC();
        operasi.tampil();
    }
}
    

