package modul.pkg3;

import java.io.*;
class utama
{
    public static void main (String args[])throws Exception
    {
        BufferedReader br= new BufferedReader(new InputStreamReader (System.in));
        //instant class
        mobil mb = new mobil();
        
        //input
        System.out.println("Masukan Merk mobil = ");
        String merk_mobil = br.readLine();
        System.out.println("Masukan type mobil = ");
        String type_mobil = br.readLine();
        System.out.println("Masukan warna mobil = ");
        String warna_mobil = br.readLine();
        System.out.println("Masukan harga mobil = ");
        double harga_mobil = Double.parseDouble(br.readLine());
        mb.setmerk(merk_mobil);
        mb.settype(type_mobil);
        mb.setwarna(type_mobil);
        
        //output
        System.out.println("Daftar Harga,Merk,Type dan Harga Mobil");
        System.out.println("Merk Mobil="+mb.getmerk());
        System.out.println("Type Mobil="+mb.gettype());
        System.out.println("Warna Mobil="+mb.getwarna());
        System.out.println("Harga Mobil sebelum di Diskon"+mb.getharga());
        mb.keterangan();
        
    }
}
