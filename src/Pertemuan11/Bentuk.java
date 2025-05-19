package Pertemuan11;

public abstract class Bentuk {
	//atribut phi dan jari2
    protected double PHI = 3.14;
    protected int jari2;

    //konstruktor 
    public Bentuk(int jari2){
        super();
        this.jari2 = jari2;
    }

    //method abstrak
    public abstract double luas();

    //setter dan getter
    public int getJari2 (){
        return jari2;
    }

    public void setJari2 (int jari2){
        this.jari2 = jari2;
    }
}
