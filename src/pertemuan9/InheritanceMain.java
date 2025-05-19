package pertemuan9;

public class InheritanceMain {
	public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("1001", "Haifa", "Bandung");
        System.out.println(mhs.getNrp()+" - "+ mhs.getNama() + " - " + mhs.getAlamat());
    }

}
