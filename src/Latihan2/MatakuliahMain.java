package Latihan2;

public class MatakuliahMain {
	 public static void main(String[] args) {
	        Matakuliah mk1 = new Matakuliah("001", "Alogoritma Pemograman 1", "A", 3);
	        Matakuliah mk2 = new Matakuliah("002", "Alogoritma Pemograman 2", "BC", 3);
	        Matakuliah mk3 = new Matakuliah("003", "Pemograman Berorientasi Objek", "B", 4);


	        System.out.println(mk1.display());
	        System.out.println("Nilai Index: " + mk1.nilaiIndex());

	        System.out.println(mk2.display());
	        System.out.println("Nilai Index: " + mk2.nilaiIndex());
	        
	        System.out.println(mk3.display());
	        System.out.println("Nilai Index: " + mk3.nilaiIndex());
	    }
}

