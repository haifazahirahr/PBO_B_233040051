package pertemuan13;

public class TestDatabaseConnection {
	public static void main(String[] args) {
        // akses variabel static connectionString dari class DatabaseConnection
        // ini juga otomatis memicu static block di class tersebut (jika belum dijalankan)
        System.out.println("URL koneksi: " + DatabaseConnection.connectionString);
    }
}
