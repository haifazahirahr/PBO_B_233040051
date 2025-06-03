package pertemuan13;

public class Counter {
	// static: milik kelas, bukan milik objek
    // menyimpan jumlah total objek yang dibuat
    private static int instanceCount = 0;

    // konstruktor: dipanggil setiap kali objek baru dibuat
    public Counter() {
        instanceCount++; // tambah 1 setiap kali objek baru dibuat
    }

    // static method: bisa dipanggil tanpa buat objek
    public static int getInstanceCount() {
        return instanceCount; // kembalikan jumlah objek yang sudah dibuat
    }
}
