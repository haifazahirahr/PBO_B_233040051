package tugasPertemuan9;

public class Kuliah {
	protected String nama;
    protected String matkul;

    public Kuliah(String nama,String matkul) {
    	this.nama = nama;
        this.matkul = matkul;
    }

    public String getNama() {
        return nama;
    }

    public String getMatkul() {
        return matkul;
    }
}
