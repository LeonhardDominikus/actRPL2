package pert2_50421746; // Nama package yang digunakan

// Kelas Mahasiswa yang berisi atribut dasar mahasiswa
public class Mahasiswa {

    private String nama; // Atribut untuk menyimpan nama, npm dan umur mahasiswa
    private String npm;  
    private int umur;   

    // Konstruktor untuk menginisialisasi objek Mahasiswa
    public Mahasiswa(String nama, String npm, int umur) {
        this.nama = nama;
        this.npm = npm;
        this.umur = umur;
    }

    // Method untuk menampilkan data mahasiswa
    public void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("NPM: " + npm);
        System.out.println("Umur: " + umur);
    }
}
