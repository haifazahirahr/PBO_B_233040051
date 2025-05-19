package Pertemuan11.tugas;

//interface yang mendefinisikan kontrak bahwa setiap peminjam harus bisa meminjam buku
public interface Peminjaman {
    //method yang harus diimplementasikan: mencoba meminjam sejumlah buku
	boolean pinjamBuku(int jumlah);
}
