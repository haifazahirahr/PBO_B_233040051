package Latihan;

public class Lingkaran4 {
	    private int jari2;

	    public Lingkaran4(int jari2) {
	        this.jari2 = jari2;
	    }

	    public int getJari2() {
	        return jari2;
	    }

	    public static void main(String[] args) {
	        Lingkaran l1 = new Lingkaran(5);
	        Lingkaran l2 = l1; 
	        Lingkaran l3 = new Lingkaran(7);  

	        System.out.println(l1.getJari2()); 
	        System.out.println(l2.getJari2()); 
	        System.out.println(l3.getJari2()); 

	        l1 = null;
	        l2 = null;
	        l3 = null;
	    }
}

// contoh null ke 2