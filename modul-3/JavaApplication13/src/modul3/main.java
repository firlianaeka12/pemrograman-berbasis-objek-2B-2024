/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul3;
import java.util.ArrayList;


public class main {
    public static void main(String[] args) {
        ArrayList<Buku> daftarBuku = new ArrayList<>();
        EntriDataBuku entri = new EntriDataBuku("", "", "", "", 0, 0);

        entri.entriDataBuku(daftarBuku);
        entri.tampilDataBuku(daftarBuku);
    }
}
    

