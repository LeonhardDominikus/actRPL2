package pert2_50421746; // Nama package yang digunakan

// Kelas MahasiswaSarjana yang merupakan turunan dari kelas Mahasiswa
public class MahasiswaSarjana extends Mahasiswa {

    private String jurusan; // Atribut tambahan untuk menyimpan jurusan mahasiswa sarjana

    // Konstruktor untuk menginisialisasi objek MahasiswaSarjana
    public MahasiswaSarjana(String nama, String npm, int umur, String jurusan) {
        super(nama, npm, umur); // Memanggil konstruktor kelas induk (Mahasiswa)
        this.jurusan = jurusan;
    }

    // Method untuk menampilkan data mahasiswa sarjana, termasuk data dari kelas induk
    @Override
    public void tampilkanData() {
        super.tampilkanData(); // Memanggil method tampilkanData dari kelas induk
        System.out.println("Jurusan: " + jurusan);
    }
}
