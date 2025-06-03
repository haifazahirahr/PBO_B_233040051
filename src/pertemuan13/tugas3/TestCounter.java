package pertemuan13;

public class TestCounter {
	public static void main(String[] args) {
        Counter c1 = new Counter(); // objek pertama
        Counter c2 = new Counter(); // objek kedua
        Counter c3 = new Counter(); // objek ketiga
        Counter c4 = new Counter(); // objek keempat (tadi tulisannya ketiga lagi 😄)

        // panggil method static untuk cek total objek
        System.out.println("Total objek Counter : " + Counter.getInstanceCount());
    }
}
