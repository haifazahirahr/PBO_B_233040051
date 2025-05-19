package RelasiKelas;

import java.util.ArrayList;
import java.util.List;

public class KartuHasilStudi {
    private String semester;
    private double ips;
    private List<Matakuliah> daftarMatakuliah;

    public KartuHasilStudi(String semester) {
        this.semester = semester;
        this.daftarMatakuliah = new ArrayList<>();
    }

    public void addMatakuliah(Matakuliah matakuliah) {
        daftarMatakuliah.add(matakuliah);
    }

    public String display() {
        StringBuilder sb = new StringBuilder();
        for (Matakuliah mk : daftarMatakuliah) 
        {
            sb.append(mk.display());
            sb.append("\n");
        }
        return sb.toString();
    }

    public void hitungIPS() {
        double totalNilaiKaliSks = 0;
        int totalSks = 0;

        for (Matakuliah mk : daftarMatakuliah) {
            totalNilaiKaliSks += mk.getNilai() * mk.getSks();
            totalSks += mk.getSks();
        }

        if (totalSks > 0) {
            ips = totalNilaiKaliSks / totalSks;
        } else {
            ips = 0;
        }
    }

    // setter&Getter
    public double getIps() {
        return ips;
    }

	public Matakuliah[] getDaftarMatakuliah() {
		return null;
	}
    
	public void setSemester(String semester) {
	    this.semester = semester;
	}
	
	public String getSemester() {
	    return semester;
	}
	
}

