package modul.pkg3;

import java.io.*;
public class BayarSPP
{
public static void main(String[]args) throws IOException{
    //deklarasi variabel
    String nama,nim;
    int spt,spv,sks;
    //proses instansiasi objek dengan inputan manual
    spp bayar = new spp("irfan","12.12.1234",950000,70000,24);
    //dengan inputan
    //langkah 1:menginisialisasi BufferredReader
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //langkah 2:proses input
    System.out.println("Nama \t\t:");nama = br.readLine();
    System.out.println("Nim \t\t:");nim = br.readLine();
    System.out.println("SPP Tepat \t:");spt = Integer.parseInt(br.readLine());
    System.out.println("SPP variabel \t:");spv = Integer.parseInt(br.readLine());
    System.out.println("SPP \t\t:");sks = Integer.parseInt(br.readLine());
    //proses instansiasi objek dengan inputan
    spp bayar2 =new spp(nama,nim,spt,spv,sks);
    //output perhitungan dengan inputan manual
    System.out.println("------------------ PROGRAM PERHITUNGAN SPP MANUAL ------------------\n");
    System.out.println("nama \t\t" + bayar.nama);
    System.out.println("nim \t\t" + bayar.nim);
    System.out.println("spp tepat \t\t" + bayar.spt);
    System.out.println("spp variabel \t\t" + bayar.spv);
    System.out.println("sks \t\t" + bayar.sks);
    System.out.println("Total spp yang harus di bayarkan : Rp " + bayar.hitung() + "\n");
    System.out.println("------------------------- TERIMA KASIH ---------------------------------\n\n");
    //output perhitungan dengan inputan
    System.out.println("\n----------------- PROGRAM PERHITUNGAN SPP OTOMATIS -----------------------\n");
    System.out.println("nama \t\t: " + bayar2.nama);
    System.out.println("nim  \t\t: " + bayar2.nim);
    System.out.println("spp tepat \t: " + bayar2.spt);
    System.out.println("spp variabel \t: " + bayar2.spv);
    System.out.println("sks  \t\t: " + bayar2.sks);
    System.out.println("Total SPP yang harus dibayarkan : Rp " + bayar2.hitung() + "\n");
    System.out.println("------------------------ TERIMA KASIH ----------------------------------------\n");
}
}

