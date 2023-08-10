package modul.pkg3;

class mobil
{
    //deklarasi
    private String merk, type, warna;
    private double harga;
    
    //setter
    public void setmerk(String merk){this.merk=merk;}
    public void settype(String type){this.type=type;}
    public void setwarna(String colour){this.warna=colour;}
    public void setharga(double harga){this.harga=harga;}
    
    //getter
    public String getmerk(){return merk;}
    public String gettype(){return type;}
    public String getwarna(){return warna;}
    public double getharga(){return harga;}
    //method tambahan (cashback)
    public double Cashback()
    {
        double cashback=0.1*getharga();
        double total=getharga()-cashback;
        return total;
    }
    public void keterangan()
    {
        System.out.println("Harga Mobil setelah di kurangi Cashback = "+Cashback());
    }
}