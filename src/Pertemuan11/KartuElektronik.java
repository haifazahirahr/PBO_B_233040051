package Pertemuan11;

public class KartuElektronik implements Kartu {
    //atribut kodeBank dan pin
    private String kodeBank;
    private String pin;

     //konstruktor untuk kode bank dan PIN
    public KartuElektronik(String kodeBank, String pin){
        super();
        this.setKodeBank(kodeBank);
        this.pin=pin;
    }

     //method
    @Override
    public boolean otentikasi (String pinInput){
        // Mengecek PIN cocok atau tidak
        if (pin.equals(pinInput))
            return true;
        else
            return false;
    }

    @Override
    public String encode (String pin){
        //melakukan inputan PIN
        return null;
    }

	public String getKodeBank() {
		return kodeBank;
	}

	public void setKodeBank(String kodeBank) {
		this.kodeBank = kodeBank;
	}

}
