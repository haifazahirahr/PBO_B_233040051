package Latihan;
class Lingkaran2 {
	private int jari2;

    public Lingkaran2(int jari2) {
        this.jari2 = jari2;
    }

    public int getJari2() {
        return jari2;
    }

    public void setJari2(int jari2) {
        this.jari2 = jari2;
    }
    
    public static void main(String[] args) {
        Lingkaran l1 = new Lingkaran(5); 
        Lingkaran l2 = l1; 
        Lingkaran l3 = new Lingkaran(7); 

        System.out.println(l1.getJari2()); // Output: 5
        System.out.println(l2.getJari2()); // Output: 5
        System.out.println(l3.getJari2()); // Output: 7

        l2 = l3; 

        System.out.println(l1.getJari2()); // Output: 5 
        System.out.println(l2.getJari2()); // Output: 7 
        System.out.println(l3.getJari2()); // Output: 7 
    }
}

//contoh objek 3
