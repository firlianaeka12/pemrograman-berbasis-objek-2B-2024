/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul3;
import java.util.ArrayList;
import java.util.Scanner;


public class EntriDataBuku extends Buku {
    public EntriDataBuku(String judul, String penulis, String publisher, String kategori, int stok, int tahunTerbit) {
        super(judul, penulis, publisher, kategori, stok, tahunTerbit);
    }

    public void entriDataBuku(ArrayList<Buku> daftarBuku) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah buku: ");
        int jumlahBuku = scanner.nextInt();
        scanner.nextLine(); // Membersihkan buffer

        for (int i = 0; i < jumlahBuku; i++) {
            System.out.println("\nMasukkan data buku ke-" + (i + 1) + ":");
            System.out.print("Judul: ");
            String judul = scanner.nextLine();
            System.out.print("Penulis: ");
            String penulis = scanner.nextLine();
            System.out.print("Publisher: ");
            String publisher = scanner.nextLine();
            System.out.print("Kategori (SU/D/R/A): ");
            String kategori = scanner.nextLine();
            System.out.print("Stok: ");
            int stok = scanner.nextInt();
            System.out.print("Tahun Terbit: ");
            int tahunTerbit = scanner.nextInt();
            scanner.nextLine(); // Membersihkan buffer

            Buku buku = new EntriDataBuku(judul, penulis, publisher, kategori, stok, tahunTerbit);
            daftarBuku.add(buku);
        }
    }

    public void tampilDataBuku(ArrayList<Buku> daftarBuku) {
        System.out.println("\nDaftar Buku:");
        for (Buku buku : daftarBuku) {
            System.out.println(buku);
        }
    }
}
