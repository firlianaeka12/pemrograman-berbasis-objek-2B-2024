/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cobaconstructor;

class Mahasiswa {
    String Nama, NIM, Jurusan;
    
    Mahasiswa (String inputNama, String inputNIM, String inputJurusan){
        Nama = inputNama;
        NIM = inputNIM;
        Jurusan = inputJurusan;
        
        System.out.println (Nama);
        System.out.println(NIM);
        System.out.println (Jurusan");
        System.out.println ("apakah berhasil");
    }
}
public class JavaApplication10 {

   public static void main (String[] args) {
       Mahasiswa orang1 = new Mahasiswa("Raka", "178", "sistem informasi");
   }
}
