package pertemuan13;

public class TestAppConfig {
	public static void main(String[] args) {
        // mengakses konstanta dari kelas AppConfig tanpa membuat objek
        System.out.println("BASE_URL: " + AppConfig.BASE_URL);
        System.out.println("APP_VERSION: " + AppConfig.APP_VERSION);
        System.out.println("DEFAULT_TIMEOUT: " + AppConfig.DEFAULT_TIMEOUT + " ms");
    }
}
