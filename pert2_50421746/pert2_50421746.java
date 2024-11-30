package pert2_50421746; // Nama package yang digunakan

public class pert2_50421746 { // Kelas utama untuk menjalankan program

    public static void main(String[] args) {
        // Membuat objek Mahasiswa
        Mahasiswa mahasiswa = new Mahasiswa("Aji", "51421449", 21);
        mahasiswa.tampilkanData(); // Menampilkan data mahasiswa
        System.out.println();

        // Membuat objek MahasiswaSarjana (subkelas dari Mahasiswa)
        MahasiswaSarjana mahasiswaSarjana = new MahasiswaSarjana("Adrian", "1233465", 22, "Informatika");
        mahasiswaSarjana.tampilkanData(); // Menampilkan data mahasiswa sarjana beserta jurusannya
        System.out.println();
    }
}