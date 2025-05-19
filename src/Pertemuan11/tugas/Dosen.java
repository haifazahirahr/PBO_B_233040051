package Pertemuan11.tugas;

public class Dosen extends AnggotaPerpustakaan {
	//konstruktor Dosen,
    public Dosen(String nama, String id) {
        super(nama, id);
    }

    //implementasi method pinjamBuku untuk Dosen, Dosen hanya boleh meminjam maksimal 5 buku
    @Override
    public boolean pinjamBuku(int jumlah) {
        if (jumlah <= 5) {
            System.out.println("Dosen " + nama + " meminjam " + jumlah + " buku.");
            return true;
        } else {
            System.out.println("Gagal! Dosen hanya boleh pinjam maksimal 5 buku.");
            return false;
        }
    }
}
