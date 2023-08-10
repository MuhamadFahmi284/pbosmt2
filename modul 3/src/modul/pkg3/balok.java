package modul.pkg3;
//Deklarasi class
public class balok
{
    //deklarasi atribut
    double panjang,lebar,tinggi;
    //deklarasi setter
    public void setpanjang(double panjang){this.panjang=panjang;}
    public void setlebar(double lebar){this.lebar=lebar;}
    public void settinggi(double tinggi){this.tinggi=tinggi;}
    
    //deklarasi getter
    public double getpanjang(){return panjang;}
    public double getlebar(){return lebar;}
    public double gettinggi(){return tinggi;}
    public double getvolume(){return panjang*lebar*tinggi;}
    public static void main(String args[]){
        double volume;
        balok bl=new balok();
        bl.panjang=7;
        bl.lebar=4;
        bl.tinggi=5;
        volume = bl.panjang*bl.lebar*bl.tinggi;
        System.out.println("Volume Balok ="+volume+ "cm3");
    }
}
    