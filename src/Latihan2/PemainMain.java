package Latihan2;

public class PemainMain {
	public static void main(String[] args) {
        
        Matakuliah mk1 = new Matakuliah("001", "Algoritma Pemrograman 1", "A", 3);
        Matakuliah mk2 = new Matakuliah("002", "Algoritma Pemrograman 2", "BC", 3);
        Matakuliah mk3 = new Matakuliah("003", "Pemrograman Berorientasi Objek", "B", 4);

      
        System.out.println(mk1.display());
        System.out.println("Nilai Index: " + mk1.nilaiIndex());

        System.out.println(mk2.display());
        System.out.println("Nilai Index: " + mk2.nilaiIndex());

        System.out.println(mk3.display());
        System.out.println("Nilai Index: " + mk3.nilaiIndex());

        double totalNilai = (mk1.nilaiIndex() * mk1.getSKS()) + 
                            (mk2.nilaiIndex() * mk2.getSKS()) + 
                            (mk3.nilaiIndex() * mk3.getSKS());

        int totalSKS = mk1.getSKS() + mk2.getSKS() + mk3.getSKS();

        double ipk = totalNilai / totalSKS;

        System.out.printf("\nIPK Anda: %.2f\n", ipk);
    }
}
