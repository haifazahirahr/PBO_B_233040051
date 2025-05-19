package Pertemuan3;

public class MahasiswaMain {
	public static void main(String[] args) {
		Mahasiswa m1 = new Mahasiswa("233040051", 3, true);
        

        // m1.nim = "233040041";
        // m1.ipk = 3.98;

        System.out.println(m1.nim);
        System.out.println(m1.ipk);
        System.out.println(m1.statusPerwalian);
        m1.perwalian();
        System.out.println(m1.statusPerwalian);
        
    }
}

