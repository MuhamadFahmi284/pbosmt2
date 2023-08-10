package modul.pkg9;

class Manusia{
    String Nama;
    String Alamat;
    String JenisKelamin;
    public Manusia(){
    }
    public Manusia(String Nama,String Alamat,String JenisKelamin){
        this.Nama =Nama;
        this.Alamat=Alamat;
        this.JenisKelamin=JenisKelamin;
    }
    public String getNama()
    {
        return Nama;
    }
    public String getAlamat()
    {
        return Alamat;
    }
    public String getJenisKelamin()
    {
        return JenisKelamin;
    }
    public void setNama(String Nama){
        this.Nama=Nama;
    }
    public void setAlamat(String Alamat){
        this.Alamat=Alamat;
    }
    public void setJenisKelamin(String JenisKelamin){
        this.JenisKelamin=JenisKelamin;
    }
}
