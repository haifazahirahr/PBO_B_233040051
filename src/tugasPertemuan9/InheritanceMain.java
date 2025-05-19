package tugasPertemuan9;

public class InheritanceMain {
	public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("Haifa ZR", "Pemrograman Berorientasi Objek", "233040051");

        System.out.println(mhs.getNama()+" - "+ mhs.getMatkul() + " - " + mhs.getNrp());
    }

}
