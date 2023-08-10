//sub class
class Mahasiswa extends Person{
    private String NIM;
    public Mahasiswa()
    {
    }
    public Mahasiswa (String Nama, String Alamat, int umur, String NIM)
    {
        super(Nama, Alamat, umur);
        this.NIM = NIM;
    }
    public String getNIM()
    {
     return NIM;
    }
    public void infoMahasiswa()
    {
        System.out.println("\nInfo Mahasiswa");
        System.out.println("NIM\t\t: " + getNIM());
        System.out.println("Nama\t\t: " + getNama());
        System.out.println("Alamat\t\t: " + getAlamat());
        System.out.println("Umur\t\t: " + getumur());
    }
}
