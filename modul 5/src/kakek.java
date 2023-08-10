public class kakek
{
    protected String namekakek;
    protected String address;
    public kakek()
    {
        System.out.println("\n Program Demo Inheritance");
        System.out.println("=============================");
        System.out.println(" Masukan construktor kakek ");
        System.out.println("-Dijalankan oleh class Bapak-");
        namekakek="Joyo Cokro Aminoto";
        address="Sleman Djogjakarta";
    }
    public kakek(String name,String address)
    {
        this.namekakek=namekakek;
        this.address=address;
    }
    public String getNama()
    {
        return namekakek;
    }
    public String getAddress()
    {
        return address;
    }
}
