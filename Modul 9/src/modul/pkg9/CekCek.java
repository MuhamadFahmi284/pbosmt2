package modul.pkg9;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
class CekCek{
    public static void main(String []args)throws IOException{
        menu();
    }
    
    static void menu() throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Mahasiswa1 mhs2 = new Mahasiswa1();
        int pilih;
        String temp;
        Menu mn = new Menu();
        mn.Info();
        System.out.println("PILIH : ");
        temp = br.readLine();
        pilih = Integer.parseInt(temp);
        
        switch (pilih){
            case 1 :
                inputData();
                String jawab;
                System.out.println("Apakah Ingin Lanjut ? \na.Ya \nb.Tidak");
                System.out.println("Jawab : ");
                jawab = br.readLine();
                if("Ya".equals(jawab)){
                    menu();
                }else if ("Tidak".equals(jawab)){
                    System.out.println("Terima Kasih");
                }
                break;
                
            case 2 :
                String namafile = "Tuman1.txt";
                String Nama,Alamat,NIM,JenisKelamin,Prodi,Jurusan;
                try{
                    FileInputStream inFile = new FileInputStream(namafile);
                    Data InputStream inStream = new Data InputStream(infile);
                    
                    Nama = inStream.readUTF();
                    Alamat = inStream.readUTF();
                    
                }
                
        }
    }
}
