package modul.pkg3;

class orang{
    String nama,gender;
    int usia;
    public String tampilNama(){
        return nama;
    }
    public void caraBerjalan(){
        System.out.println("Tangan Ditaruh Kebelakang");
    }
    int usiaSekarang(){
        return usia;
    }
}
public class DataDiri{
    public static void main(String args[])
    {
        orang org=new orang();
        org.nama="suci";
        org.usia=19;
        System.out.println("nama :"+org.tampilNama());
        System.out.println("Usia :"+org.usiaSekarang());
        System.out.println("Cara Berjalan");
        org.caraBerjalan();
    }
}
