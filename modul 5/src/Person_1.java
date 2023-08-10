//superClass
class Person{
    private String Nama;
    private String Alamat;
    private int umur;
    public Person(){
    }
    public Person(String Nama, String Alamat, int umur){
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.umur = umur;
    }
    public String getNama(){
       return Nama;
    }
    public String getAlamat(){
       return Alamat;
    }
    public int getumur(){
       return umur;
    }
    public void setNama(String Nama){
       this.Nama = Nama;
    }
    public void setAlamat(String Alamat){
       this.Alamat = Alamat;
    }
    public void setumur(int umur){
       this.umur = umur;
    }
    public void infoPerson(){
        System.out.println("\n Info Person");
        System.out.println("Nama\t\t: " + getNama());
        System.out.println("Alamat\t\t: " + getAlamat());
        System.out.println("Umur\t\t: " + getumur());
    }
}
