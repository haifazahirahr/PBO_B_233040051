package Pertemuan11.tugas;

public class Mahasiswa extends AnggotaPerpustakaan {
	//konstruktor Mahasiswa
    public Mahasiswa(String nama, String id) {
        super(nama, id);
    }

    //implementasi method pinjamBuku untuk Mahasiswa, Mahasiswa hanya boleh meminjam maksimal 3 buku
    @Override
    public boolean pinjamBuku(int jumlah) {
        if (jumlah <= 3) {
            System.out.println("Mahasiswa " + nama + " meminjam " + jumlah + " buku.");
            return true;
        } else {
            System.out.println("Gagal! Mahasiswa hanya boleh pinjam maksimal 3 buku.");
            return false;
        }
    }
}
