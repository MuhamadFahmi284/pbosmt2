package modul.pkg9;
import java.io.*;
class CekMahasiswa
{
    public static void main (String [] args)
    throws IOException
        {

        String namaFile = "Mel.txt";
        String namaMhs, NIM, Kelas;
        try
        {
            FileInputStream	inFile	=new
            FileInputStream(namaFile);
            DataInputStream	inStream=new DataInputStream(inFile);
            namaMhs = inStream.readUTF();
            NIM = inStream.readUTF();
            Kelas = inStream.readUTF();
            inStream.close();
            System.out.println("Nama : "+namaMhs+"\nNIM : "+NIM+"\nKelas : "+Kelas);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File "+namaFile+" Tidak Ada: \n");
        }

        catch (IOException ex)
        {

            System.out.println("IOERROR:"+ex.getMessage()+"\n");
        }

    }
}
