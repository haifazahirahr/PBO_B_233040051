package pertemuan13;

public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa("233040051", "Haifa");
        Mahasiswa m2 = new Mahasiswa("233040065", "Diana");
        Mahasiswa m3 = new Mahasiswa("233040061", "Ellen");


        m1.displayInfo();
        m2.displayInfo();
        m3.displayInfo();
        
        System.out.println("Total Mahasiswa: " + Mahasiswa.getTotalMahasiswa());
    }
}
