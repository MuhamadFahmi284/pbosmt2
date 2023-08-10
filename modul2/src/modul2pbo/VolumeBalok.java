package modul2pbo;

class VolumeBalok
{
    //Deklarasi method utama
    public static void main(String argas[])
    {
        double volume;
        //instan objek dari class balok
        Balok b1 = new Balok();
        b1.panjang=7;
        b1.lebar=4;
        b1.tinggi=5;
        //hitung
        volume = b1.panjang*b1.lebar*b1.tinggi;
        System.out.println("Volume Balok ="+volume+ "cm3");
        
    }
}
