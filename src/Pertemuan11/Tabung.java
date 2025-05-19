package Pertemuan11;

public class Tabung extends Bentuk{
    //atribut tinggi tabung
    private int tinggi;

     //konstruktor yang memanggil bentuk dengan jari-jari 0
    public Tabung(){
        super(0);
    }

    //konstruktor Tabung dengan parameter 
    public Tabung (int jari2, int tinggi){
        super(jari2);
        this.tinggi = tinggi;
    }

    //method untuk menghitung luas
    @Override
    public double luas(){
        return 2*PHI*jari2*(jari2+tinggi);
    }

    //setter dan getter
    public int getTinggi(){
        return tinggi;
    }

    public void setTinggi (int tinggi){
        this.tinggi = tinggi;
    }
 
}
