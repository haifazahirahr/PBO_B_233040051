package RelasiKelas;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TranskripNilai {
    private Date tglCetak;
    private double ipk;
    private List<KartuHasilStudi> kartuHasilStudi;
    private Mahasiswa mahasiswa;

    public TranskripNilai(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
        this.kartuHasilStudi = new ArrayList<>();
        this.tglCetak = new Date();
    }

    public void hitungIPK() {
        double totalNilaiKaliSks = 0;
        int totalSks = 0;

        for (KartuHasilStudi khs : kartuHasilStudi) {
            for (Matakuliah mk : khs.getDaftarMatakuliah()) {
                totalNilaiKaliSks += mk.getNilai() * mk.getSks();
                totalSks += mk.getSks();
            }
        }

        if (totalSks > 0) {
            ipk = totalNilaiKaliSks / totalSks;
        } else {
            ipk = 0;
        }
  }

    public void addKHS(KartuHasilStudi khs) {
        kartuHasilStudi.add(khs);
    }

    public void display() {
        System.out.println(mahasiswa.display());
        System.out.println("Tanggal Cetak: " + tglCetak.toString());
        System.out.println("IPK: " + ipk);
        for (KartuHasilStudi khs : kartuHasilStudi) {
            System.out.println(khs.display());
        }
    }
    // Getter untuk daftar KHS
    public List<KartuHasilStudi> getKartuHasilStudi() {
        return kartuHasilStudi;
    }
}

