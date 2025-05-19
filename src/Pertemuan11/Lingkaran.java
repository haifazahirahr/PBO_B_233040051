package Pertemuan11;

public class Lingkaran extends Bentuk {
    //Konstruktor
   public Lingkaran (int jari2){
       super(jari2);
   }

   //method untuk menghitung luas lingkaran
   @Override
   public double luas(){
       return PHI*jari2*jari2;
   }

}
