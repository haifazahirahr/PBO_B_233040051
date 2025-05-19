package Pertemuan3;

public class Mahasiswa {
	 String nim;
	 double ipk;
	 boolean statusPerwalian;

	 //konstruktor
	 public Mahasiswa (String nim, double ipk, boolean statusPerwalian){
		 this.nim = nim;
	     this.ipk = ipk;
	     this.statusPerwalian = statusPerwalian;
	    }
	 public void perwalian(){
		 statusPerwalian=true;
	    }
}
