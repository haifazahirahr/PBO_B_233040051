package Pertemuan11.tugas;

public class Main {
	 public static void main(String[] args) {
	        Mahasiswa mhs = new Mahasiswa("Haifa", "IF001");
	        Dosen dosen = new Dosen("Zahirah", "IF001");

	        mhs.pinjamBuku(2);      // valid
	        mhs.pinjamBuku(4);      // gagal
	        dosen.pinjamBuku(5);    // valid
	        dosen.pinjamBuku(6);    // gagal
	    }
}
