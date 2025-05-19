package Pertemuan11.tugas;

public abstract class AnggotaPerpustakaan implements Peminjaman {
    protected String nama;
    protected String id;

    //konstruktor untuk menginisialisasi nama dan ID
    public AnggotaPerpustakaan(String nama, String id) {
        this.nama = nama;
        this.id = id;
    }
    //method abstrak tiap subclass 
    public abstract boolean pinjamBuku(int jumlah);
}
