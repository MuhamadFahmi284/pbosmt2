public class barang{
    String merkbarang;
    int hargabarang;
    public barang(String merkbarang,int hargabarang){
        this.merkbarang = merkbarang;
        this.hargabarang = hargabarang;
    }
    public String getNama(){
        return merkbarang;
    }
    public int getHarga(){
        return hargabarang;
    }
    public void setNama(String nama){
        this.merkbarang = nama;
    }
    public void setHarga(int harga){
        this.hargabarang = harga;
    }
    public void infobarang(){
        System.out.println("\n info barang");
        System.out.println("Nama Barang\t:" + getNama());
        System.out.println("Harga Barang\t:" + getHarga());
        
    }
}
