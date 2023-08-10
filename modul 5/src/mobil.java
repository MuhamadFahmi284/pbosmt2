public class mobil extends barang{
    String warna;
    public mobil (String merkbarang,int hargabarang,String warna){
        super(merkbarang,hargabarang);
        this.warna = warna;
    }
    public String getWarna(){
        return warna;
    }
    public void setWarna(String warna){
        this.warna = warna;
    }
    public void infomobil(){
        System.out.println("\nINFO MOBIL");
        System.out.println("Merk Mobil\t: " + getNama());
        System.out.println("Harga Mobil\t: " + getHarga());
        System.out.println("Warna Mobil\t: " + getWarna());
    }
}
