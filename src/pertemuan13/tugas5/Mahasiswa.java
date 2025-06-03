package pertemuan13;

public class Mahasiswa {
	// NIM itu unik dan gak boleh diubah setelah dibuat
    private final String nim;
    /// Nama mahasiswa bisa diubah kapan saja
    private String nama;
    // Hitung total mahasiswa yang sudah dibuat, shared di semua objek
    private static int totalMahasiswa = 0;
    // Batas maksimal SKS yang berlaku untuk semua mahasiswa
    public static final int MAX_SKS = 24;

    public Mahasiswa(String nim, String nama) {
        this.nim = nim; 
        this.nama = nama; 
        totalMahasiswa++; // setiap mahasiswa baru, totalnya bertambah
    }

    public void displayInfo() {
        System.out.println("NIM  : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Max SKS : " + MAX_SKS);
        System.out.println();
    }

    public static int getTotalMahasiswa() {
        return totalMahasiswa; // ambil total mahasiswa yang sudah dibuat
    }
}
