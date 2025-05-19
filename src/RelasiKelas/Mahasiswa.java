package RelasiKelas;

public class Mahasiswa {
	private String NRP;
	private String nama;

	public Mahasiswa() {
	    
	}

	public Mahasiswa(String NRP, String nama) {
		this.NRP = NRP;
	    this.nama = nama;
	}

	public String display() {
		return "NRP: " + NRP + ", Nama: " + nama;
	}

	public String getNRP() {
		return NRP;
	}

	public void setNRP(String NRP) {
		this.NRP = NRP;
	}

	// Getter dan Setter untuk nama
	public String getNama() {
	    return nama;
	}

	public void setNama(String nama) {
	    this.nama = nama;
	}

	public static void main(String[] args) {
	    Mahasiswa mhs1 = new Mahasiswa("303040001", "Jhon");
	    System.out.println(mhs1.display());
	}	
}


