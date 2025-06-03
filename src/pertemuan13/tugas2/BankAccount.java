package pertemuan13;

public class BankAccount {
	// variabel final: hanya bisa diisi sekali lewat konstruktor
    private final String accountNumber;

    // variabel protected: bisa diakses oleh subclass
    protected double balance;

    // konstruktor: set nomor rekening, saldo awal = 0
    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    // method untuk menambah saldo
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount; // tambahkan ke saldo
        }
    }

    // method final: tidak bisa dioverride di subclass
    public final void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance       : " + balance);
    }
}
