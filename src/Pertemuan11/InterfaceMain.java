package Pertemuan11;

public class InterfaceMain {
	public static void main(String[] args) {
        // Membuat objek KartuElektronik dengan kode bank "IF111" dan PIN "123"
       KartuElektronik k = new KartuElektronik("IF111", "123");

       // Memanggil method otentikasi dengan input PIN "123"
       // Akan mencetak "Otentikasi: true" karena PIN cocok
       System.out.println("Otentikasi:"+ k.otentikasi("123"));
   }
}
