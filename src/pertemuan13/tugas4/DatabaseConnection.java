package pertemuan13;

public class DatabaseConnection {
	public static String connectionString;

    // static block: dijalankan sekali saat class pertama kali digunakan

    static {
        connectionString = "jdbc:mysql://localhost:3306/mydb";
        System.out.println("Koneksi ke database telah disiapkan.");    
   }
}
