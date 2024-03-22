
package com.example;

import java.util.Scanner;

/**
 *
 * @author Muhammad Yusri
 */
public class Praktikum1_no2 {

    public static void main(String[] args) {
       
        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner pemasok = new Scanner(System.in);

        // Contoh membaca input string dari pengguna
        System.out.print("Masukkan nama anda: ");
        String nama = pemasok.nextLine();
        
        System.out.print("Masukkan NIM anda: ");
        String NIM = pemasok.nextLine();
        
        // pemasok.nextLine();
        
        System.out.print("Masukkan prodi anda: ");
        String prodi = pemasok.nextLine();
        
        System.out.print("Masukkan alamat anda: ");
        String alamat = pemasok.nextLine();
        System.out.println();
        
        // Output input yang diterima dari pengguna
        
        System.out.println("Nama Anda adalah: " + nama);
        System.out.println("NIM anda adalah: "+ NIM);
        System.out.println("Prodi anda adalah: "+ prodi);
        System.out.println("Alamat anda adalah: "+ alamat);
        System.out.println();
    }
}
