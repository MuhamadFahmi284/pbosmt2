//sub Class
class Dosen extends Person
{
    private String idDosen;
    public Dosen()
    {
    }
    public Dosen(String Nama, String Alamat, int umur, String idDosen){
        super(Nama, Alamat, umur);
        this.idDosen = idDosen;
    }
    public String getidDosen()
    {
    return idDosen;
    }
    public void setidDosen(String idDosen){
        this.idDosen = idDosen;
    }
    public void infoDosen()
    {
        System.out.println("\n Info Dosen");
        System.out.println("idDosen\t\t: " + getidDosen());
        System.out.println("Nama\t\t: " + getNama());
        System.out.println("Alamat\t\t: " + getAlamat());
        System.out.println("umur\t\t: " + getumur());
    }
}
