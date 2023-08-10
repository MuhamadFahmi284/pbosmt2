package modul.pkg3;

public class spp
{
    String nama,nim; int spt,spv,sks;
    //construktor dengan parameter
    public spp(String nama, String nim, int spt, int spv, int sks)
    {
        this.nama=nama;this.nim=nim;
        this.spt=spt;
        this.spt=spv;
        this.sks=sks;
    }
    public int hitung()
    {
        //method non-void harus ada nilai kembalian/return value
        return (spt+(spv*sks));
    }
}
