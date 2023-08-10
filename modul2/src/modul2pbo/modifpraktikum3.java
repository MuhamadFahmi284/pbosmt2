package modul2pbo;
import java.util.Scanner;

class modifpraktikum3
{
    //Deklarasi method utama
    public static void main(String argas[])
    {
        System.out.println("==program perhitungan volume Balok==");
        Scanner input = new Scanner(System.in);
        
        
        double panjang;
        double lebar;
        double tinggi;
        double volume;
        
        //instan objek dari class balok
        System.out.println("Masukan Panjang : ");
        panjang = input.nextDouble();
        System.out.println("masukan lebar : ");
        lebar = input.nextDouble();
        System.out.println("masukan tinggi :");
        tinggi = input.nextDouble();
        
        //hitung
        volume =panjang*lebar*tinggi;
        System.out.println("Volume Balok ="+volume+ "cm3");
        
    }
}

