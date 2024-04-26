/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul.pkg4;


public class Main {
    public static void main(String[] args) {
        double a = 9.25;
        double b = 1.25;
        OperasiAritmatika operasi = new OperasiAritmatikaSaya(a, b);

        System.out.println("Penjumlahan: " + operasi.penjumlahan());
        System.out.println("Pengurangan: " + operasi.pengurangan());
        System.out.println("Perkalian: " + operasi.perkalian());
        System.out.println("Pembagian: " + operasi.pembagian());
    }
    
}
