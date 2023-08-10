public class motor extends mobil{
    public motor(String merkbarang,int hargabarang,String warna){
        super(merkbarang,hargabarang,warna);
    }
    public void infomotor(){
        System.out.println("\nINFO MOTOR");
        System.out.println("Merk Motor\t: " + getNama());
        System.out.println("Harga Motor\t: " + getHarga());
        System.out.println("Warna Motor\t: " + getWarna());
    }
}
