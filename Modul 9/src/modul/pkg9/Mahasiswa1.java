package modul.pkg9;

class Mahasiswa1 extends Manusia
{
    String NIM;
    String Prodi;
    String Jurusan;
    public Mahasiswa1(){
    }
    public Mahasiswa1(String Nama,String Alamat,String JenisKelamin,String NIM)
    {
        super(Nama,Alamat,JenisKelamin);
        this.NIM=NIM;
    }
    public String getNIM(){
        return NIM;
    }
    public String getProdi(){
        return Prodi;
    }
    public String getJurusan(){
        return Jurusan;
    }
    public void setNIM(String NIM){
        this.NIM=NIM;
    }
    public void setProdi(String Prodi){
        this.Prodi=Prodi;
    }
    public void setJurusan(String Jurusan){
        this.Jurusan=Jurusan;
    }
}
