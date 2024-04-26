/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul3;


public class Buku {
   
    private String judul;
    private String penulis;
    private String publisher;
    private String kategori;
    private int stok;
    private int tahunTerbit;

    public Buku(String judul, String penulis, String publisher, String kategori, int stok, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.publisher = publisher;
        this.kategori = kategori;
        this.stok = stok;
        this.tahunTerbit = tahunTerbit;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getKategori() {
        return kategori;
    }

    public int getStok() {
        return stok;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    @Override
    public String toString() {
        return "Judul: " + judul + ", Penulis: " + penulis + ", Publisher: " + publisher + ", Kategori: " + kategori + ", Stok: " + stok + ", Tahun Terbit: " + tahunTerbit;
    }
}


    

