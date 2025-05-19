package tugasPertemuan9;

public class Mahasiswa extends Kuliah {
	private String nrp;

    public Mahasiswa(String nama, String matkul, String nrp) {
    	super(nama, matkul);
      	setNrp(nrp);
    	}
        public void setNrp(String nrp) {
        	this.nrp = nrp;
        }
        
        public String getNrp() {
            return nrp;
        }
}
