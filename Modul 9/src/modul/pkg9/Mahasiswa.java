package modul.pkg9;
import java.io.*; class Mahasiswa
{
public	static	void main(String[]args)
throws IOException
{
 
String namaFile = "Mel.txt";
String namaMhs = "Muhamad Fahmi";
String NIM = "20220810029";
String Kelas = "TINFC-2022-02";
FileOutputStream outFile=new 
FileOutputStream(namaFile);
try
{

DataOutputStream outStream=new DataOutputStream(outFile);
outStream.writeUTF(namaMhs);
outStream.writeUTF(NIM);
outStream.writeUTF(Kelas);
outStream.close();
}
catch (IOException e)
{

System.out.println("IOERROR: "+e.getMessage()+"\n");
}

}
}

