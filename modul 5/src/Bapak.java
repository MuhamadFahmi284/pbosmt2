public class Bapak extends kakek
{
    protected String namebapak;
    protected String addressbapak;
    public Bapak()
    {
        System.out.println("Nama Kakek : "+namekakek);
        System.out.println("Address Kakek : "+address);
        System.out.println("\n");
        System.out.println("Masukan Construktor Bapak");
        System.out.println("--dijalankan class cucu--");
        namebapak="ROHAEDI";
        addressbapak="KUNINGAN";
    }
    public Bapak(String namebapak,String addressbapak)
    {
        this.namebapak=namebapak;
        this.addressbapak=addressbapak;
    }
    public String getNama()
    {
        return namebapak;
    }
    public String getAddress()
    {
        return addressbapak;
    }
    public static void main(String[]args)
    {
        Bapak sari=new Bapak();
    }
}
