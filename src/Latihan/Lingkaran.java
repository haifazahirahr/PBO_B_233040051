package Latihan;

class Lingkaran {
    private int jari2;

    public Lingkaran(int jari2) {
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

        System.out.println(l1.getJari2()); // Output: 5
        System.out.println(l2.getJari2()); // Output: 5

        l2.setJari2(10); 

        System.out.println(l1.getJari2()); // Output: 10
        System.out.println(l2.getJari2()); // Output: 10
    }
}

// contoh objek 1

