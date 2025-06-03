package pertemuan13;

//SavingsAccount adalah subclass dari BankAccount
public class SavingsAccount extends BankAccount {
	// konstruktor: kirim nomor rekening ke superclass
    public SavingsAccount(String accountNumber) {
        super(accountNumber);
    }

    // override method deposit untuk tambahkan pesan khusus
    @Override
    public void deposit(double amount) {
        super.deposit(amount); // tambahkan saldo seperti biasa dari BankAccount
        System.out.println("Saldo berhasil ditambah di tabungan: $" + amount);
    }

    // ERROR: tidak boleh override method final dari parent
    /*
    @Override
    public void displayAccountInfo() {
        System.out.println("Tes...");
    }
    */

    // Solusi: bikin method baru tanpa ganggu method final
    public void displayExtendedInfo() {
        super.displayAccountInfo(); // tetap bisa panggil method final
        System.out.println("Informasi tambahan dari SavingsAccount.");
    }
}
