package pertemuan12;

public class Main {
    public static void main(String[] args) {
        Hewan hewan1 = new Kucing("Kucing Anggora");
        Hewan hewan2 = new Anjing("Anjing Husky");

        hewan1.info();
        hewan1.buatSuara();  

        hewan2.info();
        hewan2.buatSuara();  
    }

}


